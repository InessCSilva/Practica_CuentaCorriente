package es.studium.Practica2;

/**
 * Clase para crear objetos de tipo Cliente.
 * @author Inés
 * @version 1/2022
 *
 */
public class Cliente {
	
	// Atributos
	private String dni;
	private String nombre;
	private String direccion;

	// Constructores
	/**
	 * Constructor vacío.
	 */
	public Cliente() {
		dni = "";
		nombre = "";
		direccion = "";
	}

	/**
	 * Constructor por parámetros.
	 * @param dni
	 * @param nombre
	 * @param direccion
	 */
	public Cliente(String dni, String nombre, String direccion) {
		this.dni = dni;
		this.nombre = nombre;
		this.direccion = direccion;
	}

	// Métodos getters y setters
	/**
	 * Método get del atributo dni.
	 * @return devuelve el valor del atributo dni.
	 */
	public String getDni() {
		return dni;
	}
	
	/**
	 * Método set del atributo dni.
	 * @param dni
	 */
	public void setDni(String dni) {
		this.dni = dni;
	}

	/**
	 * Método get del atributo nombre.
	 * @return devuelve el valor del atributo nombre.
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Método set del atributo nombre.
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Método get del atributo dirección.
	 * @return devuelve el valor del atributo dirección.
	 */
	public String getDireccion() {
		return direccion;
	}

	/**
	 * Método set del atributo dirección.
	 * @param direccion
	 */
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}	
}