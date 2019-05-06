package pattern;

import java.lang.Exception;
import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import pattern.skel.SkelLexer;
import pattern.skel.SkelParser;



@SuppressWarnings("deprecation")
public class Main {

    public static <T> void main(String[] args) throws Exception {

        if (args.length == 0) {
            args = new String[]{"src/main/pattern/pattern.skel"};
        }

        System.out.println("parsing: " + args[0]);

        SkelLexer lexer = new SkelLexer(new ANTLRFileStream(args[0]));
        SkelParser parser = new SkelParser(new CommonTokenStream(lexer));
        ParseTree tree = parser.parse();
        SVisitor visitor = new SVisitor();
        visitor.visit(tree);
    }
}
