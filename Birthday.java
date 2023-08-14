package basics;

import java.time.OffsetDateTime;

public class Birthday {

	int year;
	
	public Birthday() {
		// TODO Auto-generated constructor stub
		this.year=0;
		System.out.println("Recently Born");
	}
	
	public Birthday(int year) {
		this.year=year;
		
		OffsetDateTime offsetDateTime = OffsetDateTime.now();
		int age = offsetDateTime.getYear()-year;
		
		System.out.println("Your "+age+" years old.");
	}
}
