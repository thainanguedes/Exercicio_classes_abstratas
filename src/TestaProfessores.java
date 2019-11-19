
public class TestaProfessores {
    
    public static void main(String[] args) {
        
        ProfessoresIntegral p1 = new ProfessoresIntegral ("Thainan",5000);
        ProfessoresHoristas p2 = new ProfessoresHoristas ("Joaquina",2500);
        
        System.out.println("O salario é de: "+p1.calcularSalarioLiquido());
        System.out.println("O salario é de: "+p2.calcularSalarioLiquido());
    }
}
