import java.util.Scanner;
public class Problema3_Instituciones_ejecutor {
    public static InstitucionesEducativas institucionesx = new InstitucionesEducativas();
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);
        String nombre;
        String tipo;
        int numeroalumnos;
        int numerodocentes;
        int numerosedes;
        double gastos;
        double presupuesto;
        System.out.println("Ingrese nombre: ");
        nombre = sc.nextLine();
        System.out.println("Ingrese tipo: ");
        tipo = sc.nextLine();
        System.out.println("Ingrese número de alumnos: ");
        numeroalumnos = sc.nextInt();
        System.out.println("Ingrese número de docentes: ");
        numerodocentes = sc.nextInt();
        System.out.println("Ingrese número de sedes: ");
        numerosedes = sc.nextInt();
        System.out.println("Ingrese gastos proyectado por estudiante: ");
        gastos = sc.nextDouble();
        sc.nextLine();
        institucionesx.setNombre(nombre);
        institucionesx.setTipo(tipo);
        institucionesx.setNumeroAlumnos(numeroalumnos);
        institucionesx.setNumeroDocentes(numerodocentes);
        institucionesx.setNumeroSedes(numerosedes);
        institucionesx.setGastos(gastos);
        institucionesx.calculopresupuesto();
        System.out.println("institucionesx: " + institucionesx.toString());
    }
}
class InstitucionesEducativas{
    public String nombre;
    public String tipo;
    public int numeroalumnos;
    public int numerodocentes;
    public int numerosedes;
    public double gastos;
    public double presupuesto;
    public InstitucionesEducativas(){}
    public InstitucionesEducativas(String nombre, 
            String tipo, int numeroalumnos, 
            int numerodocentes, int numerosedes, double gastos){
        this.nombre = nombre;
        this.tipo = tipo;
        this.numeroalumnos = numeroalumnos;
        this.numerodocentes = numerodocentes;
        this.numerosedes = numerosedes;
        this.gastos = gastos;
    } 
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setTipo(String tipo){
        this.tipo = tipo;
    }
    public void setNumeroAlumnos(int numeroalumnos){
        this.numeroalumnos = numeroalumnos;
    }
    public void setNumeroDocentes(int numemrodocentes){
        this.numerodocentes = numerodocentes;
    }
    public void setNumeroSedes(int numerosedes){
        this.numerosedes = numerosedes;
    }
    public void setGastos(double gastos){
        this.gastos = gastos;
    }
    public void calculopresupuesto(){
        this.presupuesto = this.numeroalumnos * this.gastos;
    }
    public String getNombre(){
        return this.nombre;
    }
    public String getTipo(){
        return this.tipo;
    }
    public int getNumeroAlumnos(){
        return this.numeroalumnos;
    }
    public int getNumeroDocentes(){
        return this.numerodocentes;
    }
    public int getNumeroSedes(){
        return this.numerosedes;
    }
    public double getGastos(){
        return this.gastos;
    }
    public double getPresupuesto(){
        return this.presupuesto;
    }
    public String toString() {
        return "InstitucionEducativa{" +
               "nombre='" + this.getNombre() + '\'' +
               ", tipoInstitucion='" + this.getTipo() + '\'' +
               ", numeroAlumnos=" + this.getNumeroAlumnos() +
               ", numeroDocentes=" + this.getNumeroDocentes() +
               ", numeroSedes=" + this.getNumeroSedes() +
               ", gastoProyectadoPorEstudiante=" + this.getGastos() +
               ", presupuesto=" + this.getPresupuesto() +
               '}';
    }
}