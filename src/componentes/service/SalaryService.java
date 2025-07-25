package componentes.service;

import componentes.entity.Employee;

public class SalaryService {
    /* Forma errada:
    taxservice taxservice = new taxservice();
    PensionService pensionService = new PensionService();
    */
    //FORMA CERTA:

    private taxservice taxservice;
    private PensionService pensionservice;

    public SalaryService(taxservice taxservice, PensionService pensionservice) {
        this.taxservice = taxservice;
        this.pensionservice = pensionservice;
    }

    public double netSalary(Employee employee) {
        //               4000                             800                                       400
        return employee.getGrossSalary() - taxservice.tax(employee.getGrossSalary()) - pensionservice.discount(employee.getGrossSalary());
    }
}
