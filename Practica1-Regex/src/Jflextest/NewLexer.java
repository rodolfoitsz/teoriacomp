/* The following code was generated by JFlex 1.5.0-SNAPSHOT */

package Jflextest;
import static Jflextest.Token.*;

/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.5.0-SNAPSHOT
 * from the specification file <tt>NewLexer.flex</tt>
 */
class NewLexer {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0, 0
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\33\1\33\1\34\1\34\1\33\22\0\1\33\4\0\1\11"+
    "\2\0\1\6\1\7\3\0\1\5\1\13\1\10\12\4\1\12\2\0"+
    "\1\32\1\0\1\30\1\14\32\1\4\0\1\3\1\0\1\26\1\22"+
    "\1\24\1\2\1\23\2\2\1\27\4\2\1\25\1\2\1\17\4\2"+
    "\1\21\1\20\1\31\1\15\1\2\1\16\1\2\12\0\1\34\u1fa2\0"+
    "\1\34\1\34\udfd6\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\7\1\1\2\13\0\1\2\5\0\2\3\2\0"+
    "\2\3\21\0\1\4\1\0\1\3\5\0\1\3\1\0"+
    "\2\5\7\0\1\3\10\0\1\3\1\4\6\0\1\3"+
    "\2\0\1\3\4\0\1\3\1\0\1\4\1\3\4\0"+
    "\1\3\1\4\1\3\1\0\1\6\2\0\1\3\1\0"+
    "\1\3\6\0\1\3\4\0\1\3\1\4\1\3\1\0"+
    "\1\7\2\0\2\3\3\0\1\3\2\0\1\6\1\0"+
    "\1\3\1\0\2\3\1\0\2\3\1\0\1\3\1\7"+
    "\4\3\1\0\1\10";

  private static int [] zzUnpackAction() {
    int [] result = new int[155];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\35\0\72\0\127\0\164\0\221\0\256\0\313"+
    "\0\350\0\u0105\0\u0122\0\u013f\0\u015c\0\u0179\0\u0196\0\u01b3"+
    "\0\u01d0\0\u01ed\0\u020a\0\u0227\0\35\0\u0244\0\u0261\0\u027e"+
    "\0\u029b\0\u02b8\0\u02d5\0\u02f2\0\u030f\0\u032c\0\u0349\0\u0366"+
    "\0\u0383\0\u03a0\0\u03bd\0\u03da\0\u03f7\0\u0414\0\u0431\0\u044e"+
    "\0\u046b\0\u0488\0\u04a5\0\u04c2\0\u04df\0\u04fc\0\u0519\0\u0536"+
    "\0\u0553\0\u0570\0\u058d\0\u05aa\0\u05c7\0\u05e4\0\u0601\0\u061e"+
    "\0\u063b\0\u0658\0\u0675\0\u0692\0\u06af\0\u06cc\0\u06e9\0\u0706"+
    "\0\u0723\0\u0740\0\u075d\0\u077a\0\u0797\0\u07b4\0\u07d1\0\u07ee"+
    "\0\u080b\0\u0828\0\u0845\0\u0862\0\u087f\0\u089c\0\u08b9\0\u08d6"+
    "\0\u08f3\0\u0910\0\u092d\0\u094a\0\u0967\0\u0984\0\u09a1\0\u09be"+
    "\0\u09db\0\u09f8\0\u0a15\0\u0a32\0\u0a4f\0\u0a6c\0\u0a89\0\u09be"+
    "\0\u0aa6\0\u0ac3\0\u0ae0\0\u0afd\0\u0b1a\0\u0b37\0\u0b54\0\u0b71"+
    "\0\u0b8e\0\u0bab\0\u0bc8\0\u0be5\0\u0c02\0\u0c1f\0\u0c3c\0\u0c59"+
    "\0\u0c76\0\u0c93\0\u0cb0\0\u0ccd\0\u0cea\0\u0d07\0\u0d24\0\u0d41"+
    "\0\u0d5e\0\u0d7b\0\u0d98\0\u0db5\0\u0dd2\0\u0def\0\u01b3\0\u0e0c"+
    "\0\u0e29\0\u0e46\0\u0e63\0\u0bab\0\u0e80\0\u0e9d\0\u0eba\0\u0ed7"+
    "\0\u0ef4\0\35\0\u0f11\0\u0f2e\0\u0f4b\0\u0f68\0\u0f85\0\u0fa2"+
    "\0\u0fbf\0\u0fdc\0\u0ff9\0\u1016\0\35\0\u1033\0\u1050\0\u106d"+
    "\0\u108a\0\u10a7\0\u10a7";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[155];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\1\3\1\4\1\2\1\5\1\2\1\6\1\2"+
    "\1\7\4\2\1\10\12\4\1\2\1\4\1\2\1\11"+
    "\37\0\1\12\1\13\1\14\1\15\1\14\4\0\1\16"+
    "\1\17\1\0\13\13\1\0\1\13\4\0\2\12\1\14"+
    "\1\15\1\14\4\0\1\16\1\17\1\0\13\12\1\0"+
    "\1\12\4\0\2\20\1\21\1\22\1\21\5\0\1\23"+
    "\1\0\13\20\1\0\1\20\7\0\1\24\40\0\1\25"+
    "\25\0\2\12\1\14\1\15\1\14\4\0\1\16\1\17"+
    "\1\0\1\26\12\12\1\0\1\12\36\0\1\11\2\0"+
    "\2\12\1\14\1\15\1\14\4\0\1\16\1\17\1\27"+
    "\13\12\1\0\1\12\4\0\1\12\1\13\1\30\1\15"+
    "\1\14\4\0\1\16\1\17\1\27\13\13\1\0\1\13"+
    "\4\0\2\15\1\14\1\15\1\14\5\0\1\31\1\27"+
    "\13\15\1\0\1\15\4\0\2\15\1\14\1\15\1\14"+
    "\5\0\1\17\1\27\13\15\1\0\1\15\13\0\1\32"+
    "\25\0\2\33\1\31\1\34\1\31\5\0\1\31\1\27"+
    "\13\33\1\0\1\33\4\0\2\20\1\21\1\20\1\21"+
    "\5\0\1\23\1\0\13\20\1\0\1\20\4\0\2\20"+
    "\1\21\1\20\1\21\7\0\13\20\1\0\1\20\4\0"+
    "\2\20\1\21\1\35\1\36\5\0\1\23\1\0\13\20"+
    "\1\0\1\20\4\0\2\37\1\0\1\40\10\0\13\37"+
    "\1\0\1\37\7\0\1\41\31\0\2\12\1\14\1\15"+
    "\1\14\4\0\1\16\1\17\1\27\1\42\12\12\1\0"+
    "\1\12\4\0\2\43\1\0\1\44\10\0\13\43\1\0"+
    "\1\43\4\0\1\45\1\46\1\14\1\15\1\14\5\0"+
    "\1\31\1\27\13\46\1\0\1\46\4\0\5\31\5\0"+
    "\1\31\1\27\13\31\1\0\1\31\13\0\1\47\25\0"+
    "\2\33\1\14\1\34\1\14\2\0\1\50\1\0\1\51"+
    "\1\17\1\27\13\33\1\0\1\33\4\0\2\34\1\14"+
    "\1\34\1\14\2\0\1\50\2\0\1\17\1\27\13\34"+
    "\1\0\1\34\4\0\2\20\1\21\1\20\1\52\5\0"+
    "\1\23\1\0\13\20\1\0\1\20\4\0\2\20\1\21"+
    "\1\53\1\21\7\0\13\20\1\0\1\20\4\0\2\37"+
    "\1\21\1\40\1\21\2\0\1\50\1\0\1\51\1\23"+
    "\1\0\13\37\1\0\1\37\4\0\2\40\1\21\1\40"+
    "\1\21\2\0\1\50\2\0\1\23\1\0\13\40\1\0"+
    "\1\40\7\0\1\54\2\0\1\55\26\0\2\12\1\14"+
    "\1\15\1\14\4\0\1\16\1\56\1\27\13\12\1\0"+
    "\1\12\4\0\2\43\1\57\1\44\1\57\4\0\1\60"+
    "\1\61\1\0\13\43\1\0\1\43\4\0\2\44\1\57"+
    "\1\44\1\57\5\0\1\61\1\0\13\44\1\0\1\44"+
    "\4\0\1\15\1\62\1\14\1\15\1\14\5\0\1\17"+
    "\1\27\13\62\1\0\1\62\4\0\1\15\1\46\1\30"+
    "\1\15\1\14\5\0\1\17\1\27\13\46\1\0\1\46"+
    "\4\0\2\20\1\0\1\20\10\0\1\63\12\20\1\0"+
    "\1\20\4\0\5\64\3\0\1\64\3\0\15\64\13\0"+
    "\1\65\25\0\2\20\1\21\1\66\1\21\7\0\13\20"+
    "\1\0\1\20\4\0\2\20\1\21\1\67\1\21\5\0"+
    "\1\23\1\0\13\20\1\0\1\20\12\0\1\70\32\0"+
    "\1\71\30\0\2\33\1\31\1\34\1\31\5\0\1\31"+
    "\1\27\1\33\1\72\11\33\1\0\1\33\4\0\2\44"+
    "\1\57\1\44\1\57\7\0\13\44\1\0\1\44\13\0"+
    "\1\73\25\0\2\74\1\0\1\75\10\0\13\74\1\0"+
    "\1\74\4\0\1\15\1\62\1\76\1\15\1\14\5\0"+
    "\1\17\1\27\13\62\1\0\1\62\4\0\2\20\1\21"+
    "\1\20\1\21\5\0\1\23\1\0\1\77\12\20\1\0"+
    "\1\20\4\0\5\64\2\0\1\50\1\64\3\0\15\64"+
    "\13\0\1\100\25\0\2\20\1\21\1\101\1\21\5\0"+
    "\1\23\1\0\13\20\1\0\1\20\4\0\2\20\1\21"+
    "\1\20\1\102\5\0\1\23\1\0\13\20\1\0\1\20"+
    "\10\0\1\103\33\0\1\104\31\0\2\33\1\14\1\34"+
    "\1\14\2\0\1\50\1\0\1\51\1\17\1\27\2\33"+
    "\1\105\10\33\1\0\1\33\13\0\1\106\25\0\2\74"+
    "\1\57\1\75\1\57\4\0\1\60\1\61\1\0\13\74"+
    "\1\0\1\74\4\0\2\75\1\57\1\75\1\57\5\0"+
    "\1\61\1\0\13\75\1\0\1\75\4\0\1\107\1\110"+
    "\1\14\1\15\1\14\5\0\1\31\1\27\13\110\1\0"+
    "\1\110\4\0\2\20\1\21\1\20\1\21\5\0\1\23"+
    "\1\0\1\111\12\20\1\0\1\20\4\0\2\20\1\0"+
    "\1\20\10\0\13\20\1\0\1\20\4\0\2\20\1\21"+
    "\1\20\1\112\5\0\1\23\1\0\13\20\1\0\1\20"+
    "\4\0\2\20\1\21\1\113\1\21\7\0\13\20\1\0"+
    "\1\20\7\0\1\114\34\0\1\115\31\0\2\33\1\14"+
    "\1\34\1\14\2\0\1\50\1\0\1\51\1\17\1\27"+
    "\3\33\1\116\7\33\1\0\1\33\4\0\2\44\1\0"+
    "\1\44\10\0\13\44\1\0\1\44\4\0\1\15\1\117"+
    "\1\14\1\15\1\14\5\0\1\17\1\27\13\117\1\0"+
    "\1\117\4\0\1\15\1\110\1\120\1\15\1\14\5\0"+
    "\1\17\1\27\13\110\1\0\1\110\4\0\2\20\1\21"+
    "\1\20\1\21\5\0\1\121\1\0\13\20\1\0\1\20"+
    "\4\0\2\20\1\21\1\122\1\21\7\0\13\20\1\0"+
    "\1\20\4\0\2\20\1\21\1\123\1\21\5\0\1\23"+
    "\1\0\13\20\1\0\1\20\7\0\1\124\35\0\1\125"+
    "\30\0\2\33\1\14\1\34\1\14\2\0\1\50\1\0"+
    "\1\51\1\17\1\27\4\33\1\126\6\33\1\0\1\33"+
    "\4\0\1\15\1\117\1\127\1\15\1\14\5\0\1\17"+
    "\1\27\13\117\1\0\1\117\4\0\1\130\1\110\1\14"+
    "\1\15\1\14\5\0\1\31\1\27\13\110\1\0\1\110"+
    "\4\0\2\37\1\0\1\40\10\0\1\37\1\131\11\37"+
    "\1\0\1\37\4\0\2\20\1\21\1\132\1\21\5\0"+
    "\1\23\1\0\13\20\1\0\1\20\4\0\2\20\1\21"+
    "\1\20\1\133\5\0\1\23\1\0\13\20\1\0\1\20"+
    "\10\0\1\134\33\0\1\135\31\0\2\33\1\14\1\34"+
    "\1\14\2\0\1\50\1\0\1\51\1\17\1\27\3\33"+
    "\1\136\7\33\1\0\1\33\4\0\1\137\1\110\1\14"+
    "\1\15\1\14\5\0\1\31\1\27\13\110\1\0\1\110"+
    "\4\0\1\15\1\140\1\14\1\15\1\14\5\0\1\17"+
    "\1\27\13\140\1\0\1\140\4\0\2\37\1\21\1\40"+
    "\1\21\2\0\1\50\1\0\1\51\1\23\1\0\2\37"+
    "\1\141\10\37\1\0\1\37\4\0\2\20\1\21\1\20"+
    "\1\142\5\0\1\23\1\0\13\20\1\0\1\20\4\0"+
    "\2\20\1\21\1\143\1\21\7\0\13\20\1\0\1\20"+
    "\7\0\1\144\34\0\1\145\31\0\2\33\1\14\1\34"+
    "\1\14\2\0\1\50\1\0\1\51\1\17\1\27\5\33"+
    "\1\146\5\33\1\0\1\33\4\0\1\15\1\147\1\14"+
    "\1\15\1\14\5\0\1\17\1\27\13\147\1\0\1\147"+
    "\4\0\2\37\1\21\1\40\1\21\2\0\1\50\1\0"+
    "\1\51\1\23\1\0\3\37\1\150\7\37\1\0\1\37"+
    "\4\0\2\20\1\21\1\151\1\21\7\0\13\20\1\0"+
    "\1\20\4\0\2\20\1\21\1\152\1\21\5\0\1\23"+
    "\1\0\13\20\1\0\1\20\7\0\1\153\35\0\1\154"+
    "\30\0\2\33\1\14\1\34\1\14\2\0\1\50\1\0"+
    "\1\51\1\17\1\27\6\33\1\155\4\33\1\0\1\33"+
    "\4\0\1\15\1\147\1\156\1\15\1\14\5\0\1\17"+
    "\1\27\13\147\1\0\1\147\4\0\2\37\1\21\1\40"+
    "\1\21\2\0\1\50\1\0\1\51\1\23\1\0\4\37"+
    "\1\157\6\37\1\0\1\37\4\0\2\20\1\21\1\160"+
    "\1\21\5\0\1\23\1\0\13\20\1\0\1\20\4\0"+
    "\2\20\1\21\1\20\1\161\5\0\1\23\1\0\13\20"+
    "\1\0\1\20\10\0\1\162\33\0\1\163\31\0\2\33"+
    "\1\14\1\34\1\14\2\0\1\50\1\0\1\51\1\164"+
    "\1\27\13\33\1\0\1\33\4\0\1\165\1\110\1\14"+
    "\1\15\1\14\5\0\1\31\1\27\13\110\1\0\1\110"+
    "\4\0\2\37\1\21\1\40\1\21\2\0\1\50\1\0"+
    "\1\51\1\23\1\0\3\37\1\166\7\37\1\0\1\37"+
    "\4\0\2\20\1\21\1\20\1\167\5\0\1\23\1\0"+
    "\13\20\1\0\1\20\4\0\2\20\1\21\1\170\1\21"+
    "\7\0\13\20\1\0\1\20\7\0\1\171\34\0\1\172"+
    "\31\0\2\33\1\31\1\34\1\31\5\0\1\31\1\27"+
    "\7\33\1\173\3\33\1\0\1\33\4\0\1\15\1\174"+
    "\1\14\1\15\1\14\5\0\1\17\1\27\13\174\1\0"+
    "\1\174\4\0\2\37\1\21\1\40\1\21\2\0\1\50"+
    "\1\0\1\51\1\23\1\0\5\37\1\175\5\37\1\0"+
    "\1\37\4\0\2\20\1\21\1\176\1\21\7\0\13\20"+
    "\1\0\1\20\4\0\2\20\1\21\1\177\1\21\5\0"+
    "\1\23\1\0\13\20\1\0\1\20\7\0\1\200\35\0"+
    "\1\201\30\0\2\33\1\14\1\34\1\14\2\0\1\50"+
    "\1\0\1\51\1\17\1\27\2\33\1\202\10\33\1\0"+
    "\1\33\4\0\1\15\1\174\1\120\1\15\1\14\5\0"+
    "\1\17\1\27\13\174\1\0\1\174\4\0\2\37\1\21"+
    "\1\40\1\21\2\0\1\50\1\0\1\51\1\23\1\0"+
    "\6\37\1\203\4\37\1\0\1\37\4\0\2\20\1\21"+
    "\1\204\1\21\5\0\1\23\1\0\13\20\1\0\1\20"+
    "\10\0\1\205\33\0\1\206\31\0\2\33\1\14\1\34"+
    "\1\14\2\0\1\50\1\0\1\51\1\17\1\27\10\33"+
    "\1\207\2\33\1\0\1\33\4\0\2\37\1\21\1\40"+
    "\1\21\2\0\1\50\1\0\1\51\1\210\1\0\13\37"+
    "\1\0\1\37\7\0\1\211\34\0\1\212\31\0\2\33"+
    "\1\14\1\34\1\14\2\0\1\213\1\0\1\51\1\17"+
    "\1\27\13\33\1\0\1\33\4\0\2\37\1\0\1\40"+
    "\10\0\7\37\1\214\3\37\1\0\1\37\7\0\1\215"+
    "\31\0\5\64\3\0\1\64\3\0\1\216\14\64\4\0"+
    "\2\37\1\21\1\40\1\21\2\0\1\50\1\0\1\51"+
    "\1\23\1\0\2\37\1\217\10\37\1\0\1\37\10\0"+
    "\1\220\30\0\5\64\2\0\1\50\1\64\3\0\11\64"+
    "\1\221\3\64\4\0\2\37\1\21\1\40\1\21\2\0"+
    "\1\50\1\0\1\51\1\23\1\0\10\37\1\222\2\37"+
    "\1\0\1\37\7\0\1\223\31\0\5\64\2\0\1\50"+
    "\1\64\3\0\4\64\1\224\10\64\4\0\2\37\1\21"+
    "\1\40\1\21\2\0\1\213\1\0\1\51\1\23\1\0"+
    "\13\37\1\0\1\37\7\0\1\225\31\0\5\64\2\0"+
    "\1\50\1\64\3\0\7\64\1\226\5\64\4\0\5\64"+
    "\2\0\1\50\1\64\3\0\12\64\1\227\2\64\4\0"+
    "\5\64\2\0\1\50\1\64\3\0\13\64\1\230\1\64"+
    "\4\0\5\64\2\0\1\50\1\64\3\0\14\64\1\231"+
    "\4\0\5\64\2\0\1\50\1\64\3\0\15\64\1\232"+
    "\3\0\5\233\3\0\1\233\3\0\15\233\3\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[4292];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\7\1\13\0\1\11\5\0\2\1\2\0"+
    "\2\1\21\0\1\1\1\0\1\1\5\0\1\1\1\0"+
    "\2\1\7\0\1\1\10\0\2\1\6\0\1\1\2\0"+
    "\1\1\4\0\1\1\1\0\2\1\4\0\3\1\1\0"+
    "\1\1\2\0\1\1\1\0\1\1\6\0\1\1\4\0"+
    "\3\1\1\0\1\1\2\0\2\1\3\0\1\1\2\0"+
    "\1\11\1\0\1\1\1\0\2\1\1\0\2\1\1\0"+
    "\1\1\1\11\4\1\1\0\1\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[155];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;

  /* user code: */
	public String lexeme;


  /**
   * Creates a new scanner
   * There is also a java.io.InputStream version of this constructor.
   *
   * @param   in  the java.io.Reader to read input from.
   */
  NewLexer(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  NewLexer(java.io.InputStream in) {
    this(new java.io.InputStreamReader
             (in, java.nio.charset.Charset.forName("UTF-8")));
  }

  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x10000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 106) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzCurrentPos*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
    }

    /* finally: fill the buffer with new input */
    int numRead = zzReader.read(zzBuffer, zzEndRead,
                                            zzBuffer.length-zzEndRead);

    if (numRead > 0) {
      zzEndRead+= numRead;
      return false;
    }
    // unlikely but not impossible: read 0 characters, but not at end of stream    
    if (numRead == 0) {
      int c = zzReader.read();
      if (c == -1) {
        return true;
      } else {
        zzBuffer[zzEndRead++] = (char) c;
        return false;
      }     
    }

    // numRead < 0
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * Internal scan buffer is resized down to its initial length, if it has grown.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
    if (zzBuffer.length > ZZ_BUFFERSIZE)
      zzBuffer = new char[ZZ_BUFFERSIZE];
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public Token yylex() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL)
            zzInput = zzBufferL[zzCurrentPosL++];
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = zzBufferL[zzCurrentPosL++];
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 1: 
          { lexeme =yytext();return ERROR;
          }
        case 9: break;
        case 2: 
          { /*Ignore*/
          }
        case 10: break;
        case 3: 
          { lexeme =yytext(); return url;
          }
        case 11: break;
        case 4: 
          { lexeme =yytext(); return nombre;
          }
        case 12: break;
        case 5: 
          { lexeme =yytext(); return correo;
          }
        case 13: break;
        case 6: 
          { lexeme =yytext(); return telLocal;
          }
        case 14: break;
        case 7: 
          { lexeme =yytext(); return telCel;
          }
        case 15: break;
        case 8: 
          { lexeme =yytext(); return youtube;
          }
        case 16: break;
        default: 
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            return null;
          } 
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
