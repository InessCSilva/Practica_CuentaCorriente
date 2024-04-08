package es.studium.Practica2;

/**
 * Clase para crear objetos de tipo Cliente.
 * @author In�s
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
	 * Constructor vac�o.
	 */
	public Cliente() {
		dni = "";
		nombre = "";
		direccion = "";
	}

	/**
	 * Constructor por par�metros.
	 * @param dni
	 * @param nombre
	 * @param direccion
	 */
	public Cliente(String dni, String nombre, String direccion) {
		this.dni = dni;
		this.nombre = nombre;
		this.direccion = direccion;
	}

	// M�todos getters y setters
	/**
	 * M�todo get del atributo dni.
	 * @return devuelve el valor del atributo dni.
	 */
	public String getDni() {
		return dni;
	}
	
	/**
	 * M�todo set del atributo dni.
	 * @param dni
	 */
	public void setDni(String dni) {
		this.dni = dni;
	}

	/**
	 * M�todo get del atributo nombre.
	 * @return devuelve el valor del atributo nombre.
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * M�todo set del atributo nombre.
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * M�todo get del atributo direcci�n.
	 * @return devuelve el valor del atributo direcci�n.
	 */
	public String getDireccion() {
		return direccion;
	}

	/**
	 * M�todo set del atributo direcci�n.
	 * @param direccion
	 */
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}	
}