import java.util.ArrayList;

public class Service {

    public ArrayList<Registe> getAllAccount() {
        ArrayList<Registe> registes = new ArrayList<>();
        registes.add(new Registe("aaa", "bbb", "ccc"));
        registes.add(new Registe("bbb", "ccc", "ddd"));
        registes.add(new Registe("qqq", "www", "eee"));
        return registes;
    }

    public void show(ArrayList<Registe> registes) {
        for (Registe re : registes) {
            System.out.println(re);
        }
    }

    public void login(String username, String password, ArrayList<Registe> registes) {
        Controller controller = new Controller();
        for (Registe registe : registes) {
            if (registe.getUserName().equals(username) && registe.getPassword().equals(password)) {
                System.out.println("Chao mung " + registe.getUserName());
                controller.changName();
                break;
            }
            if (registe.getUserName().equals(username) && registe.getPassword() != password) {
                System.out.println("Sai pass word");
                controller.mainMenu2();
            }
            if (registe.getUserName() != username && registe.getPassword().equals(password)) {
                System.out.println("Sai username");
            }
        }
    }

    public void forgotPassword(String email, String password, ArrayList<Registe> registes) {
        for (Registe registe : registes) {
            if (registe.getEmail().equals(email)) {
                System.out.println("Doi mat khau");
                registe.setPassword(password);
                System.out.println(registe);
            }
        }
    }

    public void register(ArrayList<Registe> registes, String username, String password, String email) {
        registes.add(new Registe(username, password, email));
        show(registes);
    }

    public void changeUserName(Registe registe, String username) {
        registe.setUserName(username);
        System.out.println("Ten sau khi cap nhap:");
        System.out.println(registe);
    }

    public void changeEmail(Registe registe, String email) {
        registe.setUserName(email);
        System.out.println("Email sau khi cap nhap:");
        System.out.println(registe);
    }

    public void changePassword(Registe registe, String password) {
        registe.setUserName(password);
        System.out.println("Ten sau khi cap nhap:");
        System.out.println(registe);
    }


}
