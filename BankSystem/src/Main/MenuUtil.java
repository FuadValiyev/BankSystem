package Main;

import util.BankUtil;
import util.InputUtil;
import util.Util;

public class MenuUtil {

    public static void menu() {
        int menu = InputUtil.requireNumber("""
                           
                            Qeydiyyat ucun - '1'
                           Daxil olmaq ucun - '2'
                              elave edin:
                          """);
        if (menu == 1) {
            Util.register();
            MenuUtil.menu2();
        } else if (menu == 2) {
            Util.admin();
            MenuUtil.adminMenu();
        } else if (menu != 1 || menu != 2) {
            System.out.println("Duzgun say daxil edin");
            MenuUtil.menu();
        }
    }

    public static void menu2() {
        int menu2 = InputUtil.requireNumber("""
                           
           Elde etmek istediyiniz melumata uygun varianti secin
                         Menu qayitmaq ucun '0'     
                            Kredit ucun - '1'
                           Ipoteka ucun - '2'
                           Depozit ucun - '3'
                            Cixish ucun - '4'
                               elave edin
                          """);

        if (menu2 == 0) {
            MenuUtil.menu2();
        } else if (menu2 == 1) {
            BankUtil.kredit();
        } else if (menu2 == 2) {
            BankUtil.ipoteka();
        } else if (menu2 == 3) {
            BankUtil.depozit();
        } else if (menu2 == 4) {
            System.out.println("Bize muraciet etdiyiniz ucun tesekkur edirik.");
            System.exit(0);
        } else if (menu2 != 1 || menu2 != 2 || menu2 != 3 || menu2 != 4) {
            System.out.println("Duzgun say daxil edin");
            MenuUtil.menu2();
        }
    }

    public static void adminMenu() {
        while (true) {
            int adminMenu = InputUtil.requireNumber("""
                             Enter
                         Back to menu '0'
                           Find user '1'
                         Show all users '2'
                            Update '3'
                             Exit '4' 
                              """);

            if (adminMenu == 0) {
                MenuUtil.adminMenu();
            } else if (adminMenu == 1) {
                Util.findAndWrieUser();
            } else if (adminMenu == 2) {
                Util.showUsers();
                System.out.println("Baza olmadigi ucun istifadeciler haqqinda melumat yoxdur.");
            } else if (adminMenu == 3) {
                Util.showUsers();
                Util.updateUsers();
                System.out.println("Baza olmadigi ucun istifadeciler haqqinda melumat yoxdur.");
            } else if (adminMenu == 4) {
                System.exit(0);
            } else if (adminMenu != 1 || adminMenu != 2 || adminMenu != 3 || adminMenu != 4) {
                System.out.println("Duzgun say daxil edin");
                MenuUtil.adminMenu();
            }
        }
    }

}
