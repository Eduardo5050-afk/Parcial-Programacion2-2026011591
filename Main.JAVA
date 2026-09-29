public class Main {
    public static void main(String[] args) {
        EstrategiaComision comisionPersonalizada = new ComisionPersonalizada();
        Vendedor vendedor = new Vendedor("Rafael", 1000.0, comisionPersonalizada);
        
        vendedor.mostrarDetalle();
    }
}