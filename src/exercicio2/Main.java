package exercicio2;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        System.out.println("Entre com o Nome e sexo separado por traço e separe o nome por virgula: ");
        String input = System.console().readLine();

        String[] pessoas = input.split(",");

        List<String> feminino = new ArrayList<>();
        List<String> masculino = new ArrayList<>();

        for (String pessoa : pessoas) {
            String[] partes = pessoa.split("-");
            String nome = partes[0];
            String sexo = partes[1];

            if (sexo.equals("F")) {
                feminino.add(nome);
            } else {
                masculino.add(nome);
            }
        }
        System.out.println("Feminino: " + feminino);
        System.out.println("Masculino: " + masculino);

    }
}
