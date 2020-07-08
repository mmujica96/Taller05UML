/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IndicacionesMedicas;

import java.util.Date;
import sistemaclinico.Paciente;

/**
 *
 * @author usuario
 */
public class Receta {
    protected Date fecha;
    public Medicamento medicamentos;
    public PlanNutricional planNutr;
    protected Paciente paciente;
    
    public Receta(){
        medicamentos= new Medicamento();
        planNutr= new PlanNutricional();
    }
    
}
