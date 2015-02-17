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
public class BaggageServiceTipCalculator implements TipCalculatorStrategy {

    private int numberOfBags;
    private final double PERBAGTIP = 0.5;
    private double tipPercent;

    public BaggageServiceTipCalculator(int numberOfBags, double tipPercent) {
        this.numberOfBags = numberOfBags;
        this.tipPercent = tipPercent;
    }

    public int getNumberOfBags() {
        return numberOfBags;
    }

    public void setNumberOfBags(int numberOfBags) {
        this.numberOfBags = numberOfBags;
    }

    public double getTipPercent() {
        return tipPercent;
    }

    public void setTipPercent(double tipPercent) {
        this.tipPercent = tipPercent;
    }
    
    

    @Override
    public double getCalculatedTip() {
        return (numberOfBags * PERBAGTIP )*( 1 + tipPercent / 100);

    }

}
