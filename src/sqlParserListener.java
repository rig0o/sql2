// Generated from /home/rodrigo/IdeaProjects/sqlGrammar/sqlParser.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link sqlParser}.
 */
public interface sqlParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link sqlParser#sentencia}.
	 * @param ctx the parse tree
	 */
	void enterSentencia(sqlParser.SentenciaContext ctx);
	/**
	 * Exit a parse tree produced by {@link sqlParser#sentencia}.
	 * @param ctx the parse tree
	 */
	void exitSentencia(sqlParser.SentenciaContext ctx);
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
	 * Enter a parse tree produced by {@link sqlParser#create_table}.
	 * @param ctx the parse tree
	 */
	void enterCreate_table(sqlParser.Create_tableContext ctx);
	/**
	 * Exit a parse tree produced by {@link sqlParser#create_table}.
	 * @param ctx the parse tree
	 */
	void exitCreate_table(sqlParser.Create_tableContext ctx);
	/**
	 * Enter a parse tree produced by {@link sqlParser#delete}.
	 * @param ctx the parse tree
	 */
	void enterDelete(sqlParser.DeleteContext ctx);
	/**
	 * Exit a parse tree produced by {@link sqlParser#delete}.
	 * @param ctx the parse tree
	 */
	void exitDelete(sqlParser.DeleteContext ctx);
	/**
	 * Enter a parse tree produced by {@link sqlParser#update}.
	 * @param ctx the parse tree
	 */
	void enterUpdate(sqlParser.UpdateContext ctx);
	/**
	 * Exit a parse tree produced by {@link sqlParser#update}.
	 * @param ctx the parse tree
	 */
	void exitUpdate(sqlParser.UpdateContext ctx);
	/**
	 * Enter a parse tree produced by {@link sqlParser#opcion}.
	 * @param ctx the parse tree
	 */
	void enterOpcion(sqlParser.OpcionContext ctx);
	/**
	 * Exit a parse tree produced by {@link sqlParser#opcion}.
	 * @param ctx the parse tree
	 */
	void exitOpcion(sqlParser.OpcionContext ctx);
	/**
	 * Enter a parse tree produced by {@link sqlParser#where}.
	 * @param ctx the parse tree
	 */
	void enterWhere(sqlParser.WhereContext ctx);
	/**
	 * Exit a parse tree produced by {@link sqlParser#where}.
	 * @param ctx the parse tree
	 */
	void exitWhere(sqlParser.WhereContext ctx);
	/**
	 * Enter a parse tree produced by {@link sqlParser#inner}.
	 * @param ctx the parse tree
	 */
	void enterInner(sqlParser.InnerContext ctx);
	/**
	 * Exit a parse tree produced by {@link sqlParser#inner}.
	 * @param ctx the parse tree
	 */
	void exitInner(sqlParser.InnerContext ctx);
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
	 * Enter a parse tree produced by {@link sqlParser#like}.
	 * @param ctx the parse tree
	 */
	void enterLike(sqlParser.LikeContext ctx);
	/**
	 * Exit a parse tree produced by {@link sqlParser#like}.
	 * @param ctx the parse tree
	 */
	void exitLike(sqlParser.LikeContext ctx);
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
	 * Enter a parse tree produced by {@link sqlParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(sqlParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link sqlParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(sqlParser.TypeContext ctx);
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