import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int sayi= scanner.nextInt();
        int toplam=0;
        for (int i=1;i<sayi;i++){
            if (sayi%i==0)
                toplam=toplam + i;
        }
        if (sayi==toplam){
            System.out.println("sayı mükemmel sayıdır");
        }else {
            System.out.println("sayı mükemmel sayı değildir");
        }
    }
}