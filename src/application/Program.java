package application;

import java.util.Date;

import model.entities.seller;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		seller obj =  new seller(1, "Books");
		
		System.out.println(obj);
		
		Seller seller = new Seller(1, "Jose", "j@email.com", new Date(), 3000.0, obj);
		
		System.out.println(seller);
	}
}
