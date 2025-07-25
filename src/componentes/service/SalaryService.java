package componentes.service;

import componentes.entity.Employee;

public class SalaryService {
   // Forma errada:
    taxservice taxservice = new taxservice();
    PensionService pensionService = new PensionService();

    public double netSalary(Employee employee) {
        //               4000                             800                                       400
        return employee.getGrossSalary() - taxservice.tax(employee.getGrossSalary()) - pensionService.discount(employee.getGrossSalary());
    }
}
