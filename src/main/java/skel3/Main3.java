package skel3;

import java.nio.file.Path;
import java.nio.file.Paths;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import pattern.skel3.Skel3Lexer;
import pattern.skel3.Skel3Parser;
import tree.Node;




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
        System.out.println(n);
    }
	
}
