package com.module03.practice1.run;

import com.module03.practice1.dto.ProductDTO;

public class Appliction2 {
    public static void main(String[] args) {

        ProductDTO[] products = {
                new ProductDTO("ssgnote9", "갤럭시노트9", "경기도 수원", 960000, 10.0),
                new ProductDTO("lgxnote5", "LG스마트폰5", "경기도 평택", 780000, 0.7),
                new ProductDTO("ktsnote3", "KT스마트폰3", "서울시 강남", 250000, 0.3)
        };

        for (int i = 0; i < products.length; i++) {
            System.out.println(products[i]);
        }
        System.out.println("========================================");

        for (ProductDTO productdto : products) {
            productdto.setPriceAndTax(1200000, 0.05);
            System.out.println(productdto);
        }
        System.out.println("========================================");

        for (ProductDTO productdto : products) {
            productdto.showCode(productdto.getPrice(), productdto.getTax(), productdto.getProductName());
        }
    }
}
