package mx.com.gm.peliculas.domain;
// representa los objetos pelicula utilizados en la aplicacion catalogo de peliculas
public class Pelicula {

	private String nombre;

	public Pelicula() {

	}

	public Pelicula(String nombre) {
		this.nombre = nombre;

	}
public String getNombre() {
	return nombre;
}
public  void setNombre(String nombre) {
	this.nombre=nombre;
}

public String toString(){
	return this.nombre;
	
}
}
