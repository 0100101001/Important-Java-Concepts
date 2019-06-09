package gof_design_patterns.creational.abstractfactory;

public class BusinessLoan extends Loan {

    @Override
    void setInterestRate(double rate){
        this.rate = rate;
    }
}
