package exemplosOO;

import java.util.Scanner;

public class ProgramaCalculadora {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("Programa Calculadora !");
        System.out.println("Op��es:");
        System.out.println("1-Somar");
        System.out.println("2-Subtrair");
        System.out.println("3-Multiplicar");
        System.out.println("4-Dividir");
        System.out.println("5-Sair");
        System.out.println("Digite uma op��o: ");
        int opcao = teclado.nextInt();
        Calculadora cal = new Calculadora();
        while(opcao != 5) {
            switch(opcao) {
            case 1: {
                System.out.println("Digite o primeiro n�mero: ");
                double numero1 = teclado.nextDouble();
                System.out.println("Digite o primeiro n�mero: ");
                double numero2 = teclado.nextDouble();
                System.out.println("Resultado: " + cal.somar(numero1, numero2));
                break;
            }
            case 2: {
                System.out.println("Digite o primeiro n�mero: ");
                double numero1 = teclado.nextDouble();
                System.out.println("Digite o primeiro n�mero: ");
                double numero2 = teclado.nextDouble();
                System.out.println("Resultado: " + cal.subtrair(numero1, numero2));
                break;
            }
            case 3: {
                System.out.println("Digite o primeiro n�mero: ");
                double numero1 = teclado.nextDouble();
                System.out.println("Digite o primeiro n�mero: ");
                double numero2 = teclado.nextDouble();
                System.out.println("Resultado: " + cal.multiplicar(numero1, numero2));
                break;
            }
            case 4: {
                System.out.println("Digite o primeiro n�mero: ");
                double numero1 = teclado.nextDouble();
                System.out.println("Digite o primeiro n�mero: ");
                double numero2 = teclado.nextDouble();
                System.out.println("Resultado: " + cal.dividir(numero1, numero2));
                break;
            }
            default: {
                System.out.println("Op��o invalida!");
            }
            }
            System.out.println("Programa Calculadora !");
            System.out.println("Op��es:");
            System.out.println("1-Somar");
            System.out.println("2-Subtrair");
            System.out.println("3-Multiplicar");
            System.out.println("4-Dividir");
            System.out.println("5-Sair");
            System.out.println("Digite uma op��o: ");
            opcao = teclado.nextInt();
        }
    }

}