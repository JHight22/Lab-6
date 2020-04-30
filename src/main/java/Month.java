/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jared
 */
public class Month {

    private int monthNumber;

    public Month() {
        this.monthNumber = 1;
    }

    public Month(int month) {
        if (month < 1 || month > 12) {
            monthNumber = 1;
        } else {
            monthNumber = month;
        }
    }

    public Month(String monthName) {
        if (monthName.equalsIgnoreCase("january")) {
            monthNumber = 1;
        } else if (monthName.equalsIgnoreCase("february")) {
            monthNumber = 2;
        } else if (monthName.equalsIgnoreCase("march")) {
            monthNumber = 3;
        } else if (monthName.equalsIgnoreCase("april")) {
            monthNumber = 4;
        } else if (monthName.equalsIgnoreCase("may")) {
            monthNumber = 5;
        } else if (monthName.equalsIgnoreCase("june")) {
            monthNumber = 6;
        } else if (monthName.equalsIgnoreCase("july")) {
            monthNumber = 7;
        } else if (monthName.equalsIgnoreCase("august")) {
            monthNumber = 8;
        } else if (monthName.equalsIgnoreCase("september")) {
            monthNumber = 9;
        } else if (monthName.equalsIgnoreCase("october")) {
            monthNumber = 10;
        } else if (monthName.equalsIgnoreCase("november")) {
            monthNumber = 11;
        } else if (monthName.equalsIgnoreCase("december")) {
            monthNumber = 12;
        } else {
            monthNumber = 1;
        }
    }

    public void setMonthNumber(int month) {
        if (month < 1 || month > 12) {
            monthNumber = 1;
        } else {
            monthNumber = month;
        }
    }

    public int getMonthNumber() {
        return monthNumber;
    }

    public String getMonthName() {
        String monthName;

        switch (monthNumber) {
            case 1:
                monthName = "January";
                break;
            case 2:
                monthName = "February";
                break;
            case 3:
                monthName = "March";
                break;
            case 4:
                monthName = "April";
                break;
            case 5:
                monthName = "May";
                break;
            case 6:
                monthName = "June";
                break;
            case 7:
                monthName = "July";
                break;
            case 8:
                monthName = "August";
                break;
            case 9:
                monthName = "September";
                break;
            case 10:
                monthName = "October";
                break;
            case 11:
                monthName = "November";
                break;
            case 12:
                monthName = "December";
                break;
            default:
                monthName = "Unknown";
        }

        return monthName;
    }

    @Override
    public String toString() {
        return "The month is " + getMonthName();
    }

    public Boolean equals(Month month) {
        Boolean isEqual;
        if (this.getMonthNumber() == month.getMonthNumber()) {
            isEqual = true;
        } else {
            isEqual = false;
        }
        return isEqual;
    }

    public Boolean greaterThan(Month month) {
        Boolean isGreater;
        if (this.getMonthNumber() > month.getMonthNumber()) {
            isGreater = true;
        } else {
            isGreater = false;
        }
        return isGreater;
    }

    public Boolean lessThan(Month month) {
        Boolean isLess;
        if (this.getMonthNumber() < month.getMonthNumber()) {
            isLess = true;
        } else {
            isLess = false;
        }
        return isLess;
    }

}
