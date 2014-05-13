package piorty_queue;

import java.util.Arrays;

public class ClassTest {
	public static void main(String[] args) {
		Car[] CarArrays = new Car[] {
				new Car("TOYOTA","Ã¶à¡ë§",600000),
				new Car("ISUZU","¡ÃÐºÐ",700000)};
				Arrays.sort(CarArrays);
				System.out.println(Arrays.toString(CarArrays));
}
}
