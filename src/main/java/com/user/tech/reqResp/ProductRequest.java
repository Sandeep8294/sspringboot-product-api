package com.user.tech.reqResp;

import jakarta.persistence.Column;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class ProductRequest {
    @NotBlank
    @Size(min = 4, max = 20, message = "Product name must be between 4 and 20 characters")
    public String name;
    public Double price;
    public String productType;
    public Long productCode;
    public Long year;
}
