package training1;

public class DemoWatch {

	public static void main(String[] args) {
		Watch w1=new Watch();
		//w1.setData();
		//w1.displayData();
		
		w1.setBrand("guess");
		w1.setColour("blue");
		w1.setPrice("5k");
		
		//System.out.println(w1.getBrand());
		//System.out.println(w1.getColour());
		//System.out.println(w1.getPrice());
		System.out.println(w1);
	}
}
//toString() function - predefined, basically used to convert anything to String