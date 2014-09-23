public class Welcome{
	public static void main(String[] args){
		String[] greeting = new String[3];
		greeting[0] = "hello";
		greeting[1] = "java";
		greeting[2] = "world!";

		for (String g : greeting) System.out.println(g);
	}
}
