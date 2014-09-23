import java.util.*;
public class Employee{
	private static int nextId;

	private int id;
	private String name = "";
	private double salary;

	static
	{
		Random generator = new Random();
		nextId = generator.nextInt(10000);
	}

	{
		id = nextId;
		nextId++;
	}

	public Employee(double salary){
		this("Employee #" + nextId, salary);
	}

	public Employee(String name, double salary){
		this.name = name;
		this.salary = salary;
	}

	public Employee(){}

	public String getName(){
		return this.name;
	}

	public double getSalary(){
		return this.salary;
	}

	public int getId(){
		return this.id;
	}
}
