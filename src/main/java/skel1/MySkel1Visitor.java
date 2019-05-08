package skel1;

import javax.swing.plaf.synth.SynthSeparatorUI;

import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.RuleNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import pattern.skel1.Skel1BaseVisitor;
import pattern.skel1.Skel1Parser.AssignmentContext;
import pattern.skel1.Skel1Parser.BlockContext;
import pattern.skel1.Skel1Parser.CompositionContext;
import pattern.skel1.Skel1Parser.DataParallelPatternContext;
import pattern.skel1.Skel1Parser.FarmSkelContext;
import pattern.skel1.Skel1Parser.MainStatementContext;
import pattern.skel1.Skel1Parser.MapSkelContext;
import pattern.skel1.Skel1Parser.PatternExprContext;
import pattern.skel1.Skel1Parser.PipeSkelContext;
import pattern.skel1.Skel1Parser.ProgramContext;
import pattern.skel1.Skel1Parser.SequenceContext;
import pattern.skel1.Skel1Parser.SequentialContext;
import pattern.skel1.Skel1Parser.StagesContext;
import pattern.skel1.Skel1Parser.StatementContext;
import pattern.skel1.Skel1Parser.StreamPatternContext;

public class MySkel1Visitor<T> extends Skel1BaseVisitor<T> {

	@Override
	public T visitProgram(ProgramContext ctx) {
		// TODO Auto-generated method stub
		return super.visitProgram(ctx);
	}

	@Override
	public T visitMainStatement(MainStatementContext ctx) {
		System.out.println("main");
		System.out.println(ctx.getText());
//		System.out.println(ctx.children);
		return super.visitMainStatement(ctx);
	}

	@Override
	public T visitStatement(StatementContext ctx) {
		// TODO Auto-generated method stub
		return super.visitStatement(ctx);
	}

	@Override
	public T visitAssignment(AssignmentContext ctx) {
		// TODO Auto-generated method stub
		
		return super.visitAssignment(ctx);
	}

	@Override
	public T visitPatternExpr(PatternExprContext ctx) {
		// TODO Auto-generated method stub
		return super.visitPatternExpr(ctx);
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
		return super.visitStages(ctx);
	}

	@Override
	protected T aggregateResult(T aggregate, T nextResult) {
		// TODO Auto-generated method stub
		return super.aggregateResult(aggregate, nextResult);
	}

	@Override
	protected T defaultResult() {
		// TODO Auto-generated method stub
		return super.defaultResult();
	}

	@Override
	protected boolean shouldVisitNextChild(RuleNode node, T currentResult) {
		// TODO Auto-generated method stub
		return super.shouldVisitNextChild(node, currentResult);
	}

	@Override
	public T visit(ParseTree tree) {
		// TODO Auto-generated method stub
	
		return super.visit(tree);
	}

	@Override
	public T visitChildren(RuleNode arg0) {
		// TODO Auto-generated method stub
		return super.visitChildren(arg0);
	}

	@Override
	public T visitErrorNode(ErrorNode node) {
		// TODO Auto-generated method stub
		return super.visitErrorNode(node);
	}

	@Override
	public T visitTerminal(TerminalNode node) {
		// TODO Auto-generated method stub
		return super.visitTerminal(node);
	}

}
