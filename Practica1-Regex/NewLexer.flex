package Jflextest;
import static Jflextest.Token.*;
%%
%class NewLexer
%type Token

/* patrones para nombres */
lmay= [A-Z]{1}
lmin= [a-z]+
guiBajo= "_"
conector= [a-z]{1,3}

nombre = ({lmay}{lmin}{guiBajo}){1} ((({conector}+{guiBajo})+)?) ((({lmay}{lmin}{guiBajo}){1,4})?) ((({conector}+{guiBajo})+)?) ({lmay}{lmin}){1}


/* patrones para telefonos */
numDosDig = [0-9]{2}
numTresDig = [0-9]{3}
guion= "-"
abrParent = "("
cieParent = ")"
                                                          
telLocal = ({abrParent}{numDosDig}{cieParent}{guion})?(({numDosDig}{guion}){3}){numDosDig}
telCel = (({numTresDig}|({abrParent}{numTresDig}{cieParent})){guion})?(({numDosDig}{guion}){4}){numDosDig}

/*Patrones para URL*/
letProt=[a-zA-Z]+
eleDom=[a-zA-Z0-9]+
guiBajMed=["_""-"]+
segPost=("/"[a-zA-Z0-9"_""-""%""?"]+)+

protocolo= ({letProt}"://")?
dominio=( ( {protocolo }? {eleDom}  ((({guiBajMed}{eleDom})+)?) ) ".")+ {eleDom}

url= {dominio}{segPost}?




/* patrones para correos */
letCorr=[a-zA-Z]+
lets=[a-zA-Z0-9"_""-""."]+


correo={letCorr}{lets}"@"{dominio}

/* patrones para youtube */
dominioYou ="www.youtube.com/watch?v="
eleDomYou=[a-zA-Z0-9"_""-""%""?"]+

youtube={protocolo}{dominioYou}{eleDomYou}



white=[ \t\r\n]+

%{
	public String lexeme;
%}
%%


{white} {/*Ignore*/}
"//" {/*Ignore*/}

{nombre} {lexeme =yytext(); return nombre;}
{telLocal} {lexeme =yytext(); return telLocal;}
{telCel} {lexeme =yytext(); return telCel;}
{url} {lexeme =yytext(); return url;}
{correo} {lexeme =yytext(); return correo;}
{youtube} {lexeme =yytext(); return youtube;}
. {lexeme =yytext();return ERROR;}