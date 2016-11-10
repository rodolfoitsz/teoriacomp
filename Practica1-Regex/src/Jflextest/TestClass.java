package Jflextest;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import javax.swing.JOptionPane;

public class TestClass {
		
	public static void main(String args[]) throws IOException{
		 String str = JOptionPane.showInputDialog("expresi�n");
		 
		 InputStream is = new ByteArrayInputStream(str.getBytes());
		 //BufferedReader br = new BufferedReader(new InputStreamReader(is));
		 
		 NewLexer lexer = new NewLexer (is);
		 String resultados ="";
		 
		 while(true){
			 Token token = lexer.yylex();
			 if(token ==null){
				 resultados+= "FIN";
				 break;
			 }
			 
			 
			 System.out.println("this i sthe token"+lexer.lexeme);
			 
			 //igual, suma, variable, numero, multiplicacion, resta, division, ERROR
			 switch(token){
				 case num: 
					 resultados+="Palabra reservada de calis "+lexer.lexeme;
					break;
				
				 default: resultados+="Token:"+token+"\n";
				 		break;
				 }
			 }
		 
		 JOptionPane.showMessageDialog(null, resultados);
			 
		 }
		 
		 
}
