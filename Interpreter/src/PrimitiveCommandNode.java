/**
 * Created by kilo on 2018/9/3.
 * <primitive command> ::= go | right | left
 */
public class PrimitiveCommandNode extends Node {

    private String name;

    @Override
    public void parse(Context context) throws ParseException {
        name = context.getCurrentToken();
        context.skipToken(name);
        if (!name.equals("go") && !name.equals("right") && !name.equals("left")) {
            throw new ParseException(name + " is undefined");
        }
    }

    public String toString() {
        return name;
    }
}
