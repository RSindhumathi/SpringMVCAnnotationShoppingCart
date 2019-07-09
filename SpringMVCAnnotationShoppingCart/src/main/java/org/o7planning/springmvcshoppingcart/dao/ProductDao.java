package org.o7planning.springmvcshoppingcart.dao;

import org.o7planning.springmvcshoppingcart.model.PaginationResult;
import org.o7planning.springmvcshoppingcart.model.ProductInfo;
import org.o7planning.springmvcshoppingcart.entity.Product;

public interface ProductDao {
	 public Product findProduct(String code);
	    
	    public ProductInfo findProductInfo(String code) ;
	  
	    
	    public PaginationResult<ProductInfo> queryProducts(int page,
	                       int maxResult, int maxNavigationPage  );
	    
	    public PaginationResult<ProductInfo> queryProducts(int page, int maxResult,
	                       int maxNavigationPage, String likeName);
	 
	    public void save(ProductInfo productInfo);
}
