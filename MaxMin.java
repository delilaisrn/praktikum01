import java.util.Scanner;

public class MaxMin {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("nilai a: ");
        int a = input.nextInt();

        System.out.print("nilai b: ");
        int b = input.nextInt();

        System.out.print("nilai c: ");
        int c = input.nextInt();

        System.out.print("nilai d: ");
        int d = input.nextInt();

        int max;
        int min;
        
        if (a >= b && a >= c && a >= d) {
            max = a;
        } else if (b >= a && b >= c && b >= d) {
            max = b;
        } else if (c >= a && c >= b && c >= d) {
            max = c;
        } else {
            max = d;
        }

        if (a <= b && a <= c && a <= d) {
            min = a;
        } else if (b <= a && b <= c && b <= d) {
            min = b;
        } else if (c <= a && c <= b && c <= d) {
            min = c;
        } else {
            min = d;
        }

        System.out.println("nilai terbesarnya adalah: "+ max);
        System.out.println("nilai terkecilnya adalah: "+ min);

        input.close();
    }
}