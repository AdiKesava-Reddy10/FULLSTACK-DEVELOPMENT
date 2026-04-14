package com.example.service;

import com.example.model.Product;
import com.example.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repo;

    public Product save(Product p) {
        return repo.save(p);
    }

    public List<Product> getAll() {
        return repo.findAll();
    }

    public Product getById(int id) {
        return repo.findById(id).orElse(null);
    }

    public Product update(int id, Product p) {
        Product existing = repo.findById(id).orElse(null);
        if (existing != null) {
            existing.setName(p.getName());
            existing.setPrice(p.getPrice());
            existing.setQuantity(p.getQuantity());
            return repo.save(existing);
        }
        return null;
    }

    public void delete(int id) {
        repo.deleteById(id);
    }
}
