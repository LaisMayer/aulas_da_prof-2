import java.util.Scanner;

public class exercicio_3 {
    final static Scanner LER = new Scanner(System.in);
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        String name = LER.nextLine();
        System.out.println(name);

        for (int i = 1; i == 10; i++) {
            System.out.println(i + "-"+ name);
        }

    }
}
// for (int mensagem = 0; mensagem <= 20; mensagem++) {
//     System.out.println("“Esta é a mensagem " + mensagem);
// }