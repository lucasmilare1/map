package map;


import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class treeMap {
    public static void main(String[] args) {
        TreeMap<String, String>treeCapitais = new TreeMap<>();

        treeCapitais.put("RS", "Porto Alegre");
        treeCapitais.put("SC", "Santa Catarina");
        treeCapitais.put("PR","Curitiba");
        treeCapitais.put("SP", "São Paulo");
        treeCapitais.put("RJ","Rio de Janeiro");
        treeCapitais.put("MG", "Belo Horizonte");

        System.out.println(treeCapitais);

        //Retorna a primeira capital no topo da arvore
        System.out.println(treeCapitais.firstKey());

        //Retorna a ultima capital no final da arvore
        System.out.println(treeCapitais.lastKey());

        //Retorna a primeira capital abaixo na arvore da capital parametrizada
        System.out.println(treeCapitais.lowerKey("SC"));

        //Retorna a primeira capital acima na arvore da capital parametrizada
        System.out.println(treeCapitais.higherKey("SC"));

        // Exibe todas as capitais no console
        System.out.println(treeCapitais);

        //Retorna a primeira capital no topo da arvore
        System.out.println(treeCapitais.firstEntry().getKey() + "---"+ treeCapitais.firstEntry().getValue());

        //Retorna a ultima capital no final da arvore
        System.out.println(treeCapitais.lastEntry().getKey()+ "---" + treeCapitais.lastEntry().getValue());

        //Exibe todas as capitais no console
        System.out.println(treeCapitais);

        //Navega em todas as chaves do iterator
        Iterator<String> iterator = treeCapitais.keySet().iterator();

        while (iterator.hasNext()){
            String key = iterator.next();
            System.out.println(key + "--" + treeCapitais.get(key));
        }

        for (String capital : treeCapitais.keySet() ){
            System.out.println(capital + "--" + treeCapitais.get(capital));
        }

        for (Map.Entry<String,String> capital : treeCapitais.entrySet()){
            System.out.println(capital.getKey() + "--" + capital.getValue());

        }
    }
}
