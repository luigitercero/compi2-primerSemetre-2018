package analizadores;

import java_cup.runtime.Symbol;
import java.util.ArrayList;

//Scanner para generar C3D
%%
%{
    //Código de usuario
    String expresion="";
    ArrayList<String> erroresl = new ArrayList<String>();

%}

%cup
%class scanner
%public
%line
%char
%column
%full
%state EXPRESION
%ignorecase

MODULE = "Module"



NUMERO          =("-")?[0-9]+
NDECIMAL        = {NUMERO}"."{NUMERO}
ID              =([a-zA-Z0-9]|_)+
CARACTER        = "'"[^\n]"'"

SPACE           = [\ \r\t\f\t]
ENTER           = [\ \n]


 
%%


/* PALABRAS RESERVADAS */
<YYINITIAL>"\""        {yybegin (EXPRESION);}
<YYINITIAL>"+"         { return new Symbol(sym.MAS         ,yychar,yyline,yytext());}
<YYINITIAL>"-"         { return new Symbol(sym.MENOS       ,yychar,yyline,yytext());}
<YYINITIAL>"*"         { return new Symbol(sym.POR         ,yychar,yyline,yytext());}  
<YYINITIAL>"/"         { return new Symbol(sym.DIV         ,yychar,yyline,yytext());}
<YYINITIAL>"("         { return new Symbol(sym.PAREA       ,yychar,yyline,yytext());}
<YYINITIAL>")"         { return new Symbol(sym.PAREC        ,yychar,yyline,yytext());}
<YYINITIAL>"["         { return new Symbol(sym.CORA       ,yychar,yyline,yytext());}
<YYINITIAL>"]"         { return new Symbol(sym.CORC        ,yychar,yyline,yytext());}
<YYINITIAL>","         { return new Symbol(sym.COMA        ,yychar,yyline,yytext());}
<YYINITIAL>"."         { return new Symbol(sym.PUNTO       ,yychar,yyline,yytext());}
<YYINITIAL>">"         { return new Symbol(sym.MAYORQUE    ,yychar,yyline,yytext());}
<YYINITIAL>"<"         { return new Symbol(sym.MENORQUE    ,yychar,yyline,yytext());}
<YYINITIAL>">="        { return new Symbol(sym.MAYORIGUAL  ,yychar,yyline,yytext());}
<YYINITIAL>"<="        { return new Symbol(sym.MENORIGUAL  ,yychar,yyline, yytext());}
<YYINITIAL>"="         { return new Symbol(sym.IGUAL  ,yychar,yyline, yytext());}
<YYINITIAL>"<>"        { return new Symbol(sym.NOIGUAL     ,yychar,yyline, yytext());}
<YYINITIAL>"&"      	{ return new Symbol(sym.AMPERSAND   ,yychar,yyline, yytext()); }
<YYINITIAL>"True"      { return new Symbol(sym.TRUE   ,yychar,yyline, yytext()); }
<YYINITIAL>"False"     { return new Symbol(sym.FALSE       ,yychar,yyline, yytext()); }
<YYINITIAL>{MODULE}    { return new Symbol(sym.MODULE   ,yychar,yyline, yytext()); }
<YYINITIAL>"End"      	{ return new Symbol(sym.END   ,yychar,yyline, yytext()); }
<YYINITIAL>"Public"    { return new Symbol(sym.PUBLIC   ,yychar,yyline, yytext()); }
<YYINITIAL>"Private"   { return new Symbol(sym.PRIVATE   ,yychar,yyline, yytext()); }
<YYINITIAL>"Dim"      	{ return new Symbol(sym.DIM   ,yychar,yyline, yytext()); }
<YYINITIAL>"Static"    { return new Symbol(sym.STATIC   ,yychar,yyline, yytext()); }
<YYINITIAL>"As"      	{ return new Symbol(sym.AS   ,yychar,yyline, yytext()); }
<YYINITIAL>"Integer"   { return new Symbol(sym.INTEGER   ,yychar,yyline, yytext()); }
<YYINITIAL>"Boolean"   { return new Symbol(sym.BOOLEAN   ,yychar,yyline, yytext()); }
<YYINITIAL>"Char"      { return new Symbol(sym.CHAR   ,yychar,yyline, yytext()); }
<YYINITIAL>"Double"    { return new Symbol(sym.DOUBLE   ,yychar,yyline, yytext()); }
<YYINITIAL>"Long"      { return new Symbol(sym.LONG   ,yychar,yyline, yytext()); }
<YYINITIAL>"String"    { return new Symbol(sym.STRING   ,yychar,yyline, yytext()); }
<YYINITIAL>"Console"   { return new Symbol(sym.CONSOLE   ,yychar,yyline, yytext()); }
<YYINITIAL>"ByVal"     { return new Symbol(sym.BYVAL   ,yychar,yyline, yytext()); }
<YYINITIAL>"Sub"      	{ return new Symbol(sym.SUB   ,yychar,yyline, yytext()); }
<YYINITIAL>"Main"      { return new Symbol(sym.MAIN   ,yychar,yyline, yytext()); }
<YYINITIAL>"Function"  { return new Symbol(sym.FUNCTION   ,yychar,yyline, yytext()); }
<YYINITIAL>"Return"    { return new Symbol(sym.RETURN   ,yychar,yyline, yytext()); }
<YYINITIAL>"If"      	{ return new Symbol(sym.IF   ,yychar,yyline, yytext()); }
<YYINITIAL>"Else"      { return new Symbol(sym.ELSE   ,yychar,yyline, yytext()); }
<YYINITIAL>"Then"      { return new Symbol(sym.THEN   ,yychar,yyline, yytext()); }
<YYINITIAL>"Elseif"    { return new Symbol(sym.ELSEIF   ,yychar,yyline, yytext()); }
<YYINITIAL>"While"     { return new Symbol(sym.WHILE   ,yychar,yyline, yytext()); }
<YYINITIAL>"For"      	{ return new Symbol(sym.FOR   ,yychar,yyline, yytext()); }
<YYINITIAL>"To"      	{ return new Symbol(sym.TO   ,yychar,yyline, yytext()); }
<YYINITIAL>"Step"      { return new Symbol(sym.STEP   ,yychar,yyline, yytext()); }
<YYINITIAL>"Next"      { return new Symbol(sym.NEXT   ,yychar,yyline, yytext()); }
<YYINITIAL>"Do"      	{ return new Symbol(sym.DO   ,yychar,yyline, yytext()); }
<YYINITIAL>"Loop"      { return new Symbol(sym.LOOP   ,yychar,yyline, yytext()); }
<YYINITIAL>"Until"     { return new Symbol(sym.UNTIL   ,yychar,yyline, yytext()); }
<YYINITIAL>"Select"    { return new Symbol(sym.SELECT   ,yychar,yyline, yytext()); }
<YYINITIAL>"Case"      { return new Symbol(sym.CASE   ,yychar,yyline, yytext()); }
<YYINITIAL>"And"      	{ return new Symbol(sym.AND   ,yychar,yyline, yytext()); }
<YYINITIAL>"Or"      	{ return new Symbol(sym.OR   ,yychar,yyline, yytext()); }
<YYINITIAL>"Not"      	{ return new Symbol(sym.NOT   ,yychar,yyline, yytext()); }
<YYINITIAL>"Exit"      { return new Symbol(sym.EXIT   ,yychar,yyline, yytext()); }
<YYINITIAL>"WriteLine" { return new Symbol(sym.WRITELINE   ,yychar,yyline, yytext()); }
<YYINITIAL>"ReadLine"  { return new Symbol(sym.READLINE   ,yychar,yyline, yytext()); }

/*RETORNO DE EXPRESIONES REGULARES*/
<YYINITIAL>{NUMERO}   {return new Symbol(sym.NUMERO       ,yychar,yyline,new String(yytext()));}
<YYINITIAL>{NDECIMAL} {return new Symbol(sym.NDECIMAL     ,yychar, yyline, new String(yytext()));}  
<YYINITIAL>{CARACTER} {return new Symbol(sym.CARACTER     ,yychar,yyline,new String(yytext()));}
<YYINITIAL>{ID}       {return new Symbol(sym.ID           ,yychar,yyline, new String(yytext()));}

<YYINITIAL>{ENTER}    {/*Ignorado*/}
<YYINITIAL>{SPACE}   {/*Ignorado*/}



/* BLANCOS */
<YYINITIAL>[ \n\r\t\f]+   { /* Se ignoran */}



/* ERRORES LEXICOS */
<YYINITIAL> . {System.out.println("Error lexico: "+yytext()+" en Columna: "+yychar+" y linea: " +(yyline+1));
				erroresl.add("-Error lexico: "+yytext()+" en Columna: "+yychar+" y linea: " +(yyline+1));
}




<EXPRESION>{
[\"] { String temporal="\""+expresion+"\""; 
        expresion=""; 
        yybegin(YYINITIAL); 
        return new Symbol(sym.CADENA, yyline+1, yyline, temporal);  }
[^\"] { 
expresion +=yytext();}
}