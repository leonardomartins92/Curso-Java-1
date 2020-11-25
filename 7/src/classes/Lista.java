package classes;

import java.util.ArrayList;

public class Lista<E> {
    private ArrayList<E> listaElemento = new ArrayList();

    public void adiciona(E elemento ){
        listaElemento.add(elemento);
    }
    public void remove(E elemento ){
        listaElemento.remove(elemento);
    }
    public String consulta(E elemento ){
        if (listaElemento.contains(elemento)) {
            return "Sim";
        } else {
            return "Não";
        }
    }
    public ArrayList<E> listar(){
        return (ArrayList<E>) listaElemento.clone();
    }
}
