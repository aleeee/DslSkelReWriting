package skel2;

import java.util.HashMap;
import java.util.Map;

import model.Comp;
import model.Farm;
import model.Pipeline;
import model.Seq;
import model.SkelType;
import model.Skeleton;
import pattern.skel2.Skel2BaseVisitor;
import pattern.skel2.Skel2Parser.AssignmentContext;
import pattern.skel2.Skel2Parser.BlockContext;
import pattern.skel2.Skel2Parser.CompositionContext;
import pattern.skel2.Skel2Parser.DataParallelPatternContext;
import pattern.skel2.Skel2Parser.FarmSkelContext;
import pattern.skel2.Skel2Parser.MainExprContext;
import pattern.skel2.Skel2Parser.MapSkelContext;
import pattern.skel2.Skel2Parser.PatternExprContext;
import pattern.skel2.Skel2Parser.PipeSkelContext;
import pattern.skel2.Skel2Parser.SequenceContext;
import pattern.skel2.Skel2Parser.SequentialContext;
import pattern.skel2.Skel2Parser.StagesContext;
import pattern.skel2.Skel2Parser.StreamPatternContext;
import pattern.skel2.Skel2Parser.VarTypeContext;
import tree.Node;

public class Skel2Visitor1 extends Skel2BaseVisitor<SkelType>{

	Map<String,Skeleton> variables = new HashMap<>();

	@Override
	public SkelType visitMainExpr(MainExprContext ctx) {
		Node root = new Node(ctx.type.getText(),null);
		SkelType exp = visit(ctx.expr);
		System.out.println(exp);
		return super.visitMainExpr(ctx);
	}

	@Override
	public SkelType visitAssignment(AssignmentContext ctx) {
		Skeleton sk = null;
		switch(ctx.type.getText()) {
		case "Seq":
//			System.out.println("sequential " + ctx.expr.seq.sec.ts.getText());
			sk = new Seq(Long.parseLong(ctx.expr.seq.sec.ts.getText()));
			variables.put(ctx.varName.getText(), sk);
			break;
		case "Comp":
			sk= new Comp(0);
			variables.put(ctx.varName.getText(),sk);
			break;
		case "Farm":
			sk = new Farm(0);
			variables.put(ctx.varName.getText()	,sk);
			break;
		case "Pipe":
			sk = new Pipeline(0);
			variables.put(ctx.varName.getText(), sk);
			break;
		case "Map":
			sk = new model.MapSkel(0);
			variables.put(ctx.varName.getText(),sk);
		}
		return super.visitAssignment(ctx);
	}
	

	@Override
	public SkelType visitPatternExpr(PatternExprContext ctx) {
		Node n ;
		//create a node and add children to it
		if(ctx.varName != null){
			 n = new Node(ctx.varName.getText(),variables.get(ctx.varName));
//			 n.setChildren(children);
			}
		
		return super.visitPatternExpr(ctx);
	}

	@Override
	public SkelType visitVarType(VarTypeContext ctx) {
		// TODO Auto-generated method stub
		return super.visitVarType(ctx);
	}

	@Override
	public SkelType visitStreamPattern(StreamPatternContext ctx) {
		// TODO Auto-generated method stub
		return super.visitStreamPattern(ctx);
	}

	@Override
	public SkelType visitSequential(SequentialContext ctx) {
		// TODO Auto-generated method stub
		return super.visitSequential(ctx);
	}

	@Override
	public SkelType visitDataParallelPattern(DataParallelPatternContext ctx) {
		// TODO Auto-generated method stub
		return super.visitDataParallelPattern(ctx);
	}


	@Override
	public SkelType visitBlock(BlockContext ctx) {
		// TODO Auto-generated method stub
		return super.visitBlock(ctx);
	}

	@Override
	public SkelType visitSequence(SequenceContext ctx) {
		return new SkelType(new Seq(1));
	}

	@Override
	public SkelType visitComposition(CompositionContext ctx) {
		return new SkelType(new Comp(2));
	}

	@Override
	public SkelType visitPipeSkel(PipeSkelContext ctx) {
		return new SkelType(new Pipeline(2));
	}

	@Override
	public SkelType visitFarmSkel(FarmSkelContext ctx) {
		return new SkelType(new Farm(2));
	}

	@Override
	public SkelType visitMapSkel(MapSkelContext ctx) {
		// TODO Auto-generated method stub
		return super.visitMapSkel(ctx);
	}

	@Override
	public SkelType visitStages(StagesContext ctx) {
		// TODO Auto-generated method stub
		return super.visitStages(ctx);
	}

	

}
