
public class TestaProduto {
    
    public static void main(String [] args){
        Motor m1= new Motor("M012", "Motor v12"," v12", 1200.00, 750, 1100);
        Parafuso p1= new Parafuso("Pa08", "Parafuso cabeça abaulada", "Abaulada", 4.50,  10.0, 2.5);
        
        System.out.println(m1.calcularPrecoFinal());
        System.out.println(m1.ImprimirDados());
        
        System.out.println(p1.calcularPrecoFinal());
        System.out.println(p1.ImprimirDados());
    }
}
