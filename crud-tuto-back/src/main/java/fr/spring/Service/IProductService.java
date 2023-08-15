package fr.spring.service;

import java.util.List;

import fr.spring.entity.Product;

public interface IProductService {

	Product addProduct(Product p);

	Product editProduct(Product p);

	void deleteProduct(Long idProduct);

	List<Product> retrieveAll();
}
