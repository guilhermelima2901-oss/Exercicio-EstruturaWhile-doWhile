import java.util.Scanner;

public class Exercicio {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        int tabuada = 0;
        int resultado;

        System.out.println("Olá vamos calcular a tabuada ? Qual número você quer descobrir a tabuada ?.");
        number = scanner.nextInt();

        while(tabuada <= 10){
            resultado = number*tabuada;
            System.out.println(number +" x "+ tabuada+" = "+resultado);
            tabuada++;

        }

        int Opçao;

        do{
            System.out.println("\n========MENU========\nOpção 1: continuar \nOpção55 2: Sair");
            Opçao = scanner.nextInt();
            if(Opçao == 1){
                String frase;
                System.out.println("Digite uma frase:");
                frase = scanner.next();

            }else if (Opçao == 2){
                System.out.println("Obrigado por utilizar o nosso sistema, espero que tenha gostado.");

            }else {
                System.out.println("Opção inválida");
            }

        }while(Opçao != 2 );

    }
}
