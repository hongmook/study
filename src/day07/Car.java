package day07;

public class Car {
	
	
	private static Car car = new Car();
	private String company;
	
	private Car(){
		
	}
	
	//static�� static������
	static Car getCar(){
		return car;
	}
	
	void setCompany(String company){
		this.company = company;
	}
	
	String getCompany(){
		return company;
	}
	
	
	
	
	
	
}
