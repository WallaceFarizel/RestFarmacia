package br.com.farmacia.model.negocio;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name = "TLoja")
public class Loja {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column(name = "localizacao")
	private String local;
	@Column(name = "horario")
	private String horarioFuncionamento;
	@Column(name = "Entregas")
	private boolean entregaEmCasa;
	@ManyToOne
	@JsonBackReference
	@JoinColumn(name = "idRede")
	private Rede rede;
	@OneToMany(
			mappedBy = "loja",
			fetch = FetchType.EAGER,
			cascade = CascadeType.ALL,
			orphanRemoval = true
		)
	@JsonManagedReference
	private List<Produto> produtos;
	
	public Loja() {
		this.setLocal("Localização não conhecida");
		this.setEntregaEmCasa(false);
		produtos = new ArrayList<Produto>();
	}
	
	public Loja(String local, String horarioFuncionamento, boolean entregaEmCasa) {
		this.local = local;
		this.horarioFuncionamento = horarioFuncionamento;
		this.entregaEmCasa = entregaEmCasa;
	}
	
	public Loja(Integer id, String local, String horarioFuncionamento, boolean entregaEmCasa) {
		this.rede = new Rede(id);
		this.local = local;
		this.horarioFuncionamento = horarioFuncionamento;
		this.entregaEmCasa = entregaEmCasa;
	}
	
	public Loja(String local, String horarioFuncionamento, boolean entregaEmCasa, String nome, String slogan, int anoDeCriacao) {
		this(local, horarioFuncionamento, entregaEmCasa);
		rede = new Rede(nome, slogan, anoDeCriacao);
	}
	
	@Override
	public String toString() {
		return String.format("%s - %s - %s", 
				this.getLocal(),
				this.getHorarioFuncionamento(),
				this.isEntregaEmCasa() ? "Entrega em domicílio" : "Retirada no local"
			);
	}

	//getters and setters
	public Integer getId() {
		return id;
	}
	public String getLocal() {
		return local;
	}
	public void setLocal(String local) {
		this.local = local;
	}
	public String getHorarioFuncionamento() {
		return horarioFuncionamento;
	}
	public void setHorarioFuncionamento(String horarioFuncionamento) {
		this.horarioFuncionamento = horarioFuncionamento;
	}
	public boolean isEntregaEmCasa() {
		return entregaEmCasa;
	}
	public void setEntregaEmCasa(boolean entregaEmCasa) {
		this.entregaEmCasa = entregaEmCasa;
	}
	public List<Produto> getProdutos() {
		return produtos;
	}
	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}
	public Rede getRede() {
		return rede;
	}
	public void setRede(Rede rede) {
		this.rede = rede;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((local == null) ? 0 : local.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Loja other = (Loja) obj;
		if (local == null) {
			if (other.local != null)
				return false;
		} else if (!local.equals(other.local))
			return false;
		return true;
	}
}
