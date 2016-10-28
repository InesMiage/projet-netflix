package models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="episodes")
public class Episode {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	
	@NotNull
	private Long saison_number;
	
	@NotNull
	private Long episode_number;
	
	private String titre;
	
	private String description;
	
	@OneToOne
	@JoinColumn(name="video_id", referencedColumnName="video_id")
	private Video video;
	
	@ManyToOne
	@JoinColumn(name="serie_id" , referencedColumnName="id")
	private Serie serie;

	
	
	
	public Episode(Long saison_number, Long episode_number, String titre, String description) {
		super();
		this.saison_number = saison_number;
		this.episode_number = episode_number;
		this.titre = titre;
		this.description = description;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getSaison_number() {
		return saison_number;
	}

	public void setSaison_number(Long saison_number) {
		this.saison_number = saison_number;
	}

	public Long getEpisode_number() {
		return episode_number;
	}

	public void setEpisode_number(Long episode_number) {
		this.episode_number = episode_number;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	
}