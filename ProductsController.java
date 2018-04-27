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
@RequestMapping("/products")
public class ProductsController {

	private Map<Long, Products> productsData = new HashMap<>();

	@GetMapping("/{id}")
	public Products getProducts(@PathVariable(name = "id") Long id) {
		return productsData.get(id);
	}

	@PostMapping
	public Long createProducts(@RequestBody Products products) {
		productsData.put(products.getId(), products);
		return products.getId();
	}

	@PutMapping
	public String updateProducts(@RequestBody Products products) {
		productsData.put(products.getId(), products);
		return "Ok";
	}

	@DeleteMapping(path = "/{id}")
	public String deleteProducts(@PathVariable(name = "id") Long id) {
		productsData.remove(id);
		return "Ok";

	}

}
