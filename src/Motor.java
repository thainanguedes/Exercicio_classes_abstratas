
public class Motor extends Produto{    

    private double potencia;
    private double rpm;
    
    public Motor (String c, String n,String d, double p, double pot, double rpm){
        super(c,n,d,p);
        this.setPotencia(pot);
        this.setRpm(rpm);
    }
    
    public double calcularPrecoFinal(){
        return getPreco() - (0.5*getPreco());
    }
    
    public String ImprimirDados(){
        String s = "Código: "+getCod()+ "Nome: "+getNome()+"Descrição: "+getDesc()+"Valor: "+getPreco()+"Potência: "+getPotencia()+"RPM: "+getRpm();
        return s;
    }

    public double getPotencia() {
        return potencia;
    }

    public double getRpm() {
        return rpm;
    }

    public void setPotencia(double pot) {
        this.potencia = potencia;
    }

    public void setRpm(double rpm) {
        this.rpm = rpm;
    }
    
    
    
}
