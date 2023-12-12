
import java.util.Scanner;
public class loginAkun {
    public String Code[] = {"G6uv7Y", "F7ri9R", "P9gc8F"};
    public String capca;
    public int hitung = -1;
    public String kasir;  

    public loginAkun() {
        String id;
        String password;
        System.out.println("SELAMAT DATANG DI INISUPERMARKET");
        System.out.println("==============================");
        System.out.println("Log in");
        System.out.print("Username    : ");
        Scanner scanner = new Scanner(System.in);
        id = scanner.next();
        System.out.print("Password    : ");
        password = scanner.next();

            if (id.equalsIgnoreCase("Yala") && password.equals("IniYala123")) {
                int random = 0;
                String n;
                do {
                    if (random > 0) {
                        System.out.println("Captcha Salah !!!");
                    }
                    random++;
                    hitung++;
                    hitung %= 3;
                    System.out.println("Kode Captcha : " + Code[hitung]);
                    System.out.print("Entry Captcha: ");
                    Scanner kode = new Scanner(System.in);
                    capca = kode.next();
                } while (!capca.equals(Code[hitung]));
                System.out.println("-----------------------------------------\t");
                kasir = id;  
            } else {
                System.out.println("Coba Lagi");
            }
    }
}
