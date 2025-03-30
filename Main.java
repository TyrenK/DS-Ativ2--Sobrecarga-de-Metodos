import java.util.Scanner;
public class Main {
    public static void main(String[]args){
        ConversorTemperatura conv = new ConversorTemperatura();
        Scanner scanner = new Scanner(System.in);
        int op = 0;
        double c = 0;
        double f = 0;
        double ar = 0;

        do{
            System.out.println("Bem-vindo ao Conversor de Temperatura! \n1 - Converter Celsius para Fahrenheit \n2 - Converter Fahrenheit para Celsius \n3 - Converter Celsius para Fahrenheit e arredondar o resultado\n4 - Sair");
            System.out.println("Escolha uma opção: ");
            op = scanner.nextInt();

            switch(op) {
                case 1:
                    System.out.println("Insira a temperatura em Celsius: ");
                    c = scanner.nextDouble();
                    f = conv.conversor(c);
                    System.out.println( c +"C = " + f +"F");
                break;

                case 2:
                    System.out.println("Insira a temperatura em Fahrenheit: ");
                    f = scanner.nextDouble();
                    c = conv.conversor(c, f);
                    System.out.println( f +"F = " + c +"C");
                break;

                case 3:
                    System.out.println("Insira a temperatura em Celsius: ");
                    c = scanner.nextDouble();
                    System.out.println("Insira o arredondamento desejado: ");
                    ar = scanner.nextDouble();
                    f = conv.conversor(c);
                    ar = conv.conversor(c, f, ar);
                    System.out.println(c + "C em Fahrenheit: "+ f +" \n"+ c +"C em Fahrenheit com arredondamento: "+ ar);
                break;

                case 4:
                    System.out.println("Saindo...");
                break;

                default:
                    System.out.println("Por favor, insira o número apenas de uma das opções acima.");
                break;
            }
        }while( op != 4);
        scanner.close();
    }
}
