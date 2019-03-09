package company.lesson6.homework;

import java.util.ArrayList;
import java.util.List;
//import java.util.StringTokenizer;

public class Sentence {

  private List<Word> words;

  public Sentence() {
    this.words = new ArrayList<>();
  }

  public Sentence addWord(Word word) {
    this.words.add(word);
    return this;
  }

//  public List<Word> getWords() {
//    return words;
//  }

  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    words.forEach(word -> stringBuilder.append(" ").append(word.toString()));
//    StringTokenizer stringTokenizer = new StringTokenizer()
    return stringBuilder.toString();
  }
}
