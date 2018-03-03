package html.org.compi2.codigo3d.parser;

import java_cup.runtime.Symbol;

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
%state CUALQUIERA 
%ignorecase

%{
//VARIALES Y METODOS DEL SCANER
String expresion="";
%}

COMENTARIO      ="<//" [^/] ~"//>" | "<//" "/"+ "//>"
MAYORQUE   = ">"
IGUAL      = "="
PAREA       = "("
PAREC      = ")"
PUNTOCOMA = ";"

ID          = [A-Za-z][_0-9A-Za-z]*
AID    =[<]{ID}

FINTEXTOA = [>][^<fin][^-]~ [<][Ff][Ii][Nn][-][Tt][Ee][Xx][Tt][Oo][_][Aa]
FINTEXTO = [>][^<fin][^-]~ [<][Ff][Ii][Nn][-][Tt][Ee][Xx][Tt][Oo]
FINCAJATEXTO = [>][^<fin][^-]~ [<][Ff][Ii][Nn][-][Cc][Aa][Jj][Aa][_][Tt][Ee][Xx][Tt][Oo]

ENTERO          = [0-9]+
FIN    = [<][Ff][Ii][Nn][-]{ID}




SPACE   = [\ \r\t\f\t]
ENTER   = [\ \n]


 
%%



/*RETORNO DE EXPRESIONES REGULARES*/
<YYINITIAL> "\""            {yybegin (EXPRESION);}
<YYINITIAL> "<chtml"		 { System.out.println("    chtml");return new Symbol(sym.CHTML     , yyline, yycolumn, yytext()); }
<YYINITIAL> "<fin-chtml"		 { System.out.println("    FINchtml");return new Symbol(sym.FINCHTML     , yyline, yycolumn, yytext()); }
<YYINITIAL> "<encabezado"		 { System.out.println("    ENCABEZADO");return new Symbol(sym.ENCABEZADO     , yyline, yycolumn, yytext()); }
<YYINITIAL> "<fin-encabezado"		 { System.out.println("    FINENCABEZADO");return new Symbol(sym.FINENCABEZADO     , yyline, yycolumn, yytext()); }
<YYINITIAL> "<titulo"      { System.out.println("    titulo");return new Symbol(sym.TITULO     , yyline, yycolumn, yytext()); }
<YYINITIAL> "<fin-titulo"      { System.out.println("    FINtitulo");return new Symbol(sym.FINTITULO     , yyline, yycolumn, yytext()); }
<YYINITIAL> "<ccss"      { System.out.println("    CCSS");return new Symbol(sym.CCSS     , yyline, yycolumn, yytext()); }
<YYINITIAL> "<fin-ccss"      { System.out.println("    FIN-CCSS");return new Symbol(sym.FINCCSS     , yyline, yycolumn, yytext()); }
<YYINITIAL> "<cjs"      { System.out.println("    CJS");return new Symbol(sym.CJS     , yyline, yycolumn, yytext()); }
<YYINITIAL> "<fin-cjs"      { System.out.println("    FIN-CJS");return new Symbol(sym.FINCJS     , yyline, yycolumn, yytext()); }
<YYINITIAL> "<cuerpo"      { System.out.println("    cuerpo");return new Symbol(sym.CUERPO     , yyline, yycolumn, yytext()); }
<YYINITIAL> "<fin-cuerpo"      { System.out.println("    FIN-cuerpo");return new Symbol(sym.FINCUERPO     , yyline, yycolumn, yytext()); }

<YYINITIAL> "<panel"      { System.out.println("    panel");return new Symbol(sym.PANEL     , yyline, yycolumn, yytext()); }  
<YYINITIAL> "<fin-panel"      { System.out.println("    fin panel");return new Symbol(sym.FINPANEL     , yyline, yycolumn, yytext()); }  
<YYINITIAL> "<salto-fin" { System.out.println("    SALTO");return new Symbol(sym.SALTOFIN     , yyline, yycolumn, yytext()); }  
<YYINITIAL> "<boton" { System.out.println("    boton");return new Symbol(sym.BOTON     , yyline, yycolumn, yytext()); }  
<YYINITIAL> "<fin-boton" { System.out.println("    fin-boton");return new Symbol(sym.FINBOTON     , yyline, yycolumn, yytext()); }  
<YYINITIAL> "<TEXTO" { System.out.println("    texto");return new Symbol(sym.TEXTO     , yyline, yycolumn, yytext()); }
<YYINITIAL> "<TEXTO_A" { System.out.println("    textoA");return new Symbol(sym.TEXTOA     , yyline, yycolumn, yytext()); }
<YYINITIAL> "<CAJA_TEXTO" { System.out.println("    CAJA_TEXTO");return new Symbol(sym.CAJATEXTO     , yyline, yycolumn, yytext()); }
<YYINITIAL> "<imagen" { System.out.println("    Imagen");return new Symbol(sym.IMAGEN     , yyline, yycolumn, yytext()); }
<YYINITIAL> "<FIN-imagen" { System.out.println("    finInagen");return new Symbol(sym.FINIMAGEN     , yyline, yycolumn, yytext()); }
 
<YYINITIAL> {ID}            { System.out.println("    ID");return new Symbol(sym.ID     , yyline, yycolumn, yytext()); }
<YYINITIAL> {AID}           { System.out.println("    AID");return new Symbol(sym.AID     , yyline, yycolumn, yytext()); }
<YYINITIAL> {FIN}           { System.out.println("      FIN");return new Symbol(sym.FIN    , yyline, yycolumn, yytext()); }
<YYINITIAL> {ENTERO}        { System.out.println("    ENTERO");return new Symbol(sym.ENTERO    , yyline, yycolumn, yytext()); }


<YYINITIAL> {MAYORQUE}      { System.out.println("    MAYORQUE");return new Symbol(sym.MAYORQUE, yyline, yycolumn, null); }

<YYINITIAL> {IGUAL}         { return new Symbol(sym.IGUAL    , yyline, yycolumn, null); }
<YYINITIAL> {PAREA}         { return new Symbol(sym.PAREA    , yyline, yycolumn, null); }
<YYINITIAL> {PAREC}         { return new Symbol(sym.PAREC    , yyline, yycolumn, null); }
<YYINITIAL> {PUNTOCOMA}     { return new Symbol(sym.PUNTOCOMA    , yyline, yycolumn, null); }

<YYINITIAL> {SPACE}         { /*Espacios en blanco, ignorados*/ }
<YYINITIAL> {ENTER}         { /*Saltos de linea, ignorados*/}

<YYINITIAL> {COMENTARIO}    { System.out.println("    COMENTARIO"); }
<YYINITIAL> {FINTEXTOA}    { System.out.println("    fintexto_a");return new Symbol(sym.FINTEXTOA     , yyline, yycolumn, yytext()); }
<YYINITIAL> {FINTEXTO} 		{ System.out.println("    fintexto");return new Symbol(sym.FINTEXTO     , yyline, yycolumn, yytext()); }
<YYINITIAL> {FINCAJATEXTO} { System.out.println("    FINCAJATEXTO");return new Symbol(sym.FINCAJATEXTO     , yyline, yycolumn, yytext()); }
<YYINITIAL>. {
        System.out.println("    CUALQUIERA");return new Symbol(sym.CUALQUIERA     , yyline, yycolumn, yytext());
}



<EXPRESION>{
[\"] { String temporal=expresion; 
        expresion=""; 
        yybegin(YYINITIAL); 
     System.out.println("    CADENA");
        return new Symbol(sym.CADENA, yyline+1, yyline, temporal);  }
[^\"] { 
expresion +=yytext();}
}

