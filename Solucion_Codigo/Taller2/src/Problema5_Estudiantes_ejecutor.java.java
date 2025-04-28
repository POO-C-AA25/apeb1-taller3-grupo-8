import java.util.Scanner;
public class Problema5_Estudiantes_ejecutor {
    public static Estudiante estudiantex = new Estudiante();
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);
        String nombre, estado;
        double calificacion1, calificacion2, calificacion3, promedio;
        System.out.println("Ingrese nombre del estudiante: ");
        nombre = sc.nextLine();
        System.out.println("Ingrese calificacion 1: ");
        calificacion1 = sc.nextDouble();
        System.out.println("Ingrese calificacion 2: ");
        calificacion2 = sc.nextDouble();
        System.out.println("Ingrese calificacion 3: ");
        calificacion3 = sc.nextDouble();
        estudiantex.setNombre(nombre);
        estudiantex.setCalificacion1(calificacion1);
        estudiantex.setCalificacion2(calificacion2);
        estudiantex.setCalificacion3(calificacion3);
        estudiantex.calculopromedio();
        estudiantex.determinarestado();
        System.out.println("estudiantex: " + estudiantex.toString());
    }
}
class Estudiante {
    public String nombre;
    public double calificacion1;
    public double calificacion2;
    public double calificacion3;
    public double promedio;
    public String estado;
    public Estudiante (){}
    public Estudiante (String nombre, double calificacion1, double calificacion2, double calificacion3){
        this.calificacion1 = calificacion1;
        this.calificacion2 = calificacion2;
        this.calificacion3 = calificacion3;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setCalificacion1(double calificacion1){
        this.calificacion1 = calificacion1;
    }
    public void setCalificacion2(double calificacion2){
        this.calificacion2 = calificacion2;
    }
    public void setCalificacion3(double calificacion3){
        this.calificacion3 = calificacion3;
    }
    public void calculopromedio(){
        this.promedio = ((this.calificacion1 + this.calificacion2 + this.calificacion3)/3);
    }
    public void determinarestado(){
        if(this.promedio < 6.5){
            this.estado = "Reprobado";
        } else {
            this.estado = "Aprobado";
        }
    }
    public String getNombre(){
        return this.nombre;
    }
    public double getCalificacion1(){
        return this.calificacion1;
    }
    public double getCalificacion2(){
        return this.calificacion2;
    }
    public double getCalificacion3(){
        return this.calificacion3;
    }
    public double getPromedio(){
        return this.promedio;
    }
    public String getEstado(){
        return this.estado;
    }
    public String toString (){
        return "Estudiante: {Nombre: " + this.nombre + "Calificacion 1: " + this.calificacion1 +
                " Calificacion 2: " + this.calificacion2 + " Calificacion 3: " + this.calificacion3 +
                "Promedio: " + this.promedio + " Estado: " + this.estado + "}";
    }
}