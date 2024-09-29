/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package percabangan;

import java.util.Scanner;

/**
 *
 * @author izzaa
 */
public class Latihan_percabangan_if_else {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        
        double hargabarang,totalpembelian, diskon = 0, totalfinal, uangbayar, uangkembalian;
        int jumlahbarang;
        
        System.out.println("(((latihan percabangan if else)))");
        
        System.out.print("jumlah barang =");
        jumlahbarang=input.nextInt();
        
        System.out.print("harga barang =");
        hargabarang=input.nextDouble();
        
        totalpembelian=jumlahbarang*hargabarang;
        System.out.println("total pembelian ="+totalpembelian);
        System.out.println("------------------------------------------");
        
       
        if(totalpembelian<100000){
            diskon=0*totalpembelian;
            System.out.println("mau diskon? tambahlah total pembelian anda! ");
            
        }else if(totalpembelian>=100001&&totalpembelian<=200000){
            diskon=0.05*totalpembelian;
            System.out.println("SELAMAT! anda mendapatkan diskon sebesar[5%]");
            
        }else if(totalpembelian>=200001&&totalpembelian<=300000){
            diskon=0.1*totalpembelian;
            System.out.println("SELAMAT! anda mendapatkan diskon sebesar[10%]");
            
        }else if(totalpembelian>=300001&&totalpembelian<=400000){
            diskon=0.15*totalpembelian;
            System.out.println("SELAMAT! anda mendapatkan diskon sebesar[15%]");
            
        }else if(totalpembelian>=400001&&totalpembelian<=500000){
            diskon=0.2*totalpembelian;
            System.out.println("SELAMAT! anda mendapatkan diskon sebesar[20%]");
            
        }else if(totalpembelian>500000){
            diskon=0.25*totalpembelian;
            System.out.println("SELAMAT! anda mendapatkan diskon sebesar[25%]");
        }
        
        System.out.println("Diskon ="+diskon);
        System.out.print("total pembelian-diskon");
        totalfinal=totalpembelian-diskon;
        System.out.println("total akhir ="+totalfinal);
        
        System.out.println("--------------------------------------");
        
        System.out.print("Jumlah uang yang dibayar =");
        uangbayar=input.nextDouble();
        
        if(uangbayar==totalfinal){
            System.out.println("Uang pas, TERIMA KASIH TELAH BERBELANJA!");
            
        }else if(uangbayar>totalfinal){
            uangkembalian=uangbayar-totalfinal;
            System.out.println("Kembalian ="+uangkembalian);
            
        }else if(uangbayar<totalfinal){
            System.out.println("maaf uang anda belum mencukupi untuk melakukan transaksi");
        
            
            
        
                
        
        }
        
        
        
        
    }
    
}
