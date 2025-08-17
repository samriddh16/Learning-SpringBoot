package com.service;

import java.util.List;

import com.entity.offers.Offers;
import com.entity.product.Product;


public interface IProductMgmtService {
    public   String  registerProducts(List<Product> list);
    public   String   registerOffers(List<Offers> list);
    public   List<Product>  showAllProducts();
    public   List<Offers>  showAllOffers();
}
