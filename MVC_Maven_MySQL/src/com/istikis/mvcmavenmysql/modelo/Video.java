package com.istikis.mvcmavenmysql.modelo;

public class Video {

	private Long id;
	private String nombre;
	private String url;

	private boolean correcto = true;
	private String errorNombre;
	private String errorUrl;

	public Video(Long id, String nombre, String url) {
		setId(id);
		setNombre(nombre);
		setUrl(url);
	}

	public Video(String nombre, String url) {
		this(null, nombre, url);
	}

	public Video() {

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		if (nombre == null || nombre.trim().length() < 3) {
			setErrorNombre("Debe tener mínimo 3 caracteres");
		}
		this.nombre = nombre;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public boolean isCorrecto() {
		return correcto;
	}

	public void setCorrecto(boolean correcto) {
		this.correcto = correcto;
	}

	public String getErrorNombre() {
		return errorNombre;
	}

	public void setErrorNombre(String errorNombre) {
		correcto = false;
		this.errorNombre = errorNombre;
	}

	public String getErrorUrl() {
		return errorUrl;
	}

	public void setErrorUrl(String errorUrl) {
		correcto = false;
		this.errorUrl = errorUrl;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (correcto ? 1231 : 1237);
		result = prime * result + ((errorNombre == null) ? 0 : errorNombre.hashCode());
		result = prime * result + ((errorUrl == null) ? 0 : errorUrl.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		result = prime * result + ((url == null) ? 0 : url.hashCode());
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
		Video other = (Video) obj;
		if (correcto != other.correcto)
			return false;
		if (errorNombre == null) {
			if (other.errorNombre != null)
				return false;
		} else if (!errorNombre.equals(other.errorNombre))
			return false;
		if (errorUrl == null) {
			if (other.errorUrl != null)
				return false;
		} else if (!errorUrl.equals(other.errorUrl))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		if (url == null) {
			if (other.url != null)
				return false;
		} else if (!url.equals(other.url))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Video [id=" + id + ", nombre=" + nombre + ", url=" + url + ", correcto=" + correcto + ", errorNombre="
				+ errorNombre + ", errorUrl=" + errorUrl + "]";
	}

}
