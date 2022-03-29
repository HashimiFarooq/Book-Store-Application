/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coe528project;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class FileIOTest {
    
    public FileIOTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        FileIO.books.add(new Book("Microelectronic Circuits 8th Edition", 100.5));
        FileIO.books.add(new Book("Introduction to Algorithms 3rd Edition", 99.99));
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of saveBooks method, of class FileIO.
     */
    @Test
    public void testSaveBooks() {
        System.out.println("saveBooks");
        FileIO.saveBooks();
    }

    /**
     * Test of loadBooks method, of class FileIO.
     */
    @Test
    public void testLoadBooks() {
        System.out.println("loadBooks");
        FileIO.loadBooks();
        for (int i = 0; i < FileIO.books.size(); i++){
            Book book = FileIO.books.get(i);
            System.out.println(book.getName() + ", " + book.getPrice());
        }
    }
    
}
