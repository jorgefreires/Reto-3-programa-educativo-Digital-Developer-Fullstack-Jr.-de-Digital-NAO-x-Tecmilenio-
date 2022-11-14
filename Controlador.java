package Controlador;

import Modelo.Modelo;
import Vista.Vista;

public class Controlador {
	
	//objetos vista y modelo
	
	private Vista vista;
	private Modelo modelo;
	
	//constructor para inicializar el modelo y la vista
	
	public Controlador(Modelo modelo, Vista vista) {
		this.modelo = modelo;
		this.vista = vista;
	}
	
	//getters y setters para el modelo
	
	public String getID() {
		return modelo.getID();
	}
	public void setID(String ID) {
		this.modelo.setID(ID);
	}
	
	public String geturl() {
		return modelo.geturl();
	}
	public void seturl(String url) {
		this.modelo.seturl(url); 
	}
	
	public String geteid() {
		return modelo.geteid();
	}
	public void seteid(String eid) {
		this.modelo.seteid(eid); 
	}
	
	public String getdocument_count() {
		return modelo.getdocument_count();
	}
	public void setdocument_count(String document_count) {
		this.modelo.setdocument_count(document_count);
	}
	
	public String getaffiliation_name() {
		return modelo.getaffiliation_name();
	}
	public void setaffiliation_name(String affiliation_name) {
		this.modelo.setaffiliation_name(affiliation_name);
	}
	
	public String getaffiliation_city() {
		return modelo.getaffiliation_city();
	}
	public void setaffiliation_city(String affiliation_city) {
		this.modelo.setaffiliation_city(affiliation_city);
	}
	
	public String getaffiliation_country() {
		return modelo.getaffiliation_country();
	}
	public void setaffiliation_country(String affiliation_country) {
		this.modelo.setaffiliation_country(affiliation_country);
	}
	
	//pasa el modelo a la vista para presentar los datos
	public void actualizarVista() {
		
		vista.imprimirDatos(modelo.getID(),modelo.geturl(), modelo.geteid(), modelo.getdocument_count(), modelo.getaffiliation_name(), modelo.getaffiliation_city(), modelo.getaffiliation_country());
	}

}
