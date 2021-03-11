package ru.geekbrains.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.geekbrains.entity.Product;

@RestController
public class ConvertController {
    ObjectMapper objectMapper = new ObjectMapper();
    XmlMapper xmlMapper = new XmlMapper();
    @GetMapping("/test_json")
    public String getJson() throws JsonProcessingException {
        Product product = new Product(1, "1", 10);
        return objectMapper.writeValueAsString(product);
    }
    @GetMapping("/test_xml")
    public String getXML() throws JsonProcessingException {
        Product product = new Product(1, "1", 10);
        return xmlMapper.writeValueAsString(product);
    }

}
