package Model;

//Task 5
// Create a class Employee with this constructor
// public Employee(int id, String name, int age, int salary)
// Create a list of 5 employees
// sort list by age with comparable
// then create 3 comparators [ageComparator, SalaryComparator, NameComparator]
// Sort the list of employee again with comparator
public class Employee implements Comparable<Employee> {
	
	// Values
	private int id;
	private String name;
	private Integer age;
	private int salary;
	
	// Constructors
	public Employee(int id, String name, int age, int salary) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	
	// Methods
	@Override
	public int compareTo(Employee e) {
		// TODO Auto-generated method stub
		if (e.age == age)
			return 0;
		else if (e.age < age)
			return 1;
		else
			return -1;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Integer getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", salary=" + salary + "]";
	}
	
	
	

}
