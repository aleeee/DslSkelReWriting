package skel1;

import java.nio.file.Path;
import java.nio.file.Paths;

import org.antlr.v4.runtime.CharStreams;
import java.util.Arrays;
import java.util.List;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.DOTTreeGenerator;
import org.antlr.v4.gui.TreeViewer;
import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import pattern.skel.SkelLexer;
import pattern.skel.SkelParser;
import pattern.skel1.Skel1Lexer;
import pattern.skel1.Skel1Parser;

public class Skel1Main {
	public static  <T> void main(String[] args) throws Exception {

        if (args.length == 0) {
            args = new String[]{"src/main/pattern/pattern2.skel"};
        }

        System.out.println("parsing: " + args[0]);
        Path path = Paths.get(args[0]);
        Skel1Lexer lexer = new Skel1Lexer(CharStreams.fromPath(path));
        Skel1Parser parser = new Skel1Parser(new CommonTokenStream(lexer));
        ParseTree tree = parser.program();
        MySkel1Visitor<T> visitor = new MySkel1Visitor<T>();
        visitor.visit(tree); 
        // http://stackoverflow.com/questions/30134121/drawing-parse-tree-in-antlr4-using-java/30137407#30137407
//		 List<String> ruleNames=Arrays.asList(parser.getRuleNames());
//		 System.out.println("rules" + ruleNames);
		 // http://stackoverflow.com/questions/34832518/antlr4-dotgenerator-example
//		 TreeViewer tv=new TreeViewer(ruleNames,tree.getChild(2));
//		 showTreeViewer(tv);
    }
	public static int showTreeViewer(TreeViewer tv) {
		  JPanel panel = new JPanel();
		  tv.setScale(2);
		  panel.add(tv);
		  return JOptionPane.showConfirmDialog(null, panel, "ParseTree", 
		    JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
		} 

		
}
