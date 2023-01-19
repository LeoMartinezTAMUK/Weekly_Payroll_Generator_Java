import java.util.ArrayList;

public class EmployeeTestDrive{
	private ArrayList<Employee> employeeList;

	public EmployeeTestDrive(){
		employeeList = new ArrayList<Employee>();
		testWarnings();
		System.out.println();
		addEmployees();
		calculateTotal();
	}

	/**
	 * These must print warning messages
	 */
	private void testWarnings(){
		Boss boss = new Boss("", "", -1000.00, 4, "Boss");

		CommissionWorker commissionWorker = new CommissionWorker("Sue", "Jones", -400.0, -3.0, 5, "Commission Worker");
		commissionWorker.setQuantity(-100);

		PieceWorker pieceWorker = new PieceWorker("Bob", "Lewis", -1.0, 6, "Piece Worker");
		pieceWorker.setQuantity(-200);

		HourlyWorker hourlyWorker = new HourlyWorker("Karen", "Price", -12.0, 7, "Hourly Worker");
		hourlyWorker.setHours(-40.0);
	}

	private void addEmployees(){
		// Make and add a Boss object
		Boss boss = new Boss("John", "Smith", 1000.00, 4, "Boss");
		employeeList.add(boss);

		CommissionWorker commissionWorker = new CommissionWorker("Sue", "Jones", 400.0, 3.0, 5, "Commission Worker");
		commissionWorker.setQuantity(100);
		employeeList.add(commissionWorker);

		PieceWorker pieceWorker = new PieceWorker("Bob", "Lewis", 1.0, 6, "Piece Worker");
		pieceWorker.setQuantity(200);
		employeeList.add(pieceWorker);

		HourlyWorker hourlyWorker1 = new HourlyWorker("Karen", "Price", 12.0, 7, "Hourly Worker");
		hourlyWorker1.setHours(40.0); //40 to 40.0
		employeeList.add(hourlyWorker1);

		HourlyWorker hourlyWorker2 = new HourlyWorker("Alejandro", "Gonzalez", 10.0, 8, "Hourly Worker");
		hourlyWorker2.setHours(70.0); //70 to 70.0
		employeeList.add(hourlyWorker2);
	}

	private void calculateTotal(){
		double t = 0.0;
		for(Employee e : employeeList){
			System.out.print(e);
			double w = e.calculateEarnings();
			System.out.println(", Earnings: " + w);
			t += w;
		}
		System.out.println();
		System.out.println("Total = " + t);
	}

	public static void main(String[] argList){
		new EmployeeTestDrive();
	}
}
