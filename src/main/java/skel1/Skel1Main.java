package skel1;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import org.antlr.v4.runtime.CharStreams;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import org.antlr.v4.gui.TreeViewer;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import pattern.PatternParser.MainContext;
import pattern.PatternParser.PipeContext;
import pattern.skel1.Skel1Lexer;
import pattern.skel1.Skel1Parser;
import pattern.skel1.Skel1Parser.MainExprContext;
import pattern.skel1.Skel1Parser.ProgramPartContext;

public class Skel1Main {
	public static  <T> void main(String[] args) throws Exception {

        if (args.length == 0) {
            args = new String[]{"src/main/pattern/pattern2.skel"};
        }

        System.out.println("parsing: " + args[0]);
        Path path = Paths.get(args[0]);
        Skel1Lexer lexer = new Skel1Lexer(CharStreams.fromPath(path));
        Skel1Parser parser = new Skel1Parser(new CommonTokenStream(lexer));
//        List<ProgramPartContext> progContext = parser.skeletonProgram().programPart();
//        progContext.forEach(c -> {System.out.println(c.getText() +" c");});
//       PipeContext mainCtx =  (PipeContext) progContext.stream().filter(ctx -> ctx.equals(MainContext.class));
        ParseTree tree = parser.skeletonProgram();
//       System.out.println(mainCtx.toString());
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
