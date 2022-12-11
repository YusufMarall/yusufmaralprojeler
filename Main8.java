import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int sayi1=(int)(Math.random()*10);
        int sayi2=(int)(Math.random()*10);

        System.out.println(sayi1+"-"+sayi2+"nedir?");
        Scanner giris= new Scanner(System.in);
        int cevap=giris.nextInt();
        if(sayi1-sayi2==cevap){
            System.out.println("dogru");
        }
        else{
            System.out.println("cevap yanlış");
        }

        }
    }
