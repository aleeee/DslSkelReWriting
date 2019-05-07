package pattern;

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

public class launch {
	public static  <T> void main(String[] args) throws Exception {

        if (args.length == 0) {
            args = new String[]{"src/main/pattern/pattern.skel"};
        }

        System.out.println("parsing: " + args[0]);

        SkelLexer lexer = new SkelLexer(new ANTLRFileStream(args[0]));
        SkelParser parser = new SkelParser(new CommonTokenStream(lexer));
        ParseTree tree = parser.parse();
        SkeletonsVisitor<T> visitor = new SkeletonsVisitor<T>();
        visitor.visit(tree); 
		 System.exit(0);
    }
	 

		
}
