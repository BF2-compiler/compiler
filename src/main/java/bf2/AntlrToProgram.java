package bf2;

import antlr.bf2BaseVisitor;
import antlr.bf2Parser;

public class AntlrToProgram extends bf2BaseVisitor<Program>{
    @Override
    public Program visitProgram(bf2Parser.ProgramContext ctx) {
//        Program prog  = new Program();
//
//        AntlrToLine lineVisitor = new AntlrToLine();
//
//        for( int i=0; i < ctx.getChildCount(); i++)
//        {
//            if ( i == ctx.getChildCount() -1 )
//            {
//                /* last line of the start symbol prog is EOF */
//            }
//            else {
//                prog.addLine(lineVisitor.visitLine(ctx.getChild(i)));
//            }
//        }

        return super.visitProgram(ctx);
    }
}