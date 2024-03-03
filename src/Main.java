import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Define variable
        int mat, physic, chem, turkish, history, music;

        //Define scanner class
        Scanner inp = new Scanner(System.in);

        //Import values from user
        System.out.print("Math Score :");
        mat=inp.nextInt();

        System.out.print("Physic Score :");
        physic=inp.nextInt();

        System.out.print("Chem Score :");
        chem=inp.nextInt();

        System.out.print("History Score :");
        history=inp.nextInt();

        System.out.print("Turkish Score :");
        turkish=inp.nextInt();

        System.out.print("Music Score :");
        music=inp.nextInt();

        int toplam = (mat + physic + chem + turkish + history + music);
        double ortalama = toplam / 6;
        System.out.println("Not Ortalamanız : " + ortalama);
        String sonuc = (ortalama >=60) ? "Geçtiniz" : "Kaldınız" ;
        System.out.println(sonuc);




    }
}