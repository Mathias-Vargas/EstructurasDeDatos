/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Jeffrey Mojica S
 */
public class Cola {

    private Nodo frente;
    private Nodo ultimo;

    String Cola = "";

    public Cola() {
        frente = null;
        ultimo = null;
    }

    public void encola(Nodo d) {
        if (frente == null) {  // significa que la cola esta vacia
            frente = d; //Nodo es igual a frente
            ultimo = d; // Nodo es igual ultimo
        } else {
            ultimo.setAtras(d); //Coloca el nodo de ultimo
            ultimo = d; //D es ahora el ultimo
        }
    }

    public Nodo atiende() {
        Nodo aux = frente; //Creamos un nodo auxiliar
        if (frente != null) { //Igualamos si frente es diferente de nulo
            frente = frente.getAtras();//Frente toma el valor del nodo atras
            aux.setAtras(null);
        }
        return aux;
    }

    public boolean encuentra(int reference) {
        // Crea una copia de la cola
        Nodo aux = frente;
        // Bandera para verificar si exist el elemento a search.
        boolean exist = false;
        // Recorre la cola hasta llegar encontrar el nodo o llegar al final
        // de la cola.
        while (exist != true && aux != null) {
            // Compara si el value del nodo es igual que al de reference.
            if (reference == aux.getCedula()) {
                // Cambia el value de la bandera.
                exist = true;
            } else {
                // Avanza al siguiente node.
                aux = aux.getAtras();
            }
        }
        // Retorna el value de la bandera.
        return exist;
    }

    //Pasamos los datos por parametro
    public void pedir(int cedula, String nombre, boolean reference) {

        Nodo frente_aux = frente; // Secrean nodos auxiliares
        Nodo ultimo_aux = ultimo;

        Nodo discapacidad = new Nodo(); //Creación de un nodo
        discapacidad.setDiscapacidad(reference); // Se asigna el valor

        Nodo name = new Nodo(); //Creación de un nodo
        name.setNombre(nombre); // Se asigna el valor

        Nodo id = new Nodo();
        id.setCedula(cedula);

        if (discapacidad.isDiscapacidad() != false) {

            frente = discapacidad; // Nodo es igual a frente
            discapacidad.setAtras(frente_aux); // Pasamos el valor para arriba

            frente = id; // Nodo es igual a frente
            id.setAtras(ultimo_aux); // Pasamos el valor para arriba

            frente = name;
            name.setAtras(frente_aux);

        }

    }

    @Override
    public String toString() {
        String s = "";
        Nodo aux = frente;
        while (aux != null) {
            s += aux + "\n";
            aux = aux.getAtras();
        }
        return s;
    }

}
