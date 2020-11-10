package service;

import java.util.*;

import util.AmountCalculationUtil;

public class CartService {

	Map<String, Map<Product, Double>> cart_items;

	public CartService() {
		cart_items = new HashMap<>();
	}

	public Map<String, Map<Product, Double>> addInCart(Product product) {
		Map<Product, Double> product_map = new HashMap<>();
		double total = cart_items.get(product.getName()) != null
				? AmountCalculationUtil.existingPrice(cart_items.get(product.getName()))
						+ product.getPrice() * product.getQuntity()
				: product.getPrice() * product.getQuntity();
		product_map.put(product, total);
		cart_items.put(product.getName(), product_map);
		return cart_items;
	}
	
	public static void main(String[] args) {
		String A[] = {"i:46:789"};
		Map<Integer, Integer > map = new HashMap<>();
		if(A[0].charAt(0) == 'i'){
			String sp [] = A[0].split(":");
			System.out.println(Arrays.toString(sp));
			map.put(Integer.parseInt(sp[1]), Integer.parseInt(sp[2]));
		}
		System.out.println(map);
	}
}
