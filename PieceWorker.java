public class PieceWorker extends Employee{

  private double salary;
  private double piece;
  private double getPieceBonus;

  public PieceWorker(String aFirstName, String aLastName, double aSalary, int aEmployeeId, String aPosition){
    super(aFirstName, aLastName, aPosition);
    piece = aSalary;
		if(aSalary > 0.0){
			salary = aSalary;
		}else{
			System.out.println("Warning from PieceWorker: Invalid wage per piece of " + aSalary);
      System.out.print("Warning from PieceWorker: Invalid quantity amount of ");
		}
  }

  public String toString(){
    return "Name: " + getfirstName() + " " + getlastName() +  ", ID: " + getemployeeId() + ", Position: " + getworkPosition();	}

  public void setQuantity(int p){
    double pieceBonus = (double) p * piece;
    getPieceBonus = pieceBonus;
    if(p < 0)
    System.out.println(p);
  }

  public double calculateEarnings(){
    salary = getPieceBonus;
    return salary;
  }

}
