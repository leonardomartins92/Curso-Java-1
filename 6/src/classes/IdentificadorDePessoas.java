package classes;

public class IdentificadorDePessoas {
    public static String identificaPessoas(Object identificado) {
      String classe =  identificado.getClass().toString();
      return classe.replace("class classes.","");
    }
}
