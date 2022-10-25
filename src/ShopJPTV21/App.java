/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ShopJPTV21;

import entity.Product;
import entity.Info;
import entity.Customer;
import entity.InfoCustomer;

import java.util.Arrays;
import java.util.Scanner;
import shopmanagers.ShopManager;


public class App {
    private Product[] products;
    private Customer[] productsCustomer;
    private final ShopManager shopManager;

    public App() {
        testAddProduct();
        testAddCustomer();
        shopManager = new ShopManager();
    }
    
    public void run(){
        boolean repeat = true;
        Scanner scanner = new Scanner(System.in);
        do{
 
            System.out.println("Список задач магазина: ");
            System.out.println("0. Закрыть приложение");
            System.out.println("1. Добавить продукт");
            System.out.println("2. Список продоваемых товаров");
            System.out.println("3. Добавить покупателя");
            System.out.println("4. Список зарегестрированных покупателей");
            System.out.println("5. Покупка покупателем продукта");
            System.out.println("6. Доход магазина за все время");
            System.out.println("7. Добавить денег покупателю");
            System.out.print("Выберите номер задачи: ");
            
            int task = scanner.nextInt();
            
            scanner.nextLine();
            
            System.out.println("=------------------=");
            switch (task) {
                case 0:
                    repeat = false;
                    System.out.println("Задача 0. Закрыть приложение");
                    break;
                case 1:
                    System.out.println("Задача 1. Добавить продукт(name)");
                    this.products = Arrays.copyOf(this.products, this.products.length+1);
                    this.products[this.products.length-1] = shopManager.createProduct();
                    break;
                case 2:
                    System.out.println("Задача 2. Список товаров(count)");
                    shopManager.printListProducts(products);
                    break;                
                case 3:
                    System.out.println("Задача 3. Добавить покупателя");
                    this.productsCustomer = Arrays.copyOf(this.productsCustomer, this.productsCustomer.length+1);
                    this.productsCustomer[this.productsCustomer.length-1] = shopManager.createCustomer();
                    break;
                    
                case 4:
                    System.out.println("Задача 4. Список покупателей(list)");
                    shopManager.printListCustomers(productsCustomer);
                    break;
                case 5:
                    System.out.println("Задача 5. Покупка покупателем продукта");

                    break;
                case 6:
                    System.out.println("Задача 6. Доход магазина за все время(PNL)");
                    break;
                case 7:
                    System.out.println("Задача 7. Добавить денег покупателю");
                    break;   
        
                default:
                    System.out.println("Выберите задачу из списка");
            }
            System.out.println("=======---------========");
        }while(repeat);
        System.out.println("Пока, ребята!");
    }
    

    private void testAddProduct() {
        this.products = new Product[0];
        Product product = new Product();
        product.setTitle("Moloko");
        Info info = new Info();
        info.setPrice("1");
        info.setCountProductInShop("10000");
        info.setFabricator("Alma");
        Info[] productInfos = new Info[1];
        productInfos[0] = info;
        product.setInfos(productInfos);
        this.products = Arrays.copyOf(this.products, this.products.length+1);
        this.products[this.products.length-1] = product;
    }
    
    
    
    private void testAddCustomer() {
        this.productsCustomer = new Customer[0];
        Customer customer = new Customer();
        customer.setName("Jhon Nikelson");
        InfoCustomer infocustomer = new InfoCustomer();
        infocustomer.setCash("200");
        infocustomer.setTelephone("+37251961296");
        InfoCustomer[] customerInfos = new InfoCustomer[1];
        customerInfos[0] = infocustomer;
        customer.setInfoscustomers(customerInfos);
        this.productsCustomer = Arrays.copyOf(this.productsCustomer, this.productsCustomer.length+1);
        this.productsCustomer[this.productsCustomer.length-1] = customer;
    }
}
