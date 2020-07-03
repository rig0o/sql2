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
		SELECT=1, FROM=2, WHERE=3, CREATE=4, DELETE=5, BETWEEN=6, ORDER_BY=7, 
		GROUP_BY=8, LEFT_JOIN=9, INNER_JOIN=10, RIGHT_JOIN=11, IN=12, ON=13, INTEGER=14, 
		VARCHAR=15, DESC=16, ASC=17, AND=18, OR=19, NOT=20, PAR_OPEN=21, PAR_CLOUSE=22, 
		EQ=23, GT=24, LT=25, GEQ=26, LEQ=27, DOT=28, COMA=29, PUNTOCOMA=30, WC=31, 
		STRING=32, ID=33, INT=34, FLOAT=35, WS=36, UPDATE=37, SET=38, RIGH_JOIN=39, 
		LIKE=40;
	public static final int
		RULE_sentencia = 0, RULE_select = 1, RULE_create_table = 2, RULE_delete = 3, 
		RULE_update = 4, RULE_opcion = 5, RULE_where = 6, RULE_inner = 7, RULE_clausula = 8, 
		RULE_like = 9, RULE_column = 10, RULE_columna = 11, RULE_tabla = 12, RULE_condicion = 13, 
		RULE_var = 14, RULE_type = 15, RULE_operador = 16;
	private static String[] makeRuleNames() {
		return new String[] {
			"sentencia", "select", "create_table", "delete", "update", "opcion", 
			"where", "inner", "clausula", "like", "column", "columna", "tabla", "condicion", 
			"var", "type", "operador"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, "'('", "')'", "'='", 
			"'>'", "'<'", "'>='", "'<='", "'.'", "','", "';'", "'*'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "SELECT", "FROM", "WHERE", "CREATE", "DELETE", "BETWEEN", "ORDER_BY", 
			"GROUP_BY", "LEFT_JOIN", "INNER_JOIN", "RIGHT_JOIN", "IN", "ON", "INTEGER", 
			"VARCHAR", "DESC", "ASC", "AND", "OR", "NOT", "PAR_OPEN", "PAR_CLOUSE", 
			"EQ", "GT", "LT", "GEQ", "LEQ", "DOT", "COMA", "PUNTOCOMA", "WC", "STRING", 
			"ID", "INT", "FLOAT", "WS", "UPDATE", "SET", "RIGH_JOIN", "LIKE"
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

	public static class SentenciaContext extends ParserRuleContext {
		public List<SelectContext> select() {
			return getRuleContexts(SelectContext.class);
		}
		public SelectContext select(int i) {
			return getRuleContext(SelectContext.class,i);
		}
		public List<Create_tableContext> create_table() {
			return getRuleContexts(Create_tableContext.class);
		}
		public Create_tableContext create_table(int i) {
			return getRuleContext(Create_tableContext.class,i);
		}
		public List<DeleteContext> delete() {
			return getRuleContexts(DeleteContext.class);
		}
		public DeleteContext delete(int i) {
			return getRuleContext(DeleteContext.class,i);
		}
		public List<UpdateContext> update() {
			return getRuleContexts(UpdateContext.class);
		}
		public UpdateContext update(int i) {
			return getRuleContext(UpdateContext.class,i);
		}
		public SentenciaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentencia; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sqlParserListener ) ((sqlParserListener)listener).enterSentencia(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sqlParserListener ) ((sqlParserListener)listener).exitSentencia(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sqlParserVisitor ) return ((sqlParserVisitor<? extends T>)visitor).visitSentencia(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SentenciaContext sentencia() throws RecognitionException {
		SentenciaContext _localctx = new SentenciaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_sentencia);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(38);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case SELECT:
					{
					setState(34);
					select();
					}
					break;
				case ID:
					{
					setState(35);
					create_table();
					}
					break;
				case DELETE:
					{
					setState(36);
					delete();
					}
					break;
				case UPDATE:
					{
					setState(37);
					update();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(40); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SELECT) | (1L << DELETE) | (1L << ID) | (1L << UPDATE))) != 0) );
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

	public static class SelectContext extends ParserRuleContext {
		public TerminalNode SELECT() { return getToken(sqlParser.SELECT, 0); }
		public ColumnContext column() {
			return getRuleContext(ColumnContext.class,0);
		}
		public TerminalNode FROM() { return getToken(sqlParser.FROM, 0); }
		public TablaContext tabla() {
			return getRuleContext(TablaContext.class,0);
		}
		public TerminalNode PUNTOCOMA() { return getToken(sqlParser.PUNTOCOMA, 0); }
		public OpcionContext opcion() {
			return getRuleContext(OpcionContext.class,0);
		}
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
		enterRule(_localctx, 2, RULE_select);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			match(SELECT);
			setState(43);
			column();
			setState(44);
			match(FROM);
			setState(45);
			tabla();
			setState(47);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WHERE) | (1L << ORDER_BY) | (1L << LEFT_JOIN) | (1L << INNER_JOIN) | (1L << RIGH_JOIN))) != 0)) {
				{
				setState(46);
				opcion();
				}
			}

			setState(49);
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

	public static class Create_tableContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(sqlParser.ID, 0); }
		public TerminalNode PAR_OPEN() { return getToken(sqlParser.PAR_OPEN, 0); }
		public List<ColumnaContext> columna() {
			return getRuleContexts(ColumnaContext.class);
		}
		public ColumnaContext columna(int i) {
			return getRuleContext(ColumnaContext.class,i);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public TerminalNode PAR_CLOUSE() { return getToken(sqlParser.PAR_CLOUSE, 0); }
		public TerminalNode PUNTOCOMA() { return getToken(sqlParser.PUNTOCOMA, 0); }
		public List<TerminalNode> COMA() { return getTokens(sqlParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(sqlParser.COMA, i);
		}
		public Create_tableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sqlParserListener ) ((sqlParserListener)listener).enterCreate_table(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sqlParserListener ) ((sqlParserListener)listener).exitCreate_table(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sqlParserVisitor ) return ((sqlParserVisitor<? extends T>)visitor).visitCreate_table(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_tableContext create_table() throws RecognitionException {
		Create_tableContext _localctx = new Create_tableContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_create_table);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			match(ID);
			setState(52);
			match(PAR_OPEN);
			setState(53);
			columna();
			setState(54);
			type();
			setState(61);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(55);
				match(COMA);
				setState(56);
				columna();
				setState(57);
				type();
				}
				}
				setState(63);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(64);
			match(PAR_CLOUSE);
			setState(65);
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

	public static class DeleteContext extends ParserRuleContext {
		public TerminalNode DELETE() { return getToken(sqlParser.DELETE, 0); }
		public TerminalNode FROM() { return getToken(sqlParser.FROM, 0); }
		public TablaContext tabla() {
			return getRuleContext(TablaContext.class,0);
		}
		public TerminalNode PUNTOCOMA() { return getToken(sqlParser.PUNTOCOMA, 0); }
		public TerminalNode WHERE() { return getToken(sqlParser.WHERE, 0); }
		public ClausulaContext clausula() {
			return getRuleContext(ClausulaContext.class,0);
		}
		public DeleteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_delete; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sqlParserListener ) ((sqlParserListener)listener).enterDelete(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sqlParserListener ) ((sqlParserListener)listener).exitDelete(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sqlParserVisitor ) return ((sqlParserVisitor<? extends T>)visitor).visitDelete(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeleteContext delete() throws RecognitionException {
		DeleteContext _localctx = new DeleteContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_delete);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			match(DELETE);
			setState(68);
			match(FROM);
			setState(69);
			tabla();
			setState(72);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(70);
				match(WHERE);
				setState(71);
				clausula();
				}
			}

			setState(74);
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

	public static class UpdateContext extends ParserRuleContext {
		public TerminalNode UPDATE() { return getToken(sqlParser.UPDATE, 0); }
		public TablaContext tabla() {
			return getRuleContext(TablaContext.class,0);
		}
		public TerminalNode SET() { return getToken(sqlParser.SET, 0); }
		public List<CondicionContext> condicion() {
			return getRuleContexts(CondicionContext.class);
		}
		public CondicionContext condicion(int i) {
			return getRuleContext(CondicionContext.class,i);
		}
		public TerminalNode WHERE() { return getToken(sqlParser.WHERE, 0); }
		public TerminalNode PUNTOCOMA() { return getToken(sqlParser.PUNTOCOMA, 0); }
		public List<TerminalNode> COMA() { return getTokens(sqlParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(sqlParser.COMA, i);
		}
		public UpdateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_update; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sqlParserListener ) ((sqlParserListener)listener).enterUpdate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sqlParserListener ) ((sqlParserListener)listener).exitUpdate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sqlParserVisitor ) return ((sqlParserVisitor<? extends T>)visitor).visitUpdate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UpdateContext update() throws RecognitionException {
		UpdateContext _localctx = new UpdateContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_update);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			match(UPDATE);
			setState(77);
			tabla();
			setState(78);
			match(SET);
			setState(79);
			condicion();
			{
			setState(80);
			match(COMA);
			setState(81);
			condicion();
			}
			setState(83);
			match(WHERE);
			setState(84);
			condicion();
			{
			setState(85);
			match(COMA);
			setState(86);
			condicion();
			}
			setState(88);
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

	public static class OpcionContext extends ParserRuleContext {
		public WhereContext where() {
			return getRuleContext(WhereContext.class,0);
		}
		public InnerContext inner() {
			return getRuleContext(InnerContext.class,0);
		}
		public TablaContext tabla() {
			return getRuleContext(TablaContext.class,0);
		}
		public TerminalNode ON() { return getToken(sqlParser.ON, 0); }
		public List<ColumnContext> column() {
			return getRuleContexts(ColumnContext.class);
		}
		public ColumnContext column(int i) {
			return getRuleContext(ColumnContext.class,i);
		}
		public TerminalNode EQ() { return getToken(sqlParser.EQ, 0); }
		public TerminalNode ORDER_BY() { return getToken(sqlParser.ORDER_BY, 0); }
		public List<TerminalNode> DESC() { return getTokens(sqlParser.DESC); }
		public TerminalNode DESC(int i) {
			return getToken(sqlParser.DESC, i);
		}
		public List<TerminalNode> ASC() { return getTokens(sqlParser.ASC); }
		public TerminalNode ASC(int i) {
			return getToken(sqlParser.ASC, i);
		}
		public OpcionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opcion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sqlParserListener ) ((sqlParserListener)listener).enterOpcion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sqlParserListener ) ((sqlParserListener)listener).exitOpcion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sqlParserVisitor ) return ((sqlParserVisitor<? extends T>)visitor).visitOpcion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpcionContext opcion() throws RecognitionException {
		OpcionContext _localctx = new OpcionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_opcion);
		int _la;
		try {
			setState(107);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WHERE:
				enterOuterAlt(_localctx, 1);
				{
				setState(90);
				where();
				}
				break;
			case LEFT_JOIN:
			case INNER_JOIN:
			case RIGH_JOIN:
				enterOuterAlt(_localctx, 2);
				{
				setState(91);
				inner();
				setState(92);
				tabla();
				setState(93);
				match(ON);
				setState(94);
				column();
				setState(95);
				match(EQ);
				setState(96);
				column();
				}
				break;
			case ORDER_BY:
				enterOuterAlt(_localctx, 3);
				{
				setState(98);
				match(ORDER_BY);
				setState(103); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(99);
					column();
					setState(101);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==DESC || _la==ASC) {
						{
						setState(100);
						_la = _input.LA(1);
						if ( !(_la==DESC || _la==ASC) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
					}

					}
					}
					setState(105); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==WC || _la==ID );
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class WhereContext extends ParserRuleContext {
		public TerminalNode WHERE() { return getToken(sqlParser.WHERE, 0); }
		public ClausulaContext clausula() {
			return getRuleContext(ClausulaContext.class,0);
		}
		public ColumnContext column() {
			return getRuleContext(ColumnContext.class,0);
		}
		public TerminalNode BETWEEN() { return getToken(sqlParser.BETWEEN, 0); }
		public TerminalNode ID() { return getToken(sqlParser.ID, 0); }
		public List<VarContext> var() {
			return getRuleContexts(VarContext.class);
		}
		public VarContext var(int i) {
			return getRuleContext(VarContext.class,i);
		}
		public TerminalNode AND() { return getToken(sqlParser.AND, 0); }
		public TerminalNode NOT() { return getToken(sqlParser.NOT, 0); }
		public LikeContext like() {
			return getRuleContext(LikeContext.class,0);
		}
		public TerminalNode IN() { return getToken(sqlParser.IN, 0); }
		public TerminalNode PAR_OPEN() { return getToken(sqlParser.PAR_OPEN, 0); }
		public List<TerminalNode> STRING() { return getTokens(sqlParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(sqlParser.STRING, i);
		}
		public TerminalNode PAR_CLOUSE() { return getToken(sqlParser.PAR_CLOUSE, 0); }
		public List<TerminalNode> COMA() { return getTokens(sqlParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(sqlParser.COMA, i);
		}
		public WhereContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_where; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sqlParserListener ) ((sqlParserListener)listener).enterWhere(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sqlParserListener ) ((sqlParserListener)listener).exitWhere(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sqlParserVisitor ) return ((sqlParserVisitor<? extends T>)visitor).visitWhere(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhereContext where() throws RecognitionException {
		WhereContext _localctx = new WhereContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_where);
		int _la;
		try {
			setState(140);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(109);
				match(WHERE);
				setState(110);
				clausula();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(111);
				match(WHERE);
				setState(112);
				column();
				setState(114);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(113);
					match(NOT);
					}
				}

				setState(116);
				match(BETWEEN);
				setState(117);
				match(ID);
				setState(118);
				var();
				setState(119);
				match(AND);
				setState(120);
				var();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(122);
				match(WHERE);
				setState(123);
				column();
				setState(124);
				like();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(126);
				match(WHERE);
				setState(127);
				column();
				setState(128);
				match(IN);
				setState(129);
				match(PAR_OPEN);
				setState(130);
				match(STRING);
				setState(135);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMA) {
					{
					{
					setState(131);
					match(COMA);
					setState(132);
					match(STRING);
					}
					}
					setState(137);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(138);
				match(PAR_CLOUSE);
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

	public static class InnerContext extends ParserRuleContext {
		public TerminalNode INNER_JOIN() { return getToken(sqlParser.INNER_JOIN, 0); }
		public TerminalNode LEFT_JOIN() { return getToken(sqlParser.LEFT_JOIN, 0); }
		public TerminalNode RIGH_JOIN() { return getToken(sqlParser.RIGH_JOIN, 0); }
		public InnerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inner; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sqlParserListener ) ((sqlParserListener)listener).enterInner(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sqlParserListener ) ((sqlParserListener)listener).exitInner(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sqlParserVisitor ) return ((sqlParserVisitor<? extends T>)visitor).visitInner(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InnerContext inner() throws RecognitionException {
		InnerContext _localctx = new InnerContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_inner);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LEFT_JOIN) | (1L << INNER_JOIN) | (1L << RIGH_JOIN))) != 0)) ) {
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
		enterRule(_localctx, 16, RULE_clausula);
		try {
			int _alt;
			setState(176);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(144);
				condicion();
				setState(150);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(145);
						operador();
						setState(146);
						condicion();
						}
						} 
					}
					setState(152);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(153);
				condicion();
				setState(159);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(154);
						operador();
						setState(155);
						clausula();
						}
						} 
					}
					setState(161);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(162);
				match(PAR_OPEN);
				setState(163);
				clausula();
				setState(164);
				match(PAR_CLOUSE);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(166);
				match(NOT);
				setState(167);
				clausula();
				setState(173);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(168);
						operador();
						setState(169);
						clausula();
						}
						} 
					}
					setState(175);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
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

	public static class LikeContext extends ParserRuleContext {
		public TerminalNode LIKE() { return getToken(sqlParser.LIKE, 0); }
		public TerminalNode ID() { return getToken(sqlParser.ID, 0); }
		public LikeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_like; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sqlParserListener ) ((sqlParserListener)listener).enterLike(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sqlParserListener ) ((sqlParserListener)listener).exitLike(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sqlParserVisitor ) return ((sqlParserVisitor<? extends T>)visitor).visitLike(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LikeContext like() throws RecognitionException {
		LikeContext _localctx = new LikeContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_like);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			match(LIKE);
			setState(179);
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
		enterRule(_localctx, 20, RULE_column);
		int _la;
		try {
			setState(203);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(181);
				tabla();
				setState(182);
				match(DOT);
				setState(183);
				columna();
				setState(191);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMA) {
					{
					{
					setState(184);
					match(COMA);
					setState(185);
					tabla();
					setState(186);
					match(DOT);
					setState(187);
					columna();
					}
					}
					setState(193);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(194);
				columna();
				setState(199);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMA) {
					{
					{
					setState(195);
					match(COMA);
					setState(196);
					columna();
					}
					}
					setState(201);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(202);
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
		enterRule(_localctx, 22, RULE_columna);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
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
		enterRule(_localctx, 24, RULE_tabla);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(207);
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
		enterRule(_localctx, 26, RULE_condicion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(209);
			match(ID);
			setState(210);
			match(EQ);
			setState(211);
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
		enterRule(_localctx, 28, RULE_var);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
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

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode INTEGER() { return getToken(sqlParser.INTEGER, 0); }
		public TerminalNode VARCHAR() { return getToken(sqlParser.VARCHAR, 0); }
		public TerminalNode PAR_OPEN() { return getToken(sqlParser.PAR_OPEN, 0); }
		public TerminalNode INT() { return getToken(sqlParser.INT, 0); }
		public TerminalNode PAR_CLOUSE() { return getToken(sqlParser.PAR_CLOUSE, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sqlParserListener ) ((sqlParserListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sqlParserListener ) ((sqlParserListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sqlParserVisitor ) return ((sqlParserVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_type);
		try {
			setState(220);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER:
				enterOuterAlt(_localctx, 1);
				{
				setState(215);
				match(INTEGER);
				}
				break;
			case VARCHAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(216);
				match(VARCHAR);
				setState(217);
				match(PAR_OPEN);
				setState(218);
				match(INT);
				setState(219);
				match(PAR_CLOUSE);
				}
				break;
			default:
				throw new NoViableAltException(this);
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
		enterRule(_localctx, 32, RULE_operador);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3*\u00e3\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\3\2\3\2\3\2\3\2\6\2)\n\2\r\2\16\2*\3\3\3\3\3\3\3\3\3\3\5\3\62\n\3\3\3"+
		"\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4>\n\4\f\4\16\4A\13\4\3\4\3\4\3"+
		"\4\3\5\3\5\3\5\3\5\3\5\5\5K\n\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\5\7h\n\7\6\7j\n\7\r\7\16\7k\5\7n\n\7\3\b\3\b\3\b\3\b\3\b\5\bu\n\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\7\b\u0088"+
		"\n\b\f\b\16\b\u008b\13\b\3\b\3\b\5\b\u008f\n\b\3\t\3\t\3\n\3\n\3\n\3\n"+
		"\7\n\u0097\n\n\f\n\16\n\u009a\13\n\3\n\3\n\3\n\3\n\7\n\u00a0\n\n\f\n\16"+
		"\n\u00a3\13\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u00ae\n\n\f\n\16"+
		"\n\u00b1\13\n\5\n\u00b3\n\n\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\7\f\u00c0\n\f\f\f\16\f\u00c3\13\f\3\f\3\f\3\f\7\f\u00c8\n\f\f\f\16"+
		"\f\u00cb\13\f\3\f\5\f\u00ce\n\f\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\17"+
		"\3\20\3\20\3\21\3\21\3\21\3\21\3\21\5\21\u00df\n\21\3\22\3\22\3\22\2\2"+
		"\23\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"\2\6\3\2\22\23\4\2\13\f)"+
		")\4\2\"\"$%\3\2\24\25\2\u00ec\2(\3\2\2\2\4,\3\2\2\2\6\65\3\2\2\2\bE\3"+
		"\2\2\2\nN\3\2\2\2\fm\3\2\2\2\16\u008e\3\2\2\2\20\u0090\3\2\2\2\22\u00b2"+
		"\3\2\2\2\24\u00b4\3\2\2\2\26\u00cd\3\2\2\2\30\u00cf\3\2\2\2\32\u00d1\3"+
		"\2\2\2\34\u00d3\3\2\2\2\36\u00d7\3\2\2\2 \u00de\3\2\2\2\"\u00e0\3\2\2"+
		"\2$)\5\4\3\2%)\5\6\4\2&)\5\b\5\2\')\5\n\6\2($\3\2\2\2(%\3\2\2\2(&\3\2"+
		"\2\2(\'\3\2\2\2)*\3\2\2\2*(\3\2\2\2*+\3\2\2\2+\3\3\2\2\2,-\7\3\2\2-.\5"+
		"\26\f\2./\7\4\2\2/\61\5\32\16\2\60\62\5\f\7\2\61\60\3\2\2\2\61\62\3\2"+
		"\2\2\62\63\3\2\2\2\63\64\7 \2\2\64\5\3\2\2\2\65\66\7#\2\2\66\67\7\27\2"+
		"\2\678\5\30\r\28?\5 \21\29:\7\37\2\2:;\5\30\r\2;<\5 \21\2<>\3\2\2\2=9"+
		"\3\2\2\2>A\3\2\2\2?=\3\2\2\2?@\3\2\2\2@B\3\2\2\2A?\3\2\2\2BC\7\30\2\2"+
		"CD\7 \2\2D\7\3\2\2\2EF\7\7\2\2FG\7\4\2\2GJ\5\32\16\2HI\7\5\2\2IK\5\22"+
		"\n\2JH\3\2\2\2JK\3\2\2\2KL\3\2\2\2LM\7 \2\2M\t\3\2\2\2NO\7\'\2\2OP\5\32"+
		"\16\2PQ\7(\2\2QR\5\34\17\2RS\7\37\2\2ST\5\34\17\2TU\3\2\2\2UV\7\5\2\2"+
		"VW\5\34\17\2WX\7\37\2\2XY\5\34\17\2YZ\3\2\2\2Z[\7 \2\2[\13\3\2\2\2\\n"+
		"\5\16\b\2]^\5\20\t\2^_\5\32\16\2_`\7\17\2\2`a\5\26\f\2ab\7\31\2\2bc\5"+
		"\26\f\2cn\3\2\2\2di\7\t\2\2eg\5\26\f\2fh\t\2\2\2gf\3\2\2\2gh\3\2\2\2h"+
		"j\3\2\2\2ie\3\2\2\2jk\3\2\2\2ki\3\2\2\2kl\3\2\2\2ln\3\2\2\2m\\\3\2\2\2"+
		"m]\3\2\2\2md\3\2\2\2n\r\3\2\2\2op\7\5\2\2p\u008f\5\22\n\2qr\7\5\2\2rt"+
		"\5\26\f\2su\7\26\2\2ts\3\2\2\2tu\3\2\2\2uv\3\2\2\2vw\7\b\2\2wx\7#\2\2"+
		"xy\5\36\20\2yz\7\24\2\2z{\5\36\20\2{\u008f\3\2\2\2|}\7\5\2\2}~\5\26\f"+
		"\2~\177\5\24\13\2\177\u008f\3\2\2\2\u0080\u0081\7\5\2\2\u0081\u0082\5"+
		"\26\f\2\u0082\u0083\7\16\2\2\u0083\u0084\7\27\2\2\u0084\u0089\7\"\2\2"+
		"\u0085\u0086\7\37\2\2\u0086\u0088\7\"\2\2\u0087\u0085\3\2\2\2\u0088\u008b"+
		"\3\2\2\2\u0089\u0087\3\2\2\2\u0089\u008a\3\2\2\2\u008a\u008c\3\2\2\2\u008b"+
		"\u0089\3\2\2\2\u008c\u008d\7\30\2\2\u008d\u008f\3\2\2\2\u008eo\3\2\2\2"+
		"\u008eq\3\2\2\2\u008e|\3\2\2\2\u008e\u0080\3\2\2\2\u008f\17\3\2\2\2\u0090"+
		"\u0091\t\3\2\2\u0091\21\3\2\2\2\u0092\u0098\5\34\17\2\u0093\u0094\5\""+
		"\22\2\u0094\u0095\5\34\17\2\u0095\u0097\3\2\2\2\u0096\u0093\3\2\2\2\u0097"+
		"\u009a\3\2\2\2\u0098\u0096\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u00b3\3\2"+
		"\2\2\u009a\u0098\3\2\2\2\u009b\u00a1\5\34\17\2\u009c\u009d\5\"\22\2\u009d"+
		"\u009e\5\22\n\2\u009e\u00a0\3\2\2\2\u009f\u009c\3\2\2\2\u00a0\u00a3\3"+
		"\2\2\2\u00a1\u009f\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00b3\3\2\2\2\u00a3"+
		"\u00a1\3\2\2\2\u00a4\u00a5\7\27\2\2\u00a5\u00a6\5\22\n\2\u00a6\u00a7\7"+
		"\30\2\2\u00a7\u00b3\3\2\2\2\u00a8\u00a9\7\26\2\2\u00a9\u00af\5\22\n\2"+
		"\u00aa\u00ab\5\"\22\2\u00ab\u00ac\5\22\n\2\u00ac\u00ae\3\2\2\2\u00ad\u00aa"+
		"\3\2\2\2\u00ae\u00b1\3\2\2\2\u00af\u00ad\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0"+
		"\u00b3\3\2\2\2\u00b1\u00af\3\2\2\2\u00b2\u0092\3\2\2\2\u00b2\u009b\3\2"+
		"\2\2\u00b2\u00a4\3\2\2\2\u00b2\u00a8\3\2\2\2\u00b3\23\3\2\2\2\u00b4\u00b5"+
		"\7*\2\2\u00b5\u00b6\7#\2\2\u00b6\25\3\2\2\2\u00b7\u00b8\5\32\16\2\u00b8"+
		"\u00b9\7\36\2\2\u00b9\u00c1\5\30\r\2\u00ba\u00bb\7\37\2\2\u00bb\u00bc"+
		"\5\32\16\2\u00bc\u00bd\7\36\2\2\u00bd\u00be\5\30\r\2\u00be\u00c0\3\2\2"+
		"\2\u00bf\u00ba\3\2\2\2\u00c0\u00c3\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c1\u00c2"+
		"\3\2\2\2\u00c2\u00ce\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c4\u00c9\5\30\r\2"+
		"\u00c5\u00c6\7\37\2\2\u00c6\u00c8\5\30\r\2\u00c7\u00c5\3\2\2\2\u00c8\u00cb"+
		"\3\2\2\2\u00c9\u00c7\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00ce\3\2\2\2\u00cb"+
		"\u00c9\3\2\2\2\u00cc\u00ce\7!\2\2\u00cd\u00b7\3\2\2\2\u00cd\u00c4\3\2"+
		"\2\2\u00cd\u00cc\3\2\2\2\u00ce\27\3\2\2\2\u00cf\u00d0\7#\2\2\u00d0\31"+
		"\3\2\2\2\u00d1\u00d2\7#\2\2\u00d2\33\3\2\2\2\u00d3\u00d4\7#\2\2\u00d4"+
		"\u00d5\7\31\2\2\u00d5\u00d6\5\36\20\2\u00d6\35\3\2\2\2\u00d7\u00d8\t\4"+
		"\2\2\u00d8\37\3\2\2\2\u00d9\u00df\7\20\2\2\u00da\u00db\7\21\2\2\u00db"+
		"\u00dc\7\27\2\2\u00dc\u00dd\7$\2\2\u00dd\u00df\7\30\2\2\u00de\u00d9\3"+
		"\2\2\2\u00de\u00da\3\2\2\2\u00df!\3\2\2\2\u00e0\u00e1\t\5\2\2\u00e1#\3"+
		"\2\2\2\25(*\61?Jgkmt\u0089\u008e\u0098\u00a1\u00af\u00b2\u00c1\u00c9\u00cd"+
		"\u00de";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}