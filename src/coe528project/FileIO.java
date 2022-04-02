package coe528project;

import java.util.ArrayList;
import java.io.*;

public final class FileIO {
    private static String booksFile = "./books.txt";
    private static String customersFile = "./customers.txt";
    
    public static ArrayList<Book> books = new ArrayList<Book>();
    public static ArrayList<Customer> customers = new ArrayList<Customer>();
    
    public static void saveBooks(){
        try {
            FileWriter fileWriter = new FileWriter(booksFile);
            for (int i = 0; i < books.size(); i++){
                Book book = books.get(i);
                fileWriter.write(book.getName() + "\n");
                fileWriter.write(book.getPrice() + "\n");
            }
            fileWriter.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
    
    public static void loadBooks(){
        try {
            books = new ArrayList<Book>();
            FileReader fileReader = new FileReader(booksFile);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            
            String input;
            String bookName = "";
            String bookPrice = "";
            while ((input = bufferedReader.readLine()) != null) {
                bookName = input;
                input = bufferedReader.readLine();
                bookPrice = input;
                
                double price = Double.parseDouble(bookPrice);
                
                books.add(new Book(bookName, price));
            }
            fileReader.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }    
    }
    
    public static void saveCustomers(){
        try {
            FileWriter fileWriter = new FileWriter(customersFile);
            for (int i = 0; i < customers.size(); i++){
                Customer customer = customers.get(i);
                fileWriter.write(customer.getUsername() + "\n");
                fileWriter.write(customer.getPassword() + "\n");
                fileWriter.write(customer.getPoints() + "\n");
            }
            fileWriter.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
    
    public static void loadCustomers(){
        try {
            customers = new ArrayList<Customer>();
            FileReader fileReader = new FileReader(customersFile);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            
            String input;
            String customerUsername;
            String customerPassword;
            String customerPoints;
            while ((input = bufferedReader.readLine()) != null) {
                customerUsername = input;
                input = bufferedReader.readLine();
                customerPassword = input;
                input = bufferedReader.readLine();
                customerPoints = input;
                
                int points = Integer.parseInt(customerPoints);
                
                customers.add(new Customer(customerUsername, customerPassword, points));
            }
            fileReader.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }    
    }
}
