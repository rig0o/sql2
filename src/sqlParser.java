// Generated from /home/rodrigo/IdeaProjects/sqlGrammar/sqlParser.g4 by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class sqlParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SELECT=1, FROM=2, WHERE=3, CREATE=4, DELETE=5, BETWEEN=6, ORDEN_BY=7, 
		GROUP_BY=8, LEFT_JOIN=9, INNER_JOIN=10, RIGHT_JOIN=11, IN=12, DESC=13, 
		AND=14, OR=15, NOT=16, PAR_OPEN=17, PAR_CLOUSE=18, EQ=19, GT=20, LT=21, 
		GEQ=22, LEQ=23, DOT=24, COMA=25, PUNTOCOMA=26, WC=27, STRING=28, ID=29, 
		INT=30, FLOAT=31, WS=32;
	public static final int
		RULE_select = 0, RULE_column = 1, RULE_columna = 2, RULE_tabla = 3, RULE_clausula = 4, 
		RULE_condicion = 5, RULE_var = 6, RULE_operador = 7;
	private static String[] makeRuleNames() {
		return new String[] {
			"select", "column", "columna", "tabla", "clausula", "condicion", "var", 
			"operador"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, "'('", "')'", "'='", "'>'", "'<'", "'>='", 
			"'<='", "'.'", "','", "';'", "'*'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "SELECT", "FROM", "WHERE", "CREATE", "DELETE", "BETWEEN", "ORDEN_BY", 
			"GROUP_BY", "LEFT_JOIN", "INNER_JOIN", "RIGHT_JOIN", "IN", "DESC", "AND", 
			"OR", "NOT", "PAR_OPEN", "PAR_CLOUSE", "EQ", "GT", "LT", "GEQ", "LEQ", 
			"DOT", "COMA", "PUNTOCOMA", "WC", "STRING", "ID", "INT", "FLOAT", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "sqlParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public sqlParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class SelectContext extends ParserRuleContext {
		public TerminalNode SELECT() { return getToken(sqlParser.SELECT, 0); }
		public ColumnContext column() {
			return getRuleContext(ColumnContext.class,0);
		}
		public TerminalNode FROM() { return getToken(sqlParser.FROM, 0); }
		public TablaContext tabla() {
			return getRuleContext(TablaContext.class,0);
		}
		public TerminalNode WHERE() { return getToken(sqlParser.WHERE, 0); }
		public ClausulaContext clausula() {
			return getRuleContext(ClausulaContext.class,0);
		}
		public TerminalNode PUNTOCOMA() { return getToken(sqlParser.PUNTOCOMA, 0); }
		public SelectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sqlParserListener ) ((sqlParserListener)listener).enterSelect(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sqlParserListener ) ((sqlParserListener)listener).exitSelect(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sqlParserVisitor ) return ((sqlParserVisitor<? extends T>)visitor).visitSelect(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectContext select() throws RecognitionException {
		SelectContext _localctx = new SelectContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_select);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(16);
			match(SELECT);
			setState(17);
			column();
			setState(18);
			match(FROM);
			setState(19);
			tabla();
			setState(20);
			match(WHERE);
			setState(21);
			clausula();
			setState(22);
			match(PUNTOCOMA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ColumnContext extends ParserRuleContext {
		public List<TablaContext> tabla() {
			return getRuleContexts(TablaContext.class);
		}
		public TablaContext tabla(int i) {
			return getRuleContext(TablaContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(sqlParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(sqlParser.DOT, i);
		}
		public List<ColumnaContext> columna() {
			return getRuleContexts(ColumnaContext.class);
		}
		public ColumnaContext columna(int i) {
			return getRuleContext(ColumnaContext.class,i);
		}
		public List<TerminalNode> COMA() { return getTokens(sqlParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(sqlParser.COMA, i);
		}
		public TerminalNode WC() { return getToken(sqlParser.WC, 0); }
		public ColumnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sqlParserListener ) ((sqlParserListener)listener).enterColumn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sqlParserListener ) ((sqlParserListener)listener).exitColumn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sqlParserVisitor ) return ((sqlParserVisitor<? extends T>)visitor).visitColumn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnContext column() throws RecognitionException {
		ColumnContext _localctx = new ColumnContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_column);
		int _la;
		try {
			setState(46);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(24);
				tabla();
				setState(25);
				match(DOT);
				setState(26);
				columna();
				setState(34);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMA) {
					{
					{
					setState(27);
					match(COMA);
					setState(28);
					tabla();
					setState(29);
					match(DOT);
					setState(30);
					columna();
					}
					}
					setState(36);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(37);
				columna();
				setState(42);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMA) {
					{
					{
					setState(38);
					match(COMA);
					setState(39);
					columna();
					}
					}
					setState(44);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(45);
				match(WC);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ColumnaContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(sqlParser.ID, 0); }
		public ColumnaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columna; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sqlParserListener ) ((sqlParserListener)listener).enterColumna(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sqlParserListener ) ((sqlParserListener)listener).exitColumna(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sqlParserVisitor ) return ((sqlParserVisitor<? extends T>)visitor).visitColumna(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnaContext columna() throws RecognitionException {
		ColumnaContext _localctx = new ColumnaContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_columna);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TablaContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(sqlParser.ID, 0); }
		public TablaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tabla; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sqlParserListener ) ((sqlParserListener)listener).enterTabla(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sqlParserListener ) ((sqlParserListener)listener).exitTabla(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sqlParserVisitor ) return ((sqlParserVisitor<? extends T>)visitor).visitTabla(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TablaContext tabla() throws RecognitionException {
		TablaContext _localctx = new TablaContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_tabla);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClausulaContext extends ParserRuleContext {
		public List<CondicionContext> condicion() {
			return getRuleContexts(CondicionContext.class);
		}
		public CondicionContext condicion(int i) {
			return getRuleContext(CondicionContext.class,i);
		}
		public List<OperadorContext> operador() {
			return getRuleContexts(OperadorContext.class);
		}
		public OperadorContext operador(int i) {
			return getRuleContext(OperadorContext.class,i);
		}
		public List<ClausulaContext> clausula() {
			return getRuleContexts(ClausulaContext.class);
		}
		public ClausulaContext clausula(int i) {
			return getRuleContext(ClausulaContext.class,i);
		}
		public TerminalNode PAR_OPEN() { return getToken(sqlParser.PAR_OPEN, 0); }
		public TerminalNode PAR_CLOUSE() { return getToken(sqlParser.PAR_CLOUSE, 0); }
		public TerminalNode NOT() { return getToken(sqlParser.NOT, 0); }
		public ClausulaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_clausula; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sqlParserListener ) ((sqlParserListener)listener).enterClausula(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sqlParserListener ) ((sqlParserListener)listener).exitClausula(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sqlParserVisitor ) return ((sqlParserVisitor<? extends T>)visitor).visitClausula(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClausulaContext clausula() throws RecognitionException {
		ClausulaContext _localctx = new ClausulaContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_clausula);
		try {
			int _alt;
			setState(79);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(52);
				condicion();
				setState(58);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(53);
						operador();
						setState(54);
						condicion();
						}
						} 
					}
					setState(60);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(61);
				condicion();
				setState(67);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(62);
						operador();
						setState(63);
						clausula();
						}
						} 
					}
					setState(69);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(70);
				match(PAR_OPEN);
				setState(71);
				clausula();
				setState(72);
				match(PAR_CLOUSE);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(74);
				match(NOT);
				setState(75);
				clausula();
				{
				setState(76);
				operador();
				setState(77);
				clausula();
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CondicionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(sqlParser.ID, 0); }
		public TerminalNode EQ() { return getToken(sqlParser.EQ, 0); }
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public CondicionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sqlParserListener ) ((sqlParserListener)listener).enterCondicion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sqlParserListener ) ((sqlParserListener)listener).exitCondicion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sqlParserVisitor ) return ((sqlParserVisitor<? extends T>)visitor).visitCondicion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondicionContext condicion() throws RecognitionException {
		CondicionContext _localctx = new CondicionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_condicion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			match(ID);
			setState(82);
			match(EQ);
			setState(83);
			var();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(sqlParser.STRING, 0); }
		public TerminalNode INT() { return getToken(sqlParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(sqlParser.FLOAT, 0); }
		public VarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sqlParserListener ) ((sqlParserListener)listener).enterVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sqlParserListener ) ((sqlParserListener)listener).exitVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sqlParserVisitor ) return ((sqlParserVisitor<? extends T>)visitor).visitVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarContext var() throws RecognitionException {
		VarContext _localctx = new VarContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_var);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRING) | (1L << INT) | (1L << FLOAT))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OperadorContext extends ParserRuleContext {
		public TerminalNode AND() { return getToken(sqlParser.AND, 0); }
		public TerminalNode OR() { return getToken(sqlParser.OR, 0); }
		public OperadorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operador; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sqlParserListener ) ((sqlParserListener)listener).enterOperador(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sqlParserListener ) ((sqlParserListener)listener).exitOperador(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sqlParserVisitor ) return ((sqlParserVisitor<? extends T>)visitor).visitOperador(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperadorContext operador() throws RecognitionException {
		OperadorContext _localctx = new OperadorContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_operador);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			_la = _input.LA(1);
			if ( !(_la==AND || _la==OR) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\"\\\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3#\n\3\f\3\16\3&\13\3\3"+
		"\3\3\3\3\3\7\3+\n\3\f\3\16\3.\13\3\3\3\5\3\61\n\3\3\4\3\4\3\5\3\5\3\6"+
		"\3\6\3\6\3\6\7\6;\n\6\f\6\16\6>\13\6\3\6\3\6\3\6\3\6\7\6D\n\6\f\6\16\6"+
		"G\13\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6R\n\6\3\7\3\7\3\7\3\7\3"+
		"\b\3\b\3\t\3\t\3\t\2\2\n\2\4\6\b\n\f\16\20\2\4\4\2\36\36 !\3\2\20\21\2"+
		"\\\2\22\3\2\2\2\4\60\3\2\2\2\6\62\3\2\2\2\b\64\3\2\2\2\nQ\3\2\2\2\fS\3"+
		"\2\2\2\16W\3\2\2\2\20Y\3\2\2\2\22\23\7\3\2\2\23\24\5\4\3\2\24\25\7\4\2"+
		"\2\25\26\5\b\5\2\26\27\7\5\2\2\27\30\5\n\6\2\30\31\7\34\2\2\31\3\3\2\2"+
		"\2\32\33\5\b\5\2\33\34\7\32\2\2\34$\5\6\4\2\35\36\7\33\2\2\36\37\5\b\5"+
		"\2\37 \7\32\2\2 !\5\6\4\2!#\3\2\2\2\"\35\3\2\2\2#&\3\2\2\2$\"\3\2\2\2"+
		"$%\3\2\2\2%\61\3\2\2\2&$\3\2\2\2\',\5\6\4\2()\7\33\2\2)+\5\6\4\2*(\3\2"+
		"\2\2+.\3\2\2\2,*\3\2\2\2,-\3\2\2\2-\61\3\2\2\2.,\3\2\2\2/\61\7\35\2\2"+
		"\60\32\3\2\2\2\60\'\3\2\2\2\60/\3\2\2\2\61\5\3\2\2\2\62\63\7\37\2\2\63"+
		"\7\3\2\2\2\64\65\7\37\2\2\65\t\3\2\2\2\66<\5\f\7\2\678\5\20\t\289\5\f"+
		"\7\29;\3\2\2\2:\67\3\2\2\2;>\3\2\2\2<:\3\2\2\2<=\3\2\2\2=R\3\2\2\2><\3"+
		"\2\2\2?E\5\f\7\2@A\5\20\t\2AB\5\n\6\2BD\3\2\2\2C@\3\2\2\2DG\3\2\2\2EC"+
		"\3\2\2\2EF\3\2\2\2FR\3\2\2\2GE\3\2\2\2HI\7\23\2\2IJ\5\n\6\2JK\7\24\2\2"+
		"KR\3\2\2\2LM\7\22\2\2MN\5\n\6\2NO\5\20\t\2OP\5\n\6\2PR\3\2\2\2Q\66\3\2"+
		"\2\2Q?\3\2\2\2QH\3\2\2\2QL\3\2\2\2R\13\3\2\2\2ST\7\37\2\2TU\7\25\2\2U"+
		"V\5\16\b\2V\r\3\2\2\2WX\t\2\2\2X\17\3\2\2\2YZ\t\3\2\2Z\21\3\2\2\2\b$,"+
		"\60<EQ";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}