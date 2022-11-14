/**
 * Clase Main que corre el programa
 * Los autores del 3 al 5 se ponen como comentarios dado que el json obtenido no contiene información
 * Se utilizan las librerias json.simple y myql connector
 * @author jorgefreires
 * @version1.0
 */

package Main;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import Controlador.Controlador;
import Vista.Vista;
import Modelo.Modelo;

public class Main {

	private static String ID;
	private static String url;
	private static String eid;
	private static String document_count;
	private static String affiliation_name;
	private static String affiliation_city;
	private static String affiliation_country;

	public static void main(String[] args) throws IOException, InterruptedException {
		
		/**
		* A continuación se realizán las peticiones a la API para que nos devuelva la información de los autores
		* Una petición por autor
		*/
		
		//URL request 1
		
		HttpClient client = HttpClient.newHttpClient();
		HttpRequest request = HttpRequest.newBuilder()
		.uri(URI.create("https://api.elsevier.com/content/search/scopus?query=35227147500&apiKey=7f59af901d2d86f78a1fd60c1bf9426a"))
		.build();
		
		HttpResponse<String> response = client.send(request,
		HttpResponse.BodyHandlers.ofString());
		    
		FileWriter file = new FileWriter("datos.json");
		file.write(response.body());
		file.close();
	        
		//URL request 2
		    
		HttpClient client2 = HttpClient.newHttpClient();
		HttpRequest request2 = HttpRequest.newBuilder()
		.uri(URI.create("https://api.elsevier.com/content/search/scopus?query=35231679900&apiKey=7f59af901d2d86f78a1fd60c1bf9426a"))
		.build();
		
		HttpResponse<String> response2 = client2.send(request2,
		HttpResponse.BodyHandlers.ofString());
		    
		FileWriter file2 = new FileWriter("datos2.json");
		file2.write(response2.body());
		file2.close();
		
		//URL request 3
	    
		HttpClient client3 = HttpClient.newHttpClient();
		HttpRequest request3 = HttpRequest.newBuilder()
		.uri(URI.create("https://api.elsevier.com/content/search/scopus?query=55746045300&apiKey=7f59af901d2d86f78a1fd60c1bf9426a"))
		.build();
		
		HttpResponse<String> response3 = client3.send(request3,
		HttpResponse.BodyHandlers.ofString());
		    
		FileWriter file3 = new FileWriter("datos3.json");
		file3.write(response3.body());
		file3.close();
		
		//URL request 4
	    
		HttpClient client4 = HttpClient.newHttpClient();
		HttpRequest request4 = HttpRequest.newBuilder()
		.uri(URI.create("https://api.elsevier.com/content/search/scopus?query=55228098200&apiKey=7f59af901d2d86f78a1fd60c1bf9426a"))
		.build();
		
		HttpResponse<String> response4 = client4.send(request4,
		HttpResponse.BodyHandlers.ofString());
		    
		FileWriter file4 = new FileWriter("datos4.json");
		file4.write(response4.body());
		file4.close();
		
		//URL request 5
	    
		HttpClient client5 = HttpClient.newHttpClient();
		HttpRequest request5 = HttpRequest.newBuilder()
		.uri(URI.create("https://api.elsevier.com/content/search/scopus?query=36077269600&apiKey=7f59af901d2d86f78a1fd60c1bf9426a"))
		.build();
		
		HttpResponse<String> response5 = client5.send(request5,
		HttpResponse.BodyHandlers.ofString());
		    
		FileWriter file5 = new FileWriter("datos5.json");
		file5.write(response5.body());
		file5.close();
		
		//URL request 6
	    
		HttpClient client6 = HttpClient.newHttpClient();
		HttpRequest request6 = HttpRequest.newBuilder()
		.uri(URI.create("https://api.elsevier.com/content/search/scopus?query=36066858500&apiKey=7f59af901d2d86f78a1fd60c1bf9426a"))
		.build();
		
		HttpResponse<String> response6 = client6.send(request6,
		HttpResponse.BodyHandlers.ofString());
		    
		FileWriter file6 = new FileWriter("datos6.json");
		file6.write(response6.body());
		file6.close();
	
		//URL request 7
	    
		HttpClient client7 = HttpClient.newHttpClient();
		HttpRequest request7 = HttpRequest.newBuilder()
		.uri(URI.create("https://api.elsevier.com/content/search/scopus?query=14832325400&apiKey=7f59af901d2d86f78a1fd60c1bf9426a"))
		.build();
		
		HttpResponse<String> response7 = client7.send(request7,
		HttpResponse.BodyHandlers.ofString());
		    
		FileWriter file7 = new FileWriter("datos7.json");
		file7.write(response7.body());
		file7.close();
		
		//URL request 8
	    
		HttpClient client8 = HttpClient.newHttpClient();
		HttpRequest request8 = HttpRequest.newBuilder()
		.uri(URI.create("https://api.elsevier.com/content/search/scopus?query=36062618800&apiKey=7f59af901d2d86f78a1fd60c1bf9426a"))
		.build();
		
		HttpResponse<String> response8 = client8.send(request8,
		HttpResponse.BodyHandlers.ofString());
		    
		FileWriter file8 = new FileWriter("datos8.json");
		file8.write(response8.body());
		file8.close();
		
		//URL request 9
	    
		HttpClient client9 = HttpClient.newHttpClient();
		HttpRequest request9 = HttpRequest.newBuilder()
		.uri(URI.create("https://api.elsevier.com/content/search/scopus?query=13606062200&apiKey=7f59af901d2d86f78a1fd60c1bf9426a"))
		.build();
		
		HttpResponse<String> response9 = client9.send(request9,
		HttpResponse.BodyHandlers.ofString());
		    
		FileWriter file9 = new FileWriter("datos9.json");
		file9.write(response9.body());
		file9.close();
		
		//URL request 10
	    
		HttpClient client10 = HttpClient.newHttpClient();
		HttpRequest request10 = HttpRequest.newBuilder()
		.uri(URI.create("https://api.elsevier.com/content/search/scopus?query=35391040400&apiKey=7f59af901d2d86f78a1fd60c1bf9426a"))
		.build();
		
		HttpResponse<String> response10 = client10.send(request10,
		HttpResponse.BodyHandlers.ofString());
		    
		FileWriter file10 = new FileWriter("datos10.json");
		file10.write(response10.body());
		file10.close();
		
		/**
		* Se van a asignar las clases controlador, modelo y vista para sus diversas funciones
		*/
	       		
		//objeto vista y modelo creado con el método estático 
	       
		Modelo modelo = llenarDatosModelo();
		Modelo modelo2 = llenarDatosModelo2();
		/*Modelo modelo3 = llenarDatosModelo3();
		Modelo modelo4 = llenarDatosModelo4();
		Modelo modelo5 = llenarDatosModelo5();*/
		Modelo modelo6 = llenarDatosModelo6();
		Modelo modelo7 = llenarDatosModelo7();
		Modelo modelo8 = llenarDatosModelo8();
		Modelo modelo9 = llenarDatosModelo9();
		Modelo modelo10 = llenarDatosModelo10();
		Vista vista = new Vista();
		
		//se crea un objeto controlador y se le pasa el modelo y la vista
		
		Controlador controlador = new Controlador(modelo, vista);
		Controlador controlador2 = new Controlador(modelo2, vista);
		/*Controlador controlador3 = new Controlador(modelo3, vista);
		Controlador controlador4 = new Controlador(modelo4, vista);
		Controlador controlador5 = new Controlador(modelo5, vista);*/
		Controlador controlador6 = new Controlador(modelo6, vista);
		Controlador controlador7 = new Controlador(modelo7, vista);
		Controlador controlador8 = new Controlador(modelo8, vista);
		Controlador controlador9 = new Controlador(modelo9, vista);
		Controlador controlador10 = new Controlador(modelo10, vista);
		
		// se muestra los datos
		
		controlador.actualizarVista();
		controlador2.actualizarVista();
		/*controlador3.actualizarVista();
		controlador4.actualizarVista();
		controlador5.actualizarVista();*/
		controlador6.actualizarVista();
		controlador7.actualizarVista();
		controlador8.actualizarVista();
		controlador9.actualizarVista();
		controlador10.actualizarVista();
		
		//se actualiza el SQL
		
		modelo.llenarSql();
		modelo2.llenarSql();
		/*modelo3.llenarSql();
		modelo4.llenarSql();
		modelo5.llenarSql();*/
		modelo6.llenarSql();
		modelo7.llenarSql();
		modelo8.llenarSql();
		modelo9.llenarSql();
		modelo10.llenarSql();
		
	}

	/**
	* Se van a establecer los métodos (uno por petición) con los que se devuelve el autor y sus datos (aquellos que nos interesan)
	*/
	
	private static Modelo llenarDatosModelo() {
		
		JSONParser jsonParser = new JSONParser ();
		
		try(FileReader reader = new FileReader ("datos.json")) {
			
			JSONObject documento = (JSONObject) jsonParser.parse(reader);
	
			JSONObject resultados = (JSONObject)documento.get("search-results");
			
			document_count = (String) resultados.get("opensearch:totalResults");
			
			JSONObject query = (JSONObject)resultados.get("opensearch:Query");
			
			ID = (String) query.get("@searchTerms"); 
			
			JSONArray links = (JSONArray) resultados.get("link");
			JSONObject link0 = (JSONObject) links.get(0);
			
			url = (String) link0.get("@href");
			
			JSONArray entrys = (JSONArray) resultados.get("entry");
			JSONObject entry0 = (JSONObject) entrys.get(0);
			
			eid = (String) entry0.get("eid");
			
			JSONArray affiliations = (JSONArray) entry0.get("affiliation");
			JSONObject af = (JSONObject) affiliations.get(0);
			
			affiliation_name = (String) af.get("affilname");
			
			affiliation_city = (String) af.get("affiliation-city");
			
			affiliation_country = (String) af.get("affiliation-country");
			
			
		} catch (FileNotFoundException e) {
		e.printStackTrace();	
		} catch(IOException e) {
			e.printStackTrace();		
		} catch(ParseException e) {
			e.printStackTrace();
		}
		
		Modelo autor = new Modelo();
		autor.setID(ID);
		autor.seturl(url);
		autor.seteid(eid);
		autor.setdocument_count(document_count);
		autor.setaffiliation_name(affiliation_name);
		autor.setaffiliation_city(affiliation_city);
		autor.setaffiliation_country(affiliation_country);
		return autor;
		
	}

	private static Modelo llenarDatosModelo2() {
		
		JSONParser jsonParser = new JSONParser ();
		
		try(FileReader reader = new FileReader ("datos2.json")) {
			
			JSONObject documento = (JSONObject) jsonParser.parse(reader);
			
			JSONObject resultados = (JSONObject)documento.get("search-results");
			
			document_count = (String) resultados.get("opensearch:totalResults");
			
			JSONObject query = (JSONObject)resultados.get("opensearch:Query");
			
			ID = (String) query.get("@searchTerms"); 
			
			JSONArray links = (JSONArray) resultados.get("link");
			JSONObject link0 = (JSONObject) links.get(0);
			
			url = (String) link0.get("@href");
			
			JSONArray entrys = (JSONArray) resultados.get("entry");
			JSONObject entry0 = (JSONObject) entrys.get(0);
			
			eid = (String) entry0.get("eid");
			
			JSONArray affiliations = (JSONArray) entry0.get("affiliation");
			JSONObject af = (JSONObject) affiliations.get(0);
			
			affiliation_name = (String) af.get("affilname");
			
			affiliation_city = (String) af.get("affiliation-city");
			
			affiliation_country = (String) af.get("affiliation-country");
			
		} catch (FileNotFoundException e) {
		e.printStackTrace();	
		} catch(IOException e) {
			e.printStackTrace();		
		} catch(ParseException e) {
			e.printStackTrace();
		}
		
		Modelo autor = new Modelo();
		autor.setID(ID);
		autor.seturl(url);
		autor.seteid(eid);
		autor.setdocument_count(document_count);
		autor.setaffiliation_name(affiliation_name);
		autor.setaffiliation_city(affiliation_city);
		autor.setaffiliation_country(affiliation_country);
		return autor;
		
	}
	
	private static Modelo llenarDatosModelo3() {
		
		JSONParser jsonParser = new JSONParser ();
		
		try(FileReader reader = new FileReader ("datos3.json")) {
			
			JSONObject documento = (JSONObject) jsonParser.parse(reader);
	
			JSONObject resultados = (JSONObject)documento.get("search-results");
			
			document_count = (String) resultados.get("opensearch:totalResults");
			
			JSONObject query = (JSONObject)resultados.get("opensearch:Query");
			
			ID = (String) query.get("@searchTerms"); 
			
			JSONArray links = (JSONArray) resultados.get("link");
			JSONObject link0 = (JSONObject) links.get(0);
			
			url = (String) link0.get("@href");
			
			JSONArray entrys = (JSONArray) resultados.get("entry");
			JSONObject entry0 = (JSONObject) entrys.get(0);
			
			eid = (String) entry0.get("eid");
			
			JSONArray affiliations = (JSONArray) entry0.get("affiliation");
			JSONObject af = (JSONObject) affiliations.get(0);
			
			affiliation_name = (String) af.get("affilname");
			
			affiliation_city = (String) af.get("affiliation-city");
			
			affiliation_country = (String) af.get("affiliation-country");
			
			
		} catch (FileNotFoundException e) {
		e.printStackTrace();	
		} catch(IOException e) {
			e.printStackTrace();		
		} catch(ParseException e) {
			e.printStackTrace();
		}
		
		Modelo autor = new Modelo();
		autor.setID(ID);
		autor.seturl(url);
		autor.seteid(eid);
		autor.setdocument_count(document_count);
		autor.setaffiliation_name(affiliation_name);
		autor.setaffiliation_city(affiliation_city);
		autor.setaffiliation_country(affiliation_country);
		return autor;
		
	}
	
	private static Modelo llenarDatosModelo4() {
		
		JSONParser jsonParser = new JSONParser ();
		
		try(FileReader reader = new FileReader ("datos4.json")) {
			
			JSONObject documento = (JSONObject) jsonParser.parse(reader);
	
			JSONObject resultados = (JSONObject)documento.get("search-results");
			
			document_count = (String) resultados.get("opensearch:totalResults");
			
			JSONObject query = (JSONObject)resultados.get("opensearch:Query");
			
			ID = (String) query.get("@searchTerms"); 
			
			JSONArray links = (JSONArray) resultados.get("link");
			JSONObject link0 = (JSONObject) links.get(0);
			
			url = (String) link0.get("@href");
			
			JSONArray entrys = (JSONArray) resultados.get("entry");
			JSONObject entry0 = (JSONObject) entrys.get(0);
			
			eid = (String) entry0.get("eid");
			
			JSONArray affiliations = (JSONArray) entry0.get("affiliation");
			JSONObject af = (JSONObject) affiliations.get(0);
			
			affiliation_name = (String) af.get("affilname");
			
			affiliation_city = (String) af.get("affiliation-city");
			
			affiliation_country = (String) af.get("affiliation-country");
			
			
		} catch (FileNotFoundException e) {
		e.printStackTrace();	
		} catch(IOException e) {
			e.printStackTrace();		
		} catch(ParseException e) {
			e.printStackTrace();
		}
		
		Modelo autor = new Modelo();
		autor.setID(ID);
		autor.seturl(url);
		autor.seteid(eid);
		autor.setdocument_count(document_count);
		autor.setaffiliation_name(affiliation_name);
		autor.setaffiliation_city(affiliation_city);
		autor.setaffiliation_country(affiliation_country);
		return autor;
		
	}
	
	private static Modelo llenarDatosModelo5() {
		
		JSONParser jsonParser = new JSONParser ();
		
		try(FileReader reader = new FileReader ("datos5.json")) {
			
			JSONObject documento = (JSONObject) jsonParser.parse(reader);
	
			JSONObject resultados = (JSONObject)documento.get("search-results");
			
			document_count = (String) resultados.get("opensearch:totalResults");
			
			JSONObject query = (JSONObject)resultados.get("opensearch:Query");
			
			ID = (String) query.get("@searchTerms"); 
			
			JSONArray links = (JSONArray) resultados.get("link");
			JSONObject link0 = (JSONObject) links.get(0);
			
			url = (String) link0.get("@href");
			
			JSONArray entrys = (JSONArray) resultados.get("entry");
			JSONObject entry0 = (JSONObject) entrys.get(0);
			
			eid = (String) entry0.get("eid");
			
			JSONArray affiliations = (JSONArray) entry0.get("affiliation");
			JSONObject af = (JSONObject) affiliations.get(0);
			
			affiliation_name = (String) af.get("affilname");
			
			affiliation_city = (String) af.get("affiliation-city");
			
			affiliation_country = (String) af.get("affiliation-country");
			
			
		} catch (FileNotFoundException e) {
		e.printStackTrace();	
		} catch(IOException e) {
			e.printStackTrace();		
		} catch(ParseException e) {
			e.printStackTrace();
		}
		
		Modelo autor = new Modelo();
		autor.setID(ID);
		autor.seturl(url);
		autor.seteid(eid);
		autor.setdocument_count(document_count);
		autor.setaffiliation_name(affiliation_name);
		autor.setaffiliation_city(affiliation_city);
		autor.setaffiliation_country(affiliation_country);
		return autor;
		
	}

	private static Modelo llenarDatosModelo6() {
	
		JSONParser jsonParser = new JSONParser ();
		
		try(FileReader reader = new FileReader ("datos6.json")) {
			
			JSONObject documento = (JSONObject) jsonParser.parse(reader);
	
			JSONObject resultados = (JSONObject)documento.get("search-results");
			
			document_count = (String) resultados.get("opensearch:totalResults");
			
			JSONObject query = (JSONObject)resultados.get("opensearch:Query");
			
			ID = (String) query.get("@searchTerms"); 
			
			JSONArray links = (JSONArray) resultados.get("link");
			JSONObject link0 = (JSONObject) links.get(0);
			
			url = (String) link0.get("@href");
			
			JSONArray entrys = (JSONArray) resultados.get("entry");
			JSONObject entry0 = (JSONObject) entrys.get(0);
			
			eid = (String) entry0.get("eid");
			
			JSONArray affiliations = (JSONArray) entry0.get("affiliation");
			JSONObject af = (JSONObject) affiliations.get(0);
			
			affiliation_name = (String) af.get("affilname");
			
			affiliation_city = (String) af.get("affiliation-city");
			
			affiliation_country = (String) af.get("affiliation-country");
			
			
		} catch (FileNotFoundException e) {
		e.printStackTrace();	
		} catch(IOException e) {
			e.printStackTrace();		
		} catch(ParseException e) {
			e.printStackTrace();
		}
		
		Modelo autor = new Modelo();
		autor.setID(ID);
		autor.seturl(url);
		autor.seteid(eid);
		autor.setdocument_count(document_count);
		autor.setaffiliation_name(affiliation_name);
		autor.setaffiliation_city(affiliation_city);
		autor.setaffiliation_country(affiliation_country);
		return autor;
	
	}
	
	private static Modelo llenarDatosModelo7() {
		
		JSONParser jsonParser = new JSONParser ();
		
		try(FileReader reader = new FileReader ("datos7.json")) {
			
			JSONObject documento = (JSONObject) jsonParser.parse(reader);
	
			JSONObject resultados = (JSONObject)documento.get("search-results");
			
			document_count = (String) resultados.get("opensearch:totalResults");
			
			JSONObject query = (JSONObject)resultados.get("opensearch:Query");
			
			ID = (String) query.get("@searchTerms"); 
			
			JSONArray links = (JSONArray) resultados.get("link");
			JSONObject link0 = (JSONObject) links.get(0);
			
			url = (String) link0.get("@href");
			
			JSONArray entrys = (JSONArray) resultados.get("entry");
			JSONObject entry0 = (JSONObject) entrys.get(0);
			
			eid = (String) entry0.get("eid");
			
			JSONArray affiliations = (JSONArray) entry0.get("affiliation");
			JSONObject af = (JSONObject) affiliations.get(0);
			
			affiliation_name = (String) af.get("affilname");
			
			affiliation_city = (String) af.get("affiliation-city");
			
			affiliation_country = (String) af.get("affiliation-country");
			
			
		} catch (FileNotFoundException e) {
		e.printStackTrace();	
		} catch(IOException e) {
			e.printStackTrace();		
		} catch(ParseException e) {
			e.printStackTrace();
		}
		
		Modelo autor = new Modelo();
		autor.setID(ID);
		autor.seturl(url);
		autor.seteid(eid);
		autor.setdocument_count(document_count);
		autor.setaffiliation_name(affiliation_name);
		autor.setaffiliation_city(affiliation_city);
		autor.setaffiliation_country(affiliation_country);
		return autor;
		
	}
	
	private static Modelo llenarDatosModelo8() {
		
		JSONParser jsonParser = new JSONParser ();
		
		try(FileReader reader = new FileReader ("datos8.json")) {
			
			JSONObject documento = (JSONObject) jsonParser.parse(reader);
	
			JSONObject resultados = (JSONObject)documento.get("search-results");
			
			document_count = (String) resultados.get("opensearch:totalResults");
			
			JSONObject query = (JSONObject)resultados.get("opensearch:Query");
			
			ID = (String) query.get("@searchTerms"); 
			
			JSONArray links = (JSONArray) resultados.get("link");
			JSONObject link0 = (JSONObject) links.get(0);
			
			url = (String) link0.get("@href");
			
			JSONArray entrys = (JSONArray) resultados.get("entry");
			JSONObject entry0 = (JSONObject) entrys.get(0);
			
			eid = (String) entry0.get("eid");
			
			JSONArray affiliations = (JSONArray) entry0.get("affiliation");
			JSONObject af = (JSONObject) affiliations.get(0);
			
			affiliation_name = (String) af.get("affilname");
			
			affiliation_city = (String) af.get("affiliation-city");
			
			affiliation_country = (String) af.get("affiliation-country");
			
			
		} catch (FileNotFoundException e) {
		e.printStackTrace();	
		} catch(IOException e) {
			e.printStackTrace();		
		} catch(ParseException e) {
			e.printStackTrace();
		}
		
		Modelo autor = new Modelo();
		autor.setID(ID);
		autor.seturl(url);
		autor.seteid(eid);
		autor.setdocument_count(document_count);
		autor.setaffiliation_name(affiliation_name);
		autor.setaffiliation_city(affiliation_city);
		autor.setaffiliation_country(affiliation_country);
		return autor;
		
	}
	
	private static Modelo llenarDatosModelo9() {
		
		JSONParser jsonParser = new JSONParser ();
		
		try(FileReader reader = new FileReader ("datos9.json")) {
			
			JSONObject documento = (JSONObject) jsonParser.parse(reader);
	
			JSONObject resultados = (JSONObject)documento.get("search-results");
			
			document_count = (String) resultados.get("opensearch:totalResults");
			
			JSONObject query = (JSONObject)resultados.get("opensearch:Query");
			
			ID = (String) query.get("@searchTerms"); 
			
			JSONArray links = (JSONArray) resultados.get("link");
			JSONObject link0 = (JSONObject) links.get(0);
			
			url = (String) link0.get("@href");
			
			JSONArray entrys = (JSONArray) resultados.get("entry");
			JSONObject entry0 = (JSONObject) entrys.get(0);
			
			eid = (String) entry0.get("eid");
			
			JSONArray affiliations = (JSONArray) entry0.get("affiliation");
			JSONObject af = (JSONObject) affiliations.get(0);
			
			affiliation_name = (String) af.get("affilname");
			
			affiliation_city = (String) af.get("affiliation-city");
			
			affiliation_country = (String) af.get("affiliation-country");
			
			
		} catch (FileNotFoundException e) {
		e.printStackTrace();	
		} catch(IOException e) {
			e.printStackTrace();		
		} catch(ParseException e) {
			e.printStackTrace();
		}
		
		Modelo autor = new Modelo();
		autor.setID(ID);
		autor.seturl(url);
		autor.seteid(eid);
		autor.setdocument_count(document_count);
		autor.setaffiliation_name(affiliation_name);
		autor.setaffiliation_city(affiliation_city);
		autor.setaffiliation_country(affiliation_country);
		return autor;
		
	}
	
	private static Modelo llenarDatosModelo10() {
		
		JSONParser jsonParser = new JSONParser ();
		
		try(FileReader reader = new FileReader ("datos10.json")) {
			
			JSONObject documento = (JSONObject) jsonParser.parse(reader);
	
			JSONObject resultados = (JSONObject)documento.get("search-results");
			
			document_count = (String) resultados.get("opensearch:totalResults");
			
			JSONObject query = (JSONObject)resultados.get("opensearch:Query");
			
			ID = (String) query.get("@searchTerms"); 
			
			JSONArray links = (JSONArray) resultados.get("link");
			JSONObject link0 = (JSONObject) links.get(0);
			
			url = (String) link0.get("@href");
			
			JSONArray entrys = (JSONArray) resultados.get("entry");
			JSONObject entry0 = (JSONObject) entrys.get(0);
			
			eid = (String) entry0.get("eid");
			
			JSONArray affiliations = (JSONArray) entry0.get("affiliation");
			JSONObject af = (JSONObject) affiliations.get(0);
			
			affiliation_name = (String) af.get("affilname");
			
			affiliation_city = (String) af.get("affiliation-city");
			
			affiliation_country = (String) af.get("affiliation-country");
			
			
		} catch (FileNotFoundException e) {
		e.printStackTrace();	
		} catch(IOException e) {
			e.printStackTrace();		
		} catch(ParseException e) {
			e.printStackTrace();
		}
		
		Modelo autor = new Modelo();
		autor.setID(ID);
		autor.seturl(url);
		autor.seteid(eid);
		autor.setdocument_count(document_count);
		autor.setaffiliation_name(affiliation_name);
		autor.setaffiliation_city(affiliation_city);
		autor.setaffiliation_country(affiliation_country);
		return autor;
		
	}

}
