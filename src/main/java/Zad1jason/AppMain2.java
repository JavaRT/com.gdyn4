package Zad1jason;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class AppMain2 {
    public static void main(String[] args) {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            RecipesResponse responce = objectMapper.readValue(new File("recipies.json"),RecipesResponse.class );
        responce.getResults().forEach((System.out::println));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
