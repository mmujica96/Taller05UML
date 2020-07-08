/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaclinico;

import IndicacionesMedicas.Receta;

/**
 *
 * @author usuario
 */
public class Paciente extends Persona {
    protected String email;
    protected Cita cita;
    //observaciones en relacion
    public Receta receta;
    public java.util.Collection recetas= new java.util.TreeSet<>();
    protected HistoriaClinica historiaClinica;
    
    Paciente(){
    receta= new Receta();
    historiaClinica= new HistoriaClinica();    
    }
    
    public boolean SolicitarCita(){return false;}
    
    
}
