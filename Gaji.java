import java.util.Scanner;

public class Gaji {
    
    public static void main(String[] args) {
        double jumlahjam, tarifperjam, potonganpajak,hasil;

            Scanner scan =new Scanner(System.in);
            System.out.println("Masukkan jumlah jam: ");
            jumlahjam= scan.nextDouble();
            System.out.println("Masukkan tarif per jam");
            tarifperjam = scan.nextDouble();
            System.out.println("Masukkan potongan pajak");
            potonganpajak = scan.nextDouble();


        hasil = jumlahjam*tarifperjam;
        potonganpajak=potonganpajak/100*hasil;
        hasil=hasil-potonganpajak;
        System.out.println("Gaji Karyawan adalah : "+hasil);
    }
    
}
