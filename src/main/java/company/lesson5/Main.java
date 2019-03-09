package company.lesson5;

/**
 * Задача 2
 * Создать объект класса Самолет, используя классы Крыло, Шасси,
 * Двигатель. Методы: летать, задавать маршрут, вывести на консоль маршрут.   *
 */
public class Main {
  public static void main(String[] args) {
    Crylo leftCryylo = new Crylo(10);
    Crylo rightCryylo = new Crylo(10);
    Engine engine = new Engine(1000, "Mercedes");
    Shassi shassi = new Shassi();
    Plain plain = new Plain(leftCryylo, rightCryylo, engine, shassi);
    plain.fly();

    Plain plain1 = new VipPlain(leftCryylo,rightCryylo,engine,shassi,1);
    plain1.fly();
    ((VipPlain) plain1).swim();
  }
}
