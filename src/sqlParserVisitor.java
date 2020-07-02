// Generated from /home/rodrigo/IdeaProjects/sqlGrammar/sqlParser.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link sqlParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface sqlParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link sqlParser#select}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect(sqlParser.SelectContext ctx);
	/**
	 * Visit a parse tree produced by {@link sqlParser#column}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn(sqlParser.ColumnContext ctx);
	/**
	 * Visit a parse tree produced by {@link sqlParser#columna}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumna(sqlParser.ColumnaContext ctx);
	/**
	 * Visit a parse tree produced by {@link sqlParser#tabla}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTabla(sqlParser.TablaContext ctx);
	/**
	 * Visit a parse tree produced by {@link sqlParser#clausula}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClausula(sqlParser.ClausulaContext ctx);
	/**
	 * Visit a parse tree produced by {@link sqlParser#condicion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondicion(sqlParser.CondicionContext ctx);
	/**
	 * Visit a parse tree produced by {@link sqlParser#var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar(sqlParser.VarContext ctx);
	/**
	 * Visit a parse tree produced by {@link sqlParser#operador}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperador(sqlParser.OperadorContext ctx);
}