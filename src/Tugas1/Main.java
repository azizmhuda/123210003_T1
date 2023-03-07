/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas1;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Main{
    public static void main(String[] args) {
        int pilih;
        int ulang;
        int panjang,lebar,tinggi, jari;
        
        do {
        System.out.println("------");
        System.out.println(" Menu ");
        System.out.println("------");
        System.out.println("1. Hitung Balok");
        System.out.println("2. Hitung Tabung");
        System.out.println("0. Exit");
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan pilihan : ");
        pilih=input.nextInt();
        
        switch(pilih){
            
            case 1 :
                
               //PersegiPanjang persegi = new PersegiPanjang (5,2);
               System.out.print("Masukkan panjang : "); 
               panjang=input.nextInt();
               System.out.print("Masukkan lebar : "); 
               lebar=input.nextInt();
               System.out.print("Masukkan tinggi : ");  
               tinggi=input.nextInt();
               Balok balok = new Balok (panjang, lebar, tinggi);
               balok.setTinggiBalok(tinggi);
               
                // System.out.print("Masukkan tinggi : "); 
                //persegi.tinggi=input.nextInt();
                System.out.println("Luas persegi panjang : " + balok.hitungLuas());
                System.out.println("Keliling persegi panjang : " + balok.hitungKeliling());
                System.out.println("Luas permukaan balok : " + balok.hitungLuasPermukaan());
                System.out.println("Volume balok : " + balok.hitungVolume());
                
            break;
            
            case 2 :
          
               System.out.print("Masukkan jari-jari : "); 
               jari=input.nextInt();
               System.out.print("Masukkan tinggi : "); 
               tinggi=input.nextInt();
               Tabung tabung = new Tabung (jari, tinggi);
               tabung.tinggiTabung(tinggi);
                System.out.println("Luas Lingkaran : " + tabung.hitungLuas());
                System.out.println("Keliling Lingkaran : " + tabung.hitungKeliling());
                System.out.println("Luas Permukaan Tabung : " + tabung.hitungLuasPermukaan());
                System.out.println("Volume Tabung : " + tabung.hitungVolume());                
            break;
            
            case 0 :
               System.exit(0);
            break;
            
            default :
                System.out.println("Input tidak tersedia");
            break;
        
            }
        
            System.out.print("Ulangi lagi ? (Ya:1 || Tidak:0) ");
            Scanner input2 = new Scanner(System.in);
            ulang=input2.nextInt();
            if(ulang==0){
            System.exit(0);
            }
        }while(ulang==1);
        }

   
    }

