package ugen.gestao.projectos.investimentos.modelos;

import java.sql.Date;
import javax.persistence.*;

@Entity
@Table(name="projecto")
public class Projecto {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long numero;
	
	
	private String descricao;
	
	
	private String estado;
	
	
	private int mesesDuracao;
	
	
	private String sector;
	
	
	private String tipoProjecto;

	
	private Date dataInicio;
	
	public String getTipoProjecto() {
		return tipoProjecto;
	}

	public void setTipoProjecto(String tipo_projecto) {
		this.tipoProjecto = tipo_projecto;
	}
	
	public String getSector() {
		return sector;
	}

	public void setSector(String sector) {
		this.sector = sector;
	}
	
	public int getMesesDuracao() {
		return mesesDuracao;
	}

	public void setMesesDuracao(int meses_duracao) {
		this.mesesDuracao = meses_duracao;
	}
	
	public Long getNumero() {
		return numero;
	}

	public void setNumero(Long numero) {
		this.numero = numero;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Date getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(Date dataInicio) {
		this.dataInicio = dataInicio;
	}

	public Date getDataFim() {
		return dataFim;
	}

	public void setDataFim(Date dataFim) {
		this.dataFim = dataFim;
	}

	public String getResponsavel() {
		return responsavel;
	}

	public void setResponsavel(String responsavel) {
		this.responsavel = responsavel;
	}

	public float getOrcamento() {
		return orcamento;
	}

	public void setOrcamento(float orcamento) {
		this.orcamento = orcamento;
	}

	public String getParceitros() {
		return parceitros;
	}

	public void setParceitros(String parceitros) {
		this.parceitros = parceitros;
	}

	
	private Date dataFim;
	
	
	private String responsavel;
	
	
	private float orcamento;
	
	
	private String parceitros;

}
