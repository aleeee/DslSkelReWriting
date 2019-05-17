package visitor;

import tree.model.CompPatt;
import tree.model.FarmPatt;
import tree.model.MapPatt;
import tree.model.PipePatt;
import tree.model.SeqPatt;

public interface NodeVisitor {
	public void visit(SeqPatt s);
	public void visit(CompPatt s);
	public void visit(FarmPatt s);
	public void visit(PipePatt s);
	public void visit(MapPatt s);
}
