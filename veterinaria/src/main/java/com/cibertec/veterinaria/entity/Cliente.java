package com.cibertec.veterinaria.entity;


@Getter
@Setter
@Entity
@Table(name = "tb_cliente")
public class Cliente {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cod_cli")
	private Integer cod_cli;
	
	@Column(name = "nom_cli")
	private String nom_cli;
	
	@Column(name = "ape_cli")
	private String ape_cli;
	
	@Column(name = "dni_cli")
	private String dni_cli;
	
	@Column(name = "sexo_cli")
	private String sexo_cli;
	
	@Column(name = "cod_dis")
	private Distrito distrito;

	public Integer getCod_cli() {
		return cod_cli;
	}

	public void setCod_cli(Integer cod_cli) {
		this.cod_cli = cod_cli;
	}

	public String getNom_cli() {
		return nom_cli;
	}

	public void setNom_cli(String nom_cli) {
		this.nom_cli = nom_cli;
	}

	public String getApe_cli() {
		return ape_cli;
	}

	public void setApe_cli(String ape_cli) {
		this.ape_cli = ape_cli;
	}

	public String getDni_cli() {
		return dni_cli;
	}

	public void setDni_cli(String dni_cli) {
		this.dni_cli = dni_cli;
	}

	public String getSexo_cli() {
		return sexo_cli;
	}

	public void setSexo_cli(String sexo_cli) {
		this.sexo_cli = sexo_cli;
	}

	public Distrito getDistrito() {
		return distrito;
	}

	public void setDistrito(Distrito distrito) {
		this.distrito = distrito;
	}
	
	
	
	
}
