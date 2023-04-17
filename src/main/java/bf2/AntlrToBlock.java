package bf2;

import antlr.bf2BaseVisitor;
import antlr.bf2Parser;

public class AntlrToBlock extends bf2BaseVisitor<Block> {
    @Override
    public Block visitBlock(bf2Parser.BlockContext ctx) {
        System.out.println("Antlr To Block");
        AntlrToCommand commandVisitor = new AntlrToCommand();
        Block block = new Block();
        for (int i = 1; i < ctx.getChildCount() - 1; i++)
        {
            Command com = commandVisitor.visit(ctx.getChild(i));
            block.addCommand(com);
        }
        return block;
    }
}
