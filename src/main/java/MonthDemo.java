/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jared
 */
public class MonthDemo {

    public static void main(String[] args) {
        Month month1 = new Month(1);
        Month month2 = new Month(2);

        System.out.println(month1.toString());
        System.out.println(month2.toString());

        System.out.println("Month 1 and Month 2 are the same month ---> " + month1.equals(month2));

        System.out.println("Month 1 happens after Month 2 ---> " + month1.greaterThan(month2));

        System.out.println("Month 1 happens before Month 2 ---> " + month1.lessThan(month2));

    }
}
