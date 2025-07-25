package componentes.test;

import componentes.entity.Employee;
import componentes.service.PensionService;
import componentes.service.SalaryService;
import componentes.service.taxservice;

import java.util.Locale;
import java.util.Scanner;

public class prog {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nome: ");
        String name = sc.nextLine();
        System.out.println("Salario: ");
        double grossSalary = sc.nextDouble();

        Employee employee = new Employee(name, grossSalary);
        SalaryService salaryService = new SalaryService();

        double netSalary = salaryService.netSalary(employee);
        System.out.println("salario: " +  netSalary);

        sc.close();
    }
}
