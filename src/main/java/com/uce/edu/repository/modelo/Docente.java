package com.uce.edu.repository.modelo;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "docente")
public class Docente {
	@Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "generador_docente")
    @SequenceGenerator(name="generador_docente", sequenceName="seq_docenter", allocationSize=1)
    @Column(name="docente_id")
    private Integer id;

    @Column(name="docente_nombre")
    private String nombre;

    @Column(name="docente_apellido")
    private String apellido;

    @Column(name="docente_cedula")
    private String cedula;

    @Column(name="docente_materia_impartida")
    private String materiaImpartida;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getMateriaImpartida() {
		return materiaImpartida;
	}

	public void setMateriaImpartida(String materiaImpartida) {
		this.materiaImpartida = materiaImpartida;
	}
    
    


}
