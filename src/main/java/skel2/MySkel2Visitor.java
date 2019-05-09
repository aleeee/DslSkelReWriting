package skel2;

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
		return super.visitMainExpr(ctx);
	}

	@Override
	public T visitAssignment(AssignmentContext ctx) {
		System.out.println(ctx.varName.getText() +ctx.type.getText());
		// TODO Auto-generated method stub
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
		return super.visitStages(ctx);
	}

}
