
public class ProfessoresHoristas extends Professores {
    
    private double valorHora;

    public ProfessoresHoristas(String n,double vh) {
        super(n);
        this.setValorHora(vh);
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double vh) {
        this.valorHora = vh;
    }
    
     public double calcularSalarioLiquido(){
        return valorHora - (0.5 * valorHora);
    }
    
}
