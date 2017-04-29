// Generated from CoolParser.g4 by ANTLR 4.5.3

	import cool.AST;
	import java.util.List;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CoolParser}.
 */
public interface CoolParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CoolParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(CoolParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoolParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(CoolParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoolParser#class_list}.
	 * @param ctx the parse tree
	 */
	void enterClass_list(CoolParser.Class_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoolParser#class_list}.
	 * @param ctx the parse tree
	 */
	void exitClass_list(CoolParser.Class_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoolParser#class_s}.
	 * @param ctx the parse tree
	 */
	void enterClass_s(CoolParser.Class_sContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoolParser#class_s}.
	 * @param ctx the parse tree
	 */
	void exitClass_s(CoolParser.Class_sContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoolParser#feature}.
	 * @param ctx the parse tree
	 */
	void enterFeature(CoolParser.FeatureContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoolParser#feature}.
	 * @param ctx the parse tree
	 */
	void exitFeature(CoolParser.FeatureContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoolParser#formal}.
	 * @param ctx the parse tree
	 */
	void enterFormal(CoolParser.FormalContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoolParser#formal}.
	 * @param ctx the parse tree
	 */
	void exitFormal(CoolParser.FormalContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoolParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(CoolParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoolParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(CoolParser.ExprContext ctx);
}