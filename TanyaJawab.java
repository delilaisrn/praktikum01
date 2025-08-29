import java.util.Scanner;

public class TanyaJawab {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan sebuah kalimat: ");
        String kalimat = input.nextLine();

        int jumlahHuruf = kalimat.length();

        int randomNum1 = (int)(Math.random() * (jumlahHuruf + 1));
        int randomNum2 = randomNum1 + (int)(Math.random() * (jumlahHuruf - randomNum1) + 1);

        System.out.printf("Apa substring dari indeks %s hingga %d ? ", randomNum1, randomNum2);
        String jawaban = input.nextLine();

        String jawabanBenar = kalimat.substring(randomNum1, randomNum2 + 1);

        if (jawaban.equals(jawabanBenar)){
            System.out.println("\u2713 Benar! Keren, kamu jago string!");
        } else {
            System.out.println("\u2717 Kurang tepat. Jawaban yang benar: "+ jawabanBenar);
        }

        input.close();
    }
}
