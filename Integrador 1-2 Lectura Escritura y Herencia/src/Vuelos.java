/*
-	Nombre del vuelo
-	Cantidad de pasajeros
-	Tipo de pasaje
-	Valor unitario del pasaje
-	Fecha del vuelo
 */
public class Vuelos { //Datos básicos de una persona física
    String nombre, tipo, fecha;
    int pasajeros, valorUnitario;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPasajeros() {
        return pasajeros;
    }

    public void setPasajeros(int pasajeros) {
        this.pasajeros = pasajeros;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getValorUnitario() {return valorUnitario;}

    public void setValorUnitario(int valorUnitario) {this.valorUnitario = valorUnitario;}

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Vuelos{" +
                "nombre='" + nombre + '\'' +
                ", pasajeros='" + pasajeros + '\'' +
                ", tipo='" + tipo + '\'' +
                ", fecha='" + fecha + '\'' +
                ", valorUnitario=" + valorUnitario +
                '}';
    }
}
