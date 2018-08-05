/**
 * This program prints hello world
 * @author qqdipps
 *
 */
public class HelloWorld {
	/**
	 * testing javaDoc	
	 */
	private static int hi = 90;
/**
 * starting point
 * @param args
 */
	public static void main(String[] args) {
//		System.out.println("Hello World!");	
//		System.out.println(hi);
//		System.out.print("testbug");
		int i;
		double x = 11.4; 
		i = (int) x; //cast for single occurence
		System.out.println(i);
		//System.out.println("sysout control space = ");
		x=i; 
		System.out.println(x);
		short q = 1;
		short w = 1;
		short e;
	
		q = (short) (q + 1);
		q++;
		System.out.println(i);
		System.out.println(q);
		i++;
		System.out.println(i);
		if((!(6==5)||(3==++i))){
			System.out.println("yes");
			System.out.println(i);
		}
		}
		
	}


