package service;


import model.Dictionary;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DictionaryService {
 public Map<String, Dictionary> input() {
     Map<String, Dictionary> dictionaryMap = new HashMap<>();
     Scanner scanner = new Scanner(System.in);
     while (true) {
         System.out.println("Nhập từ khóa:");
         String keyword = scanner.nextLine();
         System.out.println("Mô tả:");
         String description = scanner.nextLine();
         System.out.println("Loại từ:");
         String wordType = scanner.nextLine();

         Dictionary dictionary = new Dictionary(keyword, description, wordType);
         dictionaryMap.put(keyword, dictionary);

         System.out.println("continue? (yes/no)");
         String choice = scanner.nextLine();
         if (!choice.equalsIgnoreCase("yes")) {
             break;
         }
     }
     return dictionaryMap;
 }

 public void info(Map<String, Dictionary> dictionaryMap) {
     System.out.println("Dictionary:");
     for (Map.Entry<String, Dictionary> entry : dictionaryMap.entrySet()) {
         System.out.println(entry.getValue());
     }
 }

 public void filter(Map<String, Dictionary> dictionaryMap) {
     Scanner scanner = new Scanner(System.in);
     System.out.println("Nhập từ khóa để tìm kiếm:");
     String keyword = scanner.nextLine();
     Dictionary dictionary = dictionaryMap.get(keyword);
     if (dictionary != null) {
         System.out.println("Không tìm thấy directory:");
         System.out.println(dictionary);
     } else {
         System.out.println("Từ khóa không tìm thấy trong directory.");
     }
 }

 public void delete(Map<String, Dictionary> dictionaryMap) {
     Scanner scanner = new Scanner(System.in);
     System.out.println("Nhập từ kháo để xóa:");
     String keyword = scanner.nextLine();
     if (dictionaryMap.containsKey(keyword)) {
         dictionaryMap.remove(keyword);
         System.out.println("Dictionary với từ khóa là '" + keyword + "' đã xóa.");
     } else {
         System.out.println("Từ khóa không tìm thấy trong directory.");
     }
 }
}
