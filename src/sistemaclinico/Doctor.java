/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaclinico;

/**
 *
 * @author usuario
 */
public class Doctor extends Persona{
    protected int regDoctor;
    protected String especialidad;
    public Secretaria secretaria;
    protected java.util.Collection citasPendientes =new java.util.TreeSet();
    
    
    
    Doctor(){}
    public void recetar(){}
    public void agregarPlanNutricional(){}
    public void imprimirReceta(){}
    public void registrarSecretaria( Secretaria s){}
    
    
}
