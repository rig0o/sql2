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
		SELECT=1, FROM=2, WHERE=3, CREATE=4, DELETE=5, BETWEEN=6, ORDEN_BY=7, 
		GROUP_BY=8, LEFT_JOIN=9, INNER_JOIN=10, RIGHT_JOIN=11, IN=12, DESC=13, 
		AND=14, OR=15, NOT=16, WS=17, ID=18;
	public static final int
		DENTRO=1;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE", "DENTRO"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"SELECT", "FROM", "WHERE", "CREATE", "DELETE", "BETWEEN", "ORDEN_BY", 
			"GROUP_BY", "LEFT_JOIN", "INNER_JOIN", "RIGHT_JOIN", "IN", "DESC", "AND", 
			"OR", "NOT", "WS", "ID", "DIGIT", "CHAR"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "SELECT", "FROM", "WHERE", "CREATE", "DELETE", "BETWEEN", "ORDEN_BY", 
			"GROUP_BY", "LEFT_JOIN", "INNER_JOIN", "RIGHT_JOIN", "IN", "DESC", "AND", 
			"OR", "NOT", "WS", "ID"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\24\u0115\b\1\b\1"+
		"\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t"+
		"\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4"+
		"\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\5\29\n\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3C\n\3\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4O\n\4\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\5\5]\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\5\6k\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\5\7{\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\5\b\u008d\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\5\t\u009f\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00b3\n\n\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\5\13\u00c9\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00df\n\f\3\r\3\r\3\r\3\r\5\r"+
		"\u00e5\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u00ef\n\16\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\5\17\u00f7\n\17\3\20\3\20\3\20\3\20\5\20\u00fd"+
		"\n\20\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u0105\n\21\3\22\3\22\3\22\3\22"+
		"\3\23\3\23\7\23\u010d\n\23\f\23\16\23\u0110\13\23\3\24\3\24\3\25\3\25"+
		"\2\2\26\4\3\6\4\b\5\n\6\f\7\16\b\20\t\22\n\24\13\26\f\30\r\32\16\34\17"+
		"\36\20 \21\"\22$\23&\24(\2*\2\4\2\3\5\5\2\13\f\17\17))\3\2\62;\4\2C\\"+
		"c|\2\u0122\2\4\3\2\2\2\2\6\3\2\2\2\2\b\3\2\2\2\2\n\3\2\2\2\2\f\3\2\2\2"+
		"\2\16\3\2\2\2\2\20\3\2\2\2\2\22\3\2\2\2\2\24\3\2\2\2\2\26\3\2\2\2\2\30"+
		"\3\2\2\2\2\32\3\2\2\2\2\34\3\2\2\2\2\36\3\2\2\2\2 \3\2\2\2\2\"\3\2\2\2"+
		"\2$\3\2\2\2\3&\3\2\2\2\48\3\2\2\2\6B\3\2\2\2\bN\3\2\2\2\n\\\3\2\2\2\f"+
		"j\3\2\2\2\16z\3\2\2\2\20\u008c\3\2\2\2\22\u009e\3\2\2\2\24\u00b2\3\2\2"+
		"\2\26\u00c8\3\2\2\2\30\u00de\3\2\2\2\32\u00e4\3\2\2\2\34\u00ee\3\2\2\2"+
		"\36\u00f6\3\2\2\2 \u00fc\3\2\2\2\"\u0104\3\2\2\2$\u0106\3\2\2\2&\u010a"+
		"\3\2\2\2(\u0111\3\2\2\2*\u0113\3\2\2\2,-\7U\2\2-.\7G\2\2./\7N\2\2/\60"+
		"\7G\2\2\60\61\7E\2\2\619\7V\2\2\62\63\7u\2\2\63\64\7g\2\2\64\65\7n\2\2"+
		"\65\66\7g\2\2\66\67\7e\2\2\679\7v\2\28,\3\2\2\28\62\3\2\2\29\5\3\2\2\2"+
		":;\7H\2\2;<\7T\2\2<=\7Q\2\2=C\7O\2\2>?\7h\2\2?@\7t\2\2@A\7q\2\2AC\7o\2"+
		"\2B:\3\2\2\2B>\3\2\2\2C\7\3\2\2\2DE\7Y\2\2EF\7J\2\2FG\7G\2\2GH\7T\2\2"+
		"HO\7G\2\2IJ\7y\2\2JK\7j\2\2KL\7g\2\2LM\7t\2\2MO\7g\2\2ND\3\2\2\2NI\3\2"+
		"\2\2O\t\3\2\2\2PQ\7E\2\2QR\7T\2\2RS\7G\2\2ST\7C\2\2TU\7V\2\2U]\7G\2\2"+
		"VW\7e\2\2WX\7t\2\2XY\7g\2\2YZ\7c\2\2Z[\7v\2\2[]\7g\2\2\\P\3\2\2\2\\V\3"+
		"\2\2\2]\13\3\2\2\2^_\7F\2\2_`\7G\2\2`a\7N\2\2ab\7G\2\2bc\7V\2\2ck\7G\2"+
		"\2de\7f\2\2ef\7g\2\2fg\7n\2\2gh\7g\2\2hi\7v\2\2ik\7g\2\2j^\3\2\2\2jd\3"+
		"\2\2\2k\r\3\2\2\2lm\7D\2\2mn\7G\2\2no\7V\2\2op\7Y\2\2pq\7G\2\2qr\7G\2"+
		"\2r{\7P\2\2st\7d\2\2tu\7g\2\2uv\7v\2\2vw\7y\2\2wx\7g\2\2xy\7g\2\2y{\7"+
		"p\2\2zl\3\2\2\2zs\3\2\2\2{\17\3\2\2\2|}\7Q\2\2}~\7T\2\2~\177\7F\2\2\177"+
		"\u0080\7G\2\2\u0080\u0081\7P\2\2\u0081\u0082\7\"\2\2\u0082\u0083\7D\2"+
		"\2\u0083\u008d\7[\2\2\u0084\u0085\7q\2\2\u0085\u0086\7t\2\2\u0086\u0087"+
		"\7f\2\2\u0087\u0088\7g\2\2\u0088\u0089\7p\2\2\u0089\u008a\7\"\2\2\u008a"+
		"\u008b\7d\2\2\u008b\u008d\7{\2\2\u008c|\3\2\2\2\u008c\u0084\3\2\2\2\u008d"+
		"\21\3\2\2\2\u008e\u008f\7I\2\2\u008f\u0090\7T\2\2\u0090\u0091\7Q\2\2\u0091"+
		"\u0092\7W\2\2\u0092\u0093\7R\2\2\u0093\u0094\7\"\2\2\u0094\u0095\7D\2"+
		"\2\u0095\u009f\7[\2\2\u0096\u0097\7i\2\2\u0097\u0098\7t\2\2\u0098\u0099"+
		"\7q\2\2\u0099\u009a\7w\2\2\u009a\u009b\7r\2\2\u009b\u009c\7\"\2\2\u009c"+
		"\u009d\7d\2\2\u009d\u009f\7{\2\2\u009e\u008e\3\2\2\2\u009e\u0096\3\2\2"+
		"\2\u009f\23\3\2\2\2\u00a0\u00a1\7N\2\2\u00a1\u00a2\7G\2\2\u00a2\u00a3"+
		"\7H\2\2\u00a3\u00a4\7V\2\2\u00a4\u00a5\7\"\2\2\u00a5\u00a6\7L\2\2\u00a6"+
		"\u00a7\7Q\2\2\u00a7\u00a8\7K\2\2\u00a8\u00b3\7P\2\2\u00a9\u00aa\7n\2\2"+
		"\u00aa\u00ab\7g\2\2\u00ab\u00ac\7h\2\2\u00ac\u00ad\7v\2\2\u00ad\u00ae"+
		"\7\"\2\2\u00ae\u00af\7l\2\2\u00af\u00b0\7q\2\2\u00b0\u00b1\7k\2\2\u00b1"+
		"\u00b3\7p\2\2\u00b2\u00a0\3\2\2\2\u00b2\u00a9\3\2\2\2\u00b3\25\3\2\2\2"+
		"\u00b4\u00b5\7K\2\2\u00b5\u00b6\7P\2\2\u00b6\u00b7\7P\2\2\u00b7\u00b8"+
		"\7G\2\2\u00b8\u00b9\7T\2\2\u00b9\u00ba\7\"\2\2\u00ba\u00bb\7L\2\2\u00bb"+
		"\u00bc\7Q\2\2\u00bc\u00bd\7K\2\2\u00bd\u00c9\7P\2\2\u00be\u00bf\7k\2\2"+
		"\u00bf\u00c0\7p\2\2\u00c0\u00c1\7p\2\2\u00c1\u00c2\7g\2\2\u00c2\u00c3"+
		"\7t\2\2\u00c3\u00c4\7\"\2\2\u00c4\u00c5\7l\2\2\u00c5\u00c6\7q\2\2\u00c6"+
		"\u00c7\7k\2\2\u00c7\u00c9\7p\2\2\u00c8\u00b4\3\2\2\2\u00c8\u00be\3\2\2"+
		"\2\u00c9\27\3\2\2\2\u00ca\u00cb\7T\2\2\u00cb\u00cc\7K\2\2\u00cc\u00cd"+
		"\7I\2\2\u00cd\u00ce\7J\2\2\u00ce\u00cf\7V\2\2\u00cf\u00d0\7\"\2\2\u00d0"+
		"\u00d1\7L\2\2\u00d1\u00d2\7Q\2\2\u00d2\u00d3\7K\2\2\u00d3\u00df\7P\2\2"+
		"\u00d4\u00d5\7t\2\2\u00d5\u00d6\7k\2\2\u00d6\u00d7\7i\2\2\u00d7\u00d8"+
		"\7j\2\2\u00d8\u00d9\7v\2\2\u00d9\u00da\7\"\2\2\u00da\u00db\7l\2\2\u00db"+
		"\u00dc\7q\2\2\u00dc\u00dd\7k\2\2\u00dd\u00df\7p\2\2\u00de\u00ca\3\2\2"+
		"\2\u00de\u00d4\3\2\2\2\u00df\31\3\2\2\2\u00e0\u00e1\7K\2\2\u00e1\u00e5"+
		"\7P\2\2\u00e2\u00e3\7k\2\2\u00e3\u00e5\7p\2\2\u00e4\u00e0\3\2\2\2\u00e4"+
		"\u00e2\3\2\2\2\u00e5\33\3\2\2\2\u00e6\u00e7\7F\2\2\u00e7\u00e8\7G\2\2"+
		"\u00e8\u00e9\7U\2\2\u00e9\u00ef\7E\2\2\u00ea\u00eb\7f\2\2\u00eb\u00ec"+
		"\7g\2\2\u00ec\u00ed\7u\2\2\u00ed\u00ef\7e\2\2\u00ee\u00e6\3\2\2\2\u00ee"+
		"\u00ea\3\2\2\2\u00ef\35\3\2\2\2\u00f0\u00f1\7C\2\2\u00f1\u00f2\7P\2\2"+
		"\u00f2\u00f7\7F\2\2\u00f3\u00f4\7c\2\2\u00f4\u00f5\7p\2\2\u00f5\u00f7"+
		"\7f\2\2\u00f6\u00f0\3\2\2\2\u00f6\u00f3\3\2\2\2\u00f7\37\3\2\2\2\u00f8"+
		"\u00f9\7Q\2\2\u00f9\u00fd\7T\2\2\u00fa\u00fb\7q\2\2\u00fb\u00fd\7t\2\2"+
		"\u00fc\u00f8\3\2\2\2\u00fc\u00fa\3\2\2\2\u00fd!\3\2\2\2\u00fe\u00ff\7"+
		"P\2\2\u00ff\u0100\7Q\2\2\u0100\u0105\7V\2\2\u0101\u0102\7p\2\2\u0102\u0103"+
		"\7q\2\2\u0103\u0105\7v\2\2\u0104\u00fe\3\2\2\2\u0104\u0101\3\2\2\2\u0105"+
		"#\3\2\2\2\u0106\u0107\t\2\2\2\u0107\u0108\3\2\2\2\u0108\u0109\b\22\2\2"+
		"\u0109%\3\2\2\2\u010a\u010e\5*\25\2\u010b\u010d\5*\25\2\u010c\u010b\3"+
		"\2\2\2\u010d\u0110\3\2\2\2\u010e\u010c\3\2\2\2\u010e\u010f\3\2\2\2\u010f"+
		"\'\3\2\2\2\u0110\u010e\3\2\2\2\u0111\u0112\t\3\2\2\u0112)\3\2\2\2\u0113"+
		"\u0114\t\4\2\2\u0114+\3\2\2\2\25\2\38BN\\jz\u008c\u009e\u00b2\u00c8\u00de"+
		"\u00e4\u00ee\u00f6\u00fc\u0104\u010e\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}