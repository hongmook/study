package day13;

public class Worker extends Person {
	
	private String job;
	
	Worker(String name){
		super(name);
	}

	public String getJob() {
		return job;
	}
	
	public void setJob(String job) {
		this.job = job;
	}
	
}
