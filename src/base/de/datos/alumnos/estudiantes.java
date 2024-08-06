
package base.de.datos.alumnos;


public class estudiantes {
     private int clave;
     private String nombre, grado;
     
     public estudiantes(int clave, String nombre,String grado ){
         this.clave=clave;
         this.grado=grado;
         this.nombre=nombre;
         
     }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGrado() {
        return this.grado;
    }

    public void setGrado(String grado) {
        this.grado = grado;
    }

    public int getClave() {
        return this.clave;
    }
     
}
