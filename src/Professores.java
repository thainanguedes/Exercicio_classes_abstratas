
public abstract class Professores {
    
    private String nome;
    
    public abstract double calcularSalarioLiquido();

    public Professores(String n) {
        this.setNome(n);
    }
    
    

    public String getNome() {
        return nome;
    }

    public void setNome(String n) {
        this.nome = n;
    }
    
    
}
