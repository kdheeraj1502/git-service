package test;

import static org.junit.Assert.assertEquals;

import java.util.*;
import org.junit.Test;
import service.CartService;
import service.Product;
import util.AmountCalculationUtil;

public class CartServiceTests {
	
	String str = String.valueOf('o');

	@Test
	public void addInCartTest() {
		CartService cs = new CartService();
		Map<String, Map<Product, Double>> cart_items = new HashMap<>();
		List<Product> products = Arrays.asList(new Product("Dove", 2, 20.0), new Product("axe", 2, 100.0),
				new Product("Dove", 1, 0.0));

		for (Product prod : products) {
			cart_items.putAll(cs.addInCart(prod));
		}
		Double actual = AmountCalculationUtil.total(cart_items);
		assertEquals(Double.valueOf(actual), Double.valueOf(240.0));
		
	}

	@Test
	public void addInCartForMoreProductTest() {
		CartService cs = new CartService();
		Product product = new Product("Dove", 2, 20.0);
		Map<String, Map<Product, Double>> cart_items = cs.addInCart(product);
		assertEquals(Double.valueOf(AmountCalculationUtil.total(cart_items)), Double.valueOf(40.0));
	}

}
