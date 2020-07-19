package cpjlaboratoriofinal;

import java.util.Scanner;

import mx.com.gm.peliculas.negocio.CatalogoPeliculas;
import mx.com.gm.peliculas.negocio.CatalogoPeliculasImpl;

public class CPJLaboratorioFinal {

	private static final Scanner scanner = new Scanner(System.in);
	private static int opcion= -1;
	private static final String nombreArchivo = "C:\\Users\\oksana\\Documents\\GitHub\\ProyectoFinalFundamentosJava\\peliculas.txt";
	private static final CatalogoPeliculas catalogoPeli = new CatalogoPeliculasImpl();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
while (opcion !=0) {
	
	try {
		System.out.println("Elige opcion:\n1.- Iniciar catalogo peliculas"
				+ "\n2. - Agregar pelicula\n"
				+ "\n3. - Listar peliculas\n"
				+ "\n4.-Buscar pelicula\n"
				+ "\n0. - Salir\n");
		  opcion = Integer.parseInt(scanner.nextLine());

          
          switch (opcion) {
              case 1:
                 
                  catalogoPeli.iniciarArchivo(nombreArchivo);
                  break;
              case 2:
                  //2. agregar informacion archivo
                  System.out.println("Introduce el nombre de una pelicula a agregar:");
                  String nombre = scanner.nextLine();
                  catalogoPeli.agregarPelicula(nombre, nombreArchivo);
                  break;
              case 3:
                  //3. listar catalogo completo
                  catalogoPeli.listarPeliculas(nombreArchivo);
                  break;
              case 4:
                  //4. Buscar pelicula
                  System.out.println("Introduce el nombre de una pelicula a buscar:");
                  String buscar = scanner.nextLine();
                  catalogoPeli.buscarPelicula(nombreArchivo, buscar);
                  break;
              case 0:
                  System.out.println("!Hasta pronto!");
                  break;
              default:
                  System.out.println("Opcion no reconocida");
                  break;
          }
          System.out.println("\n"); 

      } catch (Exception e) {
          System.out.println("Error!");
      }
  }
}
}
