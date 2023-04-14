package util;

import Main.MenuUtil;
import beans.Qeydiyyat;
import beans.UserBank;

public class Util {

    public static void register() {

        UserBank.user = new Qeydiyyat[1];

        for (int i = 0; i < 1; i++) {
            String ad = InputUtil.requireText("Adinizi daxil edin");
            String soyad = InputUtil.requireText("Soyadinizi daxil edin");
            int yas = InputUtil.requireNumber("Yasinizi daxil edin");

            while (!(yas >= 18)) {
                System.out.println("""
                               Qeydiyyat ucun yas 18 ve ya uzeri olmalidir!""");
                yas = InputUtil.requireNumber("Yasinizi daxil edin");
            }

            String link = InputUtil.requireText("Istifadeci adinizi daxil edin");
            String kod = InputUtil.requireText("Kodunuzu daxil edin");
            System.out.println("Qeydiyyat ugurla tamamlanmisdir.");
            String tesdiqLink = InputUtil.requireText("Sisteme daxil olmaq ucun istifadeci adinizi daxil edin");
            String tesdiqKod = InputUtil.requireText("Kodunuzu daxil edin");

            if (!(kod.equals(tesdiqKod) && link.equals(tesdiqLink))) {
                System.out.println(" Istifadeci adi ve ya kod etibarsizdir!");
                System.exit(0);
            }

            Qeydiyyat q = new Qeydiyyat(ad, soyad, yas, link, kod);
            UserBank.user[i] = q;
        }

    }

    public static void showUsers() {

        if (UserBank.user == null) {
            return;
        } else {
            for (int i = 0; i < UserBank.user.length; i++) {
                System.out.println(i + 1 + "." + UserBank.user[i]);
            }
        }
    }

    public static void admin() {

        String tesdiqLink = InputUtil.requireText("Sisteme daxil olmaq ucun istifadeci adinizi daxil edin");
        String tesdiqKod = InputUtil.requireText("Kodunuzu daxil edin");
        if (!(tesdiqLink.equals("admin") && tesdiqKod.equals("admin"))) {
            System.out.println(" Istifadeci adi ve ya kod etibarsizdir!");
            System.exit(0);

        }
    }

    public static void findAndWrieUser() {
        String text = InputUtil.requireText("Type name | surname");
        if ("0".equals(text)) {
            MenuUtil.adminMenu();
        }

        for (int i = 0; i < UserBank.user.length; i++) {
            if (UserBank.user[i].getAd().contains(text)
                    || UserBank.user[i].getSoyad().contains(text)) {
                System.out.println(UserBank.user[i]);
            }
        }
    }

    public static void updateUsers() {
        int selectedUser = InputUtil.requireNumber("Choose number");
        if (selectedUser == 0) {
            MenuUtil.adminMenu();
        }
        Qeydiyyat q = UserBank.user[selectedUser - 1];
        String params = InputUtil.requireText("Change name | surname | age | link");
        if ("0".equals(params)) {
            MenuUtil.adminMenu();
        }

        if (params.contains("name")) {
            String ad = InputUtil.requireText("Enter new name");
            if ("0".equals(params)) {
                MenuUtil.adminMenu();
                q.setAd(ad);
            }

            if (params.contains("surname")) {
                String soyad = InputUtil.requireText("Enter new surname");
                if ("0".equals(params)) {
                    MenuUtil.adminMenu();
                    q.setSoyad(soyad);
                }

                if (params.contains("age")) {
                    int yas = InputUtil.requireNumber("Enter new age");
                    if (selectedUser == 0) {
                        MenuUtil.adminMenu();
                        q.setYas(yas);
                    }

                    if (params.contains("link")) {
                        String link = InputUtil.requireText("Enter new link");
                        if ("0".equals(params)) {
                            MenuUtil.adminMenu();
                            q.setLink(link);
                        }
                    }
                }
            }
        }
    }
}
