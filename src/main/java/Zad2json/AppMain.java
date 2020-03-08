package Zad2json;

import Zad1jason.RecipesResponse;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class AppMain {
    public static void main(String[] args) {
            ObjectMapper objectMapper = new ObjectMapper();
            try {
                menuItemsResponse responce = objectMapper.readValue(new File("menuItem.json"),menuItemsResponse.class );
                responce.getMenuItems().forEach((System.out::println));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }