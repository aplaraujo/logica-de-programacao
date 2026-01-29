package io.github.aplaraujo.exercicio_5_spring.dto;

public class ChangeRequest {
    private double price;
    private int quantity;
    private double amount;

    public ChangeRequest(double price, int quantity, double amount) {
        this.price = price;
        this.quantity = quantity;
        this.amount = amount;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
