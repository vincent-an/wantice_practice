package com.module03.practice1.run;

import com.module03.practice1.dto.ProductDTO;

public class Application {
    public static void main(String[] args) {

        // 매개변수 생성자를 이용하여 3개의 객체 생성 (위의 사용데이터 참고)
        ProductDTO dto = new ProductDTO("ssgnote9", "갤럭시노트",
                "경기도 수원", 960000, 10.0);

        ProductDTO dto1 = new ProductDTO("lgxnote5", "LG스마트폰5",
                "경기도 평택", 780000, 0.7);

        ProductDTO dto2 = new ProductDTO("ktsnote3", "KT스마트폰3",
                "서울시 강남", 250000, 0.3);

        // 객체가 가진 필드 값 출력 확인
        System.out.println(dto);
        System.out.println(dto1);
        System.out.println(dto2);
        System.out.println("========================================");
        dto.setPriceAndTax(1200000, 0.05);
        dto1.setPriceAndTax(1200000, 0.05);
        dto2.setPriceAndTax(1200000, 0.05);
        System.out.println(dto);
        System.out.println(dto1);
        System.out.println(dto2);
        System.out.println("========================================");
        dto.showCode(dto.getPrice(), dto.getTax(), dto.getProductName());
        dto1.showCode(dto1.getPrice(), dto1.getTax(), dto1.getProductName());
        dto2.showCode(dto2.getPrice(), dto2.getTax(), dto2.getProductName());

    }
}
