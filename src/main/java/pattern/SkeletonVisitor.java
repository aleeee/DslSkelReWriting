package pattern;

import pattern.PatternParser.BlockContext;
import pattern.PatternParser.CompContext;
import pattern.PatternParser.DataparallelContext;
import pattern.PatternParser.FarmContext;
import pattern.PatternParser.MainContext;
import pattern.PatternParser.MapContext;
import pattern.PatternParser.ParseContext;
import pattern.PatternParser.PatternContext;
import pattern.PatternParser.PipeContext;
import pattern.PatternParser.SeqContext;
import pattern.PatternParser.SequenceContext;
import pattern.PatternParser.StreamContext;

public class SkeletonVisitor<T> extends PatternBaseVisitor<T>{

	@Override
	public T visitParse(ParseContext ctx) {
		// TODO Auto-generated method stub
		return super.visitParse(ctx);
	}

	@Override
	public T visitPattern(PatternContext ctx) {
		// TODO Auto-generated method stub
		return super.visitPattern(ctx);
	}

	@Override
	public T visitMain(MainContext ctx) {
		// TODO Auto-generated method stub
		return super.visitMain(ctx);
	}

	@Override
	public T visitStream(StreamContext ctx) {
		// TODO Auto-generated method stub
		return super.visitStream(ctx);
	}

	@Override
	public T visitSequence(SequenceContext ctx) {
		// TODO Auto-generated method stub
		return super.visitSequence(ctx);
	}

	@Override
	public T visitDataparallel(DataparallelContext ctx) {
		// TODO Auto-generated method stub
		return super.visitDataparallel(ctx);
	}

	@Override
	public T visitSeq(SeqContext ctx) {
		// TODO Auto-generated method stub
		return super.visitSeq(ctx);
	}

	@Override
	public T visitComp(CompContext ctx) {
		// TODO Auto-generated method stub
		return super.visitComp(ctx);
	}

	@Override
	public T visitFarm(FarmContext ctx) {
		// TODO Auto-generated method stub
		return super.visitFarm(ctx);
	}

	@Override
	public T visitPipe(PipeContext ctx) {
		// TODO Auto-generated method stub
		return super.visitPipe(ctx);
	}

	@Override
	public T visitMap(MapContext ctx) {
		// TODO Auto-generated method stub
		return super.visitMap(ctx);
	}

	@Override
	public T visitBlock(BlockContext ctx) {
		// TODO Auto-generated method stub
		return super.visitBlock(ctx);
	}

	
}
