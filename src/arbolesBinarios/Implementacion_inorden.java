package arbolesBinarios;



public class Implementacion_inorden {
	// Recorrido de un árbol binario en inorden
	public void inorden(Nodo nodo) {
		if (nodo != null) {
			inorden(nodo.getIzdo());
			System.out.println(nodo.getDato());
			inorden(nodo.getDcho());
		}
	}

}
