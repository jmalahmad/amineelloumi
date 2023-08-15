package fr.spring.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;
import fr.spring.repository.ProductRepository;
import fr.spring.entity.Product;

@Service
@Slf4j
public class ProductServiceImpl implements IProductService {

	@Autowired
	ProductRepository productRepository;
	
	@Override
	public Product addProduct(Product p) {
		return productRepository.save(p);
	}
	@Override
	public Product editProduct(Product p) {
		return productRepository.save(p);
	}
	@Override
	public void deleteProduct(Long idProduct) {
		Optional<Product> product = productRepository.findById(idProduct);

		if (product.isPresent()) {
			productRepository.deleteById(idProduct);
		} else {
			log.info("No Product record exist for given id");
		}

	}
	@Override
	public List<Product> retrieveAll() {
		return productRepository.findAll();
	}

}
