public abstract class Empleado {
    protected String nombre;
    protected String id;
    protected double salario_base;

    public Empleado(String nombre, String id, double salario_base) {
        this.nombre = nombre;
        this.id = id;
        this.salario_base = salario_base;
    }

    public abstract double calcularSalario();

    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("ID: " + id);
        System.out.println("Salario Base: " + salario_base);
    }
}
