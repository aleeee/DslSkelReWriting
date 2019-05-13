package skel2;

import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.RuleNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import model.SkelType;
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

public class Skel2Visitor1 extends Skel2BaseVisitor<SkelType>{

	@Override
	public SkelType visitSkeletonProgram(SkeletonProgramContext ctx) {
		// TODO Auto-generated method stub
		return super.visitSkeletonProgram(ctx);
	}

	@Override
	public SkelType visitProgramPart(ProgramPartContext ctx) {
		// TODO Auto-generated method stub
		return super.visitProgramPart(ctx);
	}

	@Override
	public SkelType visitStatement(StatementContext ctx) {
		// TODO Auto-generated method stub
		return super.visitStatement(ctx);
	}

	@Override
	public SkelType visitMainExpr(MainExprContext ctx) {
		// TODO Auto-generated method stub
		return super.visitMainExpr(ctx);
	}

	@Override
	public SkelType visitAssignment(AssignmentContext ctx) {
		// TODO Auto-generated method stub
		return super.visitAssignment(ctx);
	}

	@Override
	public SkelType visitPatternExpr(PatternExprContext ctx) {
		// TODO Auto-generated method stub
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
	public SkelType visitMain(MainContext ctx) {
		// TODO Auto-generated method stub
		return super.visitMain(ctx);
	}

	@Override
	public SkelType visitBlock(BlockContext ctx) {
		// TODO Auto-generated method stub
		return super.visitBlock(ctx);
	}

	@Override
	public SkelType visitSequence(SequenceContext ctx) {
		// TODO Auto-generated method stub
		return super.visitSequence(ctx);
	}

	@Override
	public SkelType visitComposition(CompositionContext ctx) {
		// TODO Auto-generated method stub
		return super.visitComposition(ctx);
	}

	@Override
	public SkelType visitPipeSkel(PipeSkelContext ctx) {
		// TODO Auto-generated method stub
		return super.visitPipeSkel(ctx);
	}

	@Override
	public SkelType visitFarmSkel(FarmSkelContext ctx) {
		// TODO Auto-generated method stub
		return super.visitFarmSkel(ctx);
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

	@Override
	public SkelType visit(ParseTree tree) {
		// TODO Auto-generated method stub
		return super.visit(tree);
	}

	@Override
	public SkelType visitChildren(RuleNode node) {
		// TODO Auto-generated method stub
		return super.visitChildren(node);
	}

	@Override
	public SkelType visitTerminal(TerminalNode node) {
		// TODO Auto-generated method stub
		return super.visitTerminal(node);
	}

	@Override
	public SkelType visitErrorNode(ErrorNode node) {
		// TODO Auto-generated method stub
		return super.visitErrorNode(node);
	}

	@Override
	protected SkelType defaultResult() {
		// TODO Auto-generated method stub
		return super.defaultResult();
	}

	@Override
	protected SkelType aggregateResult(SkelType aggregate, SkelType nextResult) {
		// TODO Auto-generated method stub
		return super.aggregateResult(aggregate, nextResult);
	}

	@Override
	protected boolean shouldVisitNextChild(RuleNode node, SkelType currentResult) {
		// TODO Auto-generated method stub
		return super.shouldVisitNextChild(node, currentResult);
	}

}
