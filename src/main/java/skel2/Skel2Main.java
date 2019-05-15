package skel2;

import java.nio.file.Path;
import java.nio.file.Paths;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import pattern.skel2.Skel2Lexer;
import pattern.skel2.Skel2Parser;

public class Skel2Main {

		public static  <T> void main(String[] args) throws Exception {

	        if (args.length == 0) {
	            args = new String[]{"src/main/pattern/pattern2.skel"};
	        }

	        System.out.println("parsing: " + args[0]);
	        Path path = Paths.get(args[0]);
	        Skel2Lexer lexer = new Skel2Lexer(CharStreams.fromPath(path));
	        Skel2Parser parser = new Skel2Parser(new CommonTokenStream(lexer));
//	        List<ProgramPartContext> progContext = parser.skeletonProgram().programPart();
//	        progContext.forEach(c -> {System.out.println(c.getText() +" c");});
//	       PipeContext mainCtx =  (PipeContext) progContext.stream().filter(ctx -> ctx.equals(MainContext.class));
	        ParseTree tree = parser.skeletonProgram();
//	       System.out.println(mainCtx.toString());
	        MySkel2Visitor<T> visitor = new MySkel2Visitor<T>();
	        Skel2Visitor1 visitor2 = new Skel2Visitor1();
	        Skel2Visitor2 visitor3 = new Skel2Visitor2();
	        visitor3.visit(tree); 
	        // http://stackoverflow.com/questions/30134121/drawing-parse-tree-in-antlr4-using-java/30137407#30137407
//			 List<String> ruleNames=Arrays.asList(parser.getRuleNames());
//			 System.out.println("rules" + ruleNames);
			 // http://stackoverflow.com/questions/34832518/antlr4-dotgenerator-example
//			 TreeViewer tv=new TreeViewer(ruleNames,tree.getChild(2));
//			 showTreeViewer(tv);
	    }
		
			
	/**
	 * start at main
	 * create root node
	 * add childNode . visit(ctx.expr)
	 * each pattern visitor creates 
	 * 	creates a node
	 * 	add child nodes . visit(ctx.depending on the pattern choose the exp)
	 * pipe and comp can have more than one children
	 * farm, seq and map can have only one child
	 * 
	 */

}
