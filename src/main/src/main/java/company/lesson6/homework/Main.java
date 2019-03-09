package company.lesson6.homework;

/*
1. Создать объект класса Текст, используя классы Предложение, Слово.
Методы: дополнить текст, вывести на консоль текст, заголовок текста.

* Создать приложение, удовлетворяющее требованиям, приведенным в задании.
* Наследование применять только в тех заданиях, в которых это логически
* обосновано. Аргументировать принадлежность классу каждого создаваемого
* метода и корректно переопределить для каждого класса
* методы equals(),hashCode(), toString() (создавать эти методы вручную)
*

2. Additional task:
	Определить класс Точка в пространстве, координаты которой задаются
с помощью Комплексного числа. Создать методы по определению расстояния между точками и расстояния до начала координат.
Определить все методы характерные для комплексного числа
 */

public class Main {
  public static void main(String[] args) {
    Word word1 = new Word("This");
    Word word2 = new Word("is");
    Word word3 = new Word("a");
    Word word4 = new Word("text");
    Word word5 = new Word("!");
    Sentence sentence = new Sentence();
    sentence.addWord(word1).addWord(word2).addWord(word3).addWord(word4).addWord(word5);
    Sentence sentence1 = new Sentence();
    sentence.addWord(word4).addWord(word3).addWord(word2).addWord(word1);
    System.out.println(sentence1.toString());
    Sentence sentenceHeader = new Sentence();
    sentenceHeader.addWord(new Word("is")).addWord(new Word("header"));
    Text text = new Text(sentenceHeader);
    text.addText(sentence).addText(sentence1);
    System.out.println(text.toString());
  }
}
