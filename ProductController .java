// Product.java
public class Product {
    private Long id;
    private String name;
    private double price;

    // Getters and setters
}

// ProductController.java
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class ProductController {
    @GetMapping("/api/products")
    public List<Product> getProducts() {
        // Replace this with actual logic to fetch products from a database
        List<Product> products = productService.fetchProducts();
        return products;
    }
}









// App.js
import React, { useState, useEffect } from 'react';

function App() {
  const [products, setProducts] = useState([]);

  useEffect(() => {
    // Fetch products from the API
    fetch('/api/products')
      .then(response => response.json())
      .then(data => setProducts(data));
  }, []);

  return (
    <div>
      <h1>Our Products</h1>
      <ul>
        {products.map(product => (
          <li key={product.id}>{product.name} - ${product.price}</li>
        ))}
      </ul>
    </div>
  );
}

export default App;