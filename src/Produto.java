
public abstract class Produto {
    
    private String cod;
    private String nome;
    private String desc;
    private double preco;
    
    public Produto (String c, String n,String d, double p){
        this.setCod(c);
        this.setNome(n);
        this.setDesc(d);
        this.setPreco(p);
    }
    
   public abstract double calcularPrecoFinal();
   public abstract String ImprimirDados();

    public String getCod() {
        return cod;
    }

    public String getNome() {
        return nome;
    }

    public String getDesc() {
        return desc;
    }

    public double getPreco() {
        return preco;
    }

    public void setCod(String c) {
        this.cod = c;
    }

    public void setNome(String n) {
        this.nome = n;
    }

    public void setDesc(String d) {
        this.desc = d;
    }

    public void setPreco(double p) {
        this.preco = p;
    }
    
 }