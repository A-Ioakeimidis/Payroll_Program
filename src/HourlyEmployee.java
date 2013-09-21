// HourlyEmployee class extends Employee

public class HourlyEmployee extends Employee{
	
	private double wage; // wage per hour
	private double hours; // hours worked per week
	
	// five-argument constructor
	public HourlyEmployee(String first, String last, String ssn, double hourlyWage, double hoursWorked) {
		super(first, last, ssn);
		setWage(hourlyWage); // validate hourly wage
		setHours(hoursWorked); // validate hours worked
	}
	
	// set wage
	public void setWage(double hourlyWage){
		if(hourlyWage >=0.0)
			wage = hourlyWage;
		else
			throw new IllegalArgumentException("Hourly wage must be greater than 0.0");
	}
	
	// return wage
	public double getWage() {
		return wage;
	}
	
	// set weekly hours
	public void setHours(double hoursWorked) {
		if((hoursWorked >= 0.0) && (hoursWorked <= 168.0))
			hours = hoursWorked;
		else
			throw new IllegalArgumentException("Hours worked must be greater than 0.0 and less than 168.0");
	}
	
	// return weekly hours
	public double getHours() {
		return hours;
	}
	
	// calculate earnings. Override abstract method earnings in Employee
	@Override
	public double earnings() {
		if(getHours() <= 40) // no overtime
			return getWage();
		else 
			return 40 * getWage() + (getHours() - 40) * getWage() * 1.5;
	}
	
	
	// return String representation of HourlyEmployee object
	@Override
	public String toString() {
		return String.format("hourly employee: %s\n%s: $%.2f; %s: %,.2f", super.toString(),
				"hourly wage", getWage(), "hours worked", getHours());
	} 
	
} // end class HourlyEmployee

