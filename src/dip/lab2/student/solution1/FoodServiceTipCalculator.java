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
public class FoodServiceTipCalculator implements TipCalculatorStrategy {

    private double totalAmount;
    private double tipPercent;

    public FoodServiceTipCalculator(double totalAmount, double tipPercent) {
        this.totalAmount = totalAmount;
        this.tipPercent = tipPercent;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public double getTipPercent() {
        return tipPercent;
    }

    public void setTipPercent(double tipPercent) {
        this.tipPercent = tipPercent;
    }

    @Override
    public double getCalculatedTip() {
        return totalAmount * tipPercent / 100;
    }

}
