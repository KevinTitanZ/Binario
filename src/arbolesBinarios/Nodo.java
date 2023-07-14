package arbolesBinarios;


public class Nodo {

	protected Object dato;
	protected Nodo izdo;
	protected Nodo dcho;

	/* Se define la clase Nodo con tres atributos protegidos: dato, izdo y dcho. El atributo dato almacena el valor del nodo, 
	 * mientras que izdo y dcho son referencias a los nodos hijos izquierdo y derecho respectivamente.  */
	public Nodo(Object valor){
		dato = valor;
		izdo = dcho = null;
	}
	/* El constructor Nodo crea un nodo con un valor dado. 
	 * Inicializa las referencias izdo y dcho como null, indicando que el nodo no tiene hijos en ese momento.*/
	public Nodo(Nodo ramaIzdo, Object valor, Nodo ramaDcho){
		dato= valor;
		izdo = ramaIzdo;
		dcho = ramaDcho;
	}
	/*Estos métodos permiten modificar el valor del nodo, 
	 el nodo hijo izquierdo y el nodo hijo derecho respectivamente.*/
	public Object getDato() {
		return dato;
	}
	public void setDato(Object dato) {
		this.dato = dato;
	}
	public Nodo getIzdo() {
		return izdo;
	}
	public void setIzdo(Nodo izdo) {
		this.izdo = izdo;
	}
	public Nodo getDcho() {
		return dcho;
	}
	public void setDcho(Nodo dcho) {
		this.dcho = dcho;
	}
	/* El constructor Nodo crea un nodo con un valor dado y establece los nodos hijos izquierdo y derecho. 
	 * Permite construir un nodo con sus subárboles ya existentes.  */
	public Object valorNodo(){ 
		return dato; 
	}
	public Nodo subarbolIzdo(){ 
		return izdo; 
	}
	public Nodo subarbolDcho(){ 
		return dcho; 
	}
	/*Estos métodos permiten acceder a los valores y subárboles del nodo. valorNodo devuelve 
	 * el valor almacenado en el nodo, subarbolIzdo devuelve 
	 * el nodo hijo izquierdo y subarbolDcho devuelve el nodo hijo derecho.*/
	public void nuevoValor(Object d){ 
		dato = d; 
	}
	public void ramaIzdo(Nodo n){ 
		izdo = n; 
	}
	public void ramaDcho(Nodo n){ 
		dcho = n; 
	}
	/*Estos son los métodos de acceso y modificación (getters y setters)
	 *  para los atributos dato, izdo y dcho. 
	 *  Permiten obtener y establecer los valores de los atributos de un objeto Nodo.   */
	@Override
	public String toString() {
		return "[dato=" + dato + ", izdo=" + izdo + ", dcho=" + dcho + "]";
	}

}
