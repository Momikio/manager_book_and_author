package learnoop2.bai2.manager_book.model_and_controller;

import java.util.ArrayList;
import java.util.Scanner;

public class Author {
    private String nameAuthor;
    private int age;
    private int bornDay;
    private String butDanh;
    private String homeTown;
    private static ArrayList<Author> author = new ArrayList<>();

    public static boolean checkButDanh(String butDanhAuthor)
    {
        for(int i=0 ; i< author.size() ; i++)
        {
            Author ar=author.get(i);
            String str=ar.getButDanh() ;
            if(str.compareToIgnoreCase(butDanhAuthor)==0){
                return true;
            }
        }
        return false;
    }
    /**
     * @param nameAuthor
     * @param age
     * @param bornDay
     * @param butDanh
     * @param homeTown
     */
    public Author(String nameAuthor, int age, int bornDay, String butDanh, String homeTown) {
        this.nameAuthor = nameAuthor;
        this.age = age;
        this.bornDay = bornDay;
        this.butDanh = butDanh;
        this.homeTown = homeTown;
    }

    /**
     * 
     */
    public Author() {
    }

    /**
     * @return the nameAuthor
     */
    public String getNameAuthor() {
        return nameAuthor;
    }

    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @return the bornDay
     */
    public int getBornDay() {
        return bornDay;
    }

    /**
     * @return the butDanh
     */
    public String getButDanh() {
        return butDanh;
    }

    /**
     * @return the homeTown
     */
    public String getHomeTown() {
        return homeTown;
    }
   
    public static void add(Author c)
    {
        author.add(c);
    }
}