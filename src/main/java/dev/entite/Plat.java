package dev.entite;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="plat")
public class Plat {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "nom")
    private String nom;
	
	@Column(name = "prixEnCentimesEuros")
    private Integer prixEnCentimesEuros;

    public Plat() {
    }

    public Plat(String nom, Integer prixEnCentimesEuros) {
        this.nom = nom;
        this.prixEnCentimesEuros = prixEnCentimesEuros;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Integer getPrixEnCentimesEuros() {
        return prixEnCentimesEuros;
    }

    public void setPrixEnCentimesEuros(Integer prixEnCentimesEuros) {
        this.prixEnCentimesEuros = prixEnCentimesEuros;
    }

    
    /**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Plat plat = (Plat) o;
        return nom.equals(plat.nom);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nom);
    }
}
