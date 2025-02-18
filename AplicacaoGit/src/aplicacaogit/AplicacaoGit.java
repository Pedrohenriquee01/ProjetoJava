package aplicacaogit;
import java.util.Scanner;
public class AplicacaoGit {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Minha primeiro software"
                + " versionado com Git, hospedado no github!");
        System.out.println("Digite o priemrio valor");
        int numero1 =scan.nextInt();
        System.out.println("Digite o segundo valor");
        int numero2 = scan.nextInt();
        System.out.println("A soma é" + (numero1 + numero2));
    }
    
}
