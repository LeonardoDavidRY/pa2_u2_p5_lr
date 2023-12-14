package com.uce.edu.repository.modelo;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "materia")
public class Materia {
	@Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "generador_materia")
    @SequenceGenerator(name="generador_materia", sequenceName="seq_materia", allocationSize=1)
    @Column(name="materia_id")
    private Integer id;

    @Column(name="materia_nombre")
    private String nombre;

    @Column(name="materia_codigo")
    private String codigo;

    @Column(name="materia_creditos")
    private int creditos;

    @Column(name="materia_descripcion")
    private String descripcion;

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

	public int getCreditos() {
		return creditos;
	}

	public void setCreditos(int creditos) {
		this.creditos = creditos;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
    

}
