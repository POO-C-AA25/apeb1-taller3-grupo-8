
public class Problema10_CadidatosPresidenciales_Ejecutor {
    public static void main(String[] args) {
        Problema10_CandidatosPresidenciales candidato1=new Problema10_CandidatosPresidenciales("Guillermo Lasso", "CREO");
        System.out.println(candidato1);
        
        Problema10_CandidatosPresidenciales candidato2=new Problema10_CandidatosPresidenciales("Leonidas Iza",47, "Pachakutic","Educacion, Seguridad",4);
        System.out.println(candidato2);
    }
}

class Problema10_CandidatosPresidenciales {

    public String nombre;
    public int edad;
    public String partidoPolitico;
    public String planGobierno;
    public int propuestasClave;

    public Problema10_CandidatosPresidenciales() {

    }

    public Problema10_CandidatosPresidenciales(String nombre, String partidoPolitico) {
        this.nombre = nombre;
        this.partidoPolitico = partidoPolitico;
        this.edad = 0;
        this.planGobierno = null;
        this.propuestasClave = 0;
    }

    public Problema10_CandidatosPresidenciales(String nombre, int edad, String partidoPolitico, String planDeGobierno, int numeroDePropuestasClave) {
        this.nombre = nombre;
        this.edad = edad;
        this.partidoPolitico = partidoPolitico;
        this.planGobierno = planDeGobierno;
        this.propuestasClave = propuestasClave;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getPartidoPolitico() {
        return partidoPolitico;
    }

    public void setPartidoPolitico(String partidoPolitico) {
        this.partidoPolitico = partidoPolitico;
    }

    public String getPlanGobierno() {
        return planGobierno;
    }

    public void setPlanGobierno(String planDeGobierno) {
        this.planGobierno = planDeGobierno;
    }

    public int getPropuestasClave() {
        return propuestasClave;
    }

    public void setPropuestasClave(int numeroDePropuestasClave) {
        this.propuestasClave = numeroDePropuestasClave;
    }

    public boolean cumpleEdadMinima() {
        return this.edad >= 35;
    }

    public String toString() {
        return String.format("Candidato: \n"
                + "Nombre: %s\n"
                + "Partido Politico: %s\n"
                + "Edad: %d\n"
                + "Plan de Gobierno: %s\n"
                + "Numero de Propuestas Clave: %d\n"
                + "Cumple con la edad minima: %s\n",
                nombre, partidoPolitico, edad, planGobierno, propuestasClave, cumpleEdadMinima()?"si":"no");
    }

}
/***
 * Candidato: 
Nombre: Guillermo Lasso
Partido Politico: CREO
Edad: 0
Plan de Gobierno: null
Numero de Propuestas Clave: 0
Cumple con la edad minima: no

Candidato: 
Nombre: Leonidas Iza
Partido Politico: Pachakutic
Edad: 47
Plan de Gobierno: Educacion, Seguridad
Numero de Propuestas Clave: 4
Cumple con la edad minima: si

 */
