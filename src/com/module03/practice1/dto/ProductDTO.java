package com.module03.practice1.dto;

public class ProductDTO {
    private String productid; // 상품 아이디
    private String productName; // 상품명
    private String productArea;
    private int price;
    private double tax;
    int totalPrice;


    @Override
    public String toString() { // 문제에서 getInformation 역활
        return productid + " " + productName + " " + productArea + " " + price + " " + tax;
    }

    public ProductDTO() {}

    public ProductDTO(String productid, String productName, String productArea, int price, double tax) {
        this.productid = productid;
        this.productName = productName;
        this.productArea = productArea;
        this.price = price;
        this.tax = tax;
    }

    public void showCode(int price, double tax, String productName) {
        setTotalPrice(price, tax);
        System.out.println("상품명 = " + productName);
        System.out.println("부가세 포함 가격 = " + getTotalPrice() + "원");
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(int price, double tax) {
        totalPrice = (int)(price + (price * tax));
    }

    public void setPriceAndTax(int price, double tax) {
        this.price = price;
        this.tax = tax;
    }

    public String getProductName() {
        return productName;
    }

    public int getPrice() {
        return price;
    }

    public double getTax() {
        return tax;
    }
}
