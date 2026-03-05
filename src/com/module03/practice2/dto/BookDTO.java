package com.module03.practice2.dto;

public class BookDTO {
    private String title;
    private int price;
    private double discountRate;
    private String author;
    private int totalPrice;

    public BookDTO() {}

    public BookDTO(String title, int price, double discountRate, String author) {
        this.title = title;
        this.price = price;
        this.discountRate = discountRate;
        this.author = author;
    }

    public void showCode(int price, double discountRate, String title) {
        setTotalPrice(price, discountRate);
        System.out.println("도서명 = " + title);
        System.out.println("할인된 가격 = " + getTotalPrice() + "원");
    }

    public void setTotalPrice(int price, double discountRate) {
        totalPrice = (int)(price - (price * discountRate));
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public String getInformation() {
        return title + " " + price + " " + discountRate + " " + author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public double getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(double discountRate) {
        this.discountRate = discountRate;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
