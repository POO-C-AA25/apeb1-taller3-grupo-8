public class Problema1_Terreno_ejecutor {
    public static Terreno terrenox = new Terreno();
    public static void main(String[] args){
        double ancho = ((Math.random()) * 10) + 1;
        double largo = ((Math.random()) * 10) + 1;
        double valormetro = ((Math.random()) * 10) + 1;
        terrenox.setAncho(ancho);
        terrenox.setLargo(largo);
        terrenox.setValormetro(valormetro);
        terrenox.calculaArea();
        terrenox.calcularCosto();
        System.out.println("terrenox: " + terrenox.toString());
    }
}
class Terreno {
    public double largo;
    public double ancho;
    public double valormetro;
    public double costo;
    public double area;
    public Terreno(){}
    public Terreno (double ancho, double largo, double valormetro){
        this.ancho = ancho;
        this.largo = largo;
        this.valormetro = valormetro;
        
    }
    public void setAncho(double ancho){
        this.ancho = ancho;
    }
    public void setLargo(double largo){
        this.largo = largo;
    }
    public void setValormetro(double valormetro){
        this.valormetro = valormetro;
    }
    public double getAncho(){
        return this.ancho;
    }
    public double getLargo(){
        return this.largo;
    }
    public double getValormetro(){
        return this.valormetro;
    }
    public void calculaArea(){
        this.area = this.ancho * this.largo;
    } 
    public void calcularCosto(){
        this.costo = this.area * this.valormetro;
    }
    public double getCosto(){
        return this.costo;
    }
    public double getArea(){
        return this.area;
    }
    public String toString(){
        return "{Ancho: " + this.getAncho() + ", "+
               "Largo: " + this.getLargo() + ", "+
               "Valormetro: "+ this.getValormetro() + ", "+
               "Area: " + this.getArea() + ", "+
               "Costo: " + this.getCosto()+ "}";
    }
}