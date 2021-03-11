package ru.geekbrains.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import ru.geekbrains.entity.Product;
import ru.geekbrains.servlet.ProductRepositoryService;

import java.util.List;

@Controller
public class ProductRepositoryController {

    private final ProductRepositoryService productRepositoryService;
    public ProductRepositoryController(ProductRepositoryService productRepositoryService){
        this.productRepositoryService=productRepositoryService;
    }

    @GetMapping( "/product_repository")
    public String getForm(Model uiModel){
        uiModel.addAttribute("product", new Product());
        return "index";
    }

    @PostMapping("/product_repository/form")
    public String create(Product product) {
        productRepositoryService.addProduct(product);
        System.out.println(productRepositoryService.getProducts().size());
        return "index";
    }

    @GetMapping( "/product_repository_show")
    public String showProductRepository(Model uiModel){
        uiModel.addAttribute("product", productRepositoryService.getProducts());
        return "product_repo";
    }

}
