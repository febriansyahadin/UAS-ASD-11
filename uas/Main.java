package uas;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Dll dll = new Dll();
        int pilih;

        do{
            System.out.println("=============================");
            System.out.println("========== MENU =============");
            System.out.println("=============================");
            System.out.println("1. Daftar Kendaraan          ");
            System.out.println("2. Peminjaman                ");
            System.out.println("3. Tamilkan seluruh Transaksi");
            System.out.println("4. Urutkan Transaksi urut no TKNB");
            System.out.println("5. Keluar                    ");
            System.out.println("Pilih(1-5)");
            pilih = scanner.nextInt();
            

                switch (pilih) {
                    case 1:
                        dll.addFirst();
                        break;
                    case 2:
                        dll.addLast();
                        break;
                    case 3:
                        dll.print();
                        break;
                    case 5:
                        System.exit(5);
                        break;
                    default:
                        System.out.println("Menu tidak valid");
                        break;
                }
        } while (pilih != 5);
            }
        }

