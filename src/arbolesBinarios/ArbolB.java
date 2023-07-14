package arbolesBinarios;
public class ArbolB {
	Implementacion_inorden ola = new Implementacion_inorden();
	Implementacion_postorden ola1 = new Implementacion_postorden();
	Implementacion_preorden ola2 = new Implementacion_preorden();
	protected Nodo Raiz;
	public ArbolB(){
		Raiz = null;
	}

	public static Nodo nuevoArbol(Nodo RI, Object dato, Nodo RD){
		return new Nodo(RI, dato, RD);
	}
	public Nodo getRaiz() {
		return Raiz;
	}
	public void setRaiz(Nodo Raiz) {
		this.Raiz = Raiz;
	}

	public ArbolB(Nodo Raiz){
		this.Raiz = Raiz;
	}
	public Nodo RaizA(){
		return Raiz;
	}
	boolean Empy(){
		return Raiz == null;
	}

	public void inordenImprimir() {
		System.out.println("SE A REALIZADO EL RECORRIDO EN INORDEN");
		ola.inorden(Raiz);
	}

	public void postordenImprimir() {
		System.out.println("SE AREALIZADO EL RECORRIDO POSTORDEN");

		ola1.postorden(Raiz);
	}

	public void preordenImprimir() {
		System.out.println("SE AREALIZADO EL RECORRIDO PRORDEN");
		ola2.preorden(Raiz);
	}
}
