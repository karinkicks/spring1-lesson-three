package ru.geekbrains.servlet;

import org.springframework.stereotype.Service;
import ru.geekbrains.entity.Product;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductRepositoryService {
    Product p1 = new Product(1, "Продукт 1", 10);
    Product p2 = new Product(2, "Продукт 2", 11);
    Product p3 = new Product(3, "Продукт 3", 12);
    Product p4 = new Product(4, "Продукт 4", 13);
    Product p5 = new Product(5, "Продукт 5", 14);

    private final  List<Product> products = new ArrayList<>(Arrays.asList(p1, p2, p3, p4, p5));

    public List<Product> getProducts() {
        return products;
    }

    public Product getProductId(int id) {
        return products.get(id);
    }

    public void addProduct(Product product){
        products.add(product);
    }
}
