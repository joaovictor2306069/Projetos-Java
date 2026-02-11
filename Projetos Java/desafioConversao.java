import java.util.Scanner;
public class desafioConversao {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite o valor do primeiro salario : ");
        String salario1 = entrada.next().replace(",",".");

        System.out.println("Digite o valor do segundo salario : ");
        String salario2 = entrada.next().replace(",",".");

        System.out.println("Digite o valor do terceiro salario : ");
        String salario3 = entrada.next().replace(",",".");

        double salario1Double = Double.parseDouble(salario1);
        double salario2Double = Double.parseDouble(salario2);
        double salario3Double = Double.parseDouble(salario3);
        


        double media = (salario1Double + salario2Double + salario3Double) / 3;
        System.out.printf("A media salarial e de: %.2f", media);

        entrada.close();

    
    
    }
}
