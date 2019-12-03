package com.webapp.beerlove.bootstrap;

import com.webapp.beerlove.homepage.Product;
import com.webapp.beerlove.productrepo.ProductRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootstrapData implements CommandLineRunner {
    private final ProductRepo productrepo;

    public BootstrapData(ProductRepo productrepo) {
        this.productrepo = productrepo;
    }

    @Override
    public void run(String... args) throws Exception {

        System.out.println("Loading Products data");

        Product p1 = new Product();
        p1.setId(01);
        p1.setName("Royal Stag");
        p1.setLink("www.google.com  ");
        p1.setStarred(true);
        productrepo.save(p1);

        Product p2 = new Product();
        p2.setId(02);
        p2.setName("KingFisher");
        p2.setLink("www.msn.com  ");
        p2.setStarred(false);
        productrepo.save(p2);

        System.out.println("Products Saved "+ productrepo.count());

    }

}
