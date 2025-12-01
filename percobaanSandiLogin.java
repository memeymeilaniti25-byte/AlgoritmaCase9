import java.util.Scanner;
public class percobaanSandiLogin {
    public static void main(String[] args) {
        String pengguna;
        String sandi;
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Nama Pengguna : ");
        pengguna = input.nextLine();

        System.out.print("Masukkan Kata Sandi : ");
        sandi =  input.nextLine();

        if(pengguna.equals("admin") && sandi.equals("123")){
            System.out.print("Anda Berhasil Login");
        }else{
            System.out.println("Tidak Dapat login, Pengguna atau Sandi Salah");
        }
        input.close();

    }
    
}
