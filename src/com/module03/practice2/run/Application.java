package com.module03.practice2.run;

import com.module03.practice2.dto.BookDTO;

public class Application {
    public static void main(String[] args) {
        // 기본생성자를 이용하여 첫 번째 BookDTO 객체 생성
        BookDTO book1 = new BookDTO();
        // 매개변수 생성자를 이용하여 두 번째 BookDTO 객체 생성 (사용 데이터 참고)
        BookDTO book2 = new BookDTO("자바의 정석", 20000, 0.2, "윤상섭");

        // 객체가 가진 필드 값 출력 확인
        System.out.println(book1.getInformation());
        System.out.println(book2.getInformation());
        System.out.println("========================");

        // 첫 번째 객체가 가진 값을 setter를 이용하여 수정
        book1.setTitle("C언어");
        book1.setPrice(30000);
        book1.setDiscountRate(0.1);
        book1.setAuthor("홍길동");

        // 수정된 내용 출력 확인
        System.out.println(book1.getInformation());
        System.out.println("========================");

        // 각 객체의 할인율을 적용한 책 가격을 계산해서 출력
        book1.showCode(book1.getPrice(), book1.getDiscountRate(), book1.getTitle());
        book2.showCode(book2.getPrice(), book2.getDiscountRate(), book2.getTitle());
    }
}
