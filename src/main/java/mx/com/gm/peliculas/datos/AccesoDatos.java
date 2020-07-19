package mx.com.gm.peliculas.datos;

import java.util.List;

import mx.com.gm.peliculas.domain.Pelicula;
import mx.com.gm.peliculas.excepciones.AccesoDatosEx;
import mx.com.gm.peliculas.excepciones.EscrituraDatosEx;
import mx.com.gm.peliculas.excepciones.LecturaDatosEx;

public interface AccesoDatos {

	public boolean existe(String nombreArchivo) throws AccesoDatosEx ;
	
	public List<Pelicula>listar(String nombreArchivo) throws LecturaDatosEx;

	public void escribir(Pelicula pelicula, String nombreArchivo, boolean anexar) throws EscrituraDatosEx;

	String buscar(String nombreArchivo, String buscar) throws LecturaDatosEx;

	void crear(String nombreArchivo) throws AccesoDatosEx ;

	void borrar(String nombreArchivo) throws AccesoDatosEx ;
}
