import java.util.Scanner;

public class EstruturaWhile {
    static void main() {
        //tentar acertar a senha até acabar o número de tentativas

        Scanner scanner = new Scanner(System.in);
        String senhaCorreta = "Java21";
        String senhaDigitou;
        int tentativasRestantes = 3;

        while(tentativasRestantes > 0) {

            System.out.println("Digite a senha: ");
            senhaDigitou = scanner.nextLine();

            if (senhaDigitou.equalsIgnoreCase(senhaCorreta)) {
                System.out.println("Acesso liberado");
                return;
            } else {
                tentativasRestantes--;
                System.out.println("Senha incorreta! Tentativas restante: " + tentativasRestantes);
            }
        }
        if (tentativasRestantes == 0){
            System.out.println("conta bloqueada!");
        }

    }
}
