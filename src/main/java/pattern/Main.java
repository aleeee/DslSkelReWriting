package pattern;

import java.lang.Exception;
import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;



@SuppressWarnings("deprecation")
public class Main {

    public static <T> void main(String[] args) throws Exception {

        if (args.length == 0) {
            args = new String[]{"src/main/pattern/pattern.skel"};
        }

        System.out.println("parsing: " + args[0]);

        PatternLexer lexer = new PatternLexer(new ANTLRFileStream(args[0]));
        PatternParser parser = new PatternParser(new CommonTokenStream(lexer));
        ParseTree tree = parser.parse();
        SkeletonVisitor<T> visitor = new SkeletonVisitor<T>();
        visitor.visit(tree);
    }
}
