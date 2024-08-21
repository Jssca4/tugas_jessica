import java.util.Scanner;

public class Diskon {
    public static void main(String[] args) {
        double jumlahbarang, hargabarang, potongandiskon,hasil;

            Scanner scan =new Scanner(System.in);
            System.out.println("Masukkan jumlah barang: ");
            jumlahbarang= scan.nextDouble();
            System.out.println("Masukkan harga barang");
            hargabarang = scan.nextDouble();
            System.out.println("Masukkan potongan diskon");
            potongandiskon = scan.nextDouble();


        hasil = jumlahbarang*hargabarang;
        potongandiskon=potongandiskon/100*hasil;
        hasil=hasil-potongandiskon;
        System.out.println("Jumlah harga adalah : "+hasil);
    }
    
}
