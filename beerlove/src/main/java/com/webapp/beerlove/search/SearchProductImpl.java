package com.webapp.beerlove.search;

import com.webapp.beerlove.homepage.Product;
import com.webapp.beerlove.productrepo.ProductRepo;

import java.util.List;

public class SearchProductImpl implements SearchProduct {

    private final ProductRepo productrepo;

    public SearchProductImpl(ProductRepo productrepo) {
            this.productrepo=productrepo;
    }
   // @Override
   // public Product searchprod(int id) {
    //    return productrepo.getOne(id);
   // }
    @Override
    public List<Product> searchall( ) {
        return productrepo.findAll();
    }
}
