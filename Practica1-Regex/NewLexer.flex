package Jflextest;
import static Jflextest.Token.*;
%%
%class NewLexer
%type Token

num = [0-9]
twonum = {num}+{num}

white=[ \t\r\n]+

%{
	public String lexeme;
%}
%%


{white} {/*Ignore*/}
"//" {/*Ignore*/}

{twonum} {lexeme =yytext(); return num;}

. {return ERROR;}