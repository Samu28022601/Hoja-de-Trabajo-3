public class TestLibro {
    public static void main(String[] args) {
        Libro libro = new Libro("El Quijote", "Miguel de Cervantes");

        libro.consultar_disponibilidad();
        libro.prestar();
        libro.consultar_disponibilidad();
        libro.devolver();
        libro.consultar_disponibilidad();
    }
}
