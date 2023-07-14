package arbolesBinarios;



public class Implementacion_postorden {
	// Recorrido de un árbol binario en postorden
	public void postorden(Nodo Ola) {
		if (Ola != null) {
			postorden(Ola.izdo);
			postorden(Ola.dcho);
			System.out.println(Ola.dato + " ");
		}
	}
}
