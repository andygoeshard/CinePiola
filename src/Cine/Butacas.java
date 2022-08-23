package Cine;

public class Butacas {
	
	private Integer asientoFila;
	private Integer asientoColumna;
	private Boolean estaOcupado; 
	
	public Butacas(Integer asientoFila, Integer asientoColumna) {
		
		this.asientoFila = asientoFila;
		this.asientoColumna = asientoColumna;
		this.estaOcupado = false; 
		
	}

	public Integer getAsientoFila() {
		return asientoFila;
	}

	public void setAsientoFila(Integer asientoFila) {
		this.asientoFila = asientoFila;
	}

	public Integer getAsientoColumna() {
		return asientoColumna;
	}

	public void setAsientoColumna(Integer asientoColumna) {
		this.asientoColumna = asientoColumna;
	}

	public Boolean getEstaOcupado() {
		return estaOcupado;
	}

	public void setEstaOcupado(Boolean estaOcupado) {
		this.estaOcupado = estaOcupado;
	}
	
	

}
