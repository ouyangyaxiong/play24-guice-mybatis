package service;

import java.util.List;

import model.Product;

import org.apache.ibatis.annotations.Select;

public interface ProductMapper {
	@Select("select * from product ")
	List<Product> getProducts();
}
