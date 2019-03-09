package company.lesson2.wheel;

public class MainDriverRun {
  public static void main(String[] args) {
    Drive drive = () -> System.out.println("Just drive");
    Drive.veryFastDrive();
    drive.drive();

    //anonymous
      Drive drive1 = new Drive() {
        int n;
        int p;
        {
          n=10;
          p=20;
        }

//      public Drive(int m){} Can't be implemented

      @Override
      public void drive() {
        System.out.println("drive1");
      }

      @Override
      public void fastDrive() {
        System.out.println("Override fastDrive here");
      }
    };

    AbstractDrive abstractDrive = new AbstractDrive(90) {
      @Override
      public int speedLimit() {
        return 120;
      }

      @Override
      public int speedLimit2() {
        return 0;
      }

      @Override
      public int speedLimit3() {
        return 0;
      }
    };

  }
}
