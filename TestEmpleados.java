public class TestEmpleados {
    public static void main(String[] args) {
        EmpleadoAsalariado empleadoAsalariado = new EmpleadoAsalariado("Juan Perez", "123", 2000);
        empleadoAsalariado.mostrarInformacion();
        System.out.println("Salario: " + empleadoAsalariado.calcularSalario());

        EmpleadoPorHoras empleadoPorHoras = new EmpleadoPorHoras("Ana Lopez", "456", 0, 40, 15);
        empleadoPorHoras.mostrarInformacion();
        System.out.println("Salario: " + empleadoPorHoras.calcularSalario());
    }
}
