import java.util.Scanner;

public class ViagensEurotrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor da viagem à Alemanha: ");
        double ValorAlemanha = scanner.nextDouble();
        System.out.println("Digite o valor da viagem à Portugal: ");
        double ValorPortugal = scanner.nextDouble();
        System.out.println("Digite o valor da viagem à Itália: ");
        double ValorItália = scanner.nextDouble();

        System.out.println("Quantas pessoas irão participar da viagem? ");
        int pessoas = scanner.nextInt();

        double valorTotalViagem = ValorAlemanha + ValorPortugal + ValorItália;

        System.out.printf("\nO valor total da viagem é R$%.2f", valorTotalViagem);
        System.out.printf("\nA quantidade de pessoas que irão nesta viagem é: %d", pessoas);
        scanner.close();
    }
}
