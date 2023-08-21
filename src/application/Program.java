package application;

	
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));
		
		// now we wont refer to the "PriceUpdate"
		// cause now we can just refer as our new static method
		list.forEach(Product::staticPriceUpdate);
		
		//print
		//reference method para o println
		list.forEach(System.out::println);
	}

}
