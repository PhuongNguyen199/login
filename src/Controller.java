import java.util.ArrayList;
import java.util.Scanner;

public class Controller {
    Registe registe;
    Service sr;
    Scanner sc;
    ArrayList<Registe> registes;

    public Controller() {
        registe = new Registe();
        sr = new Service();
        sc = new Scanner(System.in);
        registes = sr.getAllAccount();
    }

    public void mainMenu() {
//        boolean isContinue = true;
//        while (isContinue) {
        Menu.menu1();
        int choose = Integer.parseInt(sc.nextLine());
        switch (choose) {
            case 1:
                System.out.println("Dang nhap");
                System.out.println("Nhap userName");
                String userName = sc.nextLine();
                System.out.println("Nhap password");
                String password = sc.nextLine();
                sr.login(userName, password, registes);
                break;
            case 2:
                System.out.println("Dang ky");
                System.out.println("Nhap Name");
                String usernew = sc.nextLine();
                System.out.println("Nhap password");
                String passNew = sc.nextLine();
                System.out.println("Nhap Email");
                String emailNew = sc.nextLine();
                sr.register(registes, usernew, passNew, emailNew);
                break;
            default:
                System.out.println("Không có lựa chọn này");
        }
        //}
    }

    public void changName() {
        boolean isContinue = true;
        while (isContinue) {
            Menu.menu3();
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("Nhap ten muon thay doi");
                    String changeUsername = sc.nextLine();
                    sr.changeUserName(registe, changeUsername);
                    break;
                case 2:
                    System.out.println("Nhap Email muon thay doi");
                    String changeEmail = sc.nextLine();
                    sr.changeUserName(registe, changeEmail);
                    break;
                case 3:
                    System.out.println("Nhap Password muon thay doi");
                    String changePassword = sc.nextLine();
                    sr.changeUserName(registe, changePassword);
                    break;
                case 4:
                    Menu.menu1();
                    isContinue = false;
                    break;
                case 0:
                    isContinue = false;
                    break;
                default:
                    System.out.println("Không có lựa chọn này");
            }

        }

    }

    public void mainMenu2() {
        Menu.menu2();
        int choose = Integer.parseInt(sc.nextLine());
        switch (choose) {
            case 1:
                System.out.println("Dang nhap");
                System.out.println("Nhap userName");
                String userName = sc.nextLine();
                System.out.println("Nhap password");
                String password = sc.nextLine();
                sr.login(userName, password, registes);
                break;
            case 2:
                System.out.println("Quen mat khau");
                System.out.println("nhap email");
                String email = sc.nextLine();
                System.out.println("Doi password");
                String passnew = sc.nextLine();
                sr.forgotPassword(email, passnew, registes);
                break;
            default:
                System.out.println("Không có lựa chọn này");
        }
    }

}
