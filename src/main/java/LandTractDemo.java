
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author jared
 */
public class LandTractDemo {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Please enter the length and width of a tract of land");
        LandTract landTract1 = new LandTract(keyboard.nextDouble(), keyboard.nextDouble());

        System.out.println("please enter the length and width of the second tract of land");
        LandTract landTract2 = new LandTract(keyboard.nextDouble(), keyboard.nextDouble());
    }
}
