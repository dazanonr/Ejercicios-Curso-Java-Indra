import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Producto { //Datos de un empleado y cálculo de salario neto

    String nombre;
    double precio, precioDescuento;
    LocalDate fechaCaducidad;
    long diasCaducidad;

    public Producto() {}

    public void nuevoProducto(){

        String input;
        LocalDate localDate;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nuevo producto\nIntroduce nombre: ");
        input = scanner.next();
        this.setNombre(input);

        System.out.println("\nIntroduce precio: ");
        input = scanner.next();
        this.setPrecio(Integer.parseInt(input));

        System.out.println("\nIntroduce fecha (yyyy-MM-dd): ");
        localDate = LocalDate.parse(scanner.next());

        this.setFechaCaducidad(localDate);

        this.calcularCaducidad();
        this.calcularPrecioDescuento();

        System.out.println("El precio con descuento es de "+getPrecioDescuento()+
                " y los días que le quedan para caducar son "+getDiasCaducidad());
    }

    private void calcularPrecioDescuento() {
        precioDescuento = precio - (precio * 0.25);
    }

    public void calcularCaducidad() {
        LocalDate localDateTime = LocalDate.now();
        this.setDiasCaducidad(ChronoUnit.DAYS.between(localDateTime, this.fechaCaducidad));
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getPrecioDescuento() {
        return precioDescuento;
    }

    public void setPrecioDescuento(double precioDescuento) {
        this.precioDescuento = precioDescuento;
    }

    public LocalDate getFechaCaducidad() {
        return fechaCaducidad;
    }

    public void setFechaCaducidad(LocalDate fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }

    public long getDiasCaducidad() {
        return diasCaducidad;
    }

    public void setDiasCaducidad(long diasCaducidad) {
        this.diasCaducidad = diasCaducidad;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "nombre='" + nombre + '\'' +
                ", precio=" + precio +
                ", precioDescuento=" + precioDescuento +
                ", fechaCaducidad=" + fechaCaducidad +
                ", diasCaducidad=" + diasCaducidad +
                '}';
    }
}