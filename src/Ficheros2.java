import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Ficheros2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn = new Scanner(System.in);
		String archivo="";
		String directorio="";
		try {
			
			
			//Ejercicio 1
		 System.out.println("Introduce un archivo : ");
			 archivo = sn.nextLine();
			 File file = new File(archivo);
		        if (file.exists()) {
		            System.out.println("El fichero existe");
		        }else {
		        	file.createNewFile();
		        	System.out.println("El fichero no existe, lo vamos a crear");
		        }
		    //Ejercicio 2
		    for(int i=0;i<5;i++) {
		    	System.out.println("Introduce un archivo : ");
				 archivo = sn.nextLine();
				 File file2 = new File(archivo);
			        if (file2.exists()) {
			            System.out.println("El fichero existe");
			        }else {
			        	file2.createNewFile();
			        }
		    }
		    //Ejercicio 3
		    
		    for(int i=1;i<101;i++) {
		    	File file3 = new File(i + ".txt");
		    	
		    	file3.createNewFile();
		    	
		    }
			//Ejercicio 4
			File carpeta = new File("/Users/unai/Desktop/programacion/Ficheros2");
			String[] listado = carpeta.list();
			
			    for (int i=0; i< listado.length; i++) {
			        System.out.println(listado[i]);
			    }
			//Ejercicio 5
			System.out.println("Introduce el nombre para crear un directorio: ");
			directorio = sn.nextLine();
			File carpeta2 = new File("/Users/unai/Desktop/programacion/Ficheros2/"+directorio);
			carpeta2.mkdir();
			//Ejercicio 6
			 File file4 = new File("listadoGS.txt");
			 file4.createNewFile();
			 System.out.println("Introduce un nombre : ");
			 archivo = sn.nextLine();
			 File file5 = new File(archivo);
			file4.renameTo(file5);
						
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Tapetao");
			e.printStackTrace();
		}
		
		
	}

}
