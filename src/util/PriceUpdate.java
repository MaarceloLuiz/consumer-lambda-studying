package util;

import java.util.function.Consumer;

import entities.Product;

//implementando o Consumer à nossa classe
public class PriceUpdate implements Consumer<Product>{

	@Override
	public void accept(Product p) {
		p.setPrice(p.getPrice() * 1.1);
		
	}

}
