package org.example;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       double Boy,kilo,index;
       Scanner input=new Scanner(System.in);
        System.out.print("Boy ölcünüz:");
        Boy=input.nextDouble();
        System.out.print("Kilonuzu belirtiniz:");
        kilo=input.nextDouble();
        index= kilo / (Boy*Boy);
        System.out.print("Boy Kilo indexsiniz:"+index);

    }
}