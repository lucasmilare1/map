package map;

import java.util.Hashtable;
import java.util.Map;

public class hashTrable {

    public static void main(String[] args) {

        Hashtable<String,Integer> estudantes = new Hashtable<>();

        estudantes.put("Lucas", 21);
        estudantes.put("Debora", 33);
        estudantes.put("Rafaela", 18);
        estudantes.put("Pedro", 44);

        System.out.println(estudantes);

        estudantes.put("Pedro", 55);

        System.out.println(estudantes);

        //Remove um estudante no indice 0
        estudantes.remove("Pedro");

        System.out.println(estudantes);

        //Recupera um estudante no indice 2:
        int idadeEstudante = estudantes.get("Debora");
          System.out.println(idadeEstudante);

          System.out.println(estudantes);

        //Navega nos registros do mapa
        for (Map.Entry<String, Integer> entry: estudantes.entrySet()){
            System.out.println(entry.getKey() + "--" + entry.getValue());
        }

        //Navega nos registro do mapa
        for (String key : estudantes.keySet()){
            System.out.println(key + "--" + estudantes.get(key));
        }

        System.out.println(estudantes);

    }
}
