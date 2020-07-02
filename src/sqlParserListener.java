// Generated from /home/rodrigo/IdeaProjects/sqlGrammar/sqlParser.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link sqlParser}.
 */
public interface sqlParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link sqlParser#select}.
	 * @param ctx the parse tree
	 */
	void enterSelect(sqlParser.SelectContext ctx);
	/**
	 * Exit a parse tree produced by {@link sqlParser#select}.
	 * @param ctx the parse tree
	 */
	void exitSelect(sqlParser.SelectContext ctx);
	/**
	 * Enter a parse tree produced by {@link sqlParser#column}.
	 * @param ctx the parse tree
	 */
	void enterColumn(sqlParser.ColumnContext ctx);
	/**
	 * Exit a parse tree produced by {@link sqlParser#column}.
	 * @param ctx the parse tree
	 */
	void exitColumn(sqlParser.ColumnContext ctx);
	/**
	 * Enter a parse tree produced by {@link sqlParser#columna}.
	 * @param ctx the parse tree
	 */
	void enterColumna(sqlParser.ColumnaContext ctx);
	/**
	 * Exit a parse tree produced by {@link sqlParser#columna}.
	 * @param ctx the parse tree
	 */
	void exitColumna(sqlParser.ColumnaContext ctx);
	/**
	 * Enter a parse tree produced by {@link sqlParser#tabla}.
	 * @param ctx the parse tree
	 */
	void enterTabla(sqlParser.TablaContext ctx);
	/**
	 * Exit a parse tree produced by {@link sqlParser#tabla}.
	 * @param ctx the parse tree
	 */
	void exitTabla(sqlParser.TablaContext ctx);
	/**
	 * Enter a parse tree produced by {@link sqlParser#clausula}.
	 * @param ctx the parse tree
	 */
	void enterClausula(sqlParser.ClausulaContext ctx);
	/**
	 * Exit a parse tree produced by {@link sqlParser#clausula}.
	 * @param ctx the parse tree
	 */
	void exitClausula(sqlParser.ClausulaContext ctx);
	/**
	 * Enter a parse tree produced by {@link sqlParser#condicion}.
	 * @param ctx the parse tree
	 */
	void enterCondicion(sqlParser.CondicionContext ctx);
	/**
	 * Exit a parse tree produced by {@link sqlParser#condicion}.
	 * @param ctx the parse tree
	 */
	void exitCondicion(sqlParser.CondicionContext ctx);
	/**
	 * Enter a parse tree produced by {@link sqlParser#var}.
	 * @param ctx the parse tree
	 */
	void enterVar(sqlParser.VarContext ctx);
	/**
	 * Exit a parse tree produced by {@link sqlParser#var}.
	 * @param ctx the parse tree
	 */
	void exitVar(sqlParser.VarContext ctx);
	/**
	 * Enter a parse tree produced by {@link sqlParser#operador}.
	 * @param ctx the parse tree
	 */
	void enterOperador(sqlParser.OperadorContext ctx);
	/**
	 * Exit a parse tree produced by {@link sqlParser#operador}.
	 * @param ctx the parse tree
	 */
	void exitOperador(sqlParser.OperadorContext ctx);
}