package js.org.compi2.codigo3d.parser;

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

Comentario      =[#][/] [^]* [/][#]
Comentario2     =[#] [^\n]* [\n]
NUMERO          =[0-9]+
NDECIMAL        = {NUMERO}"."{NUMERO}
ID              =([a-zA-Z0-9]|_)+
DATE            = [\'][0-3]?[0-9][/][0-1]?[0-9][/][0-2][0-9][0-9][0-9][\']
DATETIME        =  [\'][0-3]?[0-9][/][0-1]?[0-9][/][0-2][0-9][0-9][0-9] [0-2]?[0-9][:][0-5][0-9][:][0-5][0-9][\']
CARACTER        = "'"[^\n]"'"


SPACE           = [\ \r\t\f\t]
ENTER           = [\ \n]


 
%%

<YYINITIAL>{
/* PALABRAS RESERVADAS */
"\""        {yybegin (EXPRESION);}
"++"        { return new Symbol(sym.MASMAS      ,yychar,yyline,yytext());}
"--"        { return new Symbol(sym.MENOSMENOS  ,yychar,yyline,yytext());}
"+"         { return new Symbol(sym.MAS         ,yychar,yyline,yytext());}
"-"         { return new Symbol(sym.MENOS       ,yychar,yyline,yytext());}
"*"         { return new Symbol(sym.POR         ,yychar,yyline,yytext());}  
"/"         { return new Symbol(sym.DIV         ,yychar,yyline,yytext());}
"("         { return new Symbol(sym.PAREA       ,yychar,yyline,yytext());}
"^"         { return new Symbol(sym.ELEVA       ,yychar,yyline,yytext());}
"%"         { return new Symbol(sym.MOD       ,yychar,yyline,yytext());}
")"         { return new Symbol(sym.PAREC        ,yychar,yyline,yytext());}
"{"         { return new Symbol(sym.LLV1        ,yychar,yyline,yytext());}
"}"         { return new Symbol(sym.LLV2        ,yychar,yyline,yytext());}
","         { return new Symbol(sym.COMA        ,yychar,yyline,yytext());}
":"         { return new Symbol(sym.DOSPUNTOS        ,yychar,yyline,yytext());}
";"         { return new Symbol(sym.PUNTOCOMA   ,yychar,yyline,yytext());}
"||"        { return new Symbol(sym.OR          ,yychar ,yyline,yytext());}
"&&"        { return new Symbol(sym.Y           ,yychar ,yyline,yytext());}
"!"         { return new Symbol(sym.NEL         ,yychar ,yyline, yytext());}
"."         { return new Symbol(sym.PUNTO       ,yychar,yyline,yytext());}
">"         { return new Symbol(sym.MAYORQUE    ,yychar,yyline,yytext());}
"<"         { return new Symbol(sym.MENORQUE    ,yychar,yyline,yytext());}
">="        { return new Symbol(sym.MAYORIGUAL  ,yychar,yyline,yytext());}
"<="        { return new Symbol(sym.MENORIGUAL  ,yychar,yyline, yytext());}
"=="        { return new Symbol(sym.IGUALIGUAL  ,yychar,yyline, yytext());}
"!="        { return new Symbol(sym.NOIGUAL     ,yychar,yyline, yytext());}
"true"      { return new Symbol(sym.VERDADERO   ,yychar,yyline, yytext()); }
"false"     { return new Symbol(sym.FALSO       ,yychar,yyline, yytext()); }
"dimv"      { return new Symbol(sym.DIMV        ,yychar,yyline, yytext()); }
"retornar"  { return new Symbol(sym.RETORNAR    ,yychar,yyline, yytext()); }
"Si"        { return new Symbol(sym.SI          ,yychar,yyline, yytext()); }
"Sino"      { return new Symbol(sym.SINO        ,yychar,yyline, yytext()); }
"Selecciona" { return new Symbol(sym.SELECCIONA ,yychar,yyline, yytext()); }
"Caso"      { return new Symbol(sym.CASO        ,yychar,yyline, yytext()); }
"Defecto"   { return new Symbol(sym.DEFECTO     ,yychar,yyline, yytext()); }
"Para"      { return new Symbol(sym.PARA        ,yychar,yyline, yytext()); }
"Mientras"  { return new Symbol(sym.MIENTRAS    ,yychar,yyline, yytext()); }
"Detener"   { return new Symbol(sym.TERMINAR    ,yychar,yyline, yytext()); }
"imprimir"  { return new Symbol(sym.IMPRIMIR    ,yychar,yyline, yytext()); }
"funcion"   { return new Symbol(sym.FUNCION     ,yychar,yyline, yytext());}
"mensaje"   { return new Symbol(sym.MENSAJEV    ,yychar,yyline, yytext());}


/*RETORNO DE EXPRESIONES REGULARES*/
{DATETIME} {return new Symbol(sym.DATETIME     ,yychar,yyline,new String(yytext()));}
{DATE}     {return new Symbol(sym.DATE         ,yychar,yyline,new String(yytext()));}
{NUMERO}   {return new Symbol(sym.NUMERO       ,yychar,yyline,new String(yytext()));}
{NDECIMAL} {return new Symbol(sym.NDECIMAL     ,yychar, yyline, new String(yytext()));}  
{CARACTER} {return new Symbol(sym.CARACTER     ,yychar,yyline,new String(yytext()));}
{ID}       {return new Symbol(sym.ID           ,yychar,yyline, new String(yytext()));}

{Comentario}    {}
{Comentario2}   {}
{ENTER} {}
{SPACE} {}


/* ERRORES LEXICOS */
. {System.out.println("Error lexico: "+yytext());}

}


<EXPRESION>{
[\"] { String temporal=expresion; 
        expresion=""; 
        yybegin(YYINITIAL); 
        return new Symbol(sym.CADENA, yyline+1, yyline, temporal);  }
[^\"] { 
expresion +=yytext();}
}