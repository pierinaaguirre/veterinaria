package com.cibertec.veterinaria.entity;


@Getter
@Setter
@Entity
@Table(name = "tb_distrito")
public class Distrito {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cod_dis")
	private int cod_dis;
	
	@Column(name = "nom_dis")
	private String nom_dis;

	public int getCod_dis() {
		return cod_dis;
	}

	public void setCod_dis(int cod_dis) { 
		this.cod_dis = cod_dis;
	}

	public String getNom_dis() {
		return nom_dis;
	}

	public void setNom_dis(String nom_dis) {
		this.nom_dis = nom_dis;
	}
	
	
	
}
