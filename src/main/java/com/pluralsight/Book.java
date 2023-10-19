package com.pluralsight;

public class Book {
    private int id;

    private String isbn;

    private String title;

    private boolean isCheckedOut;

    private String checkOutTo;


    public Book(int la, String title, String isbn) {
        this.id = la;
        this.title = title;
        this.isbn = isbn;
    }


    public void checkOut(String name) {
        isCheckedOut = true;
        checkOutTo = name;
    }

    public void checkIn() {
        checkOutTo = "";
        isCheckedOut = false;
    }


    public boolean isCheckedOut() {
        return isCheckedOut;

    }

    /*--getter/setter--*/
    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;

    }

    public void setCheckedOut(boolean checkedOut) {
        isCheckedOut = checkedOut;
    }

    public String getCheckOutTo() {
        return checkOutTo;
    }

    public void setCheckOutTo(String checkOutTo) {
        this.checkOutTo = checkOutTo;

    }
}


