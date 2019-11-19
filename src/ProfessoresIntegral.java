
public class ProfessoresIntegral extends Professores {
    
    private double salario;
    
    public ProfessoresIntegral (String n, double s){
        super(n);
        this.setSalario(s);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double s) {
        this.salario = s;
    }

    public double calcularSalarioLiquido(){
        return salario - (0.11 * salario);
    }
}
