package org.example.EcommerceSpring.DTO;

import lombok.*;

import java.util.List;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class FakeStoreCategoreResponseDTO {
    private String status;
    private String message;
    private List<String> categories;
}
