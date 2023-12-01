package listasligadasDobles;

public class UsaListaDoble {

    public static void main(String[] args) {
        ListaDoble lista = new ListaDoble();

        lista.insertaPrimerNodo("R");
        lista.imprimir();

        lista.insertaPrimerNodo("F");
        lista.imprimir();

        lista.insertaAntesPrimerNodo("H");
        System.out.println("Después de insertar antes del primer nodo:");
        lista.imprimir();

        lista.insertaAlFinal("Z");
        System.out.println("Después de insertar al final:");
        lista.imprimir();

        lista.insertarAntesUltimoNodo("X");
        System.out.println("Después de insertar antes del último nodo:");
        lista.imprimir();

        lista.insertaEntreNodos("T", "R");
        System.out.println("Después de insertar entre nodos:");
        lista.imprimir();

        lista.insertaAntesPrimerNodo("K");
        System.out.println("Después de insertar antes del primer nodo nuevamente:");
        lista.imprimir();

        lista.insertaAlFinal("Ñ");
        System.out.println("Después de insertar al final nuevamente:");
        lista.imprimir();

        lista.borrarPrimerNodo();
        System.out.println("Después de borrar el primer nodo:");
        lista.imprimir();

        lista.borrarUltimoNodo();
        System.out.println("Después de borrar el último nodo:");
        lista.imprimir();

        lista.borrarCualquierNodo("R");
        System.out.println("Después de borrar un nodo cualquiera (R):");
        lista.imprimir();

        // Buscar un nodo por posición (ejemplo: posición 2)
        NodoDoble nodoEnPosicion2 = lista.buscarPorPosicion(2);
        if (nodoEnPosicion2 != null) {
            System.out.println("Nodo en posición 2: " + nodoEnPosicion2.dato);
        } else {
            System.out.println("Posición no válida");
        }

        // Intercambiar un nodo por otro buscado (ejemplo: intercambiar "X" por "Y")
        lista.intercambiarNodos("X", "Y");
        System.out.println("Después de intercambiar nodos:");
        lista.imprimir();
    }
}
