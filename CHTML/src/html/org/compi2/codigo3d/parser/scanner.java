/* The following code was generated by JFlex 1.6.1 */

package html.org.compi2.codigo3d.parser;

import java_cup.runtime.Symbol;

//Scanner para generar C3D

/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.6.1
 * from the specification file <tt>src/html/org/compi2/codigo3d/parser/lexico.flex</tt>
 */
public class scanner implements java_cup.runtime.Scanner {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;
  public static final int EXPRESION = 2;
  public static final int CUALQUIERA = 4;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0,  0,  1,  1,  2, 2
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\31\1\32\1\51\1\31\1\31\22\0\1\31\1\0\1\33"+
    "\5\0\1\5\1\6\3\0\1\13\1\0\1\2\12\11\1\0\1\7"+
    "\1\1\1\4\1\3\2\0\1\26\1\40\1\27\1\42\1\22\1\14"+
    "\1\50\1\34\1\16\1\30\1\10\1\36\1\35\1\20\1\24\1\47"+
    "\1\10\1\46\1\45\1\21\1\43\2\10\1\23\1\10\1\41\4\0"+
    "\1\25\1\0\1\26\1\40\1\27\1\42\1\22\1\15\1\50\1\34"+
    "\1\17\1\30\1\10\1\36\1\35\1\12\1\24\1\47\1\10\1\46"+
    "\1\45\1\21\1\43\2\10\1\23\1\10\1\41\12\0\1\51\252\0"+
    "\2\37\115\0\1\44\u1ea8\0\1\51\1\51\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\udfe6\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\3\0\2\1\1\2\1\3\1\4\1\5\1\6\1\7"+
    "\1\10\1\11\1\12\1\13\1\14\1\15\1\0\6\16"+
    "\1\0\1\16\1\0\2\16\2\0\1\16\1\0\3\16"+
    "\1\0\6\16\1\0\1\16\1\0\2\16\3\0\1\16"+
    "\1\0\3\16\1\0\2\16\1\0\1\16\2\17\2\16"+
    "\1\0\1\16\1\0\2\16\5\0\3\16\1\0\2\16"+
    "\2\20\2\16\1\0\1\16\1\0\2\16\3\0\5\21"+
    "\1\0\2\21\5\0\2\16\1\22\1\0\2\16\1\23"+
    "\1\16\1\0\1\24\1\0\1\16\1\25\1\0\1\26"+
    "\2\21\1\0\5\21\1\0\2\21\7\0\1\27\1\30"+
    "\1\16\1\30\2\16\1\31\1\27\2\0\2\21\1\0"+
    "\1\21\1\0\1\21\2\32\2\21\1\0\2\21\5\0"+
    "\1\33\2\16\2\0\2\21\1\0\1\21\2\34\2\21"+
    "\1\0\2\21\5\0\2\16\3\0\2\21\1\0\1\21"+
    "\1\35\1\21\1\0\1\36\1\37\1\0\1\35\1\0"+
    "\1\36\1\37\2\16\1\40\2\0\1\41\2\42\1\21"+
    "\1\43\1\41\1\0\1\43\1\44\1\45\2\0\1\21"+
    "\3\0\1\21\1\0\1\46\1\0\1\21\3\0\2\47"+
    "\1\50\3\0\1\51";

  private static int [] zzUnpackAction() {
    int [] result = new int[243];
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
    "\0\0\0\52\0\124\0\124\0\176\0\250\0\124\0\124"+
    "\0\124\0\124\0\322\0\374\0\124\0\124\0\124\0\124"+
    "\0\124\0\u0126\0\u0150\0\u017a\0\u01a4\0\u01ce\0\u01f8\0\u0222"+
    "\0\u024c\0\u0276\0\u02a0\0\u02ca\0\u02f4\0\u031e\0\u0348\0\u0372"+
    "\0\u039c\0\u03c6\0\u03f0\0\u041a\0\u0444\0\u046e\0\u0498\0\u04c2"+
    "\0\u04ec\0\u0516\0\u0540\0\u056a\0\u0594\0\u05be\0\u05e8\0\u0612"+
    "\0\u063c\0\u0666\0\u0690\0\u06ba\0\u06e4\0\u070e\0\u0738\0\u0762"+
    "\0\u078c\0\u07b6\0\u07e0\0\u080a\0\u0834\0\124\0\u0150\0\u085e"+
    "\0\u0888\0\u08b2\0\u08dc\0\u0906\0\u0930\0\u095a\0\u0984\0\u09ae"+
    "\0\u09d8\0\u0a02\0\u0a2c\0\u0a56\0\u0a80\0\u0aaa\0\u0ad4\0\u0afe"+
    "\0\u0b28\0\124\0\u0150\0\u0b52\0\u0b7c\0\u0ba6\0\u0bd0\0\u0bfa"+
    "\0\u0c24\0\u0c4e\0\u0c78\0\u0ca2\0\u0ccc\0\u0cf6\0\u0d20\0\u0d4a"+
    "\0\u0d74\0\u0d9e\0\u0dc8\0\u0df2\0\u0e1c\0\u0e46\0\u0e70\0\u0e9a"+
    "\0\u0ec4\0\u0eee\0\u0f18\0\u0f42\0\u0f6c\0\u0f96\0\u0fc0\0\u0fea"+
    "\0\u0150\0\u1014\0\u103e\0\u0150\0\u1068\0\u1092\0\u0150\0\u10bc"+
    "\0\124\0\u10e6\0\u1110\0\u113a\0\u1164\0\u118e\0\u11b8\0\u11e2"+
    "\0\u120c\0\u1236\0\u1260\0\u128a\0\u12b4\0\u12de\0\u1308\0\u1332"+
    "\0\u135c\0\u1386\0\u13b0\0\u0150\0\u0150\0\u13da\0\124\0\u1404"+
    "\0\u142e\0\u0150\0\124\0\u1458\0\u1482\0\u14ac\0\u14d6\0\u1500"+
    "\0\u152a\0\u1554\0\u157e\0\124\0\u0cf6\0\u15a8\0\u15d2\0\u15fc"+
    "\0\u1626\0\u1650\0\u167a\0\u16a4\0\u16ce\0\u16f8\0\u1722\0\u0150"+
    "\0\u174c\0\u1776\0\u17a0\0\u17ca\0\u17f4\0\u181e\0\u1848\0\u1872"+
    "\0\124\0\u0cf6\0\u189c\0\u18c6\0\u18f0\0\u191a\0\u1944\0\u196e"+
    "\0\u1998\0\u19c2\0\u19ec\0\u1a16\0\u1a40\0\u1a6a\0\u1a94\0\u1abe"+
    "\0\u1ae8\0\u1b12\0\u1b3c\0\u1b66\0\u1b90\0\u0cf6\0\u1bba\0\u1be4"+
    "\0\u0cf6\0\u0cf6\0\u1c0e\0\124\0\u1c38\0\124\0\124\0\u1c62"+
    "\0\u1c8c\0\124\0\u1cb6\0\u1ce0\0\u0cf6\0\u0cf6\0\124\0\u1d0a"+
    "\0\u0cf6\0\124\0\u1d34\0\124\0\u0150\0\u0150\0\u1d5e\0\u1d88"+
    "\0\u1db2\0\u1ddc\0\u1e06\0\u1e30\0\u1e5a\0\u1e84\0\u1eae\0\u1ed8"+
    "\0\u1f02\0\u1f2c\0\u1f56\0\u1f80\0\u0cf6\0\124\0\124\0\u1faa"+
    "\0\u1fd4\0\u1ffe\0\124";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[243];
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
    "\1\4\1\5\1\4\1\6\1\7\1\10\1\11\1\12"+
    "\1\13\1\14\1\13\1\4\11\13\1\4\3\13\1\15"+
    "\1\16\1\17\3\13\1\4\4\13\1\4\4\13\1\0"+
    "\33\20\1\21\16\20\54\0\1\22\5\0\1\23\1\0"+
    "\1\23\1\0\2\24\2\25\1\23\1\26\1\27\2\23"+
    "\1\0\1\23\1\30\1\23\3\0\3\23\1\31\1\32"+
    "\3\23\1\33\1\34\1\23\1\35\1\23\1\0\1\36"+
    "\1\0\10\36\1\0\2\36\1\0\1\36\1\0\32\36"+
    "\10\0\3\13\1\0\15\13\3\0\3\13\1\0\4\13"+
    "\1\0\4\13\12\0\1\14\42\0\1\37\57\0\3\23"+
    "\1\0\15\23\3\0\3\23\1\0\4\23\1\0\4\23"+
    "\11\0\3\23\1\0\2\23\2\40\11\23\3\0\3\23"+
    "\1\41\4\23\1\0\4\23\11\0\3\23\1\0\15\23"+
    "\3\0\1\23\1\42\1\23\1\0\4\23\1\0\4\23"+
    "\11\0\3\23\1\0\2\23\2\43\2\23\1\44\6\23"+
    "\3\0\3\23\1\45\4\23\1\0\4\23\11\0\2\23"+
    "\1\46\1\0\4\23\1\46\10\23\3\0\3\23\1\0"+
    "\4\23\1\0\4\23\11\0\3\23\1\0\12\23\1\47"+
    "\1\50\1\51\3\0\1\52\2\23\1\0\3\23\1\53"+
    "\1\0\4\23\36\0\1\54\24\0\3\23\1\0\10\23"+
    "\1\55\4\23\3\0\3\23\1\0\4\23\1\0\4\23"+
    "\27\0\1\56\33\0\3\23\1\0\12\23\1\57\2\23"+
    "\3\0\3\23\1\0\4\23\1\0\4\23\11\0\3\23"+
    "\1\0\12\23\1\60\2\23\3\0\3\23\1\0\4\23"+
    "\1\0\4\23\1\0\13\61\1\0\36\61\2\62\1\63"+
    "\47\62\10\0\2\23\1\64\1\0\4\23\1\64\10\23"+
    "\3\0\3\23\1\0\4\23\1\0\4\23\13\0\1\65"+
    "\5\0\1\65\41\0\3\23\1\0\12\23\1\66\2\23"+
    "\3\0\3\23\1\0\4\23\1\0\4\23\11\0\3\23"+
    "\1\0\5\23\1\67\7\23\3\0\3\23\1\0\4\23"+
    "\1\0\4\23\11\0\3\23\1\0\7\23\1\70\5\23"+
    "\3\0\3\23\1\0\4\23\1\0\4\23\22\0\1\71"+
    "\40\0\3\23\1\0\13\23\1\72\1\23\3\0\3\23"+
    "\1\0\4\23\1\0\4\23\11\0\3\23\1\0\14\23"+
    "\1\73\3\0\3\23\1\0\4\23\1\0\4\23\11\0"+
    "\3\23\1\0\15\23\3\0\3\23\1\0\4\23\1\74"+
    "\1\75\3\23\11\0\3\23\1\0\15\23\3\0\3\23"+
    "\1\0\4\23\1\76\1\77\3\23\11\0\3\23\1\0"+
    "\5\23\1\100\7\23\3\0\3\23\1\0\4\23\1\0"+
    "\4\23\11\0\3\23\1\0\6\23\1\101\6\23\3\0"+
    "\3\23\1\0\4\23\1\0\4\23\27\0\1\102\33\0"+
    "\3\23\1\0\5\23\1\103\7\23\3\0\3\23\1\0"+
    "\4\23\1\0\4\23\37\0\1\104\23\0\3\23\1\0"+
    "\15\23\3\0\2\23\1\105\1\0\4\23\1\0\4\23"+
    "\11\0\2\23\1\106\1\0\4\23\1\106\10\23\3\0"+
    "\3\23\1\0\4\23\1\0\4\23\1\0\1\61\1\107"+
    "\50\61\2\62\1\110\47\62\2\0\1\111\57\0\3\23"+
    "\1\112\15\23\3\0\3\23\1\0\4\23\1\0\4\23"+
    "\14\0\1\113\46\0\3\23\1\0\15\23\3\0\3\23"+
    "\1\0\4\23\1\0\3\23\1\114\11\0\3\23\1\0"+
    "\15\23\3\0\3\23\1\0\3\23\1\115\1\0\4\23"+
    "\11\0\3\23\1\0\5\23\1\116\7\23\3\0\3\23"+
    "\1\0\4\23\1\0\4\23\44\0\1\117\16\0\3\23"+
    "\1\0\12\23\1\120\2\23\3\0\3\23\1\0\4\23"+
    "\1\0\4\23\11\0\3\23\1\0\12\23\1\121\2\23"+
    "\3\0\3\23\1\0\4\23\1\0\4\23\45\0\2\122"+
    "\14\0\3\23\1\0\15\23\3\0\3\23\1\0\4\23"+
    "\1\122\1\123\3\23\11\0\3\23\1\0\15\23\3\0"+
    "\1\23\1\124\1\23\1\0\4\23\1\0\4\23\11\0"+
    "\3\23\1\0\15\23\3\0\3\23\1\0\4\23\1\0"+
    "\1\23\1\125\2\23\51\0\1\126\11\0\3\23\1\0"+
    "\10\23\1\127\4\23\3\0\3\23\1\0\4\23\1\0"+
    "\4\23\22\0\1\130\40\0\3\23\1\0\5\23\1\131"+
    "\7\23\3\0\3\23\1\0\4\23\1\0\4\23\11\0"+
    "\3\23\1\0\6\23\1\132\6\23\3\0\3\23\1\0"+
    "\4\23\1\0\4\23\15\0\2\133\34\0\2\62\1\134"+
    "\47\62\2\0\1\135\57\0\1\136\1\0\1\136\1\0"+
    "\2\136\2\137\1\136\1\140\1\141\2\136\1\0\1\136"+
    "\1\142\1\136\3\0\3\136\1\143\1\144\3\136\1\0"+
    "\2\136\1\145\1\136\17\0\2\143\1\0\1\146\1\147"+
    "\4\0\1\150\7\0\1\143\1\151\6\0\1\152\12\0"+
    "\3\23\1\0\6\23\1\153\6\23\3\0\3\23\1\0"+
    "\4\23\1\0\4\23\11\0\3\23\1\0\15\23\3\0"+
    "\2\23\1\154\1\0\4\23\1\0\4\23\11\0\3\23"+
    "\1\0\10\23\1\155\4\23\3\0\3\23\1\0\4\23"+
    "\1\0\4\23\37\0\1\156\23\0\3\23\1\0\15\23"+
    "\3\0\3\23\1\0\1\157\3\23\1\0\4\23\11\0"+
    "\3\23\1\0\11\23\1\160\3\23\3\0\3\23\1\0"+
    "\4\23\1\0\4\23\11\0\3\23\1\0\15\23\3\0"+
    "\2\23\1\161\1\0\4\23\1\0\4\23\11\0\3\23"+
    "\1\0\15\23\3\0\3\23\1\0\4\23\1\0\2\23"+
    "\1\162\1\23\23\0\1\163\37\0\2\23\1\164\1\0"+
    "\4\23\1\164\10\23\3\0\3\23\1\0\4\23\1\0"+
    "\4\23\25\0\1\165\35\0\3\23\1\0\10\23\1\166"+
    "\4\23\3\0\3\23\1\0\4\23\1\0\4\23\11\0"+
    "\3\23\1\0\15\23\3\0\2\23\1\167\1\0\4\23"+
    "\1\0\4\23\17\0\2\170\32\0\2\62\1\134\1\171"+
    "\46\62\2\0\1\135\1\171\56\0\3\136\1\0\15\136"+
    "\3\0\3\136\1\0\4\136\1\0\4\136\11\0\3\136"+
    "\1\0\15\136\3\0\1\136\1\172\1\136\1\0\4\136"+
    "\1\0\4\136\11\0\3\136\1\0\2\136\2\173\11\136"+
    "\3\0\3\136\1\174\4\136\1\0\4\136\11\0\2\136"+
    "\1\175\1\0\4\136\1\175\10\136\3\0\3\136\1\0"+
    "\4\136\1\0\4\136\11\0\3\136\1\0\13\136\1\176"+
    "\1\177\3\0\1\200\2\136\1\0\3\136\1\201\1\0"+
    "\4\136\36\0\1\202\24\0\3\136\1\0\10\136\1\203"+
    "\4\136\3\0\3\136\1\0\4\136\1\0\4\136\11\0"+
    "\3\136\1\0\12\136\1\204\2\136\3\0\3\136\1\0"+
    "\4\136\1\0\4\136\17\0\2\174\17\0\1\174\24\0"+
    "\1\205\5\0\1\205\60\0\1\206\1\207\3\0\1\210"+
    "\6\0\1\211\32\0\1\212\53\0\1\213\33\0\2\23"+
    "\1\214\1\0\4\23\1\214\10\23\3\0\3\23\1\0"+
    "\4\23\1\0\4\23\11\0\3\23\1\0\10\23\1\215"+
    "\4\23\3\0\3\23\1\0\4\23\1\0\4\23\11\0"+
    "\3\23\1\0\11\23\1\216\3\23\3\0\3\23\1\0"+
    "\4\23\1\0\4\23\25\0\1\217\35\0\3\23\1\0"+
    "\6\23\1\220\6\23\3\0\3\23\1\0\4\23\1\0"+
    "\4\23\11\0\3\23\1\0\5\23\1\221\7\23\3\0"+
    "\3\23\1\0\4\23\1\0\4\23\11\0\3\23\1\0"+
    "\10\23\1\222\4\23\3\0\3\23\1\0\4\23\1\0"+
    "\4\23\13\0\1\223\5\0\1\223\44\0\1\224\46\0"+
    "\3\23\1\224\15\23\3\0\3\23\1\0\4\23\1\0"+
    "\4\23\13\0\1\225\5\0\1\225\41\0\3\136\1\0"+
    "\12\136\1\226\2\136\3\0\3\136\1\0\4\136\1\0"+
    "\4\136\11\0\3\136\1\0\5\136\1\227\7\136\3\0"+
    "\3\136\1\0\4\136\1\0\4\136\22\0\1\230\40\0"+
    "\3\136\1\0\13\136\1\231\1\136\3\0\3\136\1\0"+
    "\4\136\1\0\4\136\11\0\3\136\1\0\15\136\3\0"+
    "\3\136\1\0\4\136\1\232\1\233\3\136\11\0\3\136"+
    "\1\0\15\136\3\0\3\136\1\0\4\136\1\234\1\235"+
    "\3\136\11\0\3\136\1\0\5\136\1\236\7\136\3\0"+
    "\3\136\1\0\4\136\1\0\4\136\11\0\3\136\1\0"+
    "\6\136\1\237\6\136\3\0\3\136\1\0\4\136\1\0"+
    "\4\136\27\0\1\240\33\0\3\136\1\0\5\136\1\241"+
    "\7\136\3\0\3\136\1\0\4\136\1\0\4\136\11\0"+
    "\2\136\1\242\1\0\4\136\1\242\10\136\3\0\3\136"+
    "\1\0\4\136\1\0\4\136\30\0\1\243\66\0\2\232"+
    "\50\0\2\234\25\0\1\244\52\0\1\245\50\0\1\246"+
    "\42\0\1\247\5\0\1\247\41\0\3\23\1\0\12\23"+
    "\1\250\2\23\3\0\3\23\1\0\4\23\1\0\4\23"+
    "\11\0\3\23\1\0\15\23\3\0\3\23\1\0\1\23"+
    "\1\251\2\23\1\0\4\23\11\0\3\23\1\0\6\23"+
    "\1\252\6\23\3\0\3\23\1\0\4\23\1\0\4\23"+
    "\15\0\2\253\47\0\1\254\46\0\3\136\1\0\15\136"+
    "\3\0\3\136\1\0\4\136\1\0\3\136\1\255\11\0"+
    "\3\136\1\0\15\136\3\0\3\136\1\0\3\136\1\256"+
    "\1\0\4\136\44\0\1\257\16\0\3\136\1\0\12\136"+
    "\1\260\2\136\3\0\3\136\1\0\4\136\1\0\4\136"+
    "\45\0\2\261\14\0\3\136\1\0\15\136\3\0\3\136"+
    "\1\0\4\136\1\261\1\262\3\136\11\0\3\136\1\0"+
    "\15\136\3\0\1\136\1\263\1\136\1\0\4\136\1\0"+
    "\4\136\11\0\3\136\1\0\15\136\3\0\3\136\1\0"+
    "\4\136\1\0\1\136\1\264\2\136\51\0\1\265\11\0"+
    "\3\136\1\0\10\136\1\266\4\136\3\0\3\136\1\0"+
    "\4\136\1\0\4\136\11\0\3\136\1\0\6\136\1\267"+
    "\6\136\3\0\3\136\1\0\4\136\1\0\4\136\27\0"+
    "\1\270\60\0\1\271\62\0\1\272\27\0\1\273\47\0"+
    "\1\274\37\0\3\23\1\0\12\23\1\275\2\23\3\0"+
    "\3\23\1\0\4\23\1\0\4\23\11\0\3\23\1\0"+
    "\7\23\1\276\5\23\3\0\3\23\1\0\4\23\1\0"+
    "\4\23\17\0\2\277\17\0\1\277\33\0\1\300\5\0"+
    "\1\301\32\0\3\136\1\0\6\136\1\302\6\136\3\0"+
    "\3\136\1\0\4\136\1\0\4\136\11\0\3\136\1\0"+
    "\15\136\3\0\2\136\1\303\1\0\4\136\1\0\4\136"+
    "\37\0\1\304\23\0\3\136\1\0\15\136\3\0\3\136"+
    "\1\0\1\305\3\136\1\0\4\136\11\0\3\136\1\0"+
    "\15\136\3\0\2\136\1\306\1\0\4\136\1\0\4\136"+
    "\11\0\3\136\1\0\15\136\3\0\3\136\1\0\4\136"+
    "\1\0\2\136\1\307\1\136\23\0\1\310\37\0\2\136"+
    "\1\311\1\0\4\136\1\311\10\136\3\0\3\136\1\0"+
    "\4\136\1\0\4\136\11\0\3\136\1\0\15\136\3\0"+
    "\2\136\1\312\1\0\4\136\1\0\4\136\41\0\1\313"+
    "\47\0\1\314\62\0\1\315\14\0\1\316\5\0\1\316"+
    "\67\0\1\317\23\0\3\23\1\0\15\23\3\0\3\23"+
    "\1\0\2\23\1\320\1\23\1\0\4\23\11\0\3\23"+
    "\1\0\5\23\1\321\7\23\3\0\3\23\1\0\4\23"+
    "\1\0\4\23\13\0\1\322\5\0\1\322\53\0\1\323"+
    "\55\0\1\324\33\0\2\136\1\325\1\0\4\136\1\325"+
    "\10\136\3\0\3\136\1\0\4\136\1\0\4\136\11\0"+
    "\3\136\1\0\10\136\1\326\4\136\3\0\3\136\1\0"+
    "\4\136\1\0\4\136\25\0\1\327\35\0\3\136\1\0"+
    "\6\136\1\330\6\136\3\0\3\136\1\0\4\136\1\0"+
    "\4\136\11\0\3\136\1\0\10\136\1\331\4\136\3\0"+
    "\3\136\1\0\4\136\1\0\4\136\13\0\1\332\5\0"+
    "\1\332\53\0\1\333\53\0\1\334\35\0\3\23\1\0"+
    "\10\23\1\335\4\23\3\0\3\23\1\0\4\23\1\0"+
    "\4\23\11\0\3\23\1\0\10\23\1\336\4\23\3\0"+
    "\3\23\1\0\4\23\1\0\4\23\24\0\1\337\56\0"+
    "\1\340\31\0\3\136\1\0\15\136\3\0\3\136\1\0"+
    "\1\136\1\341\2\136\1\0\4\136\42\0\1\342\31\0"+
    "\1\343\56\0\1\344\33\0\3\136\1\0\12\136\1\345"+
    "\2\136\3\0\3\136\1\0\4\136\1\0\4\136\27\0"+
    "\1\346\47\0\1\347\52\0\1\350\34\0\3\136\1\0"+
    "\15\136\3\0\3\136\1\0\2\136\1\351\1\136\1\0"+
    "\4\136\43\0\1\352\34\0\1\353\45\0\1\354\40\0"+
    "\3\136\1\0\10\136\1\355\4\136\3\0\3\136\1\0"+
    "\4\136\1\0\4\136\25\0\1\356\53\0\1\357\45\0"+
    "\1\360\52\0\1\361\47\0\1\362\54\0\1\363\25\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[8232];
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
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\2\0\1\10\1\11\2\1\4\11\2\1\5\11\1\0"+
    "\6\1\1\0\1\1\1\0\2\1\2\0\1\1\1\0"+
    "\3\1\1\0\6\1\1\0\1\1\1\0\2\1\3\0"+
    "\1\1\1\0\3\1\1\0\2\1\1\0\1\1\1\11"+
    "\3\1\1\0\1\1\1\0\2\1\5\0\3\1\1\0"+
    "\2\1\1\11\3\1\1\0\1\1\1\0\2\1\3\0"+
    "\5\1\1\0\2\1\5\0\3\1\1\0\4\1\1\0"+
    "\1\1\1\0\2\1\1\0\1\11\2\1\1\0\5\1"+
    "\1\0\2\1\7\0\3\1\1\11\3\1\1\11\2\0"+
    "\2\1\1\0\1\1\1\0\1\1\1\11\3\1\1\0"+
    "\2\1\5\0\3\1\2\0\2\1\1\0\1\1\1\11"+
    "\3\1\1\0\2\1\5\0\2\1\3\0\2\1\1\0"+
    "\3\1\1\0\2\1\1\0\1\11\1\0\2\11\2\1"+
    "\1\11\2\0\2\1\1\11\2\1\1\11\1\0\1\11"+
    "\2\1\2\0\1\1\3\0\1\1\1\0\1\1\1\0"+
    "\1\1\3\0\1\1\2\11\3\0\1\11";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[243];
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
  
  /** 
   * The number of occupied positions in zzBuffer beyond zzEndRead.
   * When a lead/high surrogate has been read from the input stream
   * into the final zzBuffer position, this will have a value of 1;
   * otherwise, it will have a value of 0.
   */
  private int zzFinalHighSurrogate = 0;

  /* user code: */
    //Código de usuario
    

//VARIALES Y METODOS DEL SCANER
String expresion="";


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public scanner(java.io.Reader in) {
    this.zzReader = in;
  }


  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x110000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 206) {
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
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
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
    if (zzCurrentPos >= zzBuffer.length - zzFinalHighSurrogate) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzBuffer.length*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
    }

    /* fill the buffer with new input */
    int requested = zzBuffer.length - zzEndRead;
    int numRead = zzReader.read(zzBuffer, zzEndRead, requested);

    /* not supposed to occur according to specification of java.io.Reader */
    if (numRead == 0) {
      throw new java.io.IOException("Reader returned 0 characters. See JFlex examples for workaround.");
    }
    if (numRead > 0) {
      zzEndRead += numRead;
      /* If numRead == requested, we might have requested to few chars to
         encode a full Unicode character. We assume that a Reader would
         otherwise never return half characters. */
      if (numRead == requested) {
        if (Character.isHighSurrogate(zzBuffer[zzEndRead - 1])) {
          --zzEndRead;
          zzFinalHighSurrogate = 1;
        }
      }
      /* potentially more input available */
      return false;
    }

    /* numRead < 0 ==> end of stream */
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
    zzFinalHighSurrogate = 0;
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
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() throws java.io.IOException {
    if (!zzEOFDone) {
      zzEOFDone = true;
      yyclose();
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public java_cup.runtime.Symbol next_token() throws java.io.IOException {
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

      yychar+= zzMarkedPosL-zzStartRead;

      boolean zzR = false;
      int zzCh;
      int zzCharCount;
      for (zzCurrentPosL = zzStartRead  ;
           zzCurrentPosL < zzMarkedPosL ;
           zzCurrentPosL += zzCharCount ) {
        zzCh = Character.codePointAt(zzBufferL, zzCurrentPosL, zzMarkedPosL);
        zzCharCount = Character.charCount(zzCh);
        switch (zzCh) {
        case '\u000B':
        case '\u000C':
        case '\u0085':
        case '\u2028':
        case '\u2029':
          yyline++;
          yycolumn = 0;
          zzR = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          zzR = false;
          yycolumn += zzCharCount;
        }
      }

      if (zzR) {
        // peek one character ahead if it is \n (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof) 
            zzPeek = false;
          else 
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
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
    
          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
            zzCurrentPosL += Character.charCount(zzInput);
          }
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
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
              zzCurrentPosL += Character.charCount(zzInput);
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

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
            zzDoEOF();
          { return new java_cup.runtime.Symbol(sym.EOF); }
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1: 
            { System.out.println("    CUALQUIERA");return new Symbol(sym.CUALQUIERA     , yyline, yycolumn, yytext());
            }
          case 42: break;
          case 2: 
            { System.out.println("    MAYORQUE");return new Symbol(sym.MAYORQUE, yyline, yycolumn, null);
            }
          case 43: break;
          case 3: 
            { return new Symbol(sym.IGUAL    , yyline, yycolumn, null);
            }
          case 44: break;
          case 4: 
            { return new Symbol(sym.PAREA    , yyline, yycolumn, null);
            }
          case 45: break;
          case 5: 
            { return new Symbol(sym.PAREC    , yyline, yycolumn, null);
            }
          case 46: break;
          case 6: 
            { return new Symbol(sym.PUNTOCOMA    , yyline, yycolumn, null);
            }
          case 47: break;
          case 7: 
            { System.out.println("    ID");return new Symbol(sym.ID     , yyline, yycolumn, yytext());
            }
          case 48: break;
          case 8: 
            { System.out.println("    ENTERO");return new Symbol(sym.ENTERO    , yyline, yycolumn, yytext());
            }
          case 49: break;
          case 9: 
            { /*Espacios en blanco, ignorados*/
            }
          case 50: break;
          case 10: 
            { /*Saltos de linea, ignorados*/
            }
          case 51: break;
          case 11: 
            { yybegin (EXPRESION);
            }
          case 52: break;
          case 12: 
            { expresion +=yytext();
            }
          case 53: break;
          case 13: 
            { String temporal=expresion; 
        expresion=""; 
        yybegin(YYINITIAL); 
     System.out.println("    CADENA");
        return new Symbol(sym.CADENA, yyline+1, yyline, temporal);
            }
          case 54: break;
          case 14: 
            { System.out.println("    AID");return new Symbol(sym.AID     , yyline, yycolumn, yytext());
            }
          case 55: break;
          case 15: 
            { System.out.println("    CJS");return new Symbol(sym.CJS     , yyline, yycolumn, yytext());
            }
          case 56: break;
          case 16: 
            { System.out.println("    CCSS");return new Symbol(sym.CCSS     , yyline, yycolumn, yytext());
            }
          case 57: break;
          case 17: 
            { System.out.println("      FIN");return new Symbol(sym.FIN    , yyline, yycolumn, yytext());
            }
          case 58: break;
          case 18: 
            { System.out.println("    texto");return new Symbol(sym.TEXTO     , yyline, yycolumn, yytext());
            }
          case 59: break;
          case 19: 
            { System.out.println("    chtml");return new Symbol(sym.CHTML     , yyline, yycolumn, yytext());
            }
          case 60: break;
          case 20: 
            { System.out.println("    boton");return new Symbol(sym.BOTON     , yyline, yycolumn, yytext());
            }
          case 61: break;
          case 21: 
            { System.out.println("    panel");return new Symbol(sym.PANEL     , yyline, yycolumn, yytext());
            }
          case 62: break;
          case 22: 
            { System.out.println("    COMENTARIO");
            }
          case 63: break;
          case 23: 
            { System.out.println("    Imagen");return new Symbol(sym.IMAGEN     , yyline, yycolumn, yytext());
            }
          case 64: break;
          case 24: 
            { System.out.println("    titulo");return new Symbol(sym.TITULO     , yyline, yycolumn, yytext());
            }
          case 65: break;
          case 25: 
            { System.out.println("    cuerpo");return new Symbol(sym.CUERPO     , yyline, yycolumn, yytext());
            }
          case 66: break;
          case 26: 
            { System.out.println("    FIN-CJS");return new Symbol(sym.FINCJS     , yyline, yycolumn, yytext());
            }
          case 67: break;
          case 27: 
            { System.out.println("    textoA");return new Symbol(sym.TEXTOA     , yyline, yycolumn, yytext());
            }
          case 68: break;
          case 28: 
            { System.out.println("    FIN-CCSS");return new Symbol(sym.FINCCSS     , yyline, yycolumn, yytext());
            }
          case 69: break;
          case 29: 
            { System.out.println("    FINchtml");return new Symbol(sym.FINCHTML     , yyline, yycolumn, yytext());
            }
          case 70: break;
          case 30: 
            { System.out.println("    fin-boton");return new Symbol(sym.FINBOTON     , yyline, yycolumn, yytext());
            }
          case 71: break;
          case 31: 
            { System.out.println("    fin panel");return new Symbol(sym.FINPANEL     , yyline, yycolumn, yytext());
            }
          case 72: break;
          case 32: 
            { System.out.println("    SALTO");return new Symbol(sym.SALTOFIN     , yyline, yycolumn, yytext());
            }
          case 73: break;
          case 33: 
            { System.out.println("    finInagen");return new Symbol(sym.FINIMAGEN     , yyline, yycolumn, yytext());
            }
          case 74: break;
          case 34: 
            { System.out.println("    FINtitulo");return new Symbol(sym.FINTITULO     , yyline, yycolumn, yytext());
            }
          case 75: break;
          case 35: 
            { System.out.println("    FIN-cuerpo");return new Symbol(sym.FINCUERPO     , yyline, yycolumn, yytext());
            }
          case 76: break;
          case 36: 
            { System.out.println("    ENCABEZADO");return new Symbol(sym.ENCABEZADO     , yyline, yycolumn, yytext());
            }
          case 77: break;
          case 37: 
            { System.out.println("    CAJA_TEXTO");return new Symbol(sym.CAJATEXTO     , yyline, yycolumn, yytext());
            }
          case 78: break;
          case 38: 
            { System.out.println("    fintexto");return new Symbol(sym.FINTEXTO     , yyline, yycolumn, yytext());
            }
          case 79: break;
          case 39: 
            { System.out.println("    FINENCABEZADO");return new Symbol(sym.FINENCABEZADO     , yyline, yycolumn, yytext());
            }
          case 80: break;
          case 40: 
            { System.out.println("    fintexto_a");return new Symbol(sym.FINTEXTOA     , yyline, yycolumn, yytext());
            }
          case 81: break;
          case 41: 
            { System.out.println("    FINCAJATEXTO");return new Symbol(sym.FINCAJATEXTO     , yyline, yycolumn, yytext());
            }
          case 82: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }


}
