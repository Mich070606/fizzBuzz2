package fizzbuzz;

public class fizzbuzzclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int smbm = 1;
		while(smbm <= 100) {
			if(smbm % 3 == 0 && smbm % 5 == 0) 
			{
				System.out.println("FizzBuzz");
			}
			else if(smbm % 3 == 0) 
			{
				System.out.println("Fizz");
			}
			else if(smbm % 5 == 0) 
			{
				System.out.println("Buzz");
				
			}else {
				System.out.println(smbm);
			}
			smbm++;
		}
	}

}
