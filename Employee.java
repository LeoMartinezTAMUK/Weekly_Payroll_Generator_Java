/**
 * Credit: Will be released after the due date
 * Modified by: Dr. Hani Z. Girgis
 * Purpose a super class for all employees in a company
 */
public abstract class Employee{
	private String firstName;
	private String lastName;
	private static int id;
	private int employeeId;
	private String workPosition;

	public Employee(String aFirstName, String aLastName, String aPosition){
		workPosition = aPosition;
		if(aFirstName.equals("")){
			System.out.println("Warning from Employee: The first name cannot be empty.");
		}else{
			firstName = aFirstName;
		}

		if(aLastName.equals("")){
			System.out.println("Warning from Employee: The last name cannot be empty.");
		}else{
			lastName = aLastName;
		}

		employeeId = id++;
	}

	public String toString(){
		return "Name: " + firstName + " " + lastName +  ", ID: " + employeeId + ", Position: " + workPosition;
	}

	public abstract double calculateEarnings();

	public void setworkPosition(String aPosition){
		workPosition = aPosition;
	}
	public String getworkPosition(){
		return workPosition;
	}

	public void setfirstName(String aFirstName){
		firstName = aFirstName;
	}
	public String getfirstName(){
		return firstName;
	}

	public void setlastName(String aLastName){
		lastName = aLastName;
	}
	public String getlastName(){
		return lastName;
	}

	public void setemployeeId(int aEmployeeId){
		employeeId = aEmployeeId;
	}
	public int getemployeeId(){
		return employeeId;
	}

}
