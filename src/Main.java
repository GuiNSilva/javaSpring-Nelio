import entities.Employee;
import service.BrasilTaxService;
import service.PensionService;
import service.SalaryService;
import service.TaxService;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);




        System.out.println("name: ");
        String name = sc.nextLine();
        System.out.println("Salario bruto: ");
        double grossSalary = sc.nextDouble();

        //objeto employee recebendo dados do scanner
        Employee employee = new Employee( name, grossSalary);

        //exemplo de troca da dependencia sem precisar mexer no serviço de calculos
        TaxService taxService = new BrasilTaxService();
        
        PensionService pensionService = new PensionService();

        //instanciando o salaryService(serviço de calculo de impostos) com as suas dependencias.
        SalaryService salaryService = new SalaryService(taxService,pensionService);

        //variavel que recebe o calculo do salaryService
        double netSalary = salaryService.netSalary(employee);

        System.out.printf("Salario liquido = %.2f%n", netSalary);


        sc.close();
    }
}