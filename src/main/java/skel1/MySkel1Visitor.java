package skel1;

import java.util.HashMap;
import java.util.Map;

import org.antlr.v4.runtime.tree.ParseTree;

import pattern.skel1.Skel1BaseVisitor;
import pattern.skel1.Skel1Parser.AssignmentContext;
import pattern.skel1.Skel1Parser.BlockContext;
import pattern.skel1.Skel1Parser.CompositionContext;
import pattern.skel1.Skel1Parser.DataParallelPatternContext;
import pattern.skel1.Skel1Parser.FarmSkelContext;
import pattern.skel1.Skel1Parser.MainContext;
import pattern.skel1.Skel1Parser.MainExprContext;
import pattern.skel1.Skel1Parser.MapSkelContext;
import pattern.skel1.Skel1Parser.PatternExprContext;
import pattern.skel1.Skel1Parser.PipeSkelContext;
import pattern.skel1.Skel1Parser.ProgramPartContext;
import pattern.skel1.Skel1Parser.SequenceContext;
import pattern.skel1.Skel1Parser.SequentialContext;
import pattern.skel1.Skel1Parser.SkeletonProgramContext;
import pattern.skel1.Skel1Parser.StagesContext;
import pattern.skel1.Skel1Parser.StatementContext;
import pattern.skel1.Skel1Parser.StreamPatternContext;

public class MySkel1Visitor<T> extends Skel1BaseVisitor<T> {
	private Map<String,String> variables = new HashMap<>();
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
		System.out.println("main");
//		System.out.println(ctx.getChild(2).getText());
		ParseTree tree = ctx.getChild(2);

		return super.visitMainExpr(ctx);
	}

	@Override
	public T visitAssignment(AssignmentContext ctx) {
		
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
	public T visitMain(MainContext ctx) {

		
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
		return super.visitStages(ctx);
	}

	

		}
