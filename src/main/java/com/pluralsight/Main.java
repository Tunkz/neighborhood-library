package com.pluralsight;

import java.util.Scanner;

public class Main {
    static Book[] bookLibrary = new Book[20];
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        bookLibrary[0] = new Book(123, "HarryPotter", "0-8293-7283-0");
        bookLibrary[1] = new Book(234, "One Piece", "0-4371-7141-8");
        bookLibrary[2] = new Book(345, "Bleach", "0-4140-4004-X");
        bookLibrary[3] = new Book(456, "Boruto", "0-7353-3426-9");
        bookLibrary[4] = new Book(567, "Demon Slayer", "0-7837-4351-3");
        System.out.println("Screens\nThe Store Home Page");
        String showAvailableBooks;


        while (true) {
            System.out.println(" Press \'A' Show Available Books\n Press \'B' Show Checked out books \n Press \'E' to close application \n Provide letter: ");
            char availableBooks = input.nextLine().charAt(0);
            switch (availableBooks) {

                case 'A':
                    System.out.println("Select a book to check out");
                    availableBooksMenu();
                    break;
                case 'B':
                    System.out.println("Show Checked out books");
                    checkedOutBooks();
                    break;
                case 'E':
                    System.out.println("Closing prorgram");
                    return;
                default:
                    System.out.println("PLease type the correct letter");

            }
        }


    }

    public static char getCharInput(Scanner scanner, String prompt) {
        System.out.print(prompt);
        char input = scanner.next().toUpperCase().charAt(0);
        scanner.nextLine();
        return input;
    }

    public static void availableBooksMenu() {

        System.out.println("Here are all the available books");

        for (int i = 0; i < 5; i++) {
            System.out.println(" The title is " + bookLibrary[i].getTitle() + " The ID of the book is " + bookLibrary[i].getId() +
                    " The ISBN of the book is " + bookLibrary[i].getIsbn());
        }


        while (true) {
            System.out.println(" Select \'A' to select a book or \n Select \'B' to go back to the main menu");
            char availableBooks = input.nextLine().charAt(0);
            switch (availableBooks) {

                case 'A':
                    System.out.println("Select a book by typing in the title/ id number");
                    String titleName = input.nextLine();
                    for (int i = 0; i < 5; i++) {
                        if (titleName.equalsIgnoreCase((bookLibrary[i].getTitle()))) {
                            System.out.println("What's your name? ");
                            String userName = input.nextLine();
                            bookLibrary[i].checkOut(userName);
                            System.out.println("Book checked out to " + userName);
                        }
                    }
                    break;
                case 'B':
                    System.out.println("Going back to the main menu");
                    return;
                default:
                    System.out.println("Please select a character");

            }
        }
    }

    public static void checkedOutBooks() {

        while (true) {
            System.out.println("These are the books that are checked out");
            for (int i = 0; i < 5; i++) {
                if (bookLibrary[i].isCheckedOut()) {
                    System.out.println(" The title is " + bookLibrary[i].getTitle() + " The ID of the book is " + bookLibrary[i].getId() +
                            " The ISBN of the book is " + bookLibrary[i].getIsbn() + "Chekched out by: " + bookLibrary[i].getCheckOutTo());
                }
            }
            System.out.println("Choose an Option: ");
            System.out.println("C - to Check In a book");
            System.out.println("X - to go back the home screen");
            char showCheckedOutBooks = input.nextLine().charAt(0);

            switch (showCheckedOutBooks) {


                case 'C':
                    System.out.println("To Check in a book: \n Please provide the ID of the book you want: \n");
                    int userId = input.nextInt();
                    input.nextLine();


                    for (int i = 0; i < 5; i++) {
                        if (userId == bookLibrary[i].getId()) {
                            bookLibrary[i].checkIn();
                            System.out.println("The book has been checked in. ");
                        }
                    }
                    break;

                case 'X':
                    System.out.println("To go back to the home screen");
                    return;
                default:
                    System.out.println("Please select an option");

            }

        }
    }
}