package armstrongNumber;

import java.util.ArrayList;
import java.util.Scanner;

public class ArmstrongNumber {
	
	static ArrayList<Integer> list = new ArrayList<>();
	static int keep, temp, total = 0;
	
	public static void process(int preNumber, int postNumber) {
		
		if(preNumber >= postNumber) {
			
			for(int i=postNumber; i<=preNumber; i++) {
				
				keep = i;
				if(keep > 9) {
					
					while(keep > 9) {
						temp = keep % 10;
						keep = (keep-temp)/10;
						total = total + (temp*temp*temp);
					}
					total = total + (keep*keep*keep);
					if(total == i) {
						list.add(total);
					}
				}
				else {
					total= (keep*keep*keep) + total;
					if(total == i) {
						list.add(total);
					}
				}
				total = 0;
			}
		}
		else {
			
			for(int i=preNumber; i<=postNumber; i++) {
				
				keep = i;
				if(keep > 9) {
					
					while(keep > 9) {
						temp = keep % 10;
						keep = (keep-temp)/10;
						total = total + (temp*temp*temp);
					}
					total = total + (keep*keep*keep);
					if(total == i) {
						list.add(total);
					}
				}
				else {
					total = (keep*keep*keep) + total;
					if(total == i) {
						list.add(total);
					}
				}
				total = 0;
			}
		}
	}
	
	public static void show() {
		
		if(list.size() != 0) {
			for(int i=0; i<list.size(); i++) {
			
				System.out.println("Amstrong number: " + list.get(i));
			}
		}
		else {
				System.out.println("Amstrong number not find");
		}
	}

	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		System.out.println("First number: ");
		int preNumber = scan.nextInt();
		
		System.out.println("Last number: ");
		int postNumber = scan.nextInt();

		while(preNumber == 0 && postNumber == 0) {
			while(preNumber == postNumber) {
				System.out.println("At least one 0 and number different");
				System.out.println("First number: ");
				preNumber = scan.nextInt();
				System.out.println("Last number: ");
				postNumber = scan.nextInt();
			}
		}
		process(preNumber, postNumber);
		show();
		
		scan.close();
	}

}
