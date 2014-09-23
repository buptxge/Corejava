import java.util.*;

public class test4{
	public static void main(String args[]){
		int a[] = {1,2,3,4};
		System.out.println(a.length);
		int b[] = a;
		System.out.println(b.length);
		a[0] = 100;
		System.out.println(b[0]);
		b[1] = 100; 
		System.out.println(a[1]);
		int c[] = Arrays.copyOf(a,a.length);
		a[3] = 100;
		System.out.println(c[3]);
	}
}
