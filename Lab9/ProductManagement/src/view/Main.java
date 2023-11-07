package view;

import controller.Producer;


public class Main {

    public static void main(String[] args) {

        Producer producer = new Producer();
        try {
            producer.readDataFromFile();
        } catch (Exception e) {
        }
        ProductManagement productManagement = new ProductManagement(producer);
        
        productManagement.run();
    }
}
