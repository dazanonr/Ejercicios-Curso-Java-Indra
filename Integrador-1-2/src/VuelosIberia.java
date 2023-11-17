import java.util.Objects;

/*
ValorFinalPorVuelo = ValorUnitario * Cant Pasajeros

IF Tipo_pasaje = Económico && ValorFinalPorVuelo > 100 Entonces es Rentable
IF Tipo_pasaje = Económico && ValorFinalPorVuelo < 100 Entonces es No Rentable
IF Tipo_pasaje = Premier && ValorFinalPorVuelo > 1500 Entonces es Rentable
IF Tipo_pasaje = Premier && ValorFinalPorVuelo < 1500 Entonces no es Rentable
Para los que no esten dentro de estas definiciones, el mensaje debe ser "A CONFIRMAR"
 */
public class VuelosIberia extends Vuelos{ //Datos de un empleado y cálculo de salario neto

    int valorFinal;
    String segmentation;
    public void calcularValorFinal() {
        setValorFinal(this.getValorUnitario() * this.getPasajeros());
    }

    public void calcularSegmentation(){

        if(this.tipo.contains("ECONOMICO") && this.valorFinal > 100){this.setSegmentation("RENTABLE");}
        else if(this.tipo.contains("ECONOMICO") && this.valorFinal < 100){this.setSegmentation("NO RENTABLE");}
        else if(this.tipo.contains("PREMIER") && this.valorFinal > 1500){this.setSegmentation("RENTABLE");}
        else if(this.tipo.contains("PREMIER") && this.valorFinal < 1500){this.setSegmentation("NO RENTABLE");}
        else setSegmentation("A CONFIRMAR");
    }

    public int getValorFinal() {return valorFinal;}

    public void setValorFinal(int valorFinal) {this.valorFinal = valorFinal;}

    public String getSegmentation() {return segmentation;}

    public void setSegmentation(String segmentation) {this.segmentation = segmentation;}

    @Override
    public String toString() {
        return "VuelosIberia{" +
                "valorFinal=" + valorFinal +
                ", segmentation='" + segmentation + '\'' +
                ", nombre='" + nombre + '\'' +
                ", tipo='" + tipo + '\'' +
                ", fecha='" + fecha + '\'' +
                ", pasajeros=" + pasajeros +
                ", valorUnitario=" + valorUnitario +
                '}';
    }
}
