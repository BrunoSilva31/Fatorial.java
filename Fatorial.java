import java.util.Scanner;

public class For5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

        System.out.println("Digite o número que deseja o fatorial: ");
		int n = sc.nextInt();
		int calc = 1;

		for (int i = n; i > 0; i--) {
			calc = calc * i;
		}
		
        System.out.println("O fatorial de " + n + " é: " + calc);
		
		sc.close();
	}
}
