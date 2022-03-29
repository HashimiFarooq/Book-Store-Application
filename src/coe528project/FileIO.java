package coe528project;

import java.util.ArrayList;
import java.io.*;

public final class FileIO {
    private static String bookFile = "./books.txt";
    
    public static ArrayList<Book> books = new ArrayList<Book>();
    
    public static void saveBooks(){
        try {
            FileWriter fileWriter = new FileWriter(bookFile);
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
            FileReader fileReader = new FileReader(bookFile);
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
}
