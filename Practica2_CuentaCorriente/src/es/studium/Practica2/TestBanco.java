package es.studium.Practica2;


/**
 * Clase principal de mi programa.
 * @author Inés
 * @version 1/2022
 *
 */
public class TestBanco {
	
	/**
	 * Refactorización, extraer una constante.
	 */
	private static final int SALDO_INICIAL = 100;

	/**
	 * Método principal del programa.
	 * @param args
	 */
	public static void main(String[] args) {
		
	/* Antonio y Beatriz se hacen clientes del banco */
	Cliente antonio = new Cliente("123456789Z", "Antonio Alonso", "Av. Pueblo Saharaui, s/n");
	Cliente beatriz = new Cliente("987654321A", "Beatriz Benítez", "Calle Sol, 4");
	
	/* Por defecto, todas las cuentas nuevas tienen 100€ */
	Cuenta cuentaNuevaAntonio = new Cuenta(48151, SALDO_INICIAL, antonio);
	Cuenta cuentaBeatriz = new Cuenta(62342, SALDO_INICIAL, beatriz);
	
	/* Antonio y Beatriz consultan el saldo */
	String cuenta = "La cuenta de ";
	System.out.println(cuenta + cuentaNuevaAntonio.getCliente().getNombre() + " tiene " + cuentaNuevaAntonio.getSaldo() + " euros.");
	System.out.println(cuenta + cuentaBeatriz.getCliente().getNombre() + " tiene " + cuentaBeatriz.getSaldo() + " euros.");
	
	/* Beatriz transfiere 50€ a Antonio */
	cuentaBeatriz.setSaldo(cuentaBeatriz.getSaldo() - 50);
	cuentaNuevaAntonio.setSaldo(cuentaNuevaAntonio.getSaldo() + 50);
	
	/* Antonio y Beatriz vuelven a consultar su saldo para comprobar que todo ha ido bien */
	System.out.println(cuenta + cuentaNuevaAntonio.getCliente().getNombre() + " tiene " + cuentaNuevaAntonio.getSaldo() + " euros.");
	
	System.out.println(cuenta + cuentaBeatriz.getCliente().getNombre() + " tiene " + cuentaBeatriz.getSaldo() + " euros.");
	
	/* Antonio gana 100€ en una rifa y lo ingresa en su cuenta */
	cuentaNuevaAntonio.setSaldo(cuentaNuevaAntonio.getSaldo() + SALDO_INICIAL);
	
	/* Beatriz tiene que pagar 30€ a hacienda y retira el dinero */
	cuentaBeatriz.setSaldo(cuentaBeatriz.getSaldo() - 30);
	
	/* Antonio y Beatriz consultan de nuevo el saldo de su cuenta. */
	System.out.println(cuenta + cuentaNuevaAntonio.getCliente().getNombre() + " tiene " + cuentaNuevaAntonio.getSaldo() + " euros.");
	 
	System.out.println(cuenta + cuentaBeatriz.getCliente().getNombre() + " tiene " + cuentaBeatriz.getSaldo() + " euros.");
	
	/* Antonio transfiere 50€ a Beatriz y vuelven a consultar el saldo de su cuenta */
	cuentaNuevaAntonio.setSaldo(cuentaNuevaAntonio.getSaldo() - 50);
	
	cuentaBeatriz.setSaldo(cuentaBeatriz.getSaldo() + 50);
	
	System.out.println(cuenta + cuentaNuevaAntonio.getCliente().getNombre() + " tiene " + cuentaNuevaAntonio.getSaldo() + " euros.");
	 
	System.out.println(cuenta + cuentaBeatriz.getCliente().getNombre() + " tiene " + cuentaBeatriz.getSaldo() + " euros."); }
}
