package Jflextest;
import static Jflextest.Token.*;
%%
%class NewLexer
%type Token

num = [0-9]{2}
guion= "-"

tel = (({num}+{guion}){3})+{num}




white=[ \t\r\n]+

%{
	public String lexeme;
%}
%%


{white} {/*Ignore*/}
"//" {/*Ignore*/}

{tel} {lexeme =yytext(); return num;}

. {return ERROR;}