public class TestElectronico {
    public static void main(String[] args) {
        Electronico telefono = new Electronico("iPhone", 999.99, 10);

        telefono.consultar_inventario();
        telefono.vender(2);
        telefono.consultar_inventario();
        telefono.agregar_cantidad(5);
        telefono.consultar_inventario();
    }
}
