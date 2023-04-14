package util;

import Main.MenuUtil;
import java.util.Scanner;

public class BankUtil {

    public static void kredit() {
        Scanner sc = new Scanner(System.in);

        double mebleg, faiz, il, kredit;

        System.out.print("Elde etmek istediyiniz kredit meblegini yazin: ");
        mebleg = sc.nextDouble();
        if (mebleg == 0) {
            MenuUtil.menu2();
        }

        System.out.print("Faiz derecesini qeyd edin: ");
        faiz = sc.nextDouble();
        if (faiz == 0) {
            MenuUtil.menu2();
        }

        System.out.print("Nece illik oldugunu qeyd edin: ");
        il = sc.nextDouble();
        if (il == 0) {
            MenuUtil.menu2();
        }

        faiz = faiz / (12 * 100);
        il = il * 12;

        kredit = kreditKalkulator(mebleg, faiz, il);

        System.out.print("Ayliq kredit odenisi= " + kredit + "\n");
        MenuUtil.menu2();

    }

    public static void ipoteka() {

        Scanner sc = new Scanner(System.in);
        double ipoteka, faiz, il, kredit, ilkod;

        System.out.print("Elde etmek istediyiniz ipoteka meblegini yazin: ");
        ipoteka = sc.nextDouble();
        if (ipoteka == 0) {
            MenuUtil.menu2();
        }

        System.out.print("Ilkin odenisi qeyd edin: ");
        ilkod = sc.nextDouble();
        if (ilkod == 0) {
            MenuUtil.menu2();
        }

        System.out.print("Faiz derecesini qeyd edin: ");
        faiz = sc.nextDouble();
        if (faiz == 0) {
            MenuUtil.menu2();
        }

        System.out.print("Nece illik oldugunu qeyd edin: ");
        il = sc.nextDouble();
        if (il == 0) {
            MenuUtil.menu2();
        }

        ipoteka = ipoteka - ilkod;
        faiz = faiz / (12 * 100);
        il = il * 12;
        kredit = kreditKalkulator(ipoteka, faiz, il);
        System.out.print("Ayliq kredit odenisi= " + kredit + "\n");
        MenuUtil.menu2();
    }

    public static void depozit() {

        Scanner sc = new Scanner(System.in);
        double mebleg, faiz, ipoteka;

        System.out.print("Depozit qoydugunuz meblegi qeyd edin: ");
        mebleg = sc.nextDouble();
        if (mebleg == 0) {
            MenuUtil.menu2();
        }

        System.out.print("Faiz derecesini qeyd edin: ");
        faiz = sc.nextDouble();
        if (faiz == 0) {
            MenuUtil.menu2();
        }

        ipoteka = mebleg * faiz / 12 / 100;

        System.out.print("Ayliq depozit uzre olan geliriniz= " + Math.round(ipoteka * 100.00) / 100.00 + "\n");

        MenuUtil.menu2();

    }

    static double kreditKalkulator(double mebeleg, double faiz, double il) {
        double k = (mebeleg * faiz * Math.pow(1 + faiz, il)) / (Math.pow(1 + faiz, il) - 1);
        return Math.round(k * 100.00) / 100.00;
    }

}
