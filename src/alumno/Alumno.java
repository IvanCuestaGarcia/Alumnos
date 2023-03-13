package alumno;

import java.util.Objects;

/**
 * En esta clase se crearan y gestionaran los atributos del objeto alumno.
 *
 * @author Iván Cuesta García
 */
public class Alumno {

    private String nombre;
    private double nota;
    
    /**
     * Construimos un Alumno con el Nombre y la Nota
     * @param nombre pasamos el nombre del alumno
     * @param notaMedia pasamos la nota del alumno
     */
    public Alumno(String nombre, double notaMedia) {
        this.nombre = nombre;
        this.nota = notaMedia;
    }
    
    /**
     * Nos da el nombre del alumno
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Le damos un nombre al alumno
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Nos da la nota del alumno
     * @return the nota
     */
    public double getNota() {
        return nota;
    }

    /**
     * Le damos un valor a la nota del alumno
     * @param nota the nota to set
     */
    public void setNota(double nota) {
        this.nota = nota;
    }
    
    /**
     * El metodo hash por defecto muestra el hash de un objeto.
     * Sirve para comparar dos objetos ya que tambien tienen que tener el mismo hash
     * @return Un dato tipo int que contiene el hash
     */
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.getNombre());
        hash = 37 * hash + (int) (Double.doubleToLongBits(this.getNota()) ^ (Double.doubleToLongBits(this.getNota()) >>> 32));
        return hash;
    }
    
    /**
     * El metodo equals por defecto compara solo los datos Sting de dos objetos<br>
     * El nuestro compara tanto el nombre del alumno como la nota
     * @param obj Es otro Alumno
     * @return Verdadero(Si son el mismo alumno) o Falso (Si no lo son)
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Alumno other = (Alumno) obj;
        if (Double.doubleToLongBits(this.getNota()) != Double.doubleToLongBits(other.getNota())) {
            return false;
        }
        return Objects.equals(this.getNombre(), other.getNombre());
    }
    
    /**
     * El metodo toString por defecto muestra la posicion en memoria<br>
     * El nuestro al estar sobreescrito muestra los datos del Alumno
     * @return Un dato del tipo String que contiene los datos del Alumno
     */
    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + getNombre() + ", notaMedia=" + getNota() + '}';
    }
    
    
}
