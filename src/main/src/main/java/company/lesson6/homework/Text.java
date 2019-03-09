package company.lesson6.homework;

import java.util.ArrayList;
import java.util.List;

public class Text {
  private Sentence header;

  private List<Sentence> listSentence;

  public Text(Sentence header) {
    listSentence = new ArrayList<>();
    this.header = header;
  }

  public Text addText(Sentence sentence) {
    listSentence.add(sentence);
    return this;
  }

  public String toString() {
    String headerCapitalized = header.toString().toUpperCase();
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(headerCapitalized).append("\n");
    listSentence.forEach(sentence -> stringBuilder.append(sentence.toString()));
    return stringBuilder.toString();
  }

}
