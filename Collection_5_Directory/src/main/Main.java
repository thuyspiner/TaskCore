package main;


import model.Dictionary;
import service.DictionaryService;

import java.util.Map;

public class Main {
 public static void main(String[] args) {
     DictionaryService dictionaryService = new DictionaryService();

     // Input map of dictionaries
     Map<String, Dictionary> dictionaryMap = dictionaryService.input();

     // Display information of all dictionaries
     dictionaryService.info(dictionaryMap);

     // Filter dictionary by keyword
     dictionaryService.filter(dictionaryMap);

     // Delete dictionary by keyword
     dictionaryService.delete(dictionaryMap);

     // Display updated information of dictionaries
     dictionaryService.info(dictionaryMap);
 }
}

