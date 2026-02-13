
import java.util.Scanner;

public class DesafioWhile {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
         int numero = 0; // contador de notas válidas
         double nota = 0;  // variável para armazenar a nota digitada
         double total = 0; // variável para acumular a soma das notas válidas

         while (nota != -1) { // condição de parada
             System.out.println("Digite a nota do aluno : ");
             nota = entrada.nextDouble();
                if (nota <= 10 && nota >= 0) { // verifica se a nota é válida
                    total += nota;
                    numero++;
                }
            }

             double media = total / numero; // calculo da media
             System.out.println("A média das notas é: " + media);
             entrada.close();   

             }

    }   

