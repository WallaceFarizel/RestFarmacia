package br.com.farmacia.model.negocio;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "TLivro")
@PrimaryKeyJoinColumn(name = "idProduto")
public class Pharmacos extends Produto{
	private String formula;
	private String laboratorio;
	private boolean controlado;
	
	public Pharmacos() {
		
	}
	
	public Pharmacos(String nome, float preco, String validade, String formula, String laboratorio, boolean controlado) {
		super(nome, preco, validade);
		this.formula = formula;
		this.laboratorio = laboratorio;
		this.controlado = controlado;
	}

	@Override
	public String toString() {
		return String.format("%sFórmula: %s\nLaboratório: %s\n%s",
				super.toString(),
				this.getFormula(),
				this.getLaboratorio(),
				this.isControlado() ? "Vendido apenas com prescrição médica" : "Venda disponível" 
			);
	}
	
	//getters and setters
	public String getFormula() {
		return formula;
	}
	public void setFormula(String formula) {
		this.formula = formula;
	}
	public String getLaboratorio() {
		return laboratorio;
	}
	public void setLaboratorio(String laboratorio) {
		this.laboratorio = laboratorio;
	}
	public boolean isControlado() {
		return controlado;
	}
	public void setControlado(boolean controlado) {
		this.controlado = controlado;
	}
}
