package com.example.controller;

import com.example.model.Product;
import com.example.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductService service;

    // GET ALL
    @GetMapping
    public List<Product> getAll() {
        return service.getAll();
    }

    // GET BY ID
    @GetMapping("/{id}")
    public Product getById(@PathVariable int id) {
        return service.getById(id);
    }

    // POST (CREATE)
    @PostMapping
    public Product create(@RequestBody Product p) {
        return service.save(p);
    }

    // PUT (UPDATE)
    @PutMapping("/{id}")
    public Product update(@PathVariable int id, @RequestBody Product p) {
        return service.update(id, p);
    }

    // DELETE
    @DeleteMapping("/{id}")
    public String delete(@PathVariable int id) {
        service.delete(id);
        return "Product Deleted Successfully";
    }
}
