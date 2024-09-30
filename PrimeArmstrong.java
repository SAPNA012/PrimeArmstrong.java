package basicJava.org.com;

public class PrimeArmstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Program to print prime number
		int a =23;
	
	
			if(a%2!=0) {
			System.out.println("these number is prime:\n"+a);
			}else {
				System.out.println("these number is not prime:\n"+a);
			
		}
		
		
		
		//Program to print Armstrong number
		
			int n=153;
			int r;
			int sum=0;
			int temp=n;
			
			while(n>0) {
				r=n%10;
				n=n/10;
				sum=sum+(r*r*r);
			}
			if(temp==sum) {
				System.out.print("Armstrong number"+sum);
			}else {
				System.out.print("Not Armstrong number");
				}
	      
	}
		          
	}


