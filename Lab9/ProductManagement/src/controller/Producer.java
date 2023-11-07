    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import model.Product;

/**
 *
 * @author quock
 */
public class Producer {

    private List<Product> productlist = new ArrayList<>();

    public void readDataFromFile() throws IOException {
        try {
            BufferedReader br = new BufferedReader(new FileReader("product.txt"));
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                String productID = parts[0];
                String productName = parts[1];
                double unitPrice = Double.parseDouble(parts[2]);
                int quantity = Integer.parseInt(parts[3]);
                String version = parts[4];
                int productManufacturingDate = Integer.parseInt(parts[5]);
                productlist.add(new Product(productID, productName, unitPrice, quantity, version, productManufacturingDate));
            }
            br.close();
        } catch (FileNotFoundException ex) {
            System.err.println("Error reading data from the file.");
        }

    }

    public void searchProductByCriteria() {
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        do {
            System.out.println("Product Searching");
            System.out.println("1. Find by ProductID");
            System.out.println("2. Find by ProductName");
            System.out.println("3. Find by Product ManufacturingDate");
            System.out.println("4. Exit");
            System.out.println("------------------------");
            System.out.print("Enter selection: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Enter product ID to search: ");
                    String searchProductID = sc.nextLine();
                    for (Product product : productlist) {
                        if (searchProductID.equals(product.getProductID())) {
                            System.out.println("ProductID found: " + product);
                        }
                    }
                    break;
                case 2:
                    System.out.println("Enter ProductName to search: ");
                    String searchProductName = sc.nextLine();
                    for (Product product : productlist) {
                        if (searchProductName.equals(product.getProductName())) {
                            System.out.println("ProductName found: " + product);
                        }
                    }
                    break;
                case 3:
                    System.out.println("Enter ProductManufacturingDate to search: ");
                    int searchProductManufacturingDate = sc.nextInt();
                    for (Product product : productlist) {
                        if (searchProductManufacturingDate == product.getProductManufacturingDate()) {
                            System.out.println("ProductManufacturingDate found: " + product);
                        }
                    }
                    break;
                case 4:
                    System.out.println("Exiting product search.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 4);
    }

    public void printProducList() {
        for (Product product : productlist) {
            System.out.println(product.toString());
        }
    }

//    public void addNewProduct(Product pd) {
//        productlist.add(pd);
//    }
    public void addProductFromConsole() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Add a new Product:");

        // Read input for each attribute
        System.out.print("Product ID: ");
        String productID = scanner.nextLine();

        System.out.print("Product Name: ");
        String productName = scanner.nextLine();

        System.out.print("Unit Price: ");
        double unitPrice = scanner.nextDouble();

        System.out.print("Quantity: ");
        int quantity = scanner.nextInt();

        System.out.print("Version: ");
        String version = scanner.nextLine();

        System.out.print("Manufacturing Day (1-365): ");
        int productManufacturingDay = scanner.nextInt();

        // Create a new Product object with the provided information
        Product newProduct = new Product(productID, productName, unitPrice, quantity, version, productManufacturingDay);

        // Add the new product to the productList
        productlist.add(newProduct);

        System.out.println("Product added successfully.");
    }

    public void sortProductList() {
        Collections.sort(productlist);
    }

    public void saveProductToFile() {
        try {
            PrintWriter pw = new PrintWriter(new FileWriter("product_output.txt"));
            for (Product product : productlist) {
                pw.println(product.toString());
            }
            pw.flush();
            pw.close();
        } catch (IOException ex) {
            System.out.println("Error writing data to the file. ");
        }

    }

}
