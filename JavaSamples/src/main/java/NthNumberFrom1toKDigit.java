
public class NthNumberFrom1toKDigit {

	public static void main(String[] args) {

		
		int m = 50;
		while(m-->0)
		findNthNum(m, 4);
	
	}
	
	static int findNthNum( int n, int base){
		int[] a = new int[100000];
		
		
		int i = 0;
		
		while(n>0) {
			
			int reminder = n % base;
			if(reminder == 0) {
				reminder = base;n--;
			}a[i++] = reminder;
			n = n / base;
			
			
		}
		
		int j = i;
		
		while(j-->0) {
			System.out.print(a[j]);
		}
		System.out.print("\n");
		
		return i;
		
		
		
	}

}
