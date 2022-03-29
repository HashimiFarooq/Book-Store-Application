package coe528project;

import java.util.ArrayList;
import java.io.*;

public final class FileIO {
    private static String bookFile = "./books.txt";
    
    public static ArrayList<Book> books = new ArrayList<Book>();
    
    public static void saveBooks(){
        try {
            FileWriter fileWriter = new FileWriter(bookFile, true);
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
        
    }
}
