import java.util.Scanner;
public class Problema7_Vehiculo_ejecutor {
    public static Automovil automovilx = new Automovil();
    public static void main(String [] args){
        Scanner sc = new Scanner (System.in);
        String ceduladueño, marca;
        int añofabricacion, añoactual;
        double valorvehiculo, valormatricula;
        System.out.println("Ingrese número de cedula del dueño: ");
        ceduladueño = sc.nextLine();
        System.out.println("Ingrese marca del vehiculo: ");
        marca = sc.nextLine();
        System.out.println("Ingrese año de fabricacion del vehiculo: ");
        añofabricacion = sc.nextInt();
        System.out.println("Ingrese año actual: ");
        añoactual = sc.nextInt();
        System.out.println("Ingrese valor del vehiculo: ");
        valorvehiculo = sc.nextDouble();
        automovilx.setCeduladueño(ceduladueño);
        automovilx.setMarca(marca);
        automovilx.setAñosfabricacion(añofabricacion);
        automovilx.setAñoactual(añoactual);
        automovilx.setValorvehiculo(valorvehiculo);
        automovilx.calcularantiguedad();
        automovilx.calculomatricula();
        automovilx.getValormatricula();
        System.out.println("Automovil: " + automovilx.toString());
    }
}
class Automovil{
    public String ceduladueño;
    public String marca;
    public int añofabricacion;
    public double valorvehiculo;
    public double valormatricula;
    public int antiguedad;
    public int añoactual;
    public Automovil(){}
    public Automovil(String ceduladueño, String marca, int añofabricacion, 
            double valorvehiculo, int añoactual){
        this.ceduladueño = ceduladueño;
        this.añofabricacion = añofabricacion;
        this.marca = marca;
        this.valorvehiculo = valorvehiculo;
    }
    public  void setCeduladueño(String ceduladueño){
        this.ceduladueño = ceduladueño;
    }
    public void setMarca(String marca){
        this.marca = marca;
    }
    public void setAñosfabricacion(int añofabricacion){
        this.añofabricacion = añofabricacion;
    }
    public void setValorvehiculo(double valorvehiculo){
        this.valorvehiculo = valorvehiculo;
    }
    public void setAñoactual(int añoactual){
        this.añoactual = añoactual;
    }
    public void calcularantiguedad (){
        this.antiguedad = this.añoactual - this.añofabricacion ;
    }
    public void calculomatricula(){
        this.valormatricula = (this.valorvehiculo * (0.002/100)) * this.antiguedad;
    }
    public String getCeduladueño(){
        return this.ceduladueño;
    }
    public String getMarca(){
        return this.marca;
    }
    public int getAñofabricacion(){
        return this.añofabricacion;
    }
    public int getAñoactual(){
        return this.añoactual;
    }
    public double getValorvehiculo(){
        return this.valorvehiculo;
    }
    public double getAntiguedad(){
        return this.antiguedad;
    }
    public double getValormatricula(){
        return this.valormatricula;
    }
    public String toString(){
        return "Automovil{ Cedula del dueño: " + this.ceduladueño + ", Marca: "+
                this.marca + ", Año de fabricación: " + this.añofabricacion + 
                ", Años actual: " + this.añoactual + ", Valor del vehiculo: " +
                this.valorvehiculo + ", Valor de la matricula: " + this.valormatricula + 
                " }";
    }
}