package skel2;

import java.util.HashMap;
import java.util.Map;

import model.SkelType;
import model.Skeleton;
import pattern.skel2.Skel2BaseVisitor;
import pattern.skel2.Skel2Parser.AssignmentContext;
import pattern.skel2.Skel2Parser.BlockContext;
import pattern.skel2.Skel2Parser.CompositionContext;
import pattern.skel2.Skel2Parser.DataParallelPatternContext;
import pattern.skel2.Skel2Parser.FarmSkelContext;
import pattern.skel2.Skel2Parser.MainContext;
import pattern.skel2.Skel2Parser.MainExprContext;
import pattern.skel2.Skel2Parser.MapSkelContext;
import pattern.skel2.Skel2Parser.PatternExprContext;
import pattern.skel2.Skel2Parser.PipeSkelContext;
import pattern.skel2.Skel2Parser.ProgramPartContext;
import pattern.skel2.Skel2Parser.SequenceContext;
import pattern.skel2.Skel2Parser.SequentialContext;
import pattern.skel2.Skel2Parser.SkeletonProgramContext;
import pattern.skel2.Skel2Parser.StagesContext;
import pattern.skel2.Skel2Parser.StatementContext;
import pattern.skel2.Skel2Parser.StreamPatternContext;
import pattern.skel2.Skel2Parser.VarTypeContext;
import tree.Node;
import util.Util;

public class Skel2Visitor2 extends Skel2BaseVisitor<Node> {
	Map<String,Skeleton> variables = new HashMap<>();



	@Override
	public Node visitMainExpr(MainExprContext ctx) {
		Node root = new Node(ctx.type.getText(),Util.getType(ctx.type.getText()));
		Node child = visit(ctx.expr);
		System.out.println("root " + root.toString() );
		System.out.println("child " + child);
		return root;
	}

	@Override
	public Node visitAssignment(AssignmentContext ctx) {
		variables.put(ctx.varName.getText(),Util.getType(ctx.varName.getText()));
		return super.visitAssignment(ctx);
	}

	@Override
	public Node visitPatternExpr(PatternExprContext ctx) {
		// TODO Auto-generated method stub
		return super.visitPatternExpr(ctx);
	}

	@Override
	public Node visitVarType(VarTypeContext ctx) {
		// TODO Auto-generated method stub
		return super.visitVarType(ctx);
	}

	@Override
	public Node visitStreamPattern(StreamPatternContext ctx) {
		// TODO Auto-generated method stub
		return super.visitStreamPattern(ctx);
	}

	@Override
	public Node visitSequential(SequentialContext ctx) {
		// TODO Auto-generated method stub
		return super.visitSequential(ctx);
	}

	@Override
	public Node visitDataParallelPattern(DataParallelPatternContext ctx) {
		// TODO Auto-generated method stub
		return super.visitDataParallelPattern(ctx);
	}

	@Override
	public Node visitMain(MainContext ctx) {
		// TODO Auto-generated method stub
		return super.visitMain(ctx);
	}

	@Override
	public Node visitBlock(BlockContext ctx) {
		// TODO Auto-generated method stub
		return super.visitBlock(ctx);
	}

	@Override
	public Node visitSequence(SequenceContext ctx) {
		// TODO Auto-generated method stub
		return super.visitSequence(ctx);
	}

	@Override
	public Node visitComposition(CompositionContext ctx) {
		// TODO Auto-generated method stub
		return super.visitComposition(ctx);
	}

	@Override
	public Node visitPipeSkel(PipeSkelContext ctx) {
		// TODO Auto-generated method stub
		return super.visitPipeSkel(ctx);
	}

	@Override
	public Node visitFarmSkel(FarmSkelContext ctx) {
		// TODO Auto-generated method stub
		return super.visitFarmSkel(ctx);
	}

	@Override
	public Node visitMapSkel(MapSkelContext ctx) {
		
		return super.visitMapSkel(ctx);
	}

	@Override
	public Node visitStages(StagesContext ctx) {
		// TODO Auto-generated method stub
		return super.visitStages(ctx);
	}

}
