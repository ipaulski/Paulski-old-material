// Generated from SimplePL1Paulski.g4 by ANTLR 4.9.3
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SimplePL1PaulskiLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		READ=1, WRITE=2, ID=3, NUMBER=4, ASSIGN=5, PLUS=6, MINUS=7, TIMES=8, DIV=9, 
		SEMICOLON=10, COMMA=11, LPAREN=12, RPAREN=13, WS=14;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"READ", "WRITE", "ID", "NUMBER", "ASSIGN", "PLUS", "MINUS", "TIMES", 
			"DIV", "SEMICOLON", "COMMA", "LPAREN", "RPAREN", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'read'", "'write'", null, null, "':='", "'+'", "'-'", "'*'", "'/'", 
			"';'", "','", "'('", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "READ", "WRITE", "ID", "NUMBER", "ASSIGN", "PLUS", "MINUS", "TIMES", 
			"DIV", "SEMICOLON", "COMMA", "LPAREN", "RPAREN", "WS"
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


	public SimplePL1PaulskiLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "SimplePL1Paulski.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\20R\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\4\3\4\7\4-\n\4\f\4\16\4\60\13\4\3\5\3\5\7\5\64\n\5\f"+
		"\5\16\5\67\13\5\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13"+
		"\3\f\3\f\3\r\3\r\3\16\3\16\3\17\6\17M\n\17\r\17\16\17N\3\17\3\17\2\2\20"+
		"\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20"+
		"\3\2\6\5\2C\\aac|\6\2\62;C\\aac|\3\2\62;\4\2\13\f\"\"\2T\2\3\3\2\2\2\2"+
		"\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2"+
		"\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2"+
		"\33\3\2\2\2\2\35\3\2\2\2\3\37\3\2\2\2\5$\3\2\2\2\7*\3\2\2\2\t\61\3\2\2"+
		"\2\138\3\2\2\2\r;\3\2\2\2\17=\3\2\2\2\21?\3\2\2\2\23A\3\2\2\2\25C\3\2"+
		"\2\2\27E\3\2\2\2\31G\3\2\2\2\33I\3\2\2\2\35L\3\2\2\2\37 \7t\2\2 !\7g\2"+
		"\2!\"\7c\2\2\"#\7f\2\2#\4\3\2\2\2$%\7y\2\2%&\7t\2\2&\'\7k\2\2\'(\7v\2"+
		"\2()\7g\2\2)\6\3\2\2\2*.\t\2\2\2+-\t\3\2\2,+\3\2\2\2-\60\3\2\2\2.,\3\2"+
		"\2\2./\3\2\2\2/\b\3\2\2\2\60.\3\2\2\2\61\65\t\4\2\2\62\64\t\4\2\2\63\62"+
		"\3\2\2\2\64\67\3\2\2\2\65\63\3\2\2\2\65\66\3\2\2\2\66\n\3\2\2\2\67\65"+
		"\3\2\2\289\7<\2\29:\7?\2\2:\f\3\2\2\2;<\7-\2\2<\16\3\2\2\2=>\7/\2\2>\20"+
		"\3\2\2\2?@\7,\2\2@\22\3\2\2\2AB\7\61\2\2B\24\3\2\2\2CD\7=\2\2D\26\3\2"+
		"\2\2EF\7.\2\2F\30\3\2\2\2GH\7*\2\2H\32\3\2\2\2IJ\7+\2\2J\34\3\2\2\2KM"+
		"\t\5\2\2LK\3\2\2\2MN\3\2\2\2NL\3\2\2\2NO\3\2\2\2OP\3\2\2\2PQ\b\17\2\2"+
		"Q\36\3\2\2\2\6\2.\65N\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}