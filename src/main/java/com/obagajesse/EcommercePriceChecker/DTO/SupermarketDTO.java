package com.obagajesse.EcommercePriceChecker.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SupermarketDTO {

    private Long id;
    private String name;
    private String location;
    private String contactNumber;
    private String email;
    private String websiteUrl;
}
