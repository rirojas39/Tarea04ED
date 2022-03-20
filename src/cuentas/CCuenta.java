

package cuentas;

/**
 * Esta es la clase CCuenta del proyecto Deposito, que corresponde con la Tarea04 de la
 * asignatura Entornos de Desarrollo de DAW.
 * 
 * @author RafaelIzaguirre
 * @version 1.0
 * @since 20.03.2022
 **/
public class CCuenta {

    /**
     * @return the cuenta (comprobar mas adelante que esta línea está en la documentación 1 Rafa Izaguirre)
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * @param cuenta the cuenta to set  (comprobar mas adelante que esta línea está en la documentación 2 Rafa Izaguirre)
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * @return the saldo  (comprobar mas adelante que esta línea está en la documentación 3 Rafa Izaguirre)
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * @param saldo the saldo to set  (comprobar mas adelante que esta línea está en la documentación 4 Rafa Izaguirre)
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }


    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInteres;

    /**
     *
     */
    public CCuenta()
    {
    }

    /**
     *
     * @param nom
     * @param cue
     * @param sal
     * @param tipo
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }

    /**
     *
     * @param nom
     */
    public void asignarNombre(String nom)
    {
        setNombre(nom);
    }

    /**
     *
     * @return
     */
    public String obtenerNombre()
    {
        return getNombre();
    }

    /**
     *
     * @return
     */
    public double estado()
    {
        return getSaldo();
    }

    /**
     *
     * @param cantidad
     * @throws Exception
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }

    /**
     *
     * @param cantidad
     * @throws Exception
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }

    /**
     *
     * @return
     */
    public String obtenerCuenta()
    {
        return getCuenta();
    }

    /**
     *
     * @return
     */
    public String getNombre() {
        return nombre;
    }

    /**
     *
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     *
     * @return
     */
    public double getTipoInteres() {
        return tipoInteres;
    }

    /**
     *
     * @param tipoInteres
     */
    public void setTipoInteres(double tipoInteres) {
        this.tipoInteres = tipoInteres;
    }
}
