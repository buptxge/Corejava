public class Employee{
	private static int Number = 1;
	private static final double PI = 3.14;
	private int id;

	public int getId(){
		System.out.println(this.id*10);
		return this.id;
	}

	public Employee(){
		this.id = Number;
		Number++;
	}

	public static void main(String[] args){
		System.out.println(1123123);
	}
}

