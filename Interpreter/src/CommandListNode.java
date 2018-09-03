import java.util.ArrayList;
import java.util.List;

/**
 * Created by kilo on 2018/9/3.
 * <command list> ::= <command>* end
 */
public class CommandListNode extends Node {
    private List list = new ArrayList();

    @Override
    public void parse(Context context) throws ParseException {
        while (true) {
            if (context.getCurrentToken() == null) {
                throw new ParseException("Missing 'end'");
            } else if (context.getCurrentToken().equals("end")) {
                context.skipToken("end");
                break;
            } else {
                Node commandNode = new CommandNode();
                commandNode.parse(context);
                list.add(commandNode);
            }
        }
    }

    @Override
    public String toString() {
        return list.toString();
    }
}
