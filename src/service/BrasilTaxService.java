package service;

public class BrasilTaxService extends TaxService{

    @Override
    public double tax(double amount){
        return amount * 0.3;
    }
}
