package application;

import java.util.Date;

import model.entities.Department;
import model.entities.Saller;

public class Program {

	public static void main(String[] args) {

		Department obj = new Department(1, "Books");
		
		Saller saller = new Saller(21, "Bob", null, new Date(), 3000.0, obj);
		
		System.out.println(saller);
	}

}
