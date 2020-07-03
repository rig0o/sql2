// Generated from /home/rodrigo/IdeaProjects/sqlGrammar/sqlLexer.g4 by ANTLR 4.8
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class sqlLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SELECT=1, FROM=2, WHERE=3, CREATE_TABLE=4, DELETE=5, BETWEEN=6, ORDER_BY=7, 
		GROUP_BY=8, LEFT_JOIN=9, INNER_JOIN=10, RIGHT_JOIN=11, IN=12, ON=13, INTEGER=14, 
		VARCHAR=15, DESC=16, ASC=17, AND=18, OR=19, NOT=20, PAR_OPEN=21, PAR_CLOUSE=22, 
		EQ=23, GT=24, LT=25, GEQ=26, LEQ=27, DOT=28, COMA=29, PUNTOCOMA=30, WC=31, 
		STRING=32, ID=33, INT=34, FLOAT=35, WS=36;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"SELECT", "FROM", "WHERE", "CREATE_TABLE", "DELETE", "BETWEEN", "ORDER_BY", 
			"GROUP_BY", "LEFT_JOIN", "INNER_JOIN", "RIGHT_JOIN", "IN", "ON", "INTEGER", 
			"VARCHAR", "DESC", "ASC", "AND", "OR", "NOT", "PAR_OPEN", "PAR_CLOUSE", 
			"EQ", "GT", "LT", "GEQ", "LEQ", "DOT", "COMA", "PUNTOCOMA", "WC", "STRING", 
			"ID", "INT", "FLOAT", "WS", "DIGIT", "CHAR"
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
			null, "SELECT", "FROM", "WHERE", "CREATE_TABLE", "DELETE", "BETWEEN", 
			"ORDER_BY", "GROUP_BY", "LEFT_JOIN", "INNER_JOIN", "RIGHT_JOIN", "IN", 
			"ON", "INTEGER", "VARCHAR", "DESC", "ASC", "AND", "OR", "NOT", "PAR_OPEN", 
			"PAR_CLOUSE", "EQ", "GT", "LT", "GEQ", "LEQ", "DOT", "COMA", "PUNTOCOMA", 
			"WC", "STRING", "ID", "INT", "FLOAT", "WS"
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


	public sqlLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "sqlLexer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2&\u01a2\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\5\2\\\n\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3f"+
		"\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4r\n\4\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\5\5\u008c\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\5\6\u009a\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\5\7\u00aa\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\5\b\u00bc\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\5\t\u00ce\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00e2\n\n\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\5\13\u00f8\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u010e\n\f\3\r\3\r\3\r\3\r\5\r\u0114"+
		"\n\r\3\16\3\16\3\16\3\16\5\16\u011a\n\16\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\5\17\u0122\n\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\5\20\u0132\n\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\5\21\u013c\n\21\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u0144\n\22\3\23\3"+
		"\23\3\23\3\23\3\23\3\23\5\23\u014c\n\23\3\24\3\24\3\24\3\24\5\24\u0152"+
		"\n\24\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u015a\n\25\3\26\3\26\3\27\3\27"+
		"\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3\34\3\35\3\35"+
		"\3\36\3\36\3\37\3\37\3 \3 \3!\3!\7!\u0176\n!\f!\16!\u0179\13!\3!\3!\3"+
		"!\7!\u017e\n!\f!\16!\u0181\13!\3!\5!\u0184\n!\3\"\6\"\u0187\n\"\r\"\16"+
		"\"\u0188\3#\6#\u018c\n#\r#\16#\u018d\3$\6$\u0191\n$\r$\16$\u0192\3$\3"+
		"$\6$\u0197\n$\r$\16$\u0198\3%\3%\3%\3%\3&\3&\3\'\3\'\4\u0177\u017f\2("+
		"\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20"+
		"\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37"+
		"= ?!A\"C#E$G%I&K\2M\2\3\2\5\6\2\13\f\17\17\"\"))\3\2\62;\5\2C\\aac|\2"+
		"\u01ba\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2"+
		"\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3"+
		"\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2"+
		"\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2"+
		"/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2"+
		"\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2"+
		"G\3\2\2\2\2I\3\2\2\2\3[\3\2\2\2\5e\3\2\2\2\7q\3\2\2\2\t\u008b\3\2\2\2"+
		"\13\u0099\3\2\2\2\r\u00a9\3\2\2\2\17\u00bb\3\2\2\2\21\u00cd\3\2\2\2\23"+
		"\u00e1\3\2\2\2\25\u00f7\3\2\2\2\27\u010d\3\2\2\2\31\u0113\3\2\2\2\33\u0119"+
		"\3\2\2\2\35\u0121\3\2\2\2\37\u0131\3\2\2\2!\u013b\3\2\2\2#\u0143\3\2\2"+
		"\2%\u014b\3\2\2\2\'\u0151\3\2\2\2)\u0159\3\2\2\2+\u015b\3\2\2\2-\u015d"+
		"\3\2\2\2/\u015f\3\2\2\2\61\u0161\3\2\2\2\63\u0163\3\2\2\2\65\u0165\3\2"+
		"\2\2\67\u0168\3\2\2\29\u016b\3\2\2\2;\u016d\3\2\2\2=\u016f\3\2\2\2?\u0171"+
		"\3\2\2\2A\u0183\3\2\2\2C\u0186\3\2\2\2E\u018b\3\2\2\2G\u0190\3\2\2\2I"+
		"\u019a\3\2\2\2K\u019e\3\2\2\2M\u01a0\3\2\2\2OP\7U\2\2PQ\7G\2\2QR\7N\2"+
		"\2RS\7G\2\2ST\7E\2\2T\\\7V\2\2UV\7u\2\2VW\7g\2\2WX\7n\2\2XY\7g\2\2YZ\7"+
		"e\2\2Z\\\7v\2\2[O\3\2\2\2[U\3\2\2\2\\\4\3\2\2\2]^\7H\2\2^_\7T\2\2_`\7"+
		"Q\2\2`f\7O\2\2ab\7h\2\2bc\7t\2\2cd\7q\2\2df\7o\2\2e]\3\2\2\2ea\3\2\2\2"+
		"f\6\3\2\2\2gh\7Y\2\2hi\7J\2\2ij\7G\2\2jk\7T\2\2kr\7G\2\2lm\7y\2\2mn\7"+
		"j\2\2no\7g\2\2op\7t\2\2pr\7g\2\2qg\3\2\2\2ql\3\2\2\2r\b\3\2\2\2st\7E\2"+
		"\2tu\7T\2\2uv\7G\2\2vw\7C\2\2wx\7V\2\2xy\7G\2\2yz\7\"\2\2z{\7V\2\2{|\7"+
		"C\2\2|}\7D\2\2}~\7N\2\2~\u008c\7G\2\2\177\u0080\7e\2\2\u0080\u0081\7t"+
		"\2\2\u0081\u0082\7g\2\2\u0082\u0083\7c\2\2\u0083\u0084\7v\2\2\u0084\u0085"+
		"\7g\2\2\u0085\u0086\7\"\2\2\u0086\u0087\7v\2\2\u0087\u0088\7c\2\2\u0088"+
		"\u0089\7d\2\2\u0089\u008a\7n\2\2\u008a\u008c\7g\2\2\u008bs\3\2\2\2\u008b"+
		"\177\3\2\2\2\u008c\n\3\2\2\2\u008d\u008e\7F\2\2\u008e\u008f\7G\2\2\u008f"+
		"\u0090\7N\2\2\u0090\u0091\7G\2\2\u0091\u0092\7V\2\2\u0092\u009a\7G\2\2"+
		"\u0093\u0094\7f\2\2\u0094\u0095\7g\2\2\u0095\u0096\7n\2\2\u0096\u0097"+
		"\7g\2\2\u0097\u0098\7v\2\2\u0098\u009a\7g\2\2\u0099\u008d\3\2\2\2\u0099"+
		"\u0093\3\2\2\2\u009a\f\3\2\2\2\u009b\u009c\7D\2\2\u009c\u009d\7G\2\2\u009d"+
		"\u009e\7V\2\2\u009e\u009f\7Y\2\2\u009f\u00a0\7G\2\2\u00a0\u00a1\7G\2\2"+
		"\u00a1\u00aa\7P\2\2\u00a2\u00a3\7d\2\2\u00a3\u00a4\7g\2\2\u00a4\u00a5"+
		"\7v\2\2\u00a5\u00a6\7y\2\2\u00a6\u00a7\7g\2\2\u00a7\u00a8\7g\2\2\u00a8"+
		"\u00aa\7p\2\2\u00a9\u009b\3\2\2\2\u00a9\u00a2\3\2\2\2\u00aa\16\3\2\2\2"+
		"\u00ab\u00ac\7Q\2\2\u00ac\u00ad\7T\2\2\u00ad\u00ae\7F\2\2\u00ae\u00af"+
		"\7G\2\2\u00af\u00b0\7T\2\2\u00b0\u00b1\7\"\2\2\u00b1\u00b2\7D\2\2\u00b2"+
		"\u00bc\7[\2\2\u00b3\u00b4\7q\2\2\u00b4\u00b5\7t\2\2\u00b5\u00b6\7f\2\2"+
		"\u00b6\u00b7\7g\2\2\u00b7\u00b8\7t\2\2\u00b8\u00b9\7\"\2\2\u00b9\u00ba"+
		"\7d\2\2\u00ba\u00bc\7{\2\2\u00bb\u00ab\3\2\2\2\u00bb\u00b3\3\2\2\2\u00bc"+
		"\20\3\2\2\2\u00bd\u00be\7I\2\2\u00be\u00bf\7T\2\2\u00bf\u00c0\7Q\2\2\u00c0"+
		"\u00c1\7W\2\2\u00c1\u00c2\7R\2\2\u00c2\u00c3\7\"\2\2\u00c3\u00c4\7D\2"+
		"\2\u00c4\u00ce\7[\2\2\u00c5\u00c6\7i\2\2\u00c6\u00c7\7t\2\2\u00c7\u00c8"+
		"\7q\2\2\u00c8\u00c9\7w\2\2\u00c9\u00ca\7r\2\2\u00ca\u00cb\7\"\2\2\u00cb"+
		"\u00cc\7d\2\2\u00cc\u00ce\7{\2\2\u00cd\u00bd\3\2\2\2\u00cd\u00c5\3\2\2"+
		"\2\u00ce\22\3\2\2\2\u00cf\u00d0\7N\2\2\u00d0\u00d1\7G\2\2\u00d1\u00d2"+
		"\7H\2\2\u00d2\u00d3\7V\2\2\u00d3\u00d4\7\"\2\2\u00d4\u00d5\7L\2\2\u00d5"+
		"\u00d6\7Q\2\2\u00d6\u00d7\7K\2\2\u00d7\u00e2\7P\2\2\u00d8\u00d9\7n\2\2"+
		"\u00d9\u00da\7g\2\2\u00da\u00db\7h\2\2\u00db\u00dc\7v\2\2\u00dc\u00dd"+
		"\7\"\2\2\u00dd\u00de\7l\2\2\u00de\u00df\7q\2\2\u00df\u00e0\7k\2\2\u00e0"+
		"\u00e2\7p\2\2\u00e1\u00cf\3\2\2\2\u00e1\u00d8\3\2\2\2\u00e2\24\3\2\2\2"+
		"\u00e3\u00e4\7K\2\2\u00e4\u00e5\7P\2\2\u00e5\u00e6\7P\2\2\u00e6\u00e7"+
		"\7G\2\2\u00e7\u00e8\7T\2\2\u00e8\u00e9\7\"\2\2\u00e9\u00ea\7L\2\2\u00ea"+
		"\u00eb\7Q\2\2\u00eb\u00ec\7K\2\2\u00ec\u00f8\7P\2\2\u00ed\u00ee\7k\2\2"+
		"\u00ee\u00ef\7p\2\2\u00ef\u00f0\7p\2\2\u00f0\u00f1\7g\2\2\u00f1\u00f2"+
		"\7t\2\2\u00f2\u00f3\7\"\2\2\u00f3\u00f4\7l\2\2\u00f4\u00f5\7q\2\2\u00f5"+
		"\u00f6\7k\2\2\u00f6\u00f8\7p\2\2\u00f7\u00e3\3\2\2\2\u00f7\u00ed\3\2\2"+
		"\2\u00f8\26\3\2\2\2\u00f9\u00fa\7T\2\2\u00fa\u00fb\7K\2\2\u00fb\u00fc"+
		"\7I\2\2\u00fc\u00fd\7J\2\2\u00fd\u00fe\7V\2\2\u00fe\u00ff\7\"\2\2\u00ff"+
		"\u0100\7L\2\2\u0100\u0101\7Q\2\2\u0101\u0102\7K\2\2\u0102\u010e\7P\2\2"+
		"\u0103\u0104\7t\2\2\u0104\u0105\7k\2\2\u0105\u0106\7i\2\2\u0106\u0107"+
		"\7j\2\2\u0107\u0108\7v\2\2\u0108\u0109\7\"\2\2\u0109\u010a\7l\2\2\u010a"+
		"\u010b\7q\2\2\u010b\u010c\7k\2\2\u010c\u010e\7p\2\2\u010d\u00f9\3\2\2"+
		"\2\u010d\u0103\3\2\2\2\u010e\30\3\2\2\2\u010f\u0110\7K\2\2\u0110\u0114"+
		"\7P\2\2\u0111\u0112\7k\2\2\u0112\u0114\7p\2\2\u0113\u010f\3\2\2\2\u0113"+
		"\u0111\3\2\2\2\u0114\32\3\2\2\2\u0115\u0116\7Q\2\2\u0116\u011a\7P\2\2"+
		"\u0117\u0118\7q\2\2\u0118\u011a\7p\2\2\u0119\u0115\3\2\2\2\u0119\u0117"+
		"\3\2\2\2\u011a\34\3\2\2\2\u011b\u011c\7K\2\2\u011c\u011d\7P\2\2\u011d"+
		"\u0122\7V\2\2\u011e\u011f\7k\2\2\u011f\u0120\7p\2\2\u0120\u0122\7v\2\2"+
		"\u0121\u011b\3\2\2\2\u0121\u011e\3\2\2\2\u0122\36\3\2\2\2\u0123\u0124"+
		"\7X\2\2\u0124\u0125\7C\2\2\u0125\u0126\7T\2\2\u0126\u0127\7E\2\2\u0127"+
		"\u0128\7J\2\2\u0128\u0129\7C\2\2\u0129\u0132\7T\2\2\u012a\u012b\7x\2\2"+
		"\u012b\u012c\7c\2\2\u012c\u012d\7t\2\2\u012d\u012e\7e\2\2\u012e\u012f"+
		"\7j\2\2\u012f\u0130\7c\2\2\u0130\u0132\7t\2\2\u0131\u0123\3\2\2\2\u0131"+
		"\u012a\3\2\2\2\u0132 \3\2\2\2\u0133\u0134\7F\2\2\u0134\u0135\7G\2\2\u0135"+
		"\u0136\7U\2\2\u0136\u013c\7E\2\2\u0137\u0138\7f\2\2\u0138\u0139\7g\2\2"+
		"\u0139\u013a\7u\2\2\u013a\u013c\7e\2\2\u013b\u0133\3\2\2\2\u013b\u0137"+
		"\3\2\2\2\u013c\"\3\2\2\2\u013d\u013e\7C\2\2\u013e\u013f\7U\2\2\u013f\u0144"+
		"\7E\2\2\u0140\u0141\7c\2\2\u0141\u0142\7u\2\2\u0142\u0144\7e\2\2\u0143"+
		"\u013d\3\2\2\2\u0143\u0140\3\2\2\2\u0144$\3\2\2\2\u0145\u0146\7C\2\2\u0146"+
		"\u0147\7P\2\2\u0147\u014c\7F\2\2\u0148\u0149\7c\2\2\u0149\u014a\7p\2\2"+
		"\u014a\u014c\7f\2\2\u014b\u0145\3\2\2\2\u014b\u0148\3\2\2\2\u014c&\3\2"+
		"\2\2\u014d\u014e\7Q\2\2\u014e\u0152\7T\2\2\u014f\u0150\7q\2\2\u0150\u0152"+
		"\7t\2\2\u0151\u014d\3\2\2\2\u0151\u014f\3\2\2\2\u0152(\3\2\2\2\u0153\u0154"+
		"\7P\2\2\u0154\u0155\7Q\2\2\u0155\u015a\7V\2\2\u0156\u0157\7p\2\2\u0157"+
		"\u0158\7q\2\2\u0158\u015a\7v\2\2\u0159\u0153\3\2\2\2\u0159\u0156\3\2\2"+
		"\2\u015a*\3\2\2\2\u015b\u015c\7*\2\2\u015c,\3\2\2\2\u015d\u015e\7+\2\2"+
		"\u015e.\3\2\2\2\u015f\u0160\7?\2\2\u0160\60\3\2\2\2\u0161\u0162\7@\2\2"+
		"\u0162\62\3\2\2\2\u0163\u0164\7>\2\2\u0164\64\3\2\2\2\u0165\u0166\7@\2"+
		"\2\u0166\u0167\7?\2\2\u0167\66\3\2\2\2\u0168\u0169\7>\2\2\u0169\u016a"+
		"\7?\2\2\u016a8\3\2\2\2\u016b\u016c\7\60\2\2\u016c:\3\2\2\2\u016d\u016e"+
		"\7.\2\2\u016e<\3\2\2\2\u016f\u0170\7=\2\2\u0170>\3\2\2\2\u0171\u0172\7"+
		",\2\2\u0172@\3\2\2\2\u0173\u0177\7$\2\2\u0174\u0176\13\2\2\2\u0175\u0174"+
		"\3\2\2\2\u0176\u0179\3\2\2\2\u0177\u0178\3\2\2\2\u0177\u0175\3\2\2\2\u0178"+
		"\u017a\3\2\2\2\u0179\u0177\3\2\2\2\u017a\u0184\7$\2\2\u017b\u017f\7)\2"+
		"\2\u017c\u017e\13\2\2\2\u017d\u017c\3\2\2\2\u017e\u0181\3\2\2\2\u017f"+
		"\u0180\3\2\2\2\u017f\u017d\3\2\2\2\u0180\u0182\3\2\2\2\u0181\u017f\3\2"+
		"\2\2\u0182\u0184\7)\2\2\u0183\u0173\3\2\2\2\u0183\u017b\3\2\2\2\u0184"+
		"B\3\2\2\2\u0185\u0187\5M\'\2\u0186\u0185\3\2\2\2\u0187\u0188\3\2\2\2\u0188"+
		"\u0186\3\2\2\2\u0188\u0189\3\2\2\2\u0189D\3\2\2\2\u018a\u018c\5K&\2\u018b"+
		"\u018a\3\2\2\2\u018c\u018d\3\2\2\2\u018d\u018b\3\2\2\2\u018d\u018e\3\2"+
		"\2\2\u018eF\3\2\2\2\u018f\u0191\5K&\2\u0190\u018f\3\2\2\2\u0191\u0192"+
		"\3\2\2\2\u0192\u0190\3\2\2\2\u0192\u0193\3\2\2\2\u0193\u0194\3\2\2\2\u0194"+
		"\u0196\7\60\2\2\u0195\u0197\5K&\2\u0196\u0195\3\2\2\2\u0197\u0198\3\2"+
		"\2\2\u0198\u0196\3\2\2\2\u0198\u0199\3\2\2\2\u0199H\3\2\2\2\u019a\u019b"+
		"\t\2\2\2\u019b\u019c\3\2\2\2\u019c\u019d\b%\2\2\u019dJ\3\2\2\2\u019e\u019f"+
		"\t\3\2\2\u019fL\3\2\2\2\u01a0\u01a1\t\4\2\2\u01a1N\3\2\2\2\36\2[eq\u008b"+
		"\u0099\u00a9\u00bb\u00cd\u00e1\u00f7\u010d\u0113\u0119\u0121\u0131\u013b"+
		"\u0143\u014b\u0151\u0159\u0177\u017f\u0183\u0188\u018d\u0192\u0198\3\b"+
		"\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}