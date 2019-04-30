package pattern;

import org.antlr.v4.runtime.ANTLRFileStream;
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

        SkelLexer lexer = new SkelLexer(new ANTLRFileStream(args[0]));
        SkelParser parser = new SkelParser(new CommonTokenStream(lexer));
        ParseTree tree = parser.parse();
        System.out.println(tree.getChildCount());
        SkeletonsVisitor<T> visitor = new SkeletonsVisitor<T>();
        visitor.visit(tree);
    }
}
