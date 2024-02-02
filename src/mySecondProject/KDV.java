package mySecondProject;
import java.util.Scanner;


public class KDV {
	public static void main(String[]args){
		Scanner input =new Scanner(System.in);
		
	System.out.print("Lütfen bir fiyat giriniz:");
		double fiyat=input.nextDouble();
       if(fiyat>=0&&fiyat<=1000) {
    	   double kdv=fiyat*18/100;
    	   double kdvlifiyat=kdv+fiyat;
    	   System.out.print("KDV miktarınız:");
    	   System.out.println(kdv);
    	   System.out.print("KDVli fiyatınız:");
    	   System.out.println(kdvlifiyat);
    	   
    	   
       }
       if(fiyat>1000) {
    	   double kdv=fiyat*8/100;
    	   double kdvlifiyat=kdv+fiyat;
    	   System.out.print("KDV miktarınız:");
    	   System.out.println(kdv);
    	   System.out.print("KDVli fiyatınız:");
    	   System.out.println(kdvlifiyat);
  
       }
		
		
		
		
	}

}
