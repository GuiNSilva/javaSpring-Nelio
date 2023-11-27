package service;

public class TaxService {
    //componente simples para calculo do tax 20%
    //recebe o salary como parametro
    public double tax20(double amount){
        return amount * 0.2;
    }

    public double tax30(double amount){
        return amount * 0.3;
    }
}
