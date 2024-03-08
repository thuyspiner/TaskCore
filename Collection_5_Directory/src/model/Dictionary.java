package model;

public class Dictionary {
 private String keyword;
 private String description;
 private String wordType;

 public Dictionary(String keyword, String description, String wordType) {
     this.keyword = keyword;
     this.description = description;
     this.wordType = wordType;
 }

 public String getKeyword() {
     return keyword;
 }

 public void setKeyword(String keyword) {
     this.keyword = keyword;
 }

 public String getDescription() {
     return description;
 }

 public void setDescription(String description) {
     this.description = description;
 }

 public String getWordType() {
     return wordType;
 }

 public void setWordType(String wordType) {
     this.wordType = wordType;
 }

 @Override
 public String toString() {
     return "Dictionary{" +
             "keyword='" + keyword + '\'' +
             ", description='" + description + '\'' +
             ", wordType='" + wordType + '\'' +
             '}';
 }
}
