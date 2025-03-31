import java.util.Locale;
import java.util.Scanner;

public class BancoTerminal {


    public static void main(String[] args){
        int Numero ;
        String Agencia = "";
        String NomeCliente = "";
        float Saldo ;
        System.out.println("|---------------------------------------------------------------|");
        System.out.println("|--------------------TERMINAL BANCO DIO-------------------------|");
        System.out.println("|---------------------------------------------------------------|");
        var sc = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Por favor, digite o núomero da Agência !");
        Agencia = sc.nextLine();
        System.out.println("Por favor, digite o número da Conta !");
        var sc2 = new Scanner(System.in).useLocale(Locale.US);
        Numero = sc2.nextInt();
        System.out.println("Por favor, digite o Nome do Cliente !");
        NomeCliente = sc.nextLine();
        System.out.println(" O Saldo !");
        Saldo = sc.nextFloat();

        System.out.println("Olá "+NomeCliente+", obrigado por criar uma conta em nosso banco, sua agência é "+Agencia+", conta "+Numero+" e seu saldo "+Saldo+" já está disponível para saque ");

    }
}
