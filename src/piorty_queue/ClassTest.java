package piorty_queue;

import java.util.Arrays;

public class ClassTest {
	public static void main(String[] args) {
		Car[] CarArrays = new Car[] {
				new Car("TOYOTA","ö��",600000),
				new Car("ISUZU","��к�",700000)};
				Arrays.sort(CarArrays);
				System.out.println(Arrays.toString(CarArrays));
}
}
