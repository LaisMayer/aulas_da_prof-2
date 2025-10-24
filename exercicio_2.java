import java.util.Scanner;

public class exercicio_2 {
    final static  Scanner LER = new Scanner(System.in);
    public static void main(String[] args) {
        
        int valorInicial = 0;
        System.out.println("Digite o primeiro valor de um intervalo: ");
        valorInicial = LER.nextInt();
        
        int valorFinal = 0;
        System.out.println("Digite o ultimo valor de um intervalo: ");
        valorFinal = LER.nextInt();

        
        int valor = 0;
        valor = somatorioIntervalo(valorInicial, valorFinal);
        System.out.println(valor);
        
        
    }
    public static int somatorioIntervalo(int valorInicial, int valorFinal ) {
        int i = valorInicial;
        // int sum = 0;
        int somatorio = 0;
        while (i != valorFinal) {
         somatorio += i;
            i++;
        }
        return somatorio ;
    }
}