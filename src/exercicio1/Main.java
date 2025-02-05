package exercicio1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Entre com o nome seperado por ponto e virgula: ");

        String nome = System.console().readLine();
        String[] partes = nome.split(";");
        List<String> nomes = new ArrayList<>();

        for(String parte : partes) {
            nomes.add(parte);
        }

        Collections.sort(nomes);
        System.out.println(nomes);
    }
}
