package org.example.EcommerceSpring.DTO;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class FakeStoreProductResponseDTO {
    private ProductDTO product;
    private String message;
    private String status;
}
