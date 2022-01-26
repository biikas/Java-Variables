package AssignmentDemo;

public class Triangle {
	
	
	void area(float base,float height){
		float area= (float) (0.5*base*height);
		System.out.println(area);
	}
	public static void main(String[] args) {
		Triangle t1 = new Triangle();
		t1.area(40, 60);
		
		
	}
}
