package br.com.farmacia.model.negocio;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

//aqueles bagui de cume

@Entity
@Table(name = "TConsumiveis")
@PrimaryKeyJoinColumn(name = "idProduto")
public class Consumiveis extends Produto{
	
	private String descricao;
	
	public Consumiveis() {	
	}
	
	@Override
	public String toString() {
		return String.format("%s", 
				this.getDescricao()
			);
	}
	
	//getters and setters s2
	
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
}
