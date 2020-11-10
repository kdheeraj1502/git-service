package util;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import service.Product;

public class AmountCalculationUtil {

	public static double total(Map<String, Map<Product, Double>> cart_items) {
		return cart_items.entrySet().stream().map(p -> {
			return p.getValue().entrySet().stream().map(m -> m.getValue());
		}).flatMap(d -> d).mapToDouble(Double::valueOf).sum();
	}

	public static double existingPrice(Map<Product, Double> cart_items) {
		return cart_items.entrySet().stream().map(m -> {
			return m.getValue();
		}).mapToDouble(d -> d).sum();
	}

	public static Product existingProductDetail(Map<Product, Double> cart_items) {
		return cart_items.entrySet().stream().map(m -> m.getKey()).collect(Collectors.toList()).get(0);

	}
}
