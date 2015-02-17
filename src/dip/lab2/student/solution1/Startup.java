/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab2.student.solution1;

/**
 *
 * @author mpatel6
 */
public class Startup {

    public static void main(String[] args) {

        TipCalculatorStrategy restaurantCase = new FoodServiceTipCalculator(100, 15);
        TipCalculatorStrategy baggageCase = new BaggageServiceTipCalculator(10, 5);

        TipCalculatorService tipper = new TipCalculatorService();

        TipCalculatorStrategy[] scenario = {restaurantCase, baggageCase};

        for (TipCalculatorStrategy t : scenario) {
            System.out.println("Tip Amount is: " + tipper.calculateTip(t));

        }
    }

}
