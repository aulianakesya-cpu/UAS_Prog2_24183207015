
import java.util.ArrayList;
import java.util.Scanner;


public class MainClass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<User> listUser = new ArrayList<>();
        ArrayList<MataKuliah> listMK = new ArrayList<>();
        int menu = -1;

        while (menu != 0) {
            System.out.println("\n===SISTEM AKADEMIK===");
            System.out.println("\n1. Input Data Mahasiswa");
            System.out.println("\n2. Input Data Dosen");
            System.out.println("\n3. Input Mata Kuliah");
            System.out.println("\n4. Input Nilai Mahasiswa");
            System.out.println("\n5. Tampilkan Data");
            System.out.println("\n0. Keluar");
            System.out.print("Pilih: ");

            try {
                menu = Integer.parseInt(input.nextLine());
            } catch (Exception e) {
                System.out.println("Gunakan angka untuk memilih menu!");
                continue;
            }

            switch (menu) {
                case 1:
                    System.out.print("NIM  : "); String nim = input.nextLine();
                    System.out.print("Nama : "); String namaM = input.nextLine();
                    System.out.print("Prodi: "); String prodi = input.nextLine();
                    listUser.add(new Mahasiswa(nim, namaM, prodi));
                    break;
                case 2:
                    System.out.print("NIDN : "); String nidn = input.nextLine();
                    System.out.print("Nama : "); String namaD = input.nextLine();
                    System.out.print("Bidang: "); String bdg = input.nextLine();
                    listUser.add(new Dosen(nidn, namaD, bdg));
                    break;
                case 3:
                    System.out.print("Kode MK: "); String kmk = input.nextLine();
                    System.out.print("Nama MK: "); String nmk = input.nextLine();
                    listMK.add(new MataKuliah(kmk, nmk));
                    break;
                case 4:
                    System.out.print("Nilai Tugas: "); double t = Double.parseDouble(input.nextLine());
                    System.out.print("Nilai UTS  : "); double u1 = Double.parseDouble(input.nextLine());
                    System.out.print("Nilai UAS  : "); double u2 = Double.parseDouble(input.nextLine());
                    Nilai n = new Nilai(t, u1, u2);
                    System.out.println("Hasil Akhir: " + n.hitungNilaiAkhir());
                    break;
                case 5:
                    System.out.println("\n--- DATA TERDAFTAR ---");
                    for (User u : listUser) u.tampilInfo(); // Polymorphism
                    for (MataKuliah mk : listMK) mk.infoMK();
                    System.out.println("Total Mahasiswa Input: " + Mahasiswa.getCounterMhs());
                    break;
                case 0:
                    System.out.println("Selesai.");
                    break;
            }
        }
    }
}