package euler;

public class Problem9 {

	public static void main(String[] args) {
		
		//SPECIAL PYTHAGOREAN TRIPLET
		//There exists exactly one Pythagorean triplet for which a + b + c = 1000.
		//Find the product abc.
		
		exit:
		for(int a = 1; a < 1000; a++) {
			for(int b = 1; b < 1000; b++) {
				for(int c = 1; c < 1000; c++) {
					if(isPythagoreanTriplet(a,b,c) && (a+b+c==1000)) {
						System.out.println(a*b*c);
						break exit;
					}
				}
			}
		}
		
	}
	
	static boolean isPythagoreanTriplet(int a, int b, int c) {
		
		if((a*a) + (b*b) != (c*c)) {
			return false;
		}
		
		return true;
	}
	
}
