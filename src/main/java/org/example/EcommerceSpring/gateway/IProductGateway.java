package org.example.EcommerceSpring.gateway;

import org.example.EcommerceSpring.dto.ProductDTO;
import org.springframework.stereotype.Controller;

@Controller
public interface IProductGateway {
    ProductDTO getProductById(Long id) throws Exception;
}
