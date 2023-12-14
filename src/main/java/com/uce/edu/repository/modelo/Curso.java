package com.uce.edu.repository.modelo;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "curso")
public class Curso {
	
	@Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "generador_curso")
    @SequenceGenerator(name="generador_curso", sequenceName="seq_curso", allocationSize=1)
    @Column(name="curso_id")
    private Integer id;

    @Column(name="curso_nombre")
    private String nombre;

    @Column(name="curso_codigo")
    private String codigo;

    @Column(name="curso_descripcion")
    private String descripcion;

    @Column(name="curso_creditos")
    private int creditos;

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

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getCreditos() {
		return creditos;
	}

	public void setCreditos(int creditos) {
		this.creditos = creditos;
	}
    


}
