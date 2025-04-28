
public class Problema8_ChequesBanco_Ejecutor {

    public static void main(String[] args) {
        double valorCheque = (Math.random() * 900);

        Problema8_ChequesBanco cheque1 = new Problema8_ChequesBanco("Nahomi Armijos", "Banco de Loja", valorCheque);
         System.out.println(cheque1);
    }

}

class Problema8_ChequesBanco {

    public String nombreCliente;
    public String nombreBanco;
    public double valorCheque;
    public double comisionBanco;

    public Problema8_ChequesBanco() {

    }

    public Problema8_ChequesBanco(String nombreCliente, String nombreBanco, double valorCheque) {
        this.nombreCliente = nombreCliente;
        this.nombreBanco = nombreBanco;
        this.valorCheque = valorCheque;
        calcularCoomisionBanco();
    }

    public void calcularCoomisionBanco() {
        this.comisionBanco = valorCheque * 0.003;
    }

    public String toString() {
        return String.format("Nombre Cliente: %s\n"
                + "Banco: %s\n"
                + "Valor Cheque: %.2f\n"
                + "Comision Banco: %.2f\n",
                nombreCliente, nombreBanco, valorCheque, comisionBanco);
    }
}
/***
 * run:
Nombre Cliente: Nahomi Armijos
Banco: Banco de Loja
Valor Cheque: 812,46
Comision Banco: 2,44

BUILD SUCCESSFUL (total time: 0 seconds)

 */
