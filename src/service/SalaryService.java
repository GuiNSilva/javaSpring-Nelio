package service;

import entities.Employee;

public class SalaryService {

    //dependencias do SalaryService
    private TaxService taxService ;
    private PensionService pensionService ;

    //injetando as dependencias atraves do construtor
    public SalaryService(TaxService taxService, PensionService pensionService) {
        this.taxService = taxService;
        this.pensionService = pensionService;
    }

    //função que calcula os descontos no salario
    public double netSalary(Employee employee){
        return employee.getGrossSalary() - taxService.tax20(employee.getGrossSalary())
        - pensionService.discount(employee.getGrossSalary());
    }
}
