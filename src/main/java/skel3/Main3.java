package skel3;

import java.nio.file.Path;
import java.nio.file.Paths;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import org.antlr.v4.gui.TreeViewer;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.Tree;

import pattern.skel3.Skel3Lexer;
import pattern.skel3.Skel3Parser;
import tree.Node;
import tree.Snippet;




public class Main3 {
	public static  <T> void main(String[] args) throws Exception {

        if (args.length == 0) {
            args = new String[]{"src/main/pattern/pattern2.skel"};
        }

        System.out.println("parsing: " + args[0]);
        Path path = Paths.get(args[0]);
        Skel3Lexer lexer = new Skel3Lexer(CharStreams.fromPath(path));
        Skel3Parser parser = new Skel3Parser(new CommonTokenStream(lexer));
        ParseTree tree = parser.skeletonProgram();
        Visitor3 visitor3 = new Visitor3();
        Node n =visitor3.visit(tree);
        
//		display(n);
        System.out.println(getMainNode(n));
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
	public static int showTreeViewer(Node n) {
		 
		  JPanel panel = new JPanel();
//		  tv.setScale(2);
		  n.setSize(200,500);
		  panel.add(n);
		  return JOptionPane.showConfirmDialog(null, panel, "ParseTree", 
		    JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
		} 
	public static void display(Node n){
		JFrame jFrame = new JFrame();
        jFrame.add(n);
        jFrame.setSize(500, 500);
        jFrame.setVisible(true); 
	}
}
