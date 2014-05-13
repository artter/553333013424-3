package lab1;

import java.util.Arrays;

public class Ramsey {
	private String name;
	private String position;
	private String friend[];
	public Ramsey() {
		name = "Ramsey";
		position = "RB";
		friend = new String[]{"Walcott","Ozil","Wilshere"};
	}
	public Ramsey(int a) {
		System.out.println("Ramsey Overloading 1");
	}
	public String getName(){			
		return name;		
	}
	public String getPosition(){			
		return position;		
	}
	public String[] getFriend(){			
		return friend;		
	}
	public static void main(String[] args) {
		Ramsey ramsey = new Ramsey();
		System.out.println("name : "+ramsey.getName());
		System.out.println("position : "+ramsey.getPosition());
		System.out.println("friend : "+Arrays.toString(ramsey.getFriend()));
		new Ramsey(1);
	}

}
