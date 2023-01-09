import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
import java.io.FileInputStream;
import java.io.InputStream;
public class SimplePL1Paulski {
 public static void main(String[] args) throws Exception {
 String inputFile = null;
 if ( args.length>0 ) inputFile = args[0];
 InputStream is = System.in;
 if ( inputFile!=null ) is = new FileInputStream(inputFile);
 ANTLRInputStream input = new ANTLRInputStream(is);
 SimplePL1PaulskiLexer lexer = new SimplePL1PaulskiLexer(input);
 CommonTokenStream tokens = new CommonTokenStream(lexer);
 SimplePL1PaulskiParser parser = new SimplePL1PaulskiParser(tokens);
 ParseTree tree = parser.program(); // parse
 System.out.println(tree.toStringTree(parser)); // print LISP-style tree
 }
}