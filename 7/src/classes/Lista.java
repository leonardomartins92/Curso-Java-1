package classes;

import java.util.ArrayList;

public class Lista {
    public static void adiciona(ArrayList lista, Object objetoAdicionar ){
        lista.add(objetoAdicionar);
    }
    public static void remove(ArrayList lista, Object objetoRemover ){
        lista.remove(objetoRemover);
    }
    public static boolean consulta(ArrayList lista, Object objetoConsultado ){
        if (lista.contains(objetoConsultado)) {
            return true;
        } else {
            return false;
        }
    }
    //terminar
    public static void lista(){

    }
}
