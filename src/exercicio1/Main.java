package exercicio1;

public class Main {
    public static void main(String[] args) {
        System.out.println("Entre com o nome seperado por ponto e virgula: ");

        String nome = System.console().readLine();
        String[] partes = nome.split(";");

        for (int i = 0; i < partes.length; i++) {
            System.out.println(partes[i]);
        }
    }
}
