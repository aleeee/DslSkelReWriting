package pattern;

import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.RuleNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import pattern.skel.SkelBaseVisitor;
import pattern.skel.SkelParser.AssignmentContext;
import pattern.skel.SkelParser.BlockContext;
import pattern.skel.SkelParser.CompContext;
import pattern.skel.SkelParser.DataparallelContext;
import pattern.skel.SkelParser.FarmContext;
import pattern.skel.SkelParser.MainContext;
import pattern.skel.SkelParser.MapContext;
import pattern.skel.SkelParser.ParseContext;
import pattern.skel.SkelParser.PattContext;
import pattern.skel.SkelParser.PipeContext;
import pattern.skel.SkelParser.SeqContext;
import pattern.skel.SkelParser.SequenceContext;
import pattern.skel.SkelParser.StagesContext;
import pattern.skel.SkelParser.StreamContext;

public class SkeletonsVisitor<T> extends SkelBaseVisitor<T> {

	@Override
	public T visitParse(ParseContext ctx) {
		// TODO Auto-generated method stub
		System.out.println(ctx.toStringTree());
		return super.visitParse(ctx);
	}

	@Override
	public T visitAssignment(AssignmentContext ctx) {
		// TODO Auto-generated method stub
		return super.visitAssignment(ctx);
	}

	@Override
	public T visitPatt(PattContext ctx) {
		// TODO Auto-generated method stub
		return super.visitPatt(ctx);
	}

	@Override
	public T visitMain(MainContext ctx) {
		// TODO Auto-generated method stub
		System.out.println("main found");
		System.out.println(ctx.toStringTree());
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
	public T visitBlock(BlockContext ctx) {
		// TODO Auto-generated method stub
		return super.visitBlock(ctx);
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
	public T visitPipe(PipeContext ctx) {
		// TODO Auto-generated method stub
		return super.visitPipe(ctx);
	}

	@Override
	public T visitFarm(FarmContext ctx) {
		// TODO Auto-generated method stub
		return super.visitFarm(ctx);
	}

	@Override
	public T visitMap(MapContext ctx) {
		// TODO Auto-generated method stub
		return super.visitMap(ctx);
	}

	@Override
	public T visitStages(StagesContext ctx) {
		// TODO Auto-generated method stub
		return super.visitStages(ctx);
	}

	@Override
	public T visit(ParseTree tree) {
		// TODO Auto-generated method stub
		return super.visit(tree);
	}

	@Override
	public T visitChildren(RuleNode node) {
		// TODO Auto-generated method stub
		return super.visitChildren(node);
	}

	@Override
	public T visitTerminal(TerminalNode node) {
		// TODO Auto-generated method stub
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
