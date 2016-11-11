package Jflextest;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

import javax.swing.JOptionPane;

public class TestClass {
		
	public static void main(String args[]) throws IOException{
		// String str = JOptionPane.showInputDialog("expresi�n");
		 
		 //InputStream is = new ByteArrayInputStream(str.getBytes());
		 //BufferedReader br = new BufferedReader(new InputStreamReader(is));
		 
		 
		 ReadFile readFile = new ReadFile();
		String entradas= readFile.readFile();
		
		InputStream stream = new ByteArrayInputStream(entradas.getBytes(StandardCharsets.UTF_8));
	
		 
		 NewLexer lexer = new NewLexer (stream);
		 String resultados ="";
		 
		 

		 int cont=0;
		 
		 while(true){
			 Token token = lexer.yylex();
			 if(token ==null){
				 resultados+= "FIN";
				 break;
			 }
			 
			 
			
			 //igual, suma, variable, numero, multiplicacion, resta, division, ERROR
			 switch(token){
			 
			 case ERROR: resultados+="ERROR"+ lexer.lexeme; 
			 
			 System.out.println("this is the line"+cont);
	 			break;
			 
			 case nombre: 
				 resultados+="Palabra reservada de nombre "+lexer.lexeme;
				 cont++;
				break;
				
			 case telLocal: 
				 resultados+="Palabra reservada de telLocal "+lexer.lexeme;
				 cont++;
				break;
			 case telCel: 
				 resultados+="Palabra reservada de telCel "+lexer.lexeme;
				 cont++;
				break;
			 case url: 
				 resultados+="Palabra reservada de url "+lexer.lexeme;
				 cont++;
				break;
			 case correo: 
				 resultados+="Palabra reservada de correo "+lexer.lexeme;
				 cont++;
				break;
			 
				 case youtube: 
					 resultados+="Palabra reservada de youtube "+lexer.lexeme;
					 cont++;
					break;
				
				 default: resultados+="Token:"+token+" "+lexer.lexeme;
				 System.out.println("never here");
				 cont++;
				
				 		break;
				 }
			 }
		 
		// JOptionPane.showMessageDialog(null, resultados);
			 
		 }
		 
		 
}
