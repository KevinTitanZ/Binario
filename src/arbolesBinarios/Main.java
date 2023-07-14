package arbolesBinarios;


public class Main {

	public static void main(String[] args) throws Exception {
		ArbolB arbol1;
		Nodo a1, a2, a;
		PilaVector pila = new PilaVector();
		a1 = ArbolB.nuevoArbol(null,"Maria",null);
		a2 = ArbolB.nuevoArbol(null,"Rodrigo",null);
		a = ArbolB.nuevoArbol(a1,"Esperanza",a2);
		pila.insert(a);
		a1 = ArbolB.nuevoArbol(null,"Anyora",null);
		a2 = ArbolB.nuevoArbol(null,"Abel",null);
		a = ArbolB.nuevoArbol(a1,"M Jesus",a2);
		pila.insert(a);
		a2 = (Nodo) pila.remove();
		a1 = (Nodo) pila.remove();
		a = ArbolB.nuevoArbol(a1,"Esperanza",a2);
		arbol1 = new ArbolB(a);
		arbol1.inordenImprimir();
		arbol1.postordenImprimir();
		arbol1.preordenImprimir();
	}

}
