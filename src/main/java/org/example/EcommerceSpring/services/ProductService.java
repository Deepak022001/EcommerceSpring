package org.example.EcommerceSpring.services;
import org.example.EcommerceSpring.DTO.ProductDTO;
import org.example.EcommerceSpring.entity.Product;
import org.example.EcommerceSpring.mappers.ProductMapper;
import org.example.EcommerceSpring.repository.ProductRepository;
public class ProductService implements IProductService{
    private final ProductRepository productRepository;
    public ProductService(ProductRepository productRepository){
        this.productRepository=productRepository;
    }
    @Override
    public ProductDTO getProductById(Long id) throws Exception {
//        return productRepository.findById(id).map(ProductMapper::toDto).orElseThrow(()->new Exception("Product not found"));
        Product product =  productRepository.findById(id).orElseThrow(()->new Exception("Product not found"));
        ProductDTO dto = ProductMapper.toDto(product);
        return dto;
    }
    @Override
    public ProductDTO createProduct(ProductDTO dto){
        Product saved=productRepository.save(ProductMapper.toEntity(dto));
        System.out.println("repo here");
        return ProductMapper.toDto(saved);

    }
}
