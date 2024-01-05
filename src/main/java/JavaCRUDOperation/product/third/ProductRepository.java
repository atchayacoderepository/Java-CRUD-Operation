package JavaCRUDOperation.product.third;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

import JavaCRUDOperation.product.second.Product;



public interface ProductRepository  extends PagingAndSortingRepository<Product, Integer> {

		List<Product> findByName(String name);

		List<Product> findByNameAndDesc(String name, String desc);

		List<Product> findByPriceGreaterThan(Double price);

		List<Product> findByDescContains(String desc);

		List<Product> findByPriceBetween(Double price1, Double price2);

		List<Product> findByDescLike(String desc);

		List<Product> findByIdIn(List<Integer> ids,Pageable pageable);

		Product save(Product product);

		List<Product> findAll();

		Object findAllById(Iterable<Integer> id);

	}


