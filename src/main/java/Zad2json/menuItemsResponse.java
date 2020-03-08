package Zad2json;


import Zad1jason.RecipeResult;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@NoArgsConstructor
@Setter
public class menuItemsResponse {
        private List<menuItemsResults> menuItems;
        private String type;
        private int offset;
        private int number;
        private int totalMenuItems;
        private int processingTimeMs;
        private Long expires;


    }
