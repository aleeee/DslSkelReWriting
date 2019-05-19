package visitor;

import tree.model.CompPatt;
import tree.model.FarmPatt;
import tree.model.MapPatt;
import tree.model.PipePatt;
import tree.model.SeqPatt;
import tree.model.SkeletonPatt;

public class NodesVisitor implements NodeVisitor {
	
	@Override
	public void visit(SkeletonPatt s) {
		System.out.println("sk " + s);
		visit(s.getChild().getChild());
		
	}

	@Override
	public void visit(SeqPatt s) {
		System.out.println("v " +s);
	}
	@Override
	public void visit(CompPatt s) {
		System.out.println(s);
//		get children
//		list<Node> 
//		for each Node
//			visit Node
//		end;
//		ts = sum{ts di figli}
		
	}
	@Override
	public void visit(FarmPatt s) {
		System.out.println("farm "+s);
	}
	@Override
	public void visit(PipePatt s) {
		System.out.println("pipe "+s);
		
	}
	@Override
	public void visit(MapPatt s) {
		System.out.println(s);
	}
	

	

}
