import java.util.*;
import java.io.*;
import java.nio.file.*;

public class test3{
	public static void main(String[] args){
		Scanner in = new Scanner(Paths.get("/home/xbrother/Corejava/test3/example"));
		String str1 = in.next();
		String str2 = in.next();
		int a = in.nextInt();

		PrintWriter out = new PrintWriter("/home/xbrother/Corejava/test3/result");
		out.print(str1+str2+a);
	}

}
