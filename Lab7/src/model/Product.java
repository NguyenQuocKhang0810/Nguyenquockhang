/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package model;

import java.util.Objects;

/**
 *
 * @author quock
 */
public class Product implements Comparable<Product> {

    private String productID;
    private String productName;
    private double unitPrice;
    private int quantity;
    private String version;
    private int productManufacturingDate;

    public Product() {
    }

    public Product(String productID, String productName, double unitPrice, int quantity, String version, int productManufacturingDate) {
        this.productID = productID;
        this.productName = productName;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
        this.version = version;
        this.productManufacturingDate = productManufacturingDate;
    }

    public String getProductID() {
        return productID;
    }

    public void setProductID(String productID) {
        this.productID = productID;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public int getProductManufacturingDate() {
        return productManufacturingDate;
    }

    public void setProductManufacturingDate(int productManufacturingDate) {
        this.productManufacturingDate = productManufacturingDate;
    }

    @Override
    public String toString() {
        return "Product{" + "productID=" + productID + ", productName=" + productName + ", unitPrice=" + unitPrice + ", quantity=" + quantity + ", version=" + version + ", productManufacturingDate=" + productManufacturingDate + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Product other = (Product) obj;
        if (this.quantity != other.quantity) {
            return false;
        }
        if (this.productManufacturingDate != other.productManufacturingDate) {
            return false;
        }
        if (!Objects.equals(this.productID, other.productID)) {
            return false;
        }
        if (!Objects.equals(this.productName, other.productName)) {
            return false;
        }
        if (!Objects.equals(this.unitPrice, other.unitPrice)) {
            return false;
        }
        return Objects.equals(this.version, other.version);
    }

    @Override
    public int compareTo(Product p1) {
        return this.productID.compareTo(p1.getProductID());
    }

}
