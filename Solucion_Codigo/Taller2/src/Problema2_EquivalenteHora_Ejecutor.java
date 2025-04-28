
public class Problema2_EquivalenteHora_Ejecutor {

    public static void main(String[] args) {
        Problema2_EquivalenteHora conversion1 = new Problema2_EquivalenteHora(48);
        System.out.println(conversion1);

    }
}

class Problema2_EquivalenteHora {
    
    public double horas;
    public double minutos;
    public double segundos;
    public double dias;

    public Problema2_EquivalenteHora() {

    }

    public Problema2_EquivalenteHora(double horas) {
        this.horas = horas;
        calcularEquivalentes();
    }

    public void calcularEquivalentes() {
        this.minutos = horas * 60;
        this.segundos = horas * 3600;
        this.dias = horas / 24;
    }

    public String toString() {
        return String.format("Equivalencias de %.2f horas:\n"
                + "Minutos: %.2f\n"
                + "Segundos: %.2f\n"
                + "Dias: %.4f",
                horas, minutos, segundos, dias);
    }
}
/***
 * run:
Equivalencias de 48,00 horas:
Minutos: 2880,00
Segundos: 172800,00
Dias: 2,0000
BUILD SUCCESSFUL (total time: 0 seconds)
 */
