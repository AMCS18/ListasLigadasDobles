package listasligadasDobles;

public class ListaDoble {
    private NodoDoble primerNodo;
    private NodoDoble ultimoNodo;

    public void insertaPrimerNodo(String dato) {
        NodoDoble nuevoNodo = new NodoDoble(dato);

        if (primerNodo == null) {
            primerNodo = nuevoNodo;
            ultimoNodo = nuevoNodo;
        } else {
            nuevoNodo.siguiente = primerNodo;
            primerNodo.anterior = nuevoNodo;
            primerNodo = nuevoNodo;
        }
    }

    public void insertaAntesPrimerNodo(String dato) {
        NodoDoble nuevoNodo = new NodoDoble(dato);

        if (primerNodo == null) {
            primerNodo = nuevoNodo;
            ultimoNodo = nuevoNodo;
        } else {
            nuevoNodo.siguiente = primerNodo;
            primerNodo.anterior = nuevoNodo;
            primerNodo = nuevoNodo;
        }
    }

    public void insertaAlFinal(String dato) {
        NodoDoble nuevoNodo = new NodoDoble(dato);

        if (ultimoNodo == null) {
            primerNodo = nuevoNodo;
            ultimoNodo = nuevoNodo;
        } else {
            nuevoNodo.anterior = ultimoNodo;
            ultimoNodo.siguiente = nuevoNodo;
            ultimoNodo = nuevoNodo;
        }
    }

    public void insertarAntesUltimoNodo(String dato) {
        NodoDoble nuevoNodo = new NodoDoble(dato);

        if (ultimoNodo == null) {
            primerNodo = nuevoNodo;
            ultimoNodo = nuevoNodo;
        } else {
            nuevoNodo.siguiente = ultimoNodo;
            nuevoNodo.anterior = ultimoNodo.anterior;

            if (ultimoNodo.anterior != null) {
                ultimoNodo.anterior.siguiente = nuevoNodo;
            } else {
                primerNodo = nuevoNodo;
            }

            ultimoNodo.anterior = nuevoNodo;
        }
    }

    public void insertaEntreNodos(String dato, String datoAnterior) {
        NodoDoble nuevoNodo = new NodoDoble(dato);
        NodoDoble nodoAnterior = buscarNodoPorDato(datoAnterior);

        if (nodoAnterior != null) {
            nuevoNodo.siguiente = nodoAnterior.siguiente;
            nuevoNodo.anterior = nodoAnterior;
            nodoAnterior.siguiente = nuevoNodo;

            if (nuevoNodo.siguiente != null) {
                nuevoNodo.siguiente.anterior = nuevoNodo;
            } else {
                ultimoNodo = nuevoNodo;
            }
        } else {
            System.out.println("Nodo anterior no encontrado");
        }
    }

    public void insertaAntesPrimerNodo(String dato, String datoSiguiente) {
        NodoDoble nuevoNodo = new NodoDoble(dato);
        NodoDoble nodoSiguiente = buscarNodoPorDato(datoSiguiente);

        if (nodoSiguiente != null) {
            nuevoNodo.siguiente = nodoSiguiente;
            nuevoNodo.anterior = nodoSiguiente.anterior;
            nodoSiguiente.anterior = nuevoNodo;

            if (nuevoNodo.anterior != null) {
                nuevoNodo.anterior.siguiente = nuevoNodo;
            } else {
                primerNodo = nuevoNodo;
            }
        } else {
            System.out.println("Nodo siguiente no encontrado");
        }
    }

    // Métodos anteriores

    public void imprimir() {
        NodoDoble actual = primerNodo;

        while (actual != null) {
            System.out.print(actual.dato + " ");
            actual = actual.siguiente;
        }

        System.out.println();
    }

    public void borrarPrimerNodo() {
        if (primerNodo != null) {
            primerNodo = primerNodo.siguiente;

            if (primerNodo != null) {
                primerNodo.anterior = null;
            } else {
                ultimoNodo = null;
            }
        }
    }

    public void borrarUltimoNodo() {
        if (ultimoNodo != null) {
            ultimoNodo = ultimoNodo.anterior;

            if (ultimoNodo != null) {
                ultimoNodo.siguiente = null;
            } else {
                primerNodo = null;
            }
        }
    }

    public void borrarCualquierNodo(String dato) {
        NodoDoble nodoABorrar = buscarNodoPorDato(dato);

        if (nodoABorrar != null) {
            if (nodoABorrar.anterior != null) {
                nodoABorrar.anterior.siguiente = nodoABorrar.siguiente;
            } else {
                primerNodo = nodoABorrar.siguiente;
            }

            if (nodoABorrar.siguiente != null) {
                nodoABorrar.siguiente.anterior = nodoABorrar.anterior;
            } else {
                ultimoNodo = nodoABorrar.anterior;
            }
        } else {
            System.out.println("Nodo no encontrado");
        }
    }

    public NodoDoble buscarPorPosicion(int posicion) {
        NodoDoble actual = primerNodo;
        int contador = 0;

        while (actual != null && contador < posicion) {
            actual = actual.siguiente;
            contador++;
        }

        return actual;
    }

    public void intercambiarNodos(String nodoBuscadoDato, String nuevoDato) {
        NodoDoble nodoBuscado = buscarNodoPorDato(nodoBuscadoDato);

        if (nodoBuscado != null) {
            nodoBuscado.dato = nuevoDato;
        } else {
            System.out.println("Nodo no encontrado");
        }
    }

    private NodoDoble buscarNodoPorDato(String dato) {
        NodoDoble actual = primerNodo;

        while (actual != null && !actual.dato.equals(dato)) {
            actual = actual.siguiente;
        }

        return actual;
    }
}
