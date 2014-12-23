package com.borja.proyectodeportes.adapters;

public class Equipos {
	
	private String equipo;
	private String anioFundacion;
	private String estadio;
	private String presidente;
	private String escudo;

	public Equipos() {
	}
	
	public Equipos(String equipo, String anioFundacion, String estadio,
			String escudo, String presidente) {
		super();
		this.equipo = equipo;
		this.anioFundacion = anioFundacion;
		this.estadio = estadio;
		this.escudo = escudo;
		this.presidente = presidente;
	}
	
	public String getEquipo() {
		return equipo;
	}
	public void setEquipo(String equipo) {
		this.equipo = equipo;
	}
	public String getAnioFundacion() {
		return anioFundacion;
	}
	public void setAnioFundacion(String anioFundacion) {
		this.anioFundacion = anioFundacion;
	}
	public String getEscudo() {
		return escudo;
	}
	public void setEscudo(String escudo) {
		this.escudo = escudo;
	}

	public String getEstadio() {
		return estadio;
	}

	public void setEstadio(String estadio) {
		this.estadio = estadio;
	}

	public String getPresidente() {
		return presidente;
	}

	public void setPresidente(String presidente) {
		this.presidente = presidente;
	}
}
