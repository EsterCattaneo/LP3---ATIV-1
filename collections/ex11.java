package exercicios.array.collections;

import java.util.HashMap;
import java.util.Map;

public class ex11 {

    public static void main(String[] args) {
        // Cria um mapa que mapeia nomes de pessoas (Strings) para suas idades (Integers)
        Map<String, Integer> ageMap = new HashMap<>();

        // Adicionando três pares de chave-valor ao mapa
        ageMap.put("Ester", 20);
        ageMap.put("Sara", 24);
        ageMap.put("Giovana", 21);

        // Exibe a idade associada a "Ester"
        System.out.println("Idade da Ester: " + ageMap.get("Ester"));
    }
}
