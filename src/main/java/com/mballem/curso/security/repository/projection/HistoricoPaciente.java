package com.mballem.curso.security.repository.projection;

import com.mballem.curso.security.models.Especialidade;
import com.mballem.curso.security.models.Medico;
import com.mballem.curso.security.models.Paciente;

public interface HistoricoPaciente {

	Long getId();
	
	Paciente getPaciente();
	
	String getDataConsulta();
	
	Medico getMedico();
	
	Especialidade getEspecialidade();
}
