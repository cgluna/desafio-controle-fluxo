import java.util.Scanner;
public class Contador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Insira dois números para que o programa subtraia o primeiro do segundo e conte de 1 até o resultado da subtração: ");
        int primeiroNumero = scanner.nextInt();

        System.out.println("Insira o segundo número, que deve ser maior que do que o primeiro: ");
        int segundoNumero = scanner.nextInt();
        
        try {
            contar(primeiroNumero, segundoNumero);
        }catch(ParametrosInvalidosException exception) {
            System.out.println(exception.getMessage());
        }
    }

    private static void contar(int primeiroNumero, int segundoNumero) throws ParametrosInvalidosException {
        if (primeiroNumero >= segundoNumero) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }

        int contagem = segundoNumero - primeiroNumero;
        for (int i = 1; i <= contagem; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }
}
