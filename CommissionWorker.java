public class CommissionWorker extends Employee{

  private double salary;
  private double commission;
  private double getCommissionBonus;
  private int aQuantity;
  private int c;

  public CommissionWorker(String aFirstName, String aLastName, double aSalary, double aComission, int aEmployeeId, String aPosition){
    super(aFirstName, aLastName, aPosition);
    commission = aComission;
    c = aQuantity;
		if(aSalary > 0.0){
			salary = aSalary;
		}else{
			System.out.println("Warning from CommissionWorker: Invalid salary amount of " + aSalary);
      System.out.println("Warning from CommissionWorker: Invalid commission amount of " + aComission);
      System.out.print("Warning from CommissionWorker: Invalid quantity amount of ");
		}
  }

  public String toString(){
    return "Name: " + getfirstName() + " " + getlastName() +  ", ID: " + getemployeeId() + ", Position: " + getworkPosition();	}

  public void setQuantity(int c){
      aQuantity = c;
      double commissionBonus = (double) c * commission;
      getCommissionBonus = commissionBonus;
      if(c < 0)
      System.out.println(c);
  }

  public double calculateEarnings(){
    salary = salary + getCommissionBonus;
    return salary;
  }

}
