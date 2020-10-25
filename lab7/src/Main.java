
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        FormatadorDeTexto formatador = new FormatadorDeTexto();

        System.out.println("Digite o texto: ");
        String texto = input.nextLine();

        formatador.setTexto(texto);
        IFormataTexto negrito = new Negrito();
        IFormataTexto italico = new Italico();
        IFormataTexto alta = new CaixaAlta();

        System.out.println(formatador.getTextoFormatado(negrito));
        System.out.println("____________");
        System.out.println(formatador.getTextoFormatado(italico));
        System.out.println("____________");
        System.out.println(formatador.getTextoFormatado(alta));
        System.out.println("____________");
    }
}
