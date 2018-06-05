package RetoSelenium.RetoFinalCursoSelenium.Object;

import RetoSelenium.RetoFinalCursoSelenium.Utils.XmlUtils;

public class DatosObject {

	XmlUtils xmlUtil = new XmlUtils();

	private String Filas, ColumnaNombre, TipoNombre, EjemploNombre, ColumnaApellido, TipoApellido, EjemploApellido,
			ColumnaEdad, TipoEdad, EdadMinima, EdadMaxima, ColumnaTelefono, TipoTelefono, EjemploTelefono, ColumnaPais,
			TipoPais, ColumnaDireccion, TipoDireccion;


	public DatosObject() {
		leerArchivoXml();
	}

	public String getFilas() {
		return Filas;
	}

	public void setFilas(String filas) {
		Filas = filas;
	}

	public String getColumnaNombre() {
		return ColumnaNombre;
	}

	public void setColumnaNombre(String columnaNombre) {
		ColumnaNombre = columnaNombre;
	}

	public String getTipoNombre() {
		return TipoNombre;
	}

	public void setTipoNombre(String tipoNombre) {
		TipoNombre = tipoNombre;
	}

	public String getEjemploNombre() {
		return EjemploNombre;
	}

	public void setEjemploNombre(String ejemploNombre) {
		EjemploNombre = ejemploNombre;
	}

	public String getColumnaApellido() {
		return ColumnaApellido;
	}

	public void setColumnaApellido(String columnaApellido) {
		ColumnaApellido = columnaApellido;
	}

	public String getTipoApellido() {
		return TipoApellido;
	}

	public void setTipoApellido(String tipoApellido) {
		TipoApellido = tipoApellido;
	}

	public String getEjemploApellido() {
		return EjemploApellido;
	}

	public void setEjemploApellido(String ejemploApellido) {
		EjemploApellido = ejemploApellido;
	}

	public String getColumnaEdad() {
		return ColumnaEdad;
	}

	public void setColumnaEdad(String columnaEdad) {
		ColumnaEdad = columnaEdad;
	}

	public String getTipoEdad() {
		return TipoEdad;
	}

	public void setTipoEdad(String tipoEdad) {
		TipoEdad = tipoEdad;
	}

	public String getEdadMinima() {
		return EdadMinima;
	}

	public void setEdadMinima(String edadMinima) {
		EdadMinima = edadMinima;
	}

	public String getEdadMaxima() {
		return EdadMaxima;
	}

	public void setEdadMaxima(String edadMaxima) {
		EdadMaxima = edadMaxima;
	}

	public String getColumnaTelefono() {
		return ColumnaTelefono;
	}

	public void setColumnaTelefono(String columnaTelefono) {
		ColumnaTelefono = columnaTelefono;
	}

	public String getTipoTelefono() {
		return TipoTelefono;
	}

	public void setTipoTelefono(String tipoTelefono) {
		TipoTelefono = tipoTelefono;
	}

	public String getEjemploTelefono() {
		return EjemploTelefono;
	}

	public void setEjemploTelefono(String ejemploTelefono) {
		EjemploTelefono = ejemploTelefono;
	}

	public String getColumnaPais() {
		return ColumnaPais;
	}

	public void setColumnaPais(String columnaPais) {
		ColumnaPais = columnaPais;
	}

	public String getTipoPais() {
		return TipoPais;
	}

	public void setTipoPais(String tipoPais) {
		TipoPais = tipoPais;
	}

	public String getColumnaDireccion() {
		return ColumnaDireccion;
	}

	public void setColumnaDireccion(String columnaDireccion) {
		ColumnaDireccion = columnaDireccion;
	}

	public String getTipoDireccion() {
		return TipoDireccion;
	}

	public void setTipoDireccion(String tipoDireccion) {
		TipoDireccion = tipoDireccion;
	}

	public void leerArchivoXml() {
		this.Filas = xmlUtil.leerNodo("Filas");
		this.ColumnaNombre = xmlUtil.leerNodo("ColumnaNombre");
		this.TipoNombre = xmlUtil.leerNodo("TipoNombre");
		this.EjemploNombre = xmlUtil.leerNodo("EjemploNombre");
		this.ColumnaApellido = xmlUtil.leerNodo("ColumnaApellido");
		this.TipoApellido = xmlUtil.leerNodo("TipoApellido");
		this.EjemploApellido = xmlUtil.leerNodo("EjemploApellido");
		this.ColumnaEdad = xmlUtil.leerNodo("ColumnaEdad");
		this.TipoEdad = xmlUtil.leerNodo("TipoEdad");
		this.EdadMinima = xmlUtil.leerNodo("EdadMinima");
		this.EdadMaxima = xmlUtil.leerNodo("EdadMaxima");
		this.ColumnaTelefono = xmlUtil.leerNodo("ColumnaTelefono");
		this.TipoTelefono = xmlUtil.leerNodo("TipoTelefono");
		this.EjemploTelefono = xmlUtil.leerNodo("EjemploTelefono");
		this.ColumnaPais = xmlUtil.leerNodo("ColumnaPais");
		this.TipoPais = xmlUtil.leerNodo("TipoPais");
		this.ColumnaDireccion = xmlUtil.leerNodo("ColumnaDireccion");
		this.TipoDireccion = xmlUtil.leerNodo("TipoDireccion");		
	}
}
