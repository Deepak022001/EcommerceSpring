package org.example.EcommerceSpring.dto;

import lombok.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class FakeStoreProductResponseDTO {
    private ProductDTO product;
    private String message;
    private String status;
}
