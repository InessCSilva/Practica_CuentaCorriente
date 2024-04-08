package es.studium.Practica2;


/**
 * Clase para crear objetos de tipo Cuenta.
 * @author Inés
 * @version 1/2022
 *
 */
public class Cuenta {
	
	//Atributos
	private int numeroCuenta;
	private float saldo;
	private Cliente cliente;

	//Constructores
	/**
	 * Constructor vacío
	 */
	public Cuenta() {
		numeroCuenta = 0;
		saldo = 0.0f;
		cliente = new Cliente();
	}

	/**
	 * Constructor por parámetros.
	 * @param numeroCuenta
	 * @param saldo
	 * @param cliente
	 */
	public Cuenta(int numeroCuenta, float saldo, Cliente cliente) {
		this.numeroCuenta = numeroCuenta;
		this.saldo = saldo;
		this.cliente = cliente;
	}

	// Métodos getters y setters
	/**
	 * Método get del atributo numeroCuenta.
	 * @return devuelve el valor del atributo numeroCuenta.
	 */
	public int getNumeroCuenta() {
		return numeroCuenta;
	}

	/**
	 * Método set del atributo numeroCuenta.
	 * @param numeroCuenta
	 */
	public void setNumeroCuenta(int numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}

	/**
	 * Método get del atributo saldo.
	 * @return devuelve el valor del atributo saldo.
	 */
	public float getSaldo() {
		return saldo;
	}

	/**
	 * Método set del atributo saldo.
	 * @param saldo
	 */
	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	/**
	 * Método get del atributo cliente.
	 * @return devuelve el valor del atributo cliente.
	 */
	public Cliente getCliente() {
		return cliente;
	}

	/**
	 * Método set del atributo cliente.
	 * @param cliente
	 */
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}	
}