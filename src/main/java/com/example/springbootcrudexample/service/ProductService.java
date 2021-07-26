package com.example.springbootcrudexample.service;

import com.example.springbootcrudexample.entity.Product;
import com.example.springbootcrudexample.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    ProductRepository repository;

    public Product saveProduct(Product product)
    {
        return repository.save(product);
    }

    public List<Product> saveProducts(List<Product> products)
    {
        return repository.saveAll(products);
    }

    public List<Product> getProducts()
    {
        return repository.findAll();
    }

    public Product getProductById(int id)
    {
        return repository.findById(id).orElse(null);
    }

    public Product getProductByName(String name)
    {
        return repository.findByName(name);
    }

    public String deleteProduct(int id)
    {
        repository.deleteById(id);
        return "Product removed "+id;
    }

    public Product updateProduct(Product product)
    {
        Product exProduct = repository.findById(product.getId()).orElse(null);
        exProduct.setName(product.getName());
        exProduct.setPrice(product.getPrice());
        exProduct.setQuantity(product.getQuantity());
        return repository.save(exProduct);
    }
}
