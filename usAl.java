package kitapSonuOrnekleri;

import java.util.Scanner;

public class usAl { //sınıf adı
    //özyinelemeli us fonksiyonu
    public static double Us(int N) {
        if (N == 0)
            return 1;
        else
            return 2*Us(N-1);
    }
    //ANA PROGRAM
    public static void main(String[] args) {
        System.out.printf("n değeri:");
        Scanner gir = new Scanner(System.in);
        int n = gir.nextInt();
        System.out.println(Us(n));
    }
}
