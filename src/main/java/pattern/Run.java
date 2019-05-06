package pattern;

import java.nio.file.Path;
import java.nio.file.Paths;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import pattern.skel.SkelLexer;
import pattern.skel.SkelParser;

public class Run {
	public static <T> void main(String[] args) throws Exception {

        if (args.length == 0) {
            args = new String[]{"src/main/pattern/pattern.skel"};
        }

        System.out.println("parsing: " + args[0]);
        Path path = Paths.get(args[0]);
        SkelLexer lexer = new SkelLexer(CharStreams.fromPath(path));
        SkelParser parser = new SkelParser(new CommonTokenStream(lexer));
        ParseTree tree = parser.parse();
        System.out.println(tree.getChildCount());
        SkeletonsVisitor<T> visitor = new SkeletonsVisitor<T>();
        visitor.visit(tree);
    }
}
