package com.example;

import org.apache.commons.lang3.StringUtils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {

		App app = new App();

        // Créer un objet de la classe Personne
        Personne personne = new Personne ("alina", "cirelli");

        // Convertir l'objet Personne en JSON et afficher la chaîne JSON
        String jsonString = app.convertToJson(personne);
        System.out.println("JSON: " + jsonString);

        // Capitaliser une chaîne et afficher le résultat
        String capitalizedString = app.capitalizeString("hello world");
        System.out.println("Capitalized: " + capitalizedString);

	}

	public static String convertToJson(Object obj) {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            return objectMapper.writeValueAsString(obj);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
            return null;
        }
    }

	public static String capitalizeString(String str) {
		return StringUtils.capitalize(str);
	}

}
