package mx.com.everis.tallerjava.tareaArchivos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Archivo {

		public static void main(String[] args) throws IOException //clase principal
		{
			String url="/Users/Manuel Medina/Documents/PruebaArchivos/Archivo.txt";
			String url1="/Users/Manuel Medina/Documents/PruebaArchivos/";
			
			File folder = new File(url1); //creacion de la carpeta donde estara nuestro archivo
			folder.mkdirs();
			/*
			 * llamando a los metodos
			 */
			Archivo.create(url);
			Archivo.save(url);
			Archivo.read(url);
			
	    }

	
		private static void create(String url) throws IOException //metodo para crear el archivo dentro de la ruta especificada
		{
			 
	        File archivo = new File(url);
	        BufferedWriter bufer;
	        if(archivo.exists()) {
	            bufer = new BufferedWriter(new FileWriter(archivo));
	            System.out.println("Archivo ya existente...");
	        } else {
	            bufer = new BufferedWriter(new FileWriter(archivo));
	            System.out.println("Archivo creado con exito...");
	        }
	        
	        bufer.close();
			
		}
		
		public static void save(String url) throws IOException //metodo para agregar texto
		{
			BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
			FileWriter fichero = new FileWriter(url);
			PrintWriter print = new PrintWriter(fichero);
			System.out.println("Ingrese nuevo texto en el Archivo...");
			String dato=in.readLine();
			print.println(dato);
			System.out.println("Texto ingresado con exito...");
			//Archivo.read(url);
		    fichero.close();
		}
		
		public static void read(String url) throws IOException //metodo para leer el archivo
		{
			String texto;
			File archivo = new File (url);
	        FileReader file = new FileReader (archivo);
	        BufferedReader buff = new BufferedReader(file);
	        while((texto=buff.readLine())!=null){
	           System.out.println("la palabra en el archivo es:"+texto);
	        }
		}
	
}
