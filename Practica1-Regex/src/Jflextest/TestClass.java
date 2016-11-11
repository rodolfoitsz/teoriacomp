package Jflextest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.swing.JOptionPane;

public class TestClass {
		
	public static void main(String args[]) throws IOException{
		// String str = JOptionPane.showInputDialog("expresi�n");
		 
		 //InputStream is = new ByteArrayInputStream(str.getBytes());
		 //BufferedReader br = new BufferedReader(new InputStreamReader(is));
		 
		 
		 ReadFile readFile = new ReadFile();
		String entradas= readFile.readFile();
		
		 InputStream stream = new ByteArrayInputStream(entradas.getBytes(StandardCharsets.UTF_8));
	
		//crea el nuevo documento 
		try (Writer writer = new BufferedWriter(new OutputStreamWriter(
	              new FileOutputStream("salida.html"), "utf-8"))) {    
			     writer.write(entradas);   
	      }
		
	
		 
		 NewLexer lexer = new NewLexer (stream);
		 String resultados ="";
		
		Path path = Paths.get("salida.html");
		Charset charset = StandardCharsets.UTF_8;

		String content = new String(Files.readAllBytes(path), charset);
		
		 
		 while(true){
			 Token token = lexer.yylex();
			 if(token ==null){
				 resultados+= "FIN";
				 break;
			 }
			 
			 
			 //igual, suma, variable, numero, multiplicacion, resta, division, ERROR
			 switch(token){
			 
			 case ERROR: resultados+="ERROR"+ lexer.lexeme; 
			
	 			break;
			 
			 case nombre: 
				 
				 String nombre ="";
				 nombre+=lexer.lexeme;
				
				 content = content.replace(nombre, "<b>"+nombre+"</b>");
				 Files.write(path, content.getBytes(charset));
				 
				 System.out.println(nombre);
				 
				 
				 //resultados+="Palabra reservada de nombre "+lexer.lexeme;
				 
				break;
				
			 case telLocal: 
				 
				 String telLocal ="";
				 telLocal+=lexer.lexeme;
				 System.out.println("telLocal ="+telLocal);
				 
				  
				 content = content.replace(telLocal.trim(), "<font color='green'>"+telLocal+"</font>");
				 Files.write(path, content.getBytes(charset));
				 
				 
				// resultados+="Palabra reservada de telLocal "+lexer.lexeme;
				 
				break;
			 case telCel: 
				 String telCel ="";
				 telCel+=lexer.lexeme;
				 System.out.println("telCel ="+telCel);
				 
				 content = content.replace(telCel.trim(), "<font color='red'>"+telCel+"</font>");
				 Files.write(path, content.getBytes(charset));
				 
				 
				// resultados+="Palabra reservada de telCel "+lexer.lexeme;
			
				break;
			 case url: 
				 String url ="";
				 url+=lexer.lexeme;
				 System.out.println("url ="+url);
				 
				 content = content.replaceAll(url.trim(), "<a  href='"+url+"'>"+url+"</a>");
				 Files.write(path, content.getBytes(charset));
				 
				// resultados+="Palabra reservada de url "+lexer.lexeme;
			
				break;
			 case correo: 
				 
				 String correo ="";
				 correo+=lexer.lexeme;
				 System.out.println("correo ="+correo);
				 
				 content = content.replaceAll(correo.trim(), "<a  href='mailto:"+correo+"'>"+correo+"</a>");
				 Files.write(path, content.getBytes(charset));
				 
				 
				// resultados+="Palabra reservada de correo "+lexer.lexeme;
			
				break;
			 
				 case youtube: 
					 String youtube ="";
					 youtube+=lexer.lexeme;
					 System.out.println("youtube ="+youtube);
					 
					 
					 
					 content = content.replace(youtube.trim(), "<iframe width='420' height='315' src="+youtube+"'> </iframe> " );
					 Files.write(path, content.getBytes(charset));
					 
					// resultados+="Palabra reservada de youtube "+lexer.lexeme;
				
					break;
				
				 default: resultados+="Token:"+token+" "+lexer.lexeme;
				 System.out.println("never here");
				
				
				 		break;
				 }
			 }
		 
		// JOptionPane.showMessageDialog(null, resultados);
			 
		 }
		 
		 
}
