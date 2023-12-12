import java.util.Scanner;

public class app {
     public static void main(String[] args) {
    
        try {
          
            loginAkun login = new loginAkun();

            penjualan supermarket = new penjualan();
            supermarket.kasir = login.kasir;

            Scanner scanner = new Scanner(System.in);

            System.out.print("Nama Pelanggan : ");
            String namaPelanggan = scanner.nextLine();
            System.out.print("No. HP         : ");
            String noHp = scanner.nextLine();
            System.out.print("Alamat         : ");
            String alamatPelanggan = scanner.nextLine();

            supermarket.aA(namaPelanggan, noHp, alamatPelanggan);

            System.out.print("Kode Barang    : ");
            String kodeBarang = scanner.nextLine();
            System.out.print("Jumlah Beli    : ");
            int jumlahBeli = scanner.nextInt();
            supermarket.bB(kodeBarang, jumlahBeli);
            System.out.println(" ");

            supermarket.aAA();
            supermarket.bBB();

            scanner.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
