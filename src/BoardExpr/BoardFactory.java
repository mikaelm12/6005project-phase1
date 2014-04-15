package BoardExpr;

import java.io.File;
import java.io.IOException;

import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import warmup.Board;


public class BoardFactory {
    
    
    /**
     * @param input string representing a conjunctive boolean expression
     * @return Expression corresponding to the input
     */
    public static Board parse(String path) {
        // Create a stream of tokens using the lexer.
        CharStream stream;
        try {
            stream = new ANTLRFileStream(path);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            throw new RuntimeException("Cannot Read File");
        }
        
        BoardGrammarLexer lexer = new BoardGrammarLexer(stream);
        lexer.reportErrorsAsExceptions();
        TokenStream tokens = new CommonTokenStream(lexer);
        
        // Feed the tokens into the parser.
        BoardGrammarParser parser = new BoardGrammarParser(tokens);
        parser.reportErrorsAsExceptions();
        
        // Generate the parse tree using the starter rule.
        ParseTree tree = parser.board(); // "expression" is the starter rule
        
        // debugging option #1: print the tree to the console
//        System.err.println(tree.toStringTree(parser));

        // debugging option #2: show the tree in a window
        ((RuleContext)tree).inspect(parser);

        // debugging option #3: walk the tree with a listener
//        new ParseTreeWalker().walk(new PrintEverythingListener(), tree);
        
        // Finally, construct an Expression value by walking over the parse tree.
        //ParseTreeWalker walker = new ParseTreeWalker();
        //BoardFileListener listener = new BoardFileListener();
        //walker.walk(listener, tree);
        
        // return the Expression value that the listener created
        return null;//listener.getExpression(); //mot boilerplate
    }
    
    

}
