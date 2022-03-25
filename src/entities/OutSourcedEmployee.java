package entities;

public class OutSourcedEmployee extends Employee{
	
	private double adicionalCharge;
	private double payment;
	
	public OutSourcedEmployee(String name, Integer hours, double valuePerHours,double adicionalCharge) {
		super(name, hours, valuePerHours);
		// TODO Auto-generated constructor stub
		this.adicionalCharge=adicionalCharge;
	}
	
	@Override
	public double payment() {
		return this.getHours()*this.getValuePerHours()+adicionalCharge*0.10;
	}

	public double getAdicionalCharge() {
		return adicionalCharge;
	}

	public void setAdicionalCharge(double adicionalCharge) {
		this.adicionalCharge = adicionalCharge;
	}

}