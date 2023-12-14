package com.uce.edu.repository.modelo;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "aula")
public class Aula {
	@Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "generador_aula")
    @SequenceGenerator(name="generador_aula", sequenceName="seq_aula", allocationSize=1)
    @Column(name="aula_id")
    private Integer id;

    @Column(name="aula_nombre")
    private String nombre;

    @Column(name="aula_capacidad")
    private int capacidad;

    @Column(name="aula_edificio")
    private String edificio;

    @Column(name="aula_ubicacion")
    private String ubicacion;

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

	public int getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

	public String getEdificio() {
		return edificio;
	}

	public void setEdificio(String edificio) {
		this.edificio = edificio;
	}

	public String getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}
    
    

}
