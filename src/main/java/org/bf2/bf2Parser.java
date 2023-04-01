// Generated from bf2.g4 by ANTLR 4.12.0
package org.bf2;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class bf2Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.12.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, VARNAME=30, NUMBER=31, 
		COMMENT=32, EOL=33, WS=34;
	public static final int
		RULE_prog = 0, RULE_line = 1, RULE_command = 2, RULE_funcDef = 3, RULE_funcCall = 4, 
		RULE_loop = 5, RULE_block = 6, RULE_ifStatement = 7, RULE_boolStatement = 8, 
		RULE_assign = 9, RULE_varGetter = 10, RULE_expression = 11, RULE_print = 12, 
		RULE_logicalOperator = 13, RULE_comparisonOperator = 14, RULE_directionalMove = 15;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "line", "command", "funcDef", "funcCall", "loop", "block", "ifStatement", 
			"boolStatement", "assign", "varGetter", "expression", "print", "logicalOperator", 
			"comparisonOperator", "directionalMove"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'func'", "':'", "'{'", "'}'", "'do'", "'('", "')'", "'if'", "'='", 
			"'.'", "'+'", "'-'", "'*'", "'/'", "'@'", "'&&'", "'||'", "'<?'", "'>?'", 
			"'<=?'", "'>=?'", "'=?'", "'!=?'", "'<'", "'>'", "'^'", "'v'", "'\\'", 
			"'//'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, "VARNAME", "NUMBER", "COMMENT", "EOL", 
			"WS"
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
	public String getGrammarFileName() { return "bf2.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public bf2Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(bf2Parser.EOF, 0); }
		public List<LineContext> line() {
			return getRuleContexts(LineContext.class);
		}
		public LineContext line(int i) {
			return getRuleContext(LineContext.class,i);
		}
		public List<TerminalNode> EOL() { return getTokens(bf2Parser.EOL); }
		public TerminalNode EOL(int i) {
			return getToken(bf2Parser.EOL, i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bf2Listener ) ((bf2Listener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bf2Listener ) ((bf2Listener)listener).exitProg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bf2Visitor ) return ((bf2Visitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(35); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(32);
					line();
					setState(33);
					match(EOL);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(37); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(40);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8573159274L) != 0)) {
				{
				setState(39);
				line();
				}
			}

			setState(42);
			match(EOF);
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

	@SuppressWarnings("CheckReturnValue")
	public static class LineContext extends ParserRuleContext {
		public List<CommandContext> command() {
			return getRuleContexts(CommandContext.class);
		}
		public CommandContext command(int i) {
			return getRuleContext(CommandContext.class,i);
		}
		public TerminalNode COMMENT() { return getToken(bf2Parser.COMMENT, 0); }
		public FuncDefContext funcDef() {
			return getRuleContext(FuncDefContext.class,0);
		}
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public LineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_line; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bf2Listener ) ((bf2Listener)listener).enterLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bf2Listener ) ((bf2Listener)listener).exitLine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bf2Visitor ) return ((bf2Visitor<? extends T>)visitor).visitLine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LineContext line() throws RecognitionException {
		LineContext _localctx = new LineContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_line);
		int _la;
		try {
			setState(61);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(45); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(44);
					command();
					}
					}
					setState(47); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 4278191976L) != 0) );
				setState(50);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMENT) {
					{
					setState(49);
					match(COMMENT);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(52);
				match(COMMENT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(53);
				funcDef();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(55); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(54);
					command();
					}
					}
					setState(57); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 4278191976L) != 0) );
				setState(59);
				print();
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

	@SuppressWarnings("CheckReturnValue")
	public static class CommandContext extends ParserRuleContext {
		public LoopContext loop() {
			return getRuleContext(LoopContext.class,0);
		}
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public FuncCallContext funcCall() {
			return getRuleContext(FuncCallContext.class,0);
		}
		public DirectionalMoveContext directionalMove() {
			return getRuleContext(DirectionalMoveContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignContext assign() {
			return getRuleContext(AssignContext.class,0);
		}
		public CommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_command; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bf2Listener ) ((bf2Listener)listener).enterCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bf2Listener ) ((bf2Listener)listener).exitCommand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bf2Visitor ) return ((bf2Visitor<? extends T>)visitor).visitCommand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommandContext command() throws RecognitionException {
		CommandContext _localctx = new CommandContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_command);
		try {
			setState(69);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				enterOuterAlt(_localctx, 1);
				{
				setState(63);
				loop();
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 2);
				{
				setState(64);
				ifStatement();
				}
				break;
			case VARNAME:
				enterOuterAlt(_localctx, 3);
				{
				setState(65);
				funcCall();
				}
				break;
			case T__23:
			case T__24:
			case T__25:
			case T__26:
			case T__27:
			case T__28:
				enterOuterAlt(_localctx, 4);
				{
				setState(66);
				directionalMove();
				}
				break;
			case T__2:
			case T__5:
			case T__9:
			case NUMBER:
				enterOuterAlt(_localctx, 5);
				{
				setState(67);
				expression(0);
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 6);
				{
				setState(68);
				assign();
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

	@SuppressWarnings("CheckReturnValue")
	public static class FuncDefContext extends ParserRuleContext {
		public TerminalNode VARNAME() { return getToken(bf2Parser.VARNAME, 0); }
		public List<TerminalNode> EOL() { return getTokens(bf2Parser.EOL); }
		public TerminalNode EOL(int i) {
			return getToken(bf2Parser.EOL, i);
		}
		public List<LineContext> line() {
			return getRuleContexts(LineContext.class);
		}
		public LineContext line(int i) {
			return getRuleContext(LineContext.class,i);
		}
		public FuncDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bf2Listener ) ((bf2Listener)listener).enterFuncDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bf2Listener ) ((bf2Listener)listener).exitFuncDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bf2Visitor ) return ((bf2Visitor<? extends T>)visitor).visitFuncDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncDefContext funcDef() throws RecognitionException {
		FuncDefContext _localctx = new FuncDefContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_funcDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			match(T__0);
			setState(72);
			match(T__1);
			setState(73);
			match(VARNAME);
			setState(75);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EOL) {
				{
				setState(74);
				match(EOL);
				}
			}

			setState(77);
			match(T__2);
			setState(82); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(79);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8573159274L) != 0)) {
					{
					setState(78);
					line();
					}
				}

				setState(81);
				match(EOL);
				}
				}
				setState(84); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 17163093866L) != 0) );
			setState(86);
			match(T__3);
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

	@SuppressWarnings("CheckReturnValue")
	public static class FuncCallContext extends ParserRuleContext {
		public TerminalNode VARNAME() { return getToken(bf2Parser.VARNAME, 0); }
		public FuncCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bf2Listener ) ((bf2Listener)listener).enterFuncCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bf2Listener ) ((bf2Listener)listener).exitFuncCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bf2Visitor ) return ((bf2Visitor<? extends T>)visitor).visitFuncCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncCallContext funcCall() throws RecognitionException {
		FuncCallContext _localctx = new FuncCallContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_funcCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			match(VARNAME);
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

	@SuppressWarnings("CheckReturnValue")
	public static class LoopContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode NUMBER() { return getToken(bf2Parser.NUMBER, 0); }
		public BoolStatementContext boolStatement() {
			return getRuleContext(BoolStatementContext.class,0);
		}
		public LoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bf2Listener ) ((bf2Listener)listener).enterLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bf2Listener ) ((bf2Listener)listener).exitLoop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bf2Visitor ) return ((bf2Visitor<? extends T>)visitor).visitLoop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoopContext loop() throws RecognitionException {
		LoopContext _localctx = new LoopContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_loop);
		try {
			setState(103);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(90);
				match(T__4);
				setState(91);
				block();
				setState(92);
				match(T__5);
				setState(93);
				match(NUMBER);
				setState(94);
				match(T__6);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(96);
				match(T__4);
				setState(97);
				block();
				setState(98);
				match(T__7);
				setState(99);
				match(T__5);
				setState(100);
				boolStatement(0);
				setState(101);
				match(T__6);
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

	@SuppressWarnings("CheckReturnValue")
	public static class BlockContext extends ParserRuleContext {
		public List<CommandContext> command() {
			return getRuleContexts(CommandContext.class);
		}
		public CommandContext command(int i) {
			return getRuleContext(CommandContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bf2Listener ) ((bf2Listener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bf2Listener ) ((bf2Listener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bf2Visitor ) return ((bf2Visitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			match(T__2);
			setState(107); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(106);
				command();
				}
				}
				setState(109); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 4278191976L) != 0) );
			setState(111);
			match(T__3);
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

	@SuppressWarnings("CheckReturnValue")
	public static class IfStatementContext extends ParserRuleContext {
		public BoolStatementContext boolStatement() {
			return getRuleContext(BoolStatementContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bf2Listener ) ((bf2Listener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bf2Listener ) ((bf2Listener)listener).exitIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bf2Visitor ) return ((bf2Visitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_ifStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			match(T__7);
			setState(114);
			match(T__5);
			setState(115);
			boolStatement(0);
			setState(116);
			match(T__6);
			setState(117);
			block();
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

	@SuppressWarnings("CheckReturnValue")
	public static class BoolStatementContext extends ParserRuleContext {
		public List<VarGetterContext> varGetter() {
			return getRuleContexts(VarGetterContext.class);
		}
		public VarGetterContext varGetter(int i) {
			return getRuleContext(VarGetterContext.class,i);
		}
		public ComparisonOperatorContext comparisonOperator() {
			return getRuleContext(ComparisonOperatorContext.class,0);
		}
		public List<BoolStatementContext> boolStatement() {
			return getRuleContexts(BoolStatementContext.class);
		}
		public BoolStatementContext boolStatement(int i) {
			return getRuleContext(BoolStatementContext.class,i);
		}
		public LogicalOperatorContext logicalOperator() {
			return getRuleContext(LogicalOperatorContext.class,0);
		}
		public BoolStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bf2Listener ) ((bf2Listener)listener).enterBoolStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bf2Listener ) ((bf2Listener)listener).exitBoolStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bf2Visitor ) return ((bf2Visitor<? extends T>)visitor).visitBoolStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolStatementContext boolStatement() throws RecognitionException {
		return boolStatement(0);
	}

	private BoolStatementContext boolStatement(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		BoolStatementContext _localctx = new BoolStatementContext(_ctx, _parentState);
		BoolStatementContext _prevctx = _localctx;
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_boolStatement, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(120);
				varGetter();
				setState(121);
				comparisonOperator();
				setState(122);
				varGetter();
				}
				break;
			case 2:
				{
				setState(124);
				varGetter();
				}
				break;
			case 3:
				{
				setState(125);
				match(T__5);
				setState(126);
				boolStatement(0);
				setState(127);
				match(T__6);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(137);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new BoolStatementContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_boolStatement);
					setState(131);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(132);
					logicalOperator();
					setState(133);
					boolStatement(3);
					}
					} 
				}
				setState(139);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AssignContext extends ParserRuleContext {
		public VarGetterContext varGetter() {
			return getRuleContext(VarGetterContext.class,0);
		}
		public TerminalNode NUMBER() { return getToken(bf2Parser.NUMBER, 0); }
		public AssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bf2Listener ) ((bf2Listener)listener).enterAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bf2Listener ) ((bf2Listener)listener).exitAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bf2Visitor ) return ((bf2Visitor<? extends T>)visitor).visitAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignContext assign() throws RecognitionException {
		AssignContext _localctx = new AssignContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_assign);
		try {
			setState(144);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(140);
				match(T__8);
				setState(141);
				varGetter();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(142);
				match(T__8);
				setState(143);
				match(NUMBER);
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

	@SuppressWarnings("CheckReturnValue")
	public static class VarGetterContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(bf2Parser.NUMBER, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public VarGetterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varGetter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bf2Listener ) ((bf2Listener)listener).enterVarGetter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bf2Listener ) ((bf2Listener)listener).exitVarGetter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bf2Visitor ) return ((bf2Visitor<? extends T>)visitor).visitVarGetter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarGetterContext varGetter() throws RecognitionException {
		VarGetterContext _localctx = new VarGetterContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_varGetter);
		try {
			setState(151);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(146);
				match(NUMBER);
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 2);
				{
				setState(147);
				block();
				setState(148);
				match(T__9);
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 3);
				{
				setState(150);
				match(T__9);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public VarGetterContext varGetter() {
			return getRuleContext(VarGetterContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bf2Listener ) ((bf2Listener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bf2Listener ) ((bf2Listener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bf2Visitor ) return ((bf2Visitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 22;
		enterRecursionRule(_localctx, 22, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
				{
				setState(154);
				match(T__5);
				setState(155);
				expression(0);
				setState(156);
				match(T__6);
				}
				break;
			case T__2:
			case T__9:
			case NUMBER:
				{
				setState(158);
				varGetter();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(166);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expression);
					setState(161);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(162);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 30720L) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(163);
					expression(4);
					}
					} 
				}
				setState(168);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PrintContext extends ParserRuleContext {
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bf2Listener ) ((bf2Listener)listener).enterPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bf2Listener ) ((bf2Listener)listener).exitPrint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bf2Visitor ) return ((bf2Visitor<? extends T>)visitor).visitPrint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_print);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			match(T__14);
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

	@SuppressWarnings("CheckReturnValue")
	public static class LogicalOperatorContext extends ParserRuleContext {
		public LogicalOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bf2Listener ) ((bf2Listener)listener).enterLogicalOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bf2Listener ) ((bf2Listener)listener).exitLogicalOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bf2Visitor ) return ((bf2Visitor<? extends T>)visitor).visitLogicalOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicalOperatorContext logicalOperator() throws RecognitionException {
		LogicalOperatorContext _localctx = new LogicalOperatorContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_logicalOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			_la = _input.LA(1);
			if ( !(_la==T__15 || _la==T__16) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class ComparisonOperatorContext extends ParserRuleContext {
		public ComparisonOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparisonOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bf2Listener ) ((bf2Listener)listener).enterComparisonOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bf2Listener ) ((bf2Listener)listener).exitComparisonOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bf2Visitor ) return ((bf2Visitor<? extends T>)visitor).visitComparisonOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparisonOperatorContext comparisonOperator() throws RecognitionException {
		ComparisonOperatorContext _localctx = new ComparisonOperatorContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_comparisonOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 16515072L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class DirectionalMoveContext extends ParserRuleContext {
		public DirectionalMoveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_directionalMove; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bf2Listener ) ((bf2Listener)listener).enterDirectionalMove(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bf2Listener ) ((bf2Listener)listener).exitDirectionalMove(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bf2Visitor ) return ((bf2Visitor<? extends T>)visitor).visitDirectionalMove(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DirectionalMoveContext directionalMove() throws RecognitionException {
		DirectionalMoveContext _localctx = new DirectionalMoveContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_directionalMove);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1056964608L) != 0)) ) {
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 8:
			return boolStatement_sempred((BoolStatementContext)_localctx, predIndex);
		case 11:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean boolStatement_sempred(BoolStatementContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\"\u00b2\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0004\u0000$\b\u0000\u000b\u0000"+
		"\f\u0000%\u0001\u0000\u0003\u0000)\b\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0001\u0004\u0001.\b\u0001\u000b\u0001\f\u0001/\u0001\u0001\u0003\u0001"+
		"3\b\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0004\u00018\b\u0001\u000b"+
		"\u0001\f\u00019\u0001\u0001\u0001\u0001\u0003\u0001>\b\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002"+
		"F\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003"+
		"L\b\u0003\u0001\u0003\u0001\u0003\u0003\u0003P\b\u0003\u0001\u0003\u0004"+
		"\u0003S\b\u0003\u000b\u0003\f\u0003T\u0001\u0003\u0001\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0003\u0005h\b\u0005\u0001\u0006\u0001\u0006"+
		"\u0004\u0006l\b\u0006\u000b\u0006\f\u0006m\u0001\u0006\u0001\u0006\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0003\b\u0082\b\b\u0001\b\u0001\b\u0001\b\u0001\b\u0005\b\u0088\b\b"+
		"\n\b\f\b\u008b\t\b\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t\u0091\b\t\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n\u0098\b\n\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u00a0"+
		"\b\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0005\u000b\u00a5\b\u000b"+
		"\n\u000b\f\u000b\u00a8\t\u000b\u0001\f\u0001\f\u0001\r\u0001\r\u0001\u000e"+
		"\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0000\u0002\u0010\u0016"+
		"\u0010\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018"+
		"\u001a\u001c\u001e\u0000\u0004\u0001\u0000\u000b\u000e\u0001\u0000\u0010"+
		"\u0011\u0001\u0000\u0012\u0017\u0001\u0000\u0018\u001d\u00bb\u0000#\u0001"+
		"\u0000\u0000\u0000\u0002=\u0001\u0000\u0000\u0000\u0004E\u0001\u0000\u0000"+
		"\u0000\u0006G\u0001\u0000\u0000\u0000\bX\u0001\u0000\u0000\u0000\ng\u0001"+
		"\u0000\u0000\u0000\fi\u0001\u0000\u0000\u0000\u000eq\u0001\u0000\u0000"+
		"\u0000\u0010\u0081\u0001\u0000\u0000\u0000\u0012\u0090\u0001\u0000\u0000"+
		"\u0000\u0014\u0097\u0001\u0000\u0000\u0000\u0016\u009f\u0001\u0000\u0000"+
		"\u0000\u0018\u00a9\u0001\u0000\u0000\u0000\u001a\u00ab\u0001\u0000\u0000"+
		"\u0000\u001c\u00ad\u0001\u0000\u0000\u0000\u001e\u00af\u0001\u0000\u0000"+
		"\u0000 !\u0003\u0002\u0001\u0000!\"\u0005!\u0000\u0000\"$\u0001\u0000"+
		"\u0000\u0000# \u0001\u0000\u0000\u0000$%\u0001\u0000\u0000\u0000%#\u0001"+
		"\u0000\u0000\u0000%&\u0001\u0000\u0000\u0000&(\u0001\u0000\u0000\u0000"+
		"\')\u0003\u0002\u0001\u0000(\'\u0001\u0000\u0000\u0000()\u0001\u0000\u0000"+
		"\u0000)*\u0001\u0000\u0000\u0000*+\u0005\u0000\u0000\u0001+\u0001\u0001"+
		"\u0000\u0000\u0000,.\u0003\u0004\u0002\u0000-,\u0001\u0000\u0000\u0000"+
		"./\u0001\u0000\u0000\u0000/-\u0001\u0000\u0000\u0000/0\u0001\u0000\u0000"+
		"\u000002\u0001\u0000\u0000\u000013\u0005 \u0000\u000021\u0001\u0000\u0000"+
		"\u000023\u0001\u0000\u0000\u00003>\u0001\u0000\u0000\u00004>\u0005 \u0000"+
		"\u00005>\u0003\u0006\u0003\u000068\u0003\u0004\u0002\u000076\u0001\u0000"+
		"\u0000\u000089\u0001\u0000\u0000\u000097\u0001\u0000\u0000\u00009:\u0001"+
		"\u0000\u0000\u0000:;\u0001\u0000\u0000\u0000;<\u0003\u0018\f\u0000<>\u0001"+
		"\u0000\u0000\u0000=-\u0001\u0000\u0000\u0000=4\u0001\u0000\u0000\u0000"+
		"=5\u0001\u0000\u0000\u0000=7\u0001\u0000\u0000\u0000>\u0003\u0001\u0000"+
		"\u0000\u0000?F\u0003\n\u0005\u0000@F\u0003\u000e\u0007\u0000AF\u0003\b"+
		"\u0004\u0000BF\u0003\u001e\u000f\u0000CF\u0003\u0016\u000b\u0000DF\u0003"+
		"\u0012\t\u0000E?\u0001\u0000\u0000\u0000E@\u0001\u0000\u0000\u0000EA\u0001"+
		"\u0000\u0000\u0000EB\u0001\u0000\u0000\u0000EC\u0001\u0000\u0000\u0000"+
		"ED\u0001\u0000\u0000\u0000F\u0005\u0001\u0000\u0000\u0000GH\u0005\u0001"+
		"\u0000\u0000HI\u0005\u0002\u0000\u0000IK\u0005\u001e\u0000\u0000JL\u0005"+
		"!\u0000\u0000KJ\u0001\u0000\u0000\u0000KL\u0001\u0000\u0000\u0000LM\u0001"+
		"\u0000\u0000\u0000MR\u0005\u0003\u0000\u0000NP\u0003\u0002\u0001\u0000"+
		"ON\u0001\u0000\u0000\u0000OP\u0001\u0000\u0000\u0000PQ\u0001\u0000\u0000"+
		"\u0000QS\u0005!\u0000\u0000RO\u0001\u0000\u0000\u0000ST\u0001\u0000\u0000"+
		"\u0000TR\u0001\u0000\u0000\u0000TU\u0001\u0000\u0000\u0000UV\u0001\u0000"+
		"\u0000\u0000VW\u0005\u0004\u0000\u0000W\u0007\u0001\u0000\u0000\u0000"+
		"XY\u0005\u001e\u0000\u0000Y\t\u0001\u0000\u0000\u0000Z[\u0005\u0005\u0000"+
		"\u0000[\\\u0003\f\u0006\u0000\\]\u0005\u0006\u0000\u0000]^\u0005\u001f"+
		"\u0000\u0000^_\u0005\u0007\u0000\u0000_h\u0001\u0000\u0000\u0000`a\u0005"+
		"\u0005\u0000\u0000ab\u0003\f\u0006\u0000bc\u0005\b\u0000\u0000cd\u0005"+
		"\u0006\u0000\u0000de\u0003\u0010\b\u0000ef\u0005\u0007\u0000\u0000fh\u0001"+
		"\u0000\u0000\u0000gZ\u0001\u0000\u0000\u0000g`\u0001\u0000\u0000\u0000"+
		"h\u000b\u0001\u0000\u0000\u0000ik\u0005\u0003\u0000\u0000jl\u0003\u0004"+
		"\u0002\u0000kj\u0001\u0000\u0000\u0000lm\u0001\u0000\u0000\u0000mk\u0001"+
		"\u0000\u0000\u0000mn\u0001\u0000\u0000\u0000no\u0001\u0000\u0000\u0000"+
		"op\u0005\u0004\u0000\u0000p\r\u0001\u0000\u0000\u0000qr\u0005\b\u0000"+
		"\u0000rs\u0005\u0006\u0000\u0000st\u0003\u0010\b\u0000tu\u0005\u0007\u0000"+
		"\u0000uv\u0003\f\u0006\u0000v\u000f\u0001\u0000\u0000\u0000wx\u0006\b"+
		"\uffff\uffff\u0000xy\u0003\u0014\n\u0000yz\u0003\u001c\u000e\u0000z{\u0003"+
		"\u0014\n\u0000{\u0082\u0001\u0000\u0000\u0000|\u0082\u0003\u0014\n\u0000"+
		"}~\u0005\u0006\u0000\u0000~\u007f\u0003\u0010\b\u0000\u007f\u0080\u0005"+
		"\u0007\u0000\u0000\u0080\u0082\u0001\u0000\u0000\u0000\u0081w\u0001\u0000"+
		"\u0000\u0000\u0081|\u0001\u0000\u0000\u0000\u0081}\u0001\u0000\u0000\u0000"+
		"\u0082\u0089\u0001\u0000\u0000\u0000\u0083\u0084\n\u0002\u0000\u0000\u0084"+
		"\u0085\u0003\u001a\r\u0000\u0085\u0086\u0003\u0010\b\u0003\u0086\u0088"+
		"\u0001\u0000\u0000\u0000\u0087\u0083\u0001\u0000\u0000\u0000\u0088\u008b"+
		"\u0001\u0000\u0000\u0000\u0089\u0087\u0001\u0000\u0000\u0000\u0089\u008a"+
		"\u0001\u0000\u0000\u0000\u008a\u0011\u0001\u0000\u0000\u0000\u008b\u0089"+
		"\u0001\u0000\u0000\u0000\u008c\u008d\u0005\t\u0000\u0000\u008d\u0091\u0003"+
		"\u0014\n\u0000\u008e\u008f\u0005\t\u0000\u0000\u008f\u0091\u0005\u001f"+
		"\u0000\u0000\u0090\u008c\u0001\u0000\u0000\u0000\u0090\u008e\u0001\u0000"+
		"\u0000\u0000\u0091\u0013\u0001\u0000\u0000\u0000\u0092\u0098\u0005\u001f"+
		"\u0000\u0000\u0093\u0094\u0003\f\u0006\u0000\u0094\u0095\u0005\n\u0000"+
		"\u0000\u0095\u0098\u0001\u0000\u0000\u0000\u0096\u0098\u0005\n\u0000\u0000"+
		"\u0097\u0092\u0001\u0000\u0000\u0000\u0097\u0093\u0001\u0000\u0000\u0000"+
		"\u0097\u0096\u0001\u0000\u0000\u0000\u0098\u0015\u0001\u0000\u0000\u0000"+
		"\u0099\u009a\u0006\u000b\uffff\uffff\u0000\u009a\u009b\u0005\u0006\u0000"+
		"\u0000\u009b\u009c\u0003\u0016\u000b\u0000\u009c\u009d\u0005\u0007\u0000"+
		"\u0000\u009d\u00a0\u0001\u0000\u0000\u0000\u009e\u00a0\u0003\u0014\n\u0000"+
		"\u009f\u0099\u0001\u0000\u0000\u0000\u009f\u009e\u0001\u0000\u0000\u0000"+
		"\u00a0\u00a6\u0001\u0000\u0000\u0000\u00a1\u00a2\n\u0003\u0000\u0000\u00a2"+
		"\u00a3\u0007\u0000\u0000\u0000\u00a3\u00a5\u0003\u0016\u000b\u0004\u00a4"+
		"\u00a1\u0001\u0000\u0000\u0000\u00a5\u00a8\u0001\u0000\u0000\u0000\u00a6"+
		"\u00a4\u0001\u0000\u0000\u0000\u00a6\u00a7\u0001\u0000\u0000\u0000\u00a7"+
		"\u0017\u0001\u0000\u0000\u0000\u00a8\u00a6\u0001\u0000\u0000\u0000\u00a9"+
		"\u00aa\u0005\u000f\u0000\u0000\u00aa\u0019\u0001\u0000\u0000\u0000\u00ab"+
		"\u00ac\u0007\u0001\u0000\u0000\u00ac\u001b\u0001\u0000\u0000\u0000\u00ad"+
		"\u00ae\u0007\u0002\u0000\u0000\u00ae\u001d\u0001\u0000\u0000\u0000\u00af"+
		"\u00b0\u0007\u0003\u0000\u0000\u00b0\u001f\u0001\u0000\u0000\u0000\u0012"+
		"%(/29=EKOTgm\u0081\u0089\u0090\u0097\u009f\u00a6";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}