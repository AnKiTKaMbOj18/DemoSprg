package kamboj.ankit;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products2")
public class ProductsController2 {

	private Map<Long, Products> productsData = new HashMap<>();

	@GetMapping("/")
	public Map<Long, Products> getAllProducts() {
		return productsData;
	}

	@GetMapping("/{id}")
	public Products getProduct(@PathVariable Long id) {
		return productsData.get(id);
	}

	@PostMapping
	public Long createProduct(@RequestBody Products products) {
		productsData.put(products.getId(), products);
		return products.getId();
	}

	@PutMapping("/{id}")
	public String updateProduct(@RequestBody Products products, @PathVariable Long id) {
		productsData.put(products.getId(), products);
		return "selected product updated";
	}

	@DeleteMapping("/{id}")
	public String deleteProduct(@PathVariable Long id) {
		productsData.remove(id);
		return "selected product deleted";
	}
}
