package com.example.androidfinal;

public class Item {
    private String sellerName;
    private String productName;
    private int productImage;

    // Constructor
    public Item(String sellerName, String productName, int productImage) {
        this.sellerName = sellerName;
        this.productName = productName;
        this.productImage = productImage;
    }

    // Getters
    public String getSellerName() {
        return sellerName;
    }

    public String getProductName() {
        return productName;
    }

    public int getProductImage() {
        return productImage;
    }
}

