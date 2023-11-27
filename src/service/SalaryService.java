package service;

import entities.Employee;

public class SalaryService {



    // forma errada
    //criando componente

    TaxService taxService = new TaxService();
    PensionService pensionService = new PensionService();

    //função que calcula os descontos no salario
    public double netSalary(Employee employee){
        return employee.getGrossSalary() - taxService.tax20(employee.getGrossSalary())
        - pensionService.discount(employee.getGrossSalary());
    }
}
