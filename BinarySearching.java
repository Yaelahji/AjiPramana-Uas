/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Uas.Aji;
import java.util.Scanner;

/**
 *
 * @author Aji Pramana
 */
public class BinarySearching{     
    public static void main(String[] Args)
    {
        int k, angka;
        System.out.println("Program Binary Search");
        System.out.println();
        System.out.println("Kumpulan data Array of Random");
        boolean notfound=true;
        int[] intarray = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51,52,53,54,55,56,57,58,59,60,61,62,63,64,65,66,67,68,69,70,71,72,73,74,75,76,77,78,79,80,81,82,83,84,85,86,87,88,89,90,91,92,93,94,95,96,97,98,99,100};
        
        for(int i=0;i<intarray.length;i++)         {
             System.out.print(intarray[i]+" ");
         }
        Scanner sc=new Scanner(System.in);
        System.out.print("\nMasukan angka yang ingin dicari = ");
        angka=sc.nextInt();
        
        int batasAtas=intarray.length-1;
        int batasBawah=0;
        
        while (notfound)
        {
            int posisiSekarang = (batasAtas + batasBawah)/2;
            if(intarray[posisiSekarang] == angka)
            {
                notfound=false;
                System.out.println("Angka "+angka+" ditemukan" );
            }
            else if(batasBawah>batasAtas)
            {
            System.out.println("Angka " +angka+" tidak ditemukan");
            break;
            }
            else
            {
                if(intarray[posisiSekarang]< angka)
                {
                    batasBawah = posisiSekarang+1;
                }
                else
                {
                    batasAtas = posisiSekarang-1;
                }
            }
        }
    }
}
