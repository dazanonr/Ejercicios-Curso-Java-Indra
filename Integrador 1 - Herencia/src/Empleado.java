import java.util.Scanner;

public class Empleado extends Persona implements Salario { //Datos de un empleado y cálculo de salario neto

    String puesto, area;
    double salarioBruto, salarioNeto;

    public Empleado() {super();}

    public Empleado(String nombre, String apellido, String ciudad, int edad,
                    String puesto, String area, int salarioBruto) {

        super(nombre, apellido, ciudad, edad);

        this.puesto = puesto;
        this.area = area;
        this.salarioBruto = salarioBruto;

        //Calcula el salario neto en creación del objeto
        this.calcularSalarioNeto();
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public double getSalarioBruto() {
        return salarioBruto;
    }

    public void setSalarioBruto(int salarioBruto) {
        this.salarioBruto = salarioBruto;
    }

    public double getSalarioNeto() {
        return salarioNeto;
    }

    public void setSalarioNeto(double salarioNeto) {
        this.salarioNeto = salarioNeto;
    }

    public void nuevoEmpleado(){

        String input;
        Scanner scanner = new Scanner(System.in);


        System.out.println("Nuevo empleado\nIntroduce nombre: ");
        input = scanner.next();
        setNombre(input);

        System.out.println("\nIntroduce apellido: ");
        input = scanner.next();
        setApellido(input);

        System.out.println("\nIntroduce edad: ");
        input = scanner.next();
        setEdad(Integer.parseInt(input));

        System.out.println("\nIntroduce ciudad: ");
        input = scanner.next();
        setCiudad(input);

        System.out.println("\nIntroduce puesto: ");
        input = scanner.next();
        setPuesto(input);

        System.out.println("\nIntroduce area: ");
        input = scanner.next();
        setArea(input);

        System.out.println("\nIntroduce salario en bruto: ");
        input = scanner.next();
        setSalarioBruto(Integer.parseInt(input));

        this.calcularSalarioNeto();
    }
    @Override
    public void calcularSalarioNeto() { setSalarioNeto(getSalarioBruto() * 0.8); }

    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", edad=" + edad +
                ", ciudad='" + ciudad + '\'' +
                ", puesto='" + puesto + '\'' +
                ", area='" + area + '\'' +
                ", salarioBruto=" + salarioBruto +
                ", salarioNeto=" + salarioNeto +
                '}';
    }
}
