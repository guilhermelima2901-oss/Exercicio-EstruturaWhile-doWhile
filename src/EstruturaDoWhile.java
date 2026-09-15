import java.util.Scanner;

public class EstruturaDoWhile {
    static void main(String[] args) {
        //calculo de potência sem Math.pow

        Scanner scanner = new Scanner(System.in);

        int base, expoente, resultado;
        do {
            System.out.println("Informe o valor da base, tem que ser maior que zero: ");
            base = scanner.nextInt();
            if(base < 0) {
                System.out.println("Você digitou um valor inválido, por favor digite novamente ! \n##################################################");
            }
        }while(base < 0);


        do {
            System.out.println("Informe o valor do expoente, tem que ser maior que zero: ");
            expoente = scanner.nextInt();
            if(expoente < 0) {
                System.out.println("Você digitou um valor inválido, por favor digite novamente ! \n##################################################");
            }
        }while (expoente < 0);

        resultado = 1;

        while(expoente >= 1){
            resultado = base*resultado;
            expoente--;

        }
        System.out.println("Resultado: " + resultado);

    }


}


