package Jflextest;
import static Jflextest.Token.*;
%%
%class NewLexer
%type Token

/* patrones para nombres */
lmay= [A-Z]{1}
lmin= [^A-Z]+
guiBajo= "_"
conector= [a-z]{1,3}

nombre = {lmay}{lmin}{guiBajo} ((({conector}+{guiBajo})+)?) ((({lmay}{lmin}{guiBajo})?){1,4}) ({lmay}{lmin})


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
numProt=[0-9]+
protocolo= ({letProt}"://")?
dominio= ({letProt}|{numProt}|{guion}|guiBajo)"."{letProt}


URL= {protocolo}{dominio}



white=[ \t\r\n]+

%{
	public String lexeme;
%}
%%


{white} {/*Ignore*/}
"//" {/*Ignore*/}

{URL} {lexeme =yytext(); return num;}

. {return ERROR;}