/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ucr.ac.cr.Modelo;

/**
 *
 * @author Usuario
 */
public class Cliente 
{
    
    private String nombre;
    private String direccion;
    private String tipoCliente;
    private int cedula;
    private int numeroMedidor;

    public Cliente(String nombre, String direccion, String tipoCliente, int cedula, int numeroMedidor) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.tipoCliente = tipoCliente;
        this.cedula = cedula;
        this.numeroMedidor = numeroMedidor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(String tipoCliente) {
        this.tipoCliente = tipoCliente;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public int getNumeroMedidor() {
        return numeroMedidor;
    }

    public void setNumeroMedidor(int numeroMedidor) {
        this.numeroMedidor = numeroMedidor;
    }
    
    
    
    
}
