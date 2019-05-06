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

public class SVisitor extends SkelBaseVisitor<SkeletonPattern> {

	@Override
	public SkeletonPattern visitParse(ParseContext ctx) {
		// TODO Auto-generated method stub
		return super.visitParse(ctx);
	}

	@Override
	public SkeletonPattern visitAssignment(AssignmentContext ctx) {
		// TODO Auto-generated method stub
		return super.visitAssignment(ctx);
	}

	@Override
	public SkeletonPattern visitPatt(PattContext ctx) {
		// TODO Auto-generated method stub
		return super.visitPatt(ctx);
	}

	@Override
	public SkeletonPattern visitMain(MainContext ctx) {
		// TODO Auto-generated method stub
		return super.visitMain(ctx);
	}

	@Override
	public SkeletonPattern visitStream(StreamContext ctx) {
		// TODO Auto-generated method stub
		return super.visitStream(ctx);
	}

	@Override
	public SkeletonPattern visitSequence(SequenceContext ctx) {
		// TODO Auto-generated method stub
		return super.visitSequence(ctx);
	}

	@Override
	public SkeletonPattern visitDataparallel(DataparallelContext ctx) {
		// TODO Auto-generated method stub
		return super.visitDataparallel(ctx);
	}

	@Override
	public SkeletonPattern visitBlock(BlockContext ctx) {
		// TODO Auto-generated method stub
		return super.visitBlock(ctx);
	}

	@Override
	public SkeletonPattern visitSeq(SeqContext ctx) {
		// TODO Auto-generated method stub
		return super.visitSeq(ctx);
	}

	@Override
	public SkeletonPattern visitComp(CompContext ctx) {
		// TODO Auto-generated method stub
		return super.visitComp(ctx);
	}

	@Override
	public SkeletonPattern visitPipe(PipeContext ctx) {
		// TODO Auto-generated method stub
		System.out.println(ctx.children);
		System.out.println(ctx.getParent().getChild(0).getParent().getText());
		return super.visitPipe(ctx);
	}

	@Override
	public SkeletonPattern visitFarm(FarmContext ctx) {
		// TODO Auto-generated method stub
		return super.visitFarm(ctx);
	}

	@Override
	public SkeletonPattern visitMap(MapContext ctx) {
		// TODO Auto-generated method stub
		return super.visitMap(ctx);
	}

	@Override
	public SkeletonPattern visitStages(StagesContext ctx) {
		// TODO Auto-generated method stub
		return super.visitStages(ctx);
	}

	@Override
	public SkeletonPattern visit(ParseTree tree) {
		// TODO Auto-generated method stub
		return super.visit(tree);
	}

	@Override
	public SkeletonPattern visitChildren(RuleNode node) {
		// TODO Auto-generated method stub
		return super.visitChildren(node);
	}

	@Override
	public SkeletonPattern visitTerminal(TerminalNode node) {
		// TODO Auto-generated method stub
		return super.visitTerminal(node);
	}

	@Override
	public SkeletonPattern visitErrorNode(ErrorNode node) {
		// TODO Auto-generated method stub
		return super.visitErrorNode(node);
	}

	@Override
	protected SkeletonPattern defaultResult() {
		// TODO Auto-generated method stub
		return super.defaultResult();
	}

	@Override
	protected SkeletonPattern aggregateResult(SkeletonPattern aggregate, SkeletonPattern nextResult) {
		// TODO Auto-generated method stub
		return super.aggregateResult(aggregate, nextResult);
	}

	@Override
	protected boolean shouldVisitNextChild(RuleNode node, SkeletonPattern currentResult) {
		// TODO Auto-generated method stub
		return super.shouldVisitNextChild(node, currentResult);
	}

}
