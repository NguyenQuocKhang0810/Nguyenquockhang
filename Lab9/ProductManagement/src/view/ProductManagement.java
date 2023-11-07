package view;

import controller.Producer;

public class ProductManagement extends Menu {
    private Producer producer;

    public ProductManagement(Producer producer) {
        this.producer = producer;
        title = "Product Management Menu";
        list.add("List all Products");
        list.add("Product Search");
        list.add("Add new Product");
        list.add("Exit");
    }

    @Override
    public void execute(int choice) {
        switch (choice) {
            case 1:
                producer.printProducList();
                break;
            case 2:
                producer.searchProductByCriteria();
                break;
            case 3:
                producer.addProductFromConsole();
                break;
            case 4:
                System.out.println("Exiting the application.");
                producer.saveProductToFile();
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
        }
    }
}
