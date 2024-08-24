public class EmpleadoAsalariado extends Empleado {

    public EmpleadoAsalariado(String nombre, String id, double salario_base) {
        super(nombre, id, salario_base);
    }

    @Override
    public double calcularSalario() {
        return salario_base;
    }
}
