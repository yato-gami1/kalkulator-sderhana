/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

/**
 *
 * @author User-14
 */
public class Calculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       penjumlahan jumlah = new penjumlahan (12,12,"hasil penjumlahan =");
       pengurangan kurang = new pengurangan (12,12,"hasil pengurangan =");
       pembagian bagi = new pembagian (12,12,"hasil pembagian =");
       perkalian kali = new perkalian (12,23,"hasil perkalian =");
       akar akr = new akar (16, "hasil akar =");
       kuadrat kuadrt = new kuadrat (9,"hasil kuadrat =");
    }
    
    
    
    private static class penjumlahan {
       
      public penjumlahan (int a, int b, String u){
        System.out.print(u);
        System.out.println(a+b);
      
    }
 }
    
   private static class pengurangan{
       
      public pengurangan (int a, int b, String u){
        System.out.print(u);
        System.out.println(a-b);
      
    }
 }
   private static class pembagian {
       
      public pembagian (int a, int b, String u){
        System.out.print(u);
        System.out.println(a/b);
      
    }
 }
   private static class perkalian {
       
      public perkalian (int a, int b, String u){
        System.out.print(u);
        System.out.println(a*b);
      
    }
 }
 
    private static class akar {
       
      public akar (int a, String u){
        System.out.print(u);
        System.out.println(Math.sqrt(a));
      
    }
 }
     
    private static class kuadrat {
       
      public kuadrat (int a, String u){
        System.out.print(u);
        System.out.println(a*a);
      
    }
 }
    }
