package modelo;

public class Medicamento {
	private String id;
	private String Nombre;
	private String TipoConsumir;
	private String Dosis;
	private Double PrecioAproximado;
	private Boolean Autorizado;
	private String PrincipioActivo_id;

	public Medicamento(String id, String Nombre, String TipoConsumir, String Dosis, Double PrecioAproximado, Boolean Autorizado,
					   String PrincipioActivo_id) {
		this.id = id;
		this.Nombre = Nombre;
		this.TipoConsumir = TipoConsumir;
		this.Dosis = Dosis;
		this.PrecioAproximado = PrecioAproximado;
		this.Autorizado = Autorizado;
		this.PrincipioActivo_id = PrincipioActivo_id;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTipoConsumir() {
		return TipoConsumir;
	}

	public void setTipoConsumir(String tipoConsumir) {
		this.TipoConsumir = tipoConsumir;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String Nombre) {
		this.Nombre = Nombre;
	}

	public String getDosis() {
		return Dosis;
	}

	public void setDosis(String dosis) {
		this.Dosis = dosis;
	}

	public Double getPrecioAproximado() {
		return PrecioAproximado;
	}

	public void setPrecioAproximado(Double precioAproximado) {
		PrecioAproximado = precioAproximado;
	}

	public Boolean getAutorizado() {
		return Autorizado;
	}

	public void setAutorizado(Boolean autorizado) {
		Autorizado = autorizado;
	}

	public String getPrincipioActivo_id() {
		return PrincipioActivo_id;
	}

	public void setPrincipioActivo_id(String principioActivo_id) {
		PrincipioActivo_id = principioActivo_id;
	}
}
