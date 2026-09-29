public class Vendedor extends Empleado {

    public Vendedor(String nombre, double ventasMes, EstrategiaComision estrategia) {
        super(nombre, ventasMes, estrategia);
    }

    @Override
    public void mostrarDetalle() {
        double comision = estrategia.calcularComision(ventasMes);
        System.out.println("--- Detalle del Vendedor ---");
        System.out.println("Nombre: " + nombre);
        System.out.println("Venta Total del Mes: $" + ventasMes);
        System.out.println("Comisión Obtenida: $" + comision);
    }
}