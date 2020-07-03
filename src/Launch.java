import java.io.IOException;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import static org.antlr.v4.runtime.CharStreams.fromFileName;

public class Launch {
    public static void main(String argc[]){
        try{
            String source = "test.txt";
            CharStream cs = fromFileName(source);
            sqlLexer lexer = new sqlLexer(cs);
            CommonTokenStream token = new CommonTokenStream(lexer);
            sqlParser parser = new sqlParser(token);
            ParseTree tree = parser.sentencia();

            MyVisitor visitor = new MyVisitor();
            visitor.visit(tree);
        }catch(IOException e){
            e.printStackTrace();
        }

    }
}
