package com.cibertec.veterinaria.entity;


@Getter
@Setter
@Entity
@Table(name = "tb_mascota")
public class Mascota {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cod_cli")
	private int cod_mas;
	
	@Column(name = "nom_mas")
	private String nom_mas;
	
	@Column(name = "cod_cli")
	private String cod_cli;
	
	@Column(name = "codTipo_masc")
	private TipoMascota tipo;

	public int getCod_mas() {
		return cod_mas;
	}

	public void setCod_mas(int cod_mas) {
		this.cod_mas = cod_mas;
	}

	public String getNom_mas() {
		return nom_mas;
	}

	public void setNom_mas(String nom_mas) {
		this.nom_mas = nom_mas;
	}

	public String getCod_cli() { 
		return cod_cli;
	}

	public void setCod_cli(String cod_cli) {
		this.cod_cli = cod_cli;
	}

	public TipoMascota getTipo() {
		return tipo;
	}

	public void setTipo(TipoMascota tipo) {
		this.tipo = tipo;
	}
	
	
	
}
