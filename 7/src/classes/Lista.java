package classes;

import java.util.ArrayList;

public class Lista<E> {
    private ArrayList<E> lista = new ArrayList();

    public void adiciona(E elemento ){
        lista.add(elemento);
    }
    public void remove(E elemento ){
        lista.remove(elemento);
    }
    public String consulta(E elemento ){
        if (lista.contains(elemento)) {
            return "Sim";
        } else {
            return "Não";
        }
    }
    public ArrayList<E> listar(){
        return (ArrayList<E>) lista.clone();
    }
}
