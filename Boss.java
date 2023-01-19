/**
 * Credit: Will be released after the due date
 * Modified: Dr. Hani Z. Girgis
 * Purpose a conceret class representing a Boss
 * A boss is paid a fixed weekly salary
 */
public class Boss extends Employee{
	// Weekly salary
	private double salary;

	public Boss(String aFirstName, String aLastName, double aSalary, int aEmployeeId, String aPosition){
		super(aFirstName, aLastName, aPosition);
		if(aSalary > 0.0){
			salary = aSalary;
		}else{
			System.out.println("Warning from Boss: Invalid salary amount of " + aSalary);
		}
	}

	/* public void setfirstName(aFirstName firstName){
			this.firstname = firstName;
	}

	public aFirstName getfirstname(){
		return firstName;
	} */

    // Implement public double calculateEarnings() here
		public double calculateEarnings(){
			return salary;
		}

    //	Override public String toString() here
		public String toString(){
			return "Name: " + getfirstName() + " " + getlastName() +  ", ID: " + getemployeeId() + ", Position: " + getworkPosition();	}

}
