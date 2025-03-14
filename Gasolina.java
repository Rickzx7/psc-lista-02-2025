import java.util.Scanner;

public class Gasolina {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o preço do litro da gasolina: ");
        double precoGasolina = scanner.nextDouble();

        System.out.println("Digite a quantidade de litros de gasolina vendidos ao cliente:  ");
        double litroVendido = scanner.nextDouble();

        double result = precoGasolina * litroVendido;

        System.out.printf("O cliente devera pagar R$%.2f pela gasolina", result);
        scanner.close();
    }
}
