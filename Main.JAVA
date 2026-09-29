public class Main {
    public static void main(String[] args) {
        EstrategiaComision comisionEstandar = new ComisionEstandar();
        Vendedor vendedor = new Vendedor("Rafael", 1500.0, comisionEstandar);

        vendedor.mostrarDetalle();
    }
}