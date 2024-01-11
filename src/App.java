import java.io.BufferedReader;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int x = 0;
        int y = 1;

        for (int i = 1; i <= a; i++) {
            if (i != a) {
                System.out.print(x + " ");
            } else {
                System.out.println(x);
            }
            int soma = x + y;
            x = y;
            y = soma;
        }
    }
}
