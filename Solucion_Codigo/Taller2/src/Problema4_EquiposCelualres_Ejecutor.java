
public class Problema4_EquiposCelualres_Ejecutor {

    public static void main(String[] args) {
        Problema4_EquiposCelulares celular1 = new Problema4_EquiposCelulares(
            "Android", 11.30, 350.50, 15.0, "00:1A:2B:3C:4D:5E", "49015420323751X");
        System.out.println(celular1);

    }

}

class Problema4_EquiposCelulares {

    public String sistemaOperativo;
    public double tamañoPantalla;
    public double costoInicial;
    public double iva;
    public double ivaCostoInicial;
    public double costoFinal;
    public String direccionMac;
    public String informacionIMEI;

    public Problema4_EquiposCelulares() {
    }

    public Problema4_EquiposCelulares(String siatemaOpertivo, double tamañoPantalla, double costoInicial, double iva , String direccionMac,String informacionIMEI ) {
        this.sistemaOperativo = siatemaOpertivo;
        this.tamañoPantalla = tamañoPantalla;
        this.costoInicial = costoInicial;
        this.iva = iva;
        this.direccionMac = direccionMac;
        this.informacionIMEI = informacionIMEI;
        calcularCostoFinal();

    }

    public void calcularCostoFinal() {
        this.ivaCostoInicial = costoInicial * (iva / 100);
        this.costoFinal = ivaCostoInicial + iva;
    }

    public String toString() {
        return String.format("Equipo Celular:\n"
                + "Sistema Operativo: %s\n"
                + "Tamaño de Pantalla: %.1f pulgadas\n"
                + "Costo Inicial: $%.2f\n"
                + "IVA (%.1f%%): $%.2f\n"
                + "Costo Final: $%.2f\n"
                + "Direccion MAC: %s\n"
                + "IMEI: %s",
                sistemaOperativo, tamañoPantalla, costoInicial,
                iva, ivaCostoInicial, costoFinal,
                direccionMac, informacionIMEI);
    }

}
/***
 * run:
Equipo Celular:
Sistema Operativo: Android
Tama�o de Pantalla: 11,3 pulgadas
Costo Inicial: $350,50
IVA (15,0%): $52,57
Costo Final: $67,57
Direccion MAC: 00:1A:2B:3C:4D:5E
IMEI: 49015420323751X
BUILD SUCCESSFUL (total time: 0 seconds)

 */
