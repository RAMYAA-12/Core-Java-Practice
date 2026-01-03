import java.util.Scanner;
public class TaxiCharges {

	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.print("Enter Taxi number:");
	String taxi_num = s.nextLine();
	System.out.print("Enter distance travelled:");
	int dist_travelled = s.nextInt();
	int amount;
	if(dist_travelled <=5) {
		amount=100;
	}
	else if(dist_travelled<=15) {
		amount = 100+(dist_travelled - 5)*10;
	}
	else if(dist_travelled<=25) {
		amount = 100+(10*10)+(dist_travelled - 15)*8;
	}
	else {
		amount = 100+(10*10)+(10*8)+(dist_travelled - 25)*5;
	}
	System.out.println("Taxi No:" +taxi_num);
	System.out.println("Distance covered:"+dist_travelled);
	System.out.println("Amount:"+amount);
	s.close();
	}

}
