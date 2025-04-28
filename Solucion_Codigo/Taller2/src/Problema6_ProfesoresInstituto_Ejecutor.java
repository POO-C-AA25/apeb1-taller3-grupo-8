public class Problema6_ProfesoresInstituto_Ejecutor {
    public static void main(String[] args) {
        Problema6_ProfesoresInstituto profesor1=new Problema6_ProfesoresInstituto("Ana Paula","Armijos Contreras","1105778810",460.70);
        System.out.println(profesor1);
    }
    
}
class Problema6_ProfesoresInstituto{
    public String nombre;
    public String apellido;
    public String numeroCedula;
    public double sueldoBasico;
    public double sueldoTotal;
    
    public Problema6_ProfesoresInstituto(){
    
    }
    
    public Problema6_ProfesoresInstituto(String nombre,String apellido,String numeroCedula,double sueldoBasico){
        this.apellido=apellido;
        this.nombre=nombre;
        this.numeroCedula=numeroCedula;
        this.sueldoBasico=sueldoBasico;
        calcularSueldoTotal(); 
    }
    
    public void calcularSueldoTotal(){
        this.sueldoTotal=sueldoBasico+(sueldoBasico*0.20);
    }
    
    public String toString(){
        return String.format("Profesor\n"+
                                        "Nombres: %s\n"+
                                        "Apellidos: %s\n"+
                                        "N°cedula: %s\n"+
                                        "Sueldo Basico: %.2f \n"+
                                        "Sueldo Total: %.2f \n",
                                        nombre,apellido,numeroCedula,
                                        sueldoBasico, sueldoTotal);
    }
}
/***
 * run:
Profesor
Nombres: Ana Paula
Apellidos: Armijos Contreras
N�cedula: 1105778810
Sueldo Basico: 460,70 
Sueldo Total: 552,84 

BUILD SUCCESSFUL (total time: 0 seconds)
 */