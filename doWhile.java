import java.util.Scanner;
public class doWhile {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String texto = "";
        do {
            System.out.println("Digite um texto (ou 'sair' para encerrar): ");
            texto = entrada.nextLine();
            System.out.println("Você digitou: " + texto);
        } while (!texto.equalsIgnoreCase("sair"));      
        System.out.println("Programa encerrado.");
        entrada.close();
        
    }
}