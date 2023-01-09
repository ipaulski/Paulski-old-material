// Generated from SimplePL1Paulski.g4 by ANTLR 4.9.3
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SimplePL1PaulskiParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		READ=1, WRITE=2, ID=3, NUMBER=4, ASSIGN=5, PLUS=6, MINUS=7, TIMES=8, DIV=9, 
		SEMICOLON=10, COMMA=11, LPAREN=12, RPAREN=13, WS=14;
	public static final int
		RULE_program = 0, RULE_stmt_list = 1, RULE_stmt = 2, RULE_expr_list = 3, 
		RULE_expr_list_tail = 4, RULE_id_list = 5, RULE_id_list_tail = 6, RULE_expr = 7, 
		RULE_term_tail = 8, RULE_term = 9, RULE_factor_tail = 10, RULE_factor = 11, 
		RULE_add_op = 12, RULE_mult_op = 13;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "stmt_list", "stmt", "expr_list", "expr_list_tail", "id_list", 
			"id_list_tail", "expr", "term_tail", "term", "factor_tail", "factor", 
			"add_op", "mult_op"
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

	@Override
	public String getGrammarFileName() { return "SimplePL1Paulski.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SimplePL1PaulskiParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public Stmt_listContext stmt_list() {
			return getRuleContext(Stmt_listContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimplePL1PaulskiListener ) ((SimplePL1PaulskiListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimplePL1PaulskiListener ) ((SimplePL1PaulskiListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(28);
			stmt_list();
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

	public static class Stmt_listContext extends ParserRuleContext {
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public Stmt_listContext stmt_list() {
			return getRuleContext(Stmt_listContext.class,0);
		}
		public Stmt_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimplePL1PaulskiListener ) ((SimplePL1PaulskiListener)listener).enterStmt_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimplePL1PaulskiListener ) ((SimplePL1PaulskiListener)listener).exitStmt_list(this);
		}
	}

	public final Stmt_listContext stmt_list() throws RecognitionException {
		Stmt_listContext _localctx = new Stmt_listContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stmt_list);
		try {
			setState(34);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case READ:
			case WRITE:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(30);
				stmt();
				setState(31);
				stmt_list();
				}
				break;
			case EOF:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class StmtContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SimplePL1PaulskiParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(SimplePL1PaulskiParser.ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(SimplePL1PaulskiParser.SEMICOLON, 0); }
		public TerminalNode READ() { return getToken(SimplePL1PaulskiParser.READ, 0); }
		public TerminalNode LPAREN() { return getToken(SimplePL1PaulskiParser.LPAREN, 0); }
		public Id_listContext id_list() {
			return getRuleContext(Id_listContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(SimplePL1PaulskiParser.RPAREN, 0); }
		public TerminalNode WRITE() { return getToken(SimplePL1PaulskiParser.WRITE, 0); }
		public Expr_listContext expr_list() {
			return getRuleContext(Expr_listContext.class,0);
		}
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimplePL1PaulskiListener ) ((SimplePL1PaulskiListener)listener).enterStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimplePL1PaulskiListener ) ((SimplePL1PaulskiListener)listener).exitStmt(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_stmt);
		try {
			setState(53);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(36);
				match(ID);
				setState(37);
				match(ASSIGN);
				setState(38);
				expr();
				setState(39);
				match(SEMICOLON);
				}
				break;
			case READ:
				enterOuterAlt(_localctx, 2);
				{
				setState(41);
				match(READ);
				setState(42);
				match(LPAREN);
				setState(43);
				id_list();
				setState(44);
				match(RPAREN);
				setState(45);
				match(SEMICOLON);
				}
				break;
			case WRITE:
				enterOuterAlt(_localctx, 3);
				{
				setState(47);
				match(WRITE);
				setState(48);
				match(LPAREN);
				setState(49);
				expr_list();
				setState(50);
				match(RPAREN);
				setState(51);
				match(SEMICOLON);
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

	public static class Expr_listContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Expr_list_tailContext expr_list_tail() {
			return getRuleContext(Expr_list_tailContext.class,0);
		}
		public Expr_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimplePL1PaulskiListener ) ((SimplePL1PaulskiListener)listener).enterExpr_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimplePL1PaulskiListener ) ((SimplePL1PaulskiListener)listener).exitExpr_list(this);
		}
	}

	public final Expr_listContext expr_list() throws RecognitionException {
		Expr_listContext _localctx = new Expr_listContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_expr_list);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			expr();
			setState(56);
			expr_list_tail();
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

	public static class Expr_list_tailContext extends ParserRuleContext {
		public TerminalNode COMMA() { return getToken(SimplePL1PaulskiParser.COMMA, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Expr_list_tailContext expr_list_tail() {
			return getRuleContext(Expr_list_tailContext.class,0);
		}
		public Expr_list_tailContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_list_tail; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimplePL1PaulskiListener ) ((SimplePL1PaulskiListener)listener).enterExpr_list_tail(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimplePL1PaulskiListener ) ((SimplePL1PaulskiListener)listener).exitExpr_list_tail(this);
		}
	}

	public final Expr_list_tailContext expr_list_tail() throws RecognitionException {
		Expr_list_tailContext _localctx = new Expr_list_tailContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_expr_list_tail);
		try {
			setState(63);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(58);
				match(COMMA);
				setState(59);
				expr();
				setState(60);
				expr_list_tail();
				}
				break;
			case RPAREN:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class Id_listContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SimplePL1PaulskiParser.ID, 0); }
		public Id_list_tailContext id_list_tail() {
			return getRuleContext(Id_list_tailContext.class,0);
		}
		public Id_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimplePL1PaulskiListener ) ((SimplePL1PaulskiListener)listener).enterId_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimplePL1PaulskiListener ) ((SimplePL1PaulskiListener)listener).exitId_list(this);
		}
	}

	public final Id_listContext id_list() throws RecognitionException {
		Id_listContext _localctx = new Id_listContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_id_list);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			match(ID);
			setState(66);
			id_list_tail();
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

	public static class Id_list_tailContext extends ParserRuleContext {
		public TerminalNode COMMA() { return getToken(SimplePL1PaulskiParser.COMMA, 0); }
		public TerminalNode ID() { return getToken(SimplePL1PaulskiParser.ID, 0); }
		public Id_list_tailContext id_list_tail() {
			return getRuleContext(Id_list_tailContext.class,0);
		}
		public Id_list_tailContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id_list_tail; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimplePL1PaulskiListener ) ((SimplePL1PaulskiListener)listener).enterId_list_tail(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimplePL1PaulskiListener ) ((SimplePL1PaulskiListener)listener).exitId_list_tail(this);
		}
	}

	public final Id_list_tailContext id_list_tail() throws RecognitionException {
		Id_list_tailContext _localctx = new Id_list_tailContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_id_list_tail);
		try {
			setState(72);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(68);
				match(COMMA);
				setState(69);
				match(ID);
				setState(70);
				id_list_tail();
				}
				break;
			case RPAREN:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class ExprContext extends ParserRuleContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public Term_tailContext term_tail() {
			return getRuleContext(Term_tailContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimplePL1PaulskiListener ) ((SimplePL1PaulskiListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimplePL1PaulskiListener ) ((SimplePL1PaulskiListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			term();
			setState(75);
			term_tail();
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

	public static class Term_tailContext extends ParserRuleContext {
		public Add_opContext add_op() {
			return getRuleContext(Add_opContext.class,0);
		}
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public Term_tailContext term_tail() {
			return getRuleContext(Term_tailContext.class,0);
		}
		public Term_tailContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term_tail; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimplePL1PaulskiListener ) ((SimplePL1PaulskiListener)listener).enterTerm_tail(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimplePL1PaulskiListener ) ((SimplePL1PaulskiListener)listener).exitTerm_tail(this);
		}
	}

	public final Term_tailContext term_tail() throws RecognitionException {
		Term_tailContext _localctx = new Term_tailContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_term_tail);
		try {
			setState(82);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUS:
			case MINUS:
				enterOuterAlt(_localctx, 1);
				{
				setState(77);
				add_op();
				setState(78);
				term();
				setState(79);
				term_tail();
				}
				break;
			case SEMICOLON:
			case COMMA:
			case RPAREN:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class TermContext extends ParserRuleContext {
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public Factor_tailContext factor_tail() {
			return getRuleContext(Factor_tailContext.class,0);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimplePL1PaulskiListener ) ((SimplePL1PaulskiListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimplePL1PaulskiListener ) ((SimplePL1PaulskiListener)listener).exitTerm(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_term);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			factor();
			setState(85);
			factor_tail();
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

	public static class Factor_tailContext extends ParserRuleContext {
		public Mult_opContext mult_op() {
			return getRuleContext(Mult_opContext.class,0);
		}
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public Factor_tailContext factor_tail() {
			return getRuleContext(Factor_tailContext.class,0);
		}
		public Factor_tailContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor_tail; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimplePL1PaulskiListener ) ((SimplePL1PaulskiListener)listener).enterFactor_tail(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimplePL1PaulskiListener ) ((SimplePL1PaulskiListener)listener).exitFactor_tail(this);
		}
	}

	public final Factor_tailContext factor_tail() throws RecognitionException {
		Factor_tailContext _localctx = new Factor_tailContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_factor_tail);
		try {
			setState(92);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TIMES:
			case DIV:
				enterOuterAlt(_localctx, 1);
				{
				setState(87);
				mult_op();
				setState(88);
				factor();
				setState(89);
				factor_tail();
				}
				break;
			case PLUS:
			case MINUS:
			case SEMICOLON:
			case COMMA:
			case RPAREN:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class FactorContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(SimplePL1PaulskiParser.LPAREN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(SimplePL1PaulskiParser.RPAREN, 0); }
		public TerminalNode ID() { return getToken(SimplePL1PaulskiParser.ID, 0); }
		public TerminalNode NUMBER() { return getToken(SimplePL1PaulskiParser.NUMBER, 0); }
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimplePL1PaulskiListener ) ((SimplePL1PaulskiListener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimplePL1PaulskiListener ) ((SimplePL1PaulskiListener)listener).exitFactor(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_factor);
		try {
			setState(100);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(94);
				match(LPAREN);
				setState(95);
				expr();
				setState(96);
				match(RPAREN);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(98);
				match(ID);
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 3);
				{
				setState(99);
				match(NUMBER);
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

	public static class Add_opContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(SimplePL1PaulskiParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(SimplePL1PaulskiParser.MINUS, 0); }
		public Add_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_add_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimplePL1PaulskiListener ) ((SimplePL1PaulskiListener)listener).enterAdd_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimplePL1PaulskiListener ) ((SimplePL1PaulskiListener)listener).exitAdd_op(this);
		}
	}

	public final Add_opContext add_op() throws RecognitionException {
		Add_opContext _localctx = new Add_opContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_add_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			_la = _input.LA(1);
			if ( !(_la==PLUS || _la==MINUS) ) {
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

	public static class Mult_opContext extends ParserRuleContext {
		public TerminalNode TIMES() { return getToken(SimplePL1PaulskiParser.TIMES, 0); }
		public TerminalNode DIV() { return getToken(SimplePL1PaulskiParser.DIV, 0); }
		public Mult_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mult_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimplePL1PaulskiListener ) ((SimplePL1PaulskiListener)listener).enterMult_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimplePL1PaulskiListener ) ((SimplePL1PaulskiListener)listener).exitMult_op(this);
		}
	}

	public final Mult_opContext mult_op() throws RecognitionException {
		Mult_opContext _localctx = new Mult_opContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_mult_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			_la = _input.LA(1);
			if ( !(_la==TIMES || _la==DIV) ) {
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\20m\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4"+
		"\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\3\2\3\3\3\3\3\3\3\3\5\3%\n\3\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4"+
		"8\n\4\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\5\6B\n\6\3\7\3\7\3\7\3\b\3\b\3\b"+
		"\3\b\5\bK\n\b\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\5\nU\n\n\3\13\3\13\3\13"+
		"\3\f\3\f\3\f\3\f\3\f\5\f_\n\f\3\r\3\r\3\r\3\r\3\r\3\r\5\rg\n\r\3\16\3"+
		"\16\3\17\3\17\3\17\2\2\20\2\4\6\b\n\f\16\20\22\24\26\30\32\34\2\4\3\2"+
		"\b\t\3\2\n\13\2g\2\36\3\2\2\2\4$\3\2\2\2\6\67\3\2\2\2\b9\3\2\2\2\nA\3"+
		"\2\2\2\fC\3\2\2\2\16J\3\2\2\2\20L\3\2\2\2\22T\3\2\2\2\24V\3\2\2\2\26^"+
		"\3\2\2\2\30f\3\2\2\2\32h\3\2\2\2\34j\3\2\2\2\36\37\5\4\3\2\37\3\3\2\2"+
		"\2 !\5\6\4\2!\"\5\4\3\2\"%\3\2\2\2#%\3\2\2\2$ \3\2\2\2$#\3\2\2\2%\5\3"+
		"\2\2\2&\'\7\5\2\2\'(\7\7\2\2()\5\20\t\2)*\7\f\2\2*8\3\2\2\2+,\7\3\2\2"+
		",-\7\16\2\2-.\5\f\7\2./\7\17\2\2/\60\7\f\2\2\608\3\2\2\2\61\62\7\4\2\2"+
		"\62\63\7\16\2\2\63\64\5\b\5\2\64\65\7\17\2\2\65\66\7\f\2\2\668\3\2\2\2"+
		"\67&\3\2\2\2\67+\3\2\2\2\67\61\3\2\2\28\7\3\2\2\29:\5\20\t\2:;\5\n\6\2"+
		";\t\3\2\2\2<=\7\r\2\2=>\5\20\t\2>?\5\n\6\2?B\3\2\2\2@B\3\2\2\2A<\3\2\2"+
		"\2A@\3\2\2\2B\13\3\2\2\2CD\7\5\2\2DE\5\16\b\2E\r\3\2\2\2FG\7\r\2\2GH\7"+
		"\5\2\2HK\5\16\b\2IK\3\2\2\2JF\3\2\2\2JI\3\2\2\2K\17\3\2\2\2LM\5\24\13"+
		"\2MN\5\22\n\2N\21\3\2\2\2OP\5\32\16\2PQ\5\24\13\2QR\5\22\n\2RU\3\2\2\2"+
		"SU\3\2\2\2TO\3\2\2\2TS\3\2\2\2U\23\3\2\2\2VW\5\30\r\2WX\5\26\f\2X\25\3"+
		"\2\2\2YZ\5\34\17\2Z[\5\30\r\2[\\\5\26\f\2\\_\3\2\2\2]_\3\2\2\2^Y\3\2\2"+
		"\2^]\3\2\2\2_\27\3\2\2\2`a\7\16\2\2ab\5\20\t\2bc\7\17\2\2cg\3\2\2\2dg"+
		"\7\5\2\2eg\7\6\2\2f`\3\2\2\2fd\3\2\2\2fe\3\2\2\2g\31\3\2\2\2hi\t\2\2\2"+
		"i\33\3\2\2\2jk\t\3\2\2k\35\3\2\2\2\t$\67AJT^f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}