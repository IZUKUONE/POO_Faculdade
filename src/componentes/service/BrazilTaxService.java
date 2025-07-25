package componentes.service;

public class BrazilTaxService extends taxservice{
    // EXTENDS -> aqui ele vai herdar o taxService, é como uma sub clas mas com coisas a mais
    @Override
    public double tax(double amount){
        return amount * 0.3;
    }
}
