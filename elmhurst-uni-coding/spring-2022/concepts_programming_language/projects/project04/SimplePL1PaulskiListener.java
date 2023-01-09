// Generated from SimplePL1Paulski.g4 by ANTLR 4.9.3
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SimplePL1PaulskiParser}.
 */
public interface SimplePL1PaulskiListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SimplePL1PaulskiParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(SimplePL1PaulskiParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimplePL1PaulskiParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(SimplePL1PaulskiParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimplePL1PaulskiParser#stmt_list}.
	 * @param ctx the parse tree
	 */
	void enterStmt_list(SimplePL1PaulskiParser.Stmt_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimplePL1PaulskiParser#stmt_list}.
	 * @param ctx the parse tree
	 */
	void exitStmt_list(SimplePL1PaulskiParser.Stmt_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimplePL1PaulskiParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(SimplePL1PaulskiParser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimplePL1PaulskiParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(SimplePL1PaulskiParser.StmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimplePL1PaulskiParser#expr_list}.
	 * @param ctx the parse tree
	 */
	void enterExpr_list(SimplePL1PaulskiParser.Expr_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimplePL1PaulskiParser#expr_list}.
	 * @param ctx the parse tree
	 */
	void exitExpr_list(SimplePL1PaulskiParser.Expr_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimplePL1PaulskiParser#expr_list_tail}.
	 * @param ctx the parse tree
	 */
	void enterExpr_list_tail(SimplePL1PaulskiParser.Expr_list_tailContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimplePL1PaulskiParser#expr_list_tail}.
	 * @param ctx the parse tree
	 */
	void exitExpr_list_tail(SimplePL1PaulskiParser.Expr_list_tailContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimplePL1PaulskiParser#id_list}.
	 * @param ctx the parse tree
	 */
	void enterId_list(SimplePL1PaulskiParser.Id_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimplePL1PaulskiParser#id_list}.
	 * @param ctx the parse tree
	 */
	void exitId_list(SimplePL1PaulskiParser.Id_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimplePL1PaulskiParser#id_list_tail}.
	 * @param ctx the parse tree
	 */
	void enterId_list_tail(SimplePL1PaulskiParser.Id_list_tailContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimplePL1PaulskiParser#id_list_tail}.
	 * @param ctx the parse tree
	 */
	void exitId_list_tail(SimplePL1PaulskiParser.Id_list_tailContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimplePL1PaulskiParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(SimplePL1PaulskiParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimplePL1PaulskiParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(SimplePL1PaulskiParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimplePL1PaulskiParser#term_tail}.
	 * @param ctx the parse tree
	 */
	void enterTerm_tail(SimplePL1PaulskiParser.Term_tailContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimplePL1PaulskiParser#term_tail}.
	 * @param ctx the parse tree
	 */
	void exitTerm_tail(SimplePL1PaulskiParser.Term_tailContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimplePL1PaulskiParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(SimplePL1PaulskiParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimplePL1PaulskiParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(SimplePL1PaulskiParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimplePL1PaulskiParser#factor_tail}.
	 * @param ctx the parse tree
	 */
	void enterFactor_tail(SimplePL1PaulskiParser.Factor_tailContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimplePL1PaulskiParser#factor_tail}.
	 * @param ctx the parse tree
	 */
	void exitFactor_tail(SimplePL1PaulskiParser.Factor_tailContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimplePL1PaulskiParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(SimplePL1PaulskiParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimplePL1PaulskiParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(SimplePL1PaulskiParser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimplePL1PaulskiParser#add_op}.
	 * @param ctx the parse tree
	 */
	void enterAdd_op(SimplePL1PaulskiParser.Add_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimplePL1PaulskiParser#add_op}.
	 * @param ctx the parse tree
	 */
	void exitAdd_op(SimplePL1PaulskiParser.Add_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimplePL1PaulskiParser#mult_op}.
	 * @param ctx the parse tree
	 */
	void enterMult_op(SimplePL1PaulskiParser.Mult_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimplePL1PaulskiParser#mult_op}.
	 * @param ctx the parse tree
	 */
	void exitMult_op(SimplePL1PaulskiParser.Mult_opContext ctx);
}