import java.util.*;
public class test7{
	public static void main(String[] args){
		Employee[] staff = new Employee[3];

		staff[0] = new Employee("Harry", 40000);
		staff[1] = new Employee("Jack", 50000);
		staff[2] = new Employee("Fuck", 60000);

		for (Employee e : staff){
			System.out.printf("name=%s, salary=%.2f, id=%d",e.getName(),e.getSalary(),e.getId());
			System.out.println();
		}
	}
}
