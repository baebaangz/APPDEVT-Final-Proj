package csb.appdevt.finalproject;

import java.util.Scanner;


public class TestRice {

	public static void main(String[] args) {
		Rice customer  = new Rice();
		String Fname, Lname;
		int Ricetype;
		Double Kilos, Cash;
		Scanner input = new Scanner(System.in);
		
		System.out.println("\n\n***RICE N SHINE ***");
		System.out.println("\nTYPES OF RICE AVAILABLE:");
		System.out.println("\n1.Sinandomeng - 20php");
		System.out.println("\n2.Jasmine - 25php");
		System.out.println("\n3.Denorado - 23php");
		System.out.println("\n4.NFA - 20php");

		System.out.print("\nEnter Customer First name : ");
    	   Fname = input.next();
    	   customer.setFname(Fname);
    	   System.out.print("Enter Customer Last name : ");
    	   Lname = input.next();
    	   customer.setLname(Lname);
    	   System.out.print("Pick Rice desired : ");
    	   Ricetype = input.nextInt();
    	   customer.setRicetype(Ricetype);
    	   System.out.print("How many Kilo/s: ");
    	   Kilos = input.nextDouble();
    	   customer.setKilos(Kilos);
    	   System.out.print("Cash: ");
    	   Cash = input.nextDouble();
    	   customer.setAmountPaid(Cash);
    	   
    	   
    		 
    	System.out.println("\nOfficial Receipt");
   		System.out.println("Customer Name : " + customer.getFullname());
   		if (Ricetype == 1)
   			System.out.println("Type of Rice : Sinandomeng");
   		if (Ricetype == 2)
   			System.out.println("Type of Rice : Jasmine");
   		if (Ricetype == 3)
   			System.out.println("Type of Rice : Denorado");
   		if (Ricetype == 4)
   			System.out.println("Type of Rice : NPA");
   		System.out.println("Kilos : " + customer.getKilos());
   		System.out.println("Total : " + customer.getTotal());
   		System.out.println("Amount Paid : " + customer.getAmountPaid());
   		System.out.println("Change : " + customer.getchange());
   	   	
   	
   		
   		input.close();

	}

}
