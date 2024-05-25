package ödev;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ödev {

    public static void main(String[] args) throws IOException {
        Scanner key = new Scanner(System.in);
        System.out.println("olusturmak istediginiz dosyanin adini giriniz");
        String dosyaadi = key.next();
        String dosya= "C:\\Users\\sedat\\OneDrive\\Masaüstü\\"+dosyaadi+".txt";

        System.out.println("dosyanizin icine bosluk birakana kadar yazmak istediklerinizi girin");
        FileWriter dosyayazici = new FileWriter(dosya);
        dosyayazici.write(key.next());
        dosyayazici.close();
        System.out.println("graminiz kac olacak");
        int gram = key.nextInt();

        
         

      FileReader dosyaokuma= new FileReader(dosya);
       BufferedReader bufRead = new BufferedReader(dosyaokuma);

        Scanner giris = new Scanner(bufRead);
        String satir1 = giris.next();
        int satiruzunlugu = satir1.length();

        String[] dizi = new String[satiruzunlugu];
        int a=0;
        for (int i = 0; i < satiruzunlugu-(gram-1); i++) {
        dizi[i]=satir1.substring(a, a+gram);
        a=a+(gram-1);
            System.out.println("dizi "+i+"= "+dizi[i]);
            }
        bufRead.close();
        String butun=" ";
        for(int i = 0; i < satiruzunlugu-(gram-1); i++){
        butun=butun.concat(dizi[i]).concat(" ");
        }
        
          String ngram=dosyaadi+"ngram";
          String dosya1= "C:\\Users\\sedat\\OneDrive\\Masaüstü\\"+dosyaadi+"ngram.txt";
        FileWriter dosyayazici2 = new FileWriter(dosya1);
        dosyayazici2.write(butun);
       
        
        dosyayazici2.close();
        

    }
   }


