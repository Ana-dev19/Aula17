import java.util.Scanner;

public class ExDois {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Entre Com Seu Nome ");
        String nome = input.next();

        String retornoNome = dizerInformacao(nome);
        System.out.println(retornoNome);

        System.out.println("Entre Com Idade ");
        String idade = input.next();

        System.out.println("Entre Com Peso");
        String peso = input.next();

        System.out.println("Entre com altura");
        String altura = input.next();

        }

    public static String dizerInformacao(String nome) {
        return "Meu nome é " + nome;
    }

    public static String dizerInformacao(Int idade) {
        return "Minha idade é " + idade;
    }

    public static String dizerInformacao(double peso, double altura) {
        return "Meu peso é" + peso + "e minha altura é" + altura;
    }

}