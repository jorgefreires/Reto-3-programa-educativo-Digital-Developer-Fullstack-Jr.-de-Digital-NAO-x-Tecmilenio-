package Modelo;

public class Modelo {	
	
	private String ID;
	private String url;
	private String eid;
	private String document_count;
	private String affiliation_name;
	private String affiliation_city;
	private String affiliation_country;
	
	public Modelo() {
	}
	
	public String getID() {
		return ID;
	}
	public void setID(String string) {
		this.ID = string;
	}
	
	public String geturl() {
		return url;
	}
	public void seturl(String url) {
		this.url = url;
	}
	
	public String geteid() {
		return eid;
	}
	public void seteid(String eid) {
		this.eid = eid;
	}
	
	public String getdocument_count() {
		return document_count;
	}
	public void setdocument_count(String document_count) {
		this.document_count = document_count;
	}
	
	public String getaffiliation_name() {
		return affiliation_name;
	}
	public void setaffiliation_name(String affiliation_name) {
		this.affiliation_name = affiliation_name;
	}
	
	public String getaffiliation_city() {
		return affiliation_city;
	}
	public void setaffiliation_city(String affiliation_city) {
		this.affiliation_city = affiliation_city;
	}
	
	public String getaffiliation_country() {
		return affiliation_country;
	}
	public void setaffiliation_country(String affiliation_country) {
		this.affiliation_country = affiliation_country;
	}
	
}