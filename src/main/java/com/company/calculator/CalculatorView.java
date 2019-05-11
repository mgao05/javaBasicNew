package com.company.calculator;

import java.awt.event.ActionListener;
import javax.swing.*;

public class CalculatorView extends JFrame {
    private  JTextField firstNumer = new JTextField(10);
    private JLabel additionLabel = new JLabel("+");
    private  JTextField secondNumer = new JTextField(10);
    private JButton calculateButton = new JButton("Calculate");
    private  JTextField calSolution = new JTextField(10);

    CalculatorView(){

        JPanel calcPanel = new JPanel();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600, 200);

        calcPanel.add(firstNumer);
        calcPanel.add(additionLabel);
        calcPanel.add(secondNumer);
        calcPanel.add(calculateButton);
        calcPanel.add(calSolution);

        this.add(calcPanel);


    }

    public int getFirstNumber(){
        return Integer.parseInt(firstNumer.getText());
    }

    public int getSecondNumber(){
        return Integer.parseInt(secondNumer.getText());
    }

    public int getCalcSolution(){
        return Integer.parseInt(calSolution.getText());
    }

    public void setCalcSolution(int solution){
        calSolution.setText(Integer.toString(solution));
    }

    void addCalculationListener(ActionListener listenForCalcButton){

        calculateButton.addActionListener(listenForCalcButton);
    }

    void displayErrorMessage(String errorMessage){
        JOptionPane.showMessageDialog(this, errorMessage);
    }
}
