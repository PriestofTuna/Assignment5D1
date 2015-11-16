
public class Student {
	private final int SIZE = 4;
	private String name;
	private double [] assignments = new double[SIZE];
	private double gpa;
	
	public Student() {
		name = "";
		assignments = new double[SIZE];
		gpa =0;
		
	}

	public Student(String name, double[] assignments, double gpa) {
		
		this.name = name;
		this.assignments = assignments;
		this.gpa = gpa;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double[] getAssignments() {
		return assignments;
	}

	public void setAssignments(double[] assignments) {
		this.assignments = assignments;
	}

	public double getGpa() {
		return calculateAVGScore();
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}
	
	private double calculateAVGScore() {
		//must modify this to do... Something? <7:00 video two
		double sum=0;
		if(this.assignments != null) { 
		for(int i=0; i<assignments.length; i++) {
			
				sum +=assignments[i];
			
		}
		this.gpa =sum/assignments.length;
	}
		return this.gpa;
	}
	
	public String toString() {
		String info="";
		info = "Student Name: " + this.name; 
			for(int i=0; i<assignments.length; i++) {
				info+="\n Assignment " + (i+1) + "\t" + assignments[i] + "\n";
			}
			info+= "gpa: " + this.gpa;
			return info;
	}
}