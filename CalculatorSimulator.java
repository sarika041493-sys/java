package lab5;

class CountryNotValidException extends Exception{ // CountryNotValidException
	public CountryNotValidException(String msg) {
		super(msg);
	}
}

class EmployeeNameInvalidException extends Exception{//EmployeeNameInvalidException
	public EmployeeNameInvalidException(String msg) {
		super(msg);
	
	}
}

class TaxNotEligibleException extends Exception{ // TaxNotEligibleException
	public TaxNotEligibleException(String msg) {
		super(msg);
	}
}

class TaxCalculator{ // clacuator class creation
	public double calculateTax(String empName, boolean isIndian, double empSal) 
			throws CountryNotValidException,EmployeeNameInvalidException, TaxNotEligibleException{
		if(!isIndian)

			throw new CountryNotValidException("The employee should be an indina citizen");
		
		if(empName ==null || empName.isEmpty())
			throw new EmployeeNameInvalidException("The employee name cannot be empty");
		
		if(empSal > 100000)
		{
			return empSal *0.08;
		}
		else if(empSal >=50000)
		{
			return empSal*0.06;
		}
		else if(empSal > 30000)
		{
			return empSal *0.05;
		}
		else if(empSal > 10000)
		{
			return empSal *0.04;
		}
		else
		
			throw new TaxNotEligibleException("the employee does not pay tax");
		
	}
}


public class CalculatorSimulator { // main class

	public static void main(String[] args) {
		TaxCalculator tc = new TaxCalculator();
		
		try {
            double tax = tc.calculateTax("Ron", true, 34000);
            System.out.println("Tax amount is " + tax);
        }
        catch (CountryNotValidException e) {
            System.out.println(e.getMessage());
        }
        catch (EmployeeNameInvalidException e) {
            System.out.println(e.getMessage());
        }
        catch (TaxNotEligibleException e) {
            System.out.println(e.getMessage());
        }
		
		// TODO Auto-generated method stub

	}

}
