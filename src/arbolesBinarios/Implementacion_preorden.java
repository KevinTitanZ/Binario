package arbolesBinarios;

public class Implementacion_preorden {	
	// Recorrido de un árbol binario en preorden
	public void preorden(Nodo nodo) {
		if (nodo != null) {	
			System.out.println(nodo.dato + " ");
			preorden(nodo.izdo);
			preorden(nodo.dcho);
			
		}
	}
}
