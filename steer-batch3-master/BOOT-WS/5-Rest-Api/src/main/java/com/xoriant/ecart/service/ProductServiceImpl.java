package com.xoriant.ecart.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xoriant.ecart.dao.ProductDao;
import com.xoriant.ecart.model.Brand;
import com.xoriant.ecart.model.Category;
import com.xoriant.ecart.model.Product;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductDao productDao;

	@Override
	public Product save(Product product) {
		return productDao.save(product);
	}

	@Override
	public List<Category> findAllCatogories() {
		return productDao.findAllCatogories();
	}

	@Override
	public Product findById(int productId) {
		return productDao.findById(productId);
	}

	@Override
	public List<Brand> findAllBrands() {
		return productDao.findAllBrands();
	}

	@Override
	public List<Product> filterProductsByBrandName(String brandName) {
		return productDao.filterProductsByBrandName(brandName);
	}

	@Override
	public List<Product> filterProductsByMaxPriceRange(int maxPrice) {
		return productDao.filterProductsByMaxPriceRange(maxPrice);
	}

	@Override
	public List<Product> filterProductsByMinAndMaxRange(int minPrice, int maxPrice) {
		return productDao.filterProductsByMinAndMaxRange(minPrice, maxPrice);
	}

	@Override
	public List<Product> findAll() {
		return productDao.findAll();
	}

	@Override
	public List<Product> getProductByCategory(int catagoryId) {
		return productDao.getProductByCategory(catagoryId);
	}

	@Override
	public List<Product> findProductByName(String productName) {
		return productDao.findProductByName(productName);
	}

}
