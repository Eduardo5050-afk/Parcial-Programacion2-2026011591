public class Main {
    public static void main(String[] args) {
        EstrategiaComision comisionEstandar = new ComisionEstandar();
        Vendedor vendedor = new Vendedor("Eduardo", 1000.0, comisionEstandar);
        
        vendedor.mostrarDetalle();
    }
}