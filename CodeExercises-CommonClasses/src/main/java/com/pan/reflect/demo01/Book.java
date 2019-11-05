package com.pan.reflect.demo01;

/**
 * @author panyexiong
 * @version 1.0
 * @date 2019/11/5 10:26
 */
public class Book {
    private final static String TAG = "BookTag";

    private String name;
    private String author;

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                '}';
    }

    public Book() {
    }

    public Book(String name, String author) {
        this.name = name;
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    private String declaredMethod(int index) {
        String string = null;
        switch (index) {
            case 0:
                string = "I am 1";
                break;
            case 1:
                string = "I am 2";
                break;
            default:
                string = "I am 2";
        }
        return string;
    }


}
