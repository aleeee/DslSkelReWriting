package skel3;

import java.nio.file.Path;
import java.nio.file.Paths;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import model.Seq;
import pattern.skel3.Skel3Lexer;
import pattern.skel3.Skel3Parser;
import tree.Node;
import tree.model.SeqPatt;
import tree.model.SkeletonPatt;
import util.Util;
import visitor.NodesVisitor;
import visitor.Visitable;
public class Main3_1 {
	public static  <T> void main(String[] args) throws Exception {

        if (args.length == 0) {
            args = new String[]{"src/main/pattern/pattern2.skel"};
        }

        System.out.println("parsing: " + args[0]);
        Path path = Paths.get(args[0]);
        Skel3Lexer lexer = new Skel3Lexer(CharStreams.fromPath(path));
        Skel3Parser parser = new Skel3Parser(new CommonTokenStream(lexer));
        ParseTree tree = parser.skeletonProgram();
        Visitor6 visitor3 = new Visitor6();
        SkeletonPatt n =visitor3.visit(tree);
        System.out.println("n "+ n);
//        printTree(n);
//		display(n);
        NodesVisitor v = new NodesVisitor();
//        v.visit( n);

        n.accept(v);
        System.out.println("after " + n);
//        System.out.println(getMainNode(n));
//        System.out.println(Util.computeServiceTime(getMainNode(n),0));
    }
	
	private static Node getMainNode(Node tree){
		Node main = null;
		if(tree != null && tree.getLable() != null && tree.getLable().equalsIgnoreCase("main")){
			return tree;
		}else{
			 main = tree.getChild() != null ?getMainNode(tree.getChild()): null;
			if(main == null){
				
//				tree.getChildren().stream().forEach(node ->{ getMainNode(node);});
				if(tree.getChildren() == null)
					return null;
				for(Node n : tree.getChildren()){
					main = getMainNode(n);
					if(main != null)
						return main;
				}
				
			}
		}
		return main;
	}
	private static void printTree(SkeletonPatt n) {
//		System.out.println( "print tree " + n);
		System.out.println(n .getLable() + " " + n.serviceTime()) ;
		if(n.getChild() != null) {
			printTree(n.getChild());
		}else if(n.getChildren() != null) {
//				System.out.println("cc " + n.getChildren());
				n.getChildren().forEach(c -> {printTree(c); });
			}
		
	}
/**
 * compute serviceTime
  if has child
    ts =  child.compute   
    if(farm)
      ts/n
    if(map)

  else if has children

    ts += children.foreach.compute
    if(pipe)
      max(children.compute(max of ts))
    if(comp)
    ts = ts
  else 
    compute
 */
	
	
}
