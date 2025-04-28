import java.util.Scanner;
public class Problema9_Emprendimiento_ejecutor {
    public static Emprendimiento emprendimientox = new Emprendimiento();
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);
        String nombrecomercial,ruc, sectoreconomico, propietario,ubicacion;
        int añoinicio, año_act;
        double capital_inicial;
        System.out.println("Ingrese el nombre comercial:");
        nombrecomercial = sc.nextLine();
        System.out.println("Ingrese el RUC:");
        ruc = sc.nextLine();
        System.out.println("Ingrese el sector económico:");
        sectoreconomico = sc.nextLine();
        System.out.println("Ingrese el propietario:");
        propietario = sc.nextLine();
        System.out.println("Ingrese la ubicación:");
        ubicacion = sc.nextLine();
        System.out.println("Ingrese el año de inicio de actividades:");
        añoinicio = sc.nextInt();
        System.out.println("Ingrese año actual: ");
        año_act = sc.nextInt();
        System.out.println("Ingrese el capital inicial:");
        capital_inicial = sc.nextDouble();
        
        emprendimientox.setNombrecomercial(nombrecomercial);
        emprendimientox.setRuc(ruc);
        emprendimientox.setSectoreconomico(sectoreconomico);
        emprendimientox.setPropietario(propietario);
        emprendimientox.setUbicacion(ubicacion);
        emprendimientox.setAñoinicio(añoinicio);
        emprendimientox.setAño_act(año_act);
        emprendimientox.setCapital_inicial(capital_inicial);
        emprendimientox.calculoantiguedad();
        emprendimientox.tiponegocio();
        System.out.println("Emprendimiento: " + emprendimientox.toString());
    }
}
class Emprendimiento{
    public String nombrecomercial;
    protected String ruc;
    public String sectoreconomico;
    private String propietario;
    public String ubicacion;
    public int añoinicio;
    public int año_act;
    private double capital_inicial;
    public int antiguedad;
    private String tiponegocio;
    public Emprendimiento(){}
    public Emprendimiento(String nombrecomercial, String ruc, String sectoreconomico,
            String propietario, String ubicacion, int añoinicio, double capital_inicial){
        this.nombrecomercial = nombrecomercial;
        this.ruc = ruc;
        this.sectoreconomico = sectoreconomico;
        this.propietario = propietario;
        this.ubicacion = ubicacion;
        this.añoinicio = añoinicio;
        this.capital_inicial = capital_inicial;
    }
    public void setNombrecomercial(String nombrecomercial){
        this.nombrecomercial = nombrecomercial;
    }
    public void setRuc(String ruc){
        this.ruc = ruc;
    }
    public void setSectoreconomico(String sectoreconomico){
        this.sectoreconomico = sectoreconomico;
    }
    public void setPropietario(String propietario){
        this.propietario = propietario;
    }
    public void setUbicacion(String ubicacion){
        this.ubicacion = ubicacion;
    }
    public void setAñoinicio(int añoinicio){
        this.añoinicio = añoinicio;
    }
    public void setAño_act(int año_act){
        this.año_act = año_act;
    }
    public void setCapital_inicial(double capital_inicial){
        this.capital_inicial = capital_inicial;
    }
    public void calculoantiguedad(){
        this.antiguedad = this.año_act - this.añoinicio;
    }
    public void tiponegocio(){
        if(capital_inicial < 218694){
            this.tiponegocio = "Micro negocio";
        } else if(capital_inicial >= 218694 || capital_inicial < 2478532){
            this.tiponegocio = "Pequeño negocio";
        } else if(capital_inicial > 2478532){
            this.tiponegocio = "Mediano negocio";
        }
    }
    public void actualizarInformacion(String nombrecomercial, String sectoreconomico, String ubicacion, 
                String propietario) {
        this.nombrecomercial = nombrecomercial;
        this.sectoreconomico = sectoreconomico;
        this.ubicacion = ubicacion;
        this.propietario = propietario;
    }
    public String getNombrecomercial(){
        return this.nombrecomercial;
    }
    public String getRuc(){
        return this.ruc;
    }
    public String getSectoreconomico(){
        return this.sectoreconomico;
    }
    public String getPropietario(){
        return this.propietario;
    }
    public String getUbicacion(){
        return this.ubicacion;
    }
    public int getAñoinicio(){
        return this.añoinicio;
    }
    public int getAño_act(){
        return this.año_act;
    }
    public double getCapital_inicial(){
        return this.capital_inicial;
    }
    public int getAntiguedad(){
        return this.antiguedad;
    }
    public String getTiponegocio(){
        return this.tiponegocio;
    }
    public String toString(){
        return "Emprendimiento:\n" +
                "Nombre Comercial: " + this.nombrecomercial + "\n" +
                "RUC: " + ruc + "\n" +
                "Sector Económico: " + this.sectoreconomico + "\n" +
                "Propietario: " + this.propietario + "\n" +
                "Ubicación: " + this.ubicacion + "\n" +
                "Fecha de Inicio: " + this.añoinicio + "\n" +
                "Capital Inicial: $" + this.capital_inicial + "\n" +
                "Antigüedad: " + this.antiguedad + " años\n" +
                "Tipo de Negocio: " + this.tiponegocio;
    }
}