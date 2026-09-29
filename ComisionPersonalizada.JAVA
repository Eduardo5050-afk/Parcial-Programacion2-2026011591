public class ComisionPersonalizada implements EstrategiaComision {
    // Rafael tiene 6 letras -> (5 + 6)% = 11%
    private static final int N_LETRAS = 6;

    @Override
    public double calcularComision(double montoVenta) {
        double porcentaje = (5 + N_LETRAS) / 100.0; // 0.11
        return montoVenta * porcentaje;
    }
}