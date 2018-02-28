package org.compi2.codigo3d.parser;

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
<YYINITIAL> "GRUPO"            {return new Symbol(sym.GRUPO           , yyline,yycolumn, yytext());}
<YYINITIAL> "COLORTEXT"        {return new Symbol(sym.COLORTEXT       , yyline,yycolumn, yytext());}                 
<YYINITIAL> "OPAQUE"           {return new Symbol(sym.OPAQUE          , yyline,yycolumn, yytext());}              
<YYINITIAL> "BORDE"            {return new Symbol(sym.BORDE           , yyline,yycolumn, yytext());}             
<YYINITIAL> "VISIBLE"          {return new Symbol(sym.VISIBLE         , yyline,yycolumn, yytext());}               
<YYINITIAL> "AUTOREDIMENSION"  {return new Symbol(sym.AUTOREDIMENSION , yyline,yycolumn, yytext());}                       
<YYINITIAL> "FONDOELEMENTO"    {return new Symbol(sym.FONDOELEMENTO   , yyline,yycolumn, yytext());}                     
<YYINITIAL> "TAMTEXT"          {return new Symbol(sym.TAMTEXT         , yyline,yycolumn, yytext());}               
<YYINITIAL> "LETRA"            {return new Symbol(sym.LETRA           , yyline,yycolumn, yytext());}             
<YYINITIAL> "FORMATO"          {return new Symbol(sym.FORMATO         , yyline,yycolumn, yytext());}               
<YYINITIAL> "TEXT"             {return new Symbol(sym.TEXT            , yyline,yycolumn, yytext());}            
<YYINITIAL> "ALINEADO"         {return new Symbol(sym.ALINEADO        , yyline,yycolumn, yytext());}                
<YYINITIAL> "IZQUIERDA"        {return new Symbol (sym.IZQUIERDA      , yyline,yycolumn, yytext());}     
<YYINITIAL> "DERECHA"          {return new Symbol (sym.DERECHA        , yyline,yycolumn, yytext());}  
<YYINITIAL> "CENTRADO"         {return new Symbol (sym.CENTRADO       , yyline,yycolumn, yytext());}   
<YYINITIAL> "JUSTIFICADO"      {return new Symbol (sym.JUSTIFICADO    , yyline,yycolumn, yytext());}        
<YYINITIAL> "NEGRILLA"         {return new Symbol (sym.NEGRILLA       , yyline,yycolumn, yytext());}         
<YYINITIAL> "CURSIVA"          {return new Symbol (sym.CURSIVA        , yyline,yycolumn, yytext());} 
<YYINITIAL> "MAYUSCULA"        {return new Symbol (sym.MAYUSCULA      , yyline,yycolumn, yytext());}           
<YYINITIAL> "MINUSCULA"        {return new Symbol (sym.MINUSCULA      , yyline,yycolumn, yytext());}            
<YYINITIAL> "CAPITAL-T"        {return new Symbol (sym.CAPITAL        , yyline,yycolumn, yytext());}
<YYINITIAL> "TRUE"             {return new Symbol (sym.TRUE           , yyline,yycolumn, yytext());}              
<YYINITIAL> "FALSE"            {return new Symbol (sym.FALSE          , yyline,yycolumn, yytext());}
<YYINITIAL> {COMA}             { return new Symbol(sym.COMA           , yyline, yycolumn, yytext()); }
<YYINITIAL> {ID}               { return new Symbol(sym.ID 	      , yyline, yycolumn, yytext()); }
<YYINITIAL> {ENTERO}           { return new Symbol(sym.ENTERO	      , yyline, yycolumn, yytext()); }
<YYINITIAL> {DECIMAL}          { return new Symbol(sym.DECIMAL        , yyline, yycolumn, yytext());}
<YYINITIAL> {MAYORQUE}         { return new Symbol(sym.MAYORQUE       , yyline, yycolumn, null); }
<YYINITIAL> {MENORQUE}         { return new Symbol(sym.MENORQUE       , yyline, yycolumn, null); }
<YYINITIAL> {IGUAL}            { return new Symbol(sym.IGUAL	      , yyline, yycolumn, null); }
<YYINITIAL> {PUNTOCOMA}        { return new Symbol(sym.PUNTOCOMA      , yyline, yycolumn, null); }
<YYINITIAL> {PAREA}            { return new Symbol(sym.PAREA	      , yyline, yycolumn, null); }
<YYINITIAL> {PAREC}            { return new Symbol(sym.PAREC	      , yyline, yycolumn, null); }
<YYINITIAL> {MENOS}            { return new Symbol(sym.MENOS	      , yyline, yycolumn, null); }
<YYINITIAL> {MAS}              { return new Symbol(sym.MAS	          , yyline, yycolumn, null); }
<YYINITIAL> {DIV}              { return new Symbol(sym.DIV	          , yyline, yycolumn, null); }
<YYINITIAL> {POR}              { return new Symbol(sym.POR	          , yyline, yycolumn, null); }
<YYINITIAL> {CORCHA}           { return new Symbol(sym.CORCHA	      , yyline, yycolumn, null); }
<YYINITIAL> {CORCHC}           { return new Symbol(sym.CORCHC	      , yyline, yycolumn, null); }
<YYINITIAL> {DOSPI}            { return new Symbol(sym.DOSPI	      , yyline, yycolumn, null); }


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

