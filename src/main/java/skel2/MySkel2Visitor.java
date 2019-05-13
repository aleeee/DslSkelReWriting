package skel2;

import java.nio.channels.Pipe;
import java.util.HashMap;
import java.util.Map;

import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.RuleNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import model.Comp;
import model.Farm;
import model.Pipeline;
import model.Seq;
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

public class MySkel2Visitor<T> extends Skel2BaseVisitor<T> {
	Map<String,Skeleton> variables = new HashMap<>();
	@Override
	public T visitSkeletonProgram(SkeletonProgramContext ctx) {
		// TODO Auto-generated method stub
		return super.visitSkeletonProgram(ctx);
	}

	@Override
	public T visitProgramPart(ProgramPartContext ctx) {
		// TODO Auto-generated method stub
		return super.visitProgramPart(ctx);
	}

	@Override
	public T visitStatement(StatementContext ctx) {
		// TODO Auto-generated method stub
		return super.visitStatement(ctx);
	}

	@Override
	public T visitMainExpr(MainExprContext ctx) {
		// TODO Auto-generated method stub
		variables.entrySet().forEach(e -> {System.out.println(e.getKey() + " " + e.getValue().serviceTime());});
		try {
        T t = visit(ctx.type); //root
        T tt = visit(ctx.expr.stream.pipe.stages());
        System.out.println(tt);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		return super.visitMainExpr(ctx);
	}

	@Override
	public T visitAssignment(AssignmentContext ctx) {
		System.out.println(ctx.varName.getText() +ctx.type.getText() + "    " + ctx.expr.getText());
		Skeleton sk = null;
		switch(ctx.type.getText()) {
		case "Seq":
			System.out.println("sequential " + ctx.expr.seq.sec.ts.getText());
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
	public T visitPatternExpr(PatternExprContext ctx) {
		// TODO Auto-generated method stub
		return super.visitPatternExpr(ctx);
	}

	@Override
	public T visitVarType(VarTypeContext ctx) {
		// TODO Auto-generated method stub
		return super.visitVarType(ctx);
	}

	@Override
	public T visitStreamPattern(StreamPatternContext ctx) {
		// TODO Auto-generated method stub
		return super.visitStreamPattern(ctx);
	}

	@Override
	public T visitSequential(SequentialContext ctx) {
		// TODO Auto-generated method stub
		return super.visitSequential(ctx);
	}

	@Override
	public T visitDataParallelPattern(DataParallelPatternContext ctx) {
		// TODO Auto-generated method stub
		return super.visitDataParallelPattern(ctx);
	}

	@Override
	public T visitMain(MainContext ctx) {
		// TODO Auto-generated method stub
		return super.visitMain(ctx);
	}

	@Override
	public T visitBlock(BlockContext ctx) {
		// TODO Auto-generated method stub
		return super.visitBlock(ctx);
	}

	@Override
	public T visitSequence(SequenceContext ctx) {
		// TODO Auto-generated method stub
		return super.visitSequence(ctx);
	}

	@Override
	public T visitComposition(CompositionContext ctx) {
		// TODO Auto-generated method stub
		return super.visitComposition(ctx);
	}

	@Override
	public T visitPipeSkel(PipeSkelContext ctx) {
		// TODO Auto-generated method stub
		return super.visitPipeSkel(ctx);
	}

	@Override
	public T visitFarmSkel(FarmSkelContext ctx) {
		// TODO Auto-generated method stub
		return super.visitFarmSkel(ctx);
	}

	@Override
	public T visitMapSkel(MapSkelContext ctx) {
		// TODO Auto-generated method stub
		return super.visitMapSkel(ctx);
	}

	@Override
	public T visitStages(StagesContext ctx) {
		// TODO Auto-generated method stub
		System.out.println("stages " + ctx.getText());
		
		ctx.expr.forEach(e -> {visit(e);});
		return super.visitStages(ctx);
	}

	@Override
	public T visit(ParseTree tree) {
		System.out.println("tree " + tree.getText());
		return super.visit(tree);
	}

	@Override
	public T visitChildren(RuleNode node) {
		// TODO Auto-generated method stub
		return super.visitChildren(node);
	}

	@Override
	public T visitTerminal(TerminalNode node) {
		System.out.println("terminal " + node);
		return super.visitTerminal(node);
	}

	@Override
	public T visitErrorNode(ErrorNode node) {
		// TODO Auto-generated method stub
		return super.visitErrorNode(node);
	}

	@Override
	protected T defaultResult() {
		// TODO Auto-generated method stub
		return super.defaultResult();
	}

	@Override
	protected T aggregateResult(T aggregate, T nextResult) {
		// TODO Auto-generated method stub
		return super.aggregateResult(aggregate, nextResult);
	}

	@Override
	protected boolean shouldVisitNextChild(RuleNode node, T currentResult) {
		// TODO Auto-generated method stub
		return super.shouldVisitNextChild(node, currentResult);
	}

}
