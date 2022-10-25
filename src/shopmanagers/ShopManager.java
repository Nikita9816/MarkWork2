/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shopmanagers;

import entity.Info;
import entity.InfoCustomer;
import entity.Product;
import java.util.Scanner;
import entity.Customer;

public class ShopManager {
    private final Scanner scanner;
    
    public ShopManager() {
        this.scanner = new Scanner(System.in);
    }

    private InfoCustomer[] createInfoCustomers() {
        InfoCustomer[] infoscustomers = new InfoCustomer[1];
        for (int i = 0; i < 1; i++) {
            InfoCustomer infoscustomer = new InfoCustomer();
            System.out.print("Введте количество денег у покупателя: ");
            infoscustomer.setCash(scanner.nextLine());
            System.out.print("Введите номер покупателя: ");
            infoscustomer.setTelephone(scanner.nextLine());
            infoscustomers[i] = infoscustomer;
        }
        return infoscustomers;
    }
    

    
    public void printListProducts(Product[] products){
        
        for (int i = 0; i < products.length; i++) {
                        
                        Product product = products[i];
                        System.out.printf(i+1+". Product{title = %s%n",product.getTitle());
                        System.out.print("\tInfos = [\n");
            for (Info info : product.getInfos()) {
                System.out.printf("\t\tPrice: %s$ \n\t\tProduct count: %s t.k \n\t\tFabricator: %s.inc"
                        ,info.getPrice(),info.getCountProductInShop(),info.getFabricator());
            }
                        System.out.println("\t");
                    }
                    System.out.println("-----   -----");
    }
    
    
    
    
    private Info[] createInfos() {
        Info[] infos = new Info[1];
        for (int i = 0; i < 1; i++) {
            Info info = new Info();
            System.out.print("Цена продукта: "+"евро");
            info.setPrice(scanner.nextLine());
            System.out.print("Введите сколько товара вы купите: ");
            info.setCountProductInShop(scanner.nextLine());
            System.out.print("Введите фирму товара: ");
            info.setFabricator(scanner.nextLine());
            infos[i] = info;
        }
        return infos;
    }
    
    public Product createProduct(){
        Product product = new Product();
        System.out.print("Введите название продукта: ");
        product.setTitle(scanner.nextLine());
        product.setInfos(createInfos());
        return product;
    }
    public Customer createCustomer(){
        Customer customer = new Customer();
        System.out.print("Введите имя и фамилию покупателя: ");
        customer.setName(scanner.nextLine());
        customer.setInfoscustomers(createInfoCustomers());
        return customer;
    }
    
    
    
    
    public void printListCustomers(Customer[] customers){
        
        for (int i = 0; i < customers.length; i++) {
                        
                        Customer customer = customers[i];
                        System.out.printf(i+1  +  ". Worker title = %s%n",  customer.getName ());
                        System.out.print("\tInfos = \n");
            for (InfoCustomer infocustomer:customer.getInfoscustomers()) {
                System.out.printf("\tCustmer cash: %s \n\t\tcustomer telephone: %s\n"
                        , infocustomer.getCash(), infocustomer.getTelephone());
            }
                        System.out.println("\t");
                    }
                    System.out.println("-------   --------");
    }

}
