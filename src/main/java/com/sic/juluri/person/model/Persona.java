package com.sic.juluri.person.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table (name = "persona")
public class Persona {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private int Documento;
	private String Email;
	private String Comentarios;
	private String MarcaFavoritaPC;
	private Date fecha;
	
	@ManyToOne
	@JoinColumn (name="id_pc")
	private PC pc;
	@ManyToOne
	@JoinColumn (name="id_state")
	private State state;
	


	public Persona() {
	}



	public Persona(int documento, String email, String comentarios, String marcaFavoritaPC, Date fecha, PC pc,
			State state) {
		super();
		Documento = documento;
		Email = email;
		Comentarios = comentarios;
		MarcaFavoritaPC = marcaFavoritaPC;
		this.fecha = fecha;
		this.pc = pc;
		this.state = state;
	}



	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public int getDocumento() {
		return Documento;
	}



	public void setDocumento(int documento) {
		Documento = documento;
	}



	public String getEmail() {
		return Email;
	}



	public void setEmail(String email) {
		Email = email;
	}



	public String getComentarios() {
		return Comentarios;
	}



	public void setComentarios(String comentarios) {
		Comentarios = comentarios;
	}



	public String getMarcaFavoritaPC() {
		return MarcaFavoritaPC;
	}



	public void setMarcaFavoritaPC(String marcaFavoritaPC) {
		MarcaFavoritaPC = marcaFavoritaPC;
	}



	public Date getFecha() {
		return fecha;
	}



	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}



	public PC getPc() {
		return pc;
	}



	public void setPc(PC pc) {
		this.pc = pc;
	}



	public State getState() {
		return state;
	}



	public void setState(State state) {
		this.state = state;
	}

	
}