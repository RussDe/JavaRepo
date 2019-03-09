package company.lesson6.homework;

import java.util.Objects;

public class Word {

  private  String word;

  public Word(String word) {
    this.word = word;
  }

  public String getWord() {
    return word;
  }

  @Override
  public String toString() {
    return word;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Word)) return false;
    Word word1 = (Word) o;
    return Objects.equals(word, word1.word);
  }

  @Override
  public int hashCode() {
    return Objects.hash(word);
  }


//  public boolean equals(Object object) {
//    if (object == null) {
//      return false;
//    }
//    if (object == this) {
//      return true;
//    }
//    if (this.getClass() != object.getClass()) {
//      return false;
//    }
//    Word wordTemp = (Word) object;
//
//    return Objects.equals(this.word, wordTemp.word);
//            //this.getWord() != null && this.getWord().equals(wordTemp.getWord());
//  }


}
