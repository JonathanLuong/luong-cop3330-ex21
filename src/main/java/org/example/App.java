package org.example;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Jonathan Luong
 */

import java.util.Scanner;
import java.util.Calendar;

public class App
{
    public static void main( String[] args )
    {
        Scanner reader = new Scanner(System.in); // Creates reader

        System.out.println( "Please enter the number of the month: " );
        String month = reader.nextLine();

        String monthString;
        switch (month) {
            case "1":  monthString = "January";
                break;
            case "2":  monthString = "February";
                break;
            case "3":  monthString = "March";
                break;
            case "4":  monthString = "April";
                break;
            case "5":  monthString = "May";
                break;
            case "6":  monthString = "June";
                break;
            case "7":  monthString = "July";
                break;
            case "8":  monthString = "August";
                break;
            case "9":  monthString = "September";
                break;
            case "10": monthString = "October";
                break;
            case "11": monthString = "November";
                break;
            case "12": monthString = "December";
                break;
            default: monthString = "Invalid month";
                break;
        }
        System.out.println(monthString);

    }
}