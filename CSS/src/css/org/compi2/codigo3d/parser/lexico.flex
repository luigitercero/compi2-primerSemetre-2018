package css.org.compi2.codigo3d.parser;

import java_cup.runtime.Symbol;
import css.org.compi2.codigo3d.parser.sym;
//Scanner para generar C3D
%%
%{
    //Código de usuario
    

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



%{
//VARIALES Y METODOS DEL SCANER
String expresion="";
%}

Comentario      = [/][/] [^\n]*
Comentariomult  = [/][*] [^]* [*][/]
MAYORQUE        = ">"
IGUAL           = "="
MENORQUE        = "<"
PAREA           = "("
PAREC           = ")"
PUNTOCOMA       = ";"
MENOS           = "-"
MAS             = "+"
POR             = "*"
DIV             = "/"
CORCHA          = "["
CORCHC          = "]"
COMA            = ","  
ID              = [A-Za-z][_0-9A-Za-z]*
ENTERO          = [0-9]+
DOSPI            = ":="
DECIMAL        ={ENTERO}+"."{ENTERO}+


SPACE   = [\ \r\t\f\t]
ENTER   = [\ \n]


 
%%



/*RETORNO DE EXPRESIONES REGULARES*/
<YYINITIAL> "\""        {yybegin (EXPRESION);}
<YYINITIAL> "id"               { /*System.out.println("ids ");*/return new Symbol(sym.IDE, yyline,yycolumn, yytext());}
<YYINITIAL> "GRUPO"            { /*System.out.println("GRUPO");*/return new Symbol(sym.GRUPO  , yyline,yycolumn, yytext());}
<YYINITIAL> "COLORTEXT"        { /*System.out.println("COLORTEXT");*/return new Symbol(sym.COLORTEXT, yyline,yycolumn, yytext());}                 
<YYINITIAL> "OPAQUE"           { /*System.out.println("OPAQUE");*/return new Symbol(sym.OPAQUE , yyline,yycolumn, yytext());}              
<YYINITIAL> "BORDE"            { /*System.out.println("BORDE");*/return new Symbol(sym.BORDE           , yyline,yycolumn, yytext());}             
<YYINITIAL> "VISIBLE"          { /*System.out.println("VISIBLE");*/return new Symbol(sym.VISIBLE         , yyline,yycolumn, yytext());}               
<YYINITIAL> "AUTOREDIMENSION"  { /*System.out.println("AUTOREDIMENSION");*/return new Symbol(sym.AUTOREDIMENSION , yyline,yycolumn,yytext());}                       
<YYINITIAL> "FONDOELEMENTO"    { /*System.out.println("FONDOELEMENTO");*/return new Symbol(sym.FONDOELEMENTO   , yyline,yycolumn, yytext());}                     
<YYINITIAL> "TAMTEXT"          { /*System.out.println("TAMTEXT");*/return new Symbol(sym.TAMTEXT         , yyline,yycolumn, yytext());}               
<YYINITIAL> "LETRA"            { /*System.out.println("LETRA");*/return new Symbol(sym.LETRA           , yyline,yycolumn, yytext());}             
<YYINITIAL> "FORMATO"          { /*System.out.println("FORMATO");*/return new Symbol(sym.FORMATO         , yyline,yycolumn, yytext());}               
<YYINITIAL> "TEXT"             { /*System.out.println("TEXT");*/return new Symbol(sym.TEXT            , yyline,yycolumn, yytext());}            
<YYINITIAL> "ALINEADO"         { /*System.out.println("ALINEADO");*/return new Symbol(sym.ALINEADO        , yyline,yycolumn, yytext());}                
<YYINITIAL> "IZQUIERDA"        { /*System.out.println("IZQUIERDA");*/return new Symbol(sym.IZQUIERDA      , yyline,yycolumn, yytext());}     
<YYINITIAL> "DERECHA"          { /*System.out.println("DERECHA");*/return new Symbol(sym.DERECHA        , yyline,yycolumn, yytext());}  
<YYINITIAL> "CENTRADO"         { /*System.out.println("CENTRADO");*/return new Symbol(sym.CENTRADO       , yyline,yycolumn, yytext());}   
<YYINITIAL> "JUSTIFICADO"      { /*System.out.println("JUSTIFICADO");*/return new Symbol(sym.JUSTIFICADO    , yyline,yycolumn, yytext());}        
<YYINITIAL> "NEGRILLA"         { /*System.out.println("NEGRILLA");*/return new Symbol(sym.NEGRILLA       , yyline,yycolumn, yytext());}         
<YYINITIAL> "CURSIVA"          { /*System.out.println("CURSIVA");*/return new Symbol(sym.CURSIVA        , yyline,yycolumn, yytext());} 
<YYINITIAL> "MAYUSCULA"        { /*System.out.println("MAYUSCULA");*/return new Symbol(sym.MAYUSCULA      , yyline,yycolumn, yytext());}           
<YYINITIAL> "MINUSCULA"        { /*System.out.println("MINUSCULA");*/return new Symbol(sym.MINUSCULA      , yyline,yycolumn, yytext());}            
<YYINITIAL> "CAPITAL-T"        { /*System.out.println("CAPITAL");*/return new Symbol(sym.CAPITAL        , yyline,yycolumn, yytext());}
<YYINITIAL> "TRUE"             { /*System.out.println("TRUE");*/return new Symbol(sym.TRUE           , yyline,yycolumn, yytext());}              
<YYINITIAL> "FALSE"            { /*System.out.println("FALSE");*/return new Symbol(sym.FALSE          , yyline,yycolumn, yytext());}
<YYINITIAL> {COMA}             { /*System.out.println("COMA");*/return new Symbol(sym.COMA           , yyline, yycolumn, yytext()); }
<YYINITIAL> {ID}               { /*System.out.println("ID");*/return new Symbol(sym.ID 	      , yyline, yycolumn, yytext()); }
<YYINITIAL> {ENTERO}           { /*System.out.println("ENTERO");*/return new Symbol(sym.ENTERO	      , yyline, yycolumn, yytext()); }
<YYINITIAL> {DECIMAL}          { /*System.out.println("DECIMAL");*/return new Symbol(sym.DECIMAL        , yyline, yycolumn, yytext());}
<YYINITIAL> {MAYORQUE}         { /*System.out.println("MAYORQUE");*/return new Symbol(sym.MAYORQUE       , yyline, yycolumn, yytext()); }
<YYINITIAL> {MENORQUE}         { /*System.out.println("MENORQUE");*/return new Symbol(sym.MENORQUE       , yyline, yycolumn, yytext()); }
<YYINITIAL> {IGUAL}            { /*System.out.println("IGUAL");*/return new Symbol(sym.IGUAL	      , yyline, yycolumn, yytext()); }
<YYINITIAL> {PUNTOCOMA}        { /*System.out.println("PUNTOCOMA");*/return new Symbol(sym.PUNTOCOMA      , yyline, yycolumn, yytext()); }
<YYINITIAL> {PAREA}            { /*System.out.println("PAREA");*/return new Symbol(sym.PAREA	      , yyline, yycolumn, yytext()); }
<YYINITIAL> {PAREC}            { /*System.out.println("PAREC");*/return new Symbol(sym.PAREC	      , yyline, yycolumn, yytext()); }
<YYINITIAL> {MENOS}            { /*System.out.println("MENOS");*/return new Symbol(sym.MENOS	      , yyline, yycolumn, yytext()); }
<YYINITIAL> {MAS}              { /*System.out.println("MAS");*/return new Symbol(sym.MAS	          , yyline, yycolumn, yytext()); }
<YYINITIAL> {DIV}              { /*System.out.println("DIV");*/return new Symbol(sym.DIV	          , yyline, yycolumn, yytext()); }
<YYINITIAL> {POR}              { /*System.out.println("POR");*/return new Symbol(sym.POR	          , yyline, yycolumn, yytext()); }
<YYINITIAL> {CORCHA}           { /*System.out.println("CORCHA");*/return new Symbol(sym.CORCHA	      , yyline, yycolumn, yytext()); }
<YYINITIAL> {CORCHC}           { /*System.out.println("CORCHC");*/return new Symbol(sym.CORCHC	      , yyline, yycolumn, yytext()); }
<YYINITIAL> {DOSPI}            { /*System.out.println("DOSPI");*/return new Symbol(sym.DOSPI	      , yyline, yycolumn, yytext()); }


<YYINITIAL> {SPACE}     { /*Espacios en blanco, ignorados*/ }
<YYINITIAL> {ENTER}     { /*Saltos de linea, ignorados*/}
<YYINITIAL> {Comentario}     { /*Espacios en blanco, ignorados*/ }
<YYINITIAL> {Comentariomult}     { /*Saltos de linea, ignorados*/}

<YYINITIAL>. {
        String errLex = "Error léxico, caracter irreconocible: '"+yytext()+"' en la línea: "+(yyline+1)+" y columna: "+yycolumn;
        System.err.println(errLex);
}

<EXPRESION>{
[\"] { String temporal=expresion; 
        expresion=""; 
        yybegin(YYINITIAL); 
     
        return new Symbol(sym.CADENA, yyline+1, yyline, temporal);  }
[^\"] { 
expresion +=yytext();}
}

