package arbolesBinarios;

import java.util.Vector;

public class PilaVector {
	private static final int STAR = 19;
	private int cima;
	private Vector PilasL;

	/*Se define una constante STAR con un valor de 19, que indica el tamaño inicial del vector.
	Se declara una variable cima de tipo entero para rastrear la posición de la cima de la pila.
	Se declara una variable listaPila de tipo Vector para almacenar los elementos de la pila.*/

	public PilaVector(){
		cima = -1;
		PilasL = new Vector(STAR);
	}
	/*	El constructor de la clase PilaVector inicializa la cima en -1 
	 * y crea un nuevo vector listaPila con el tamaño inicial definido por la constante STAR.*/
	public void insert(Object elemento)throws Exception{
		cima++;
		PilasL.addElement(elemento);
	}
	public boolean Empy(){ 
		return cima == -1;
	}
	public Object remove() throws Exception{	
		Object aux;
		if (Empy()){
			throw new Exception ("NO SE PUEDE EXTRAER.");
		}
		aux = PilasL.elementAt(cima);
		PilasL.removeElementAt(cima);
		cima--;
		return aux;
	}

	public void cleanstack()throws Exception{
		while (! Empy())
			remove();
	}
	public Object topstack() throws Exception{	
		if (Empy()){
			throw new Exception ("NO SE PUEDE EXTRAER.");
		}
		return PilasL.elementAt(cima);
	}


}
