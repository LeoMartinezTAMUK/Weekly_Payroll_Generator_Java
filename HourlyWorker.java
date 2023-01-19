public class HourlyWorker extends Employee{

  private double salary;
  private double totalHours;
  private double regPay;
  private double overtimePay;

  public HourlyWorker(String aFirstName, String aLastName, double aSalary, int aEmployeeId, String aPosition){
    super(aFirstName, aLastName, aPosition);
		if(aSalary > 0.0){
			salary = aSalary;
		}else{
			System.out.println("Warning from HourlyWorker: Invalid wage per hour of " + aSalary);
      System.out.print("Warning from HourlyWorker: Invalid number of hours of ");
		}
  }

  public String toString(){
    return "Name: " + getfirstName() + " " + getlastName() +  ", ID: " + getemployeeId() + ", Position: " + getworkPosition();
	}

  public void setHours(double h){
    if(h <= 40){
    regPay = h * salary;
    totalHours = regPay;
  }
    if(h > 40){
    double reg = 40;
    regPay = reg * salary;
    overtimePay = (h - 40) * (salary * 1.5);

    totalHours = regPay + overtimePay;
  }
  if(h < 0){
    System.out.print(h);
    System.out.println("");
  }
}

  public double calculateEarnings(){
    salary = totalHours;
    return salary;
  }

}
