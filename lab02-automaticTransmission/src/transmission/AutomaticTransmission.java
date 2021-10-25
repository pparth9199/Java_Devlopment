package transmission;

import java.util.Objects;

/**
 * This class represents automatic transmission for one car.
 *
 */
public class AutomaticTransmission implements Transmission {
  private int thres1;
  private int thres2;
  private int thres3;
  private int thres4;
  private int thres5;
  private int speed;
  private int gear;
  
  /**
   *Class constructor to initiate the values with checking for illegal arguements.
   * 
   */
  public AutomaticTransmission(int t1, int t2, int t3, int t4, int t5) {
    if ((t1 <= 0 || t2 <= 0 || t3 <= 0 || t4 <= 0 || t5 <= 0) 
         || (t1 >= t2 || t2 >= t3 || t3 >= t4 || t4 >= t5
         || t1 >= t3 || t1 >= t4 || t1 >= t5  || t2 >= t4 || t2 >= t5
         || t3 >= t4 || t3 >= t5)) {
      throw new IllegalArgumentException();
    }
    else {
      this.thres1 = t1;
      this.thres2 = t2;
      this.thres3 = t3;
      this.thres4 = t4;
      this.thres5 = t5;
    }
    this.speed = 0;
    this.gear = 0;
  }

  @Override
  public void increaseSpeed() {
    this.speed = this.speed + 1;  
  }

  @Override
  public void decreaseSpeed() throws IllegalStateException {
    if (this.speed == 0) {
      throw new IllegalStateException();
    }
    else {
      this.speed = this.speed - 1;
    }
  }

  @Override
  public int getSpeed() {
    return this.speed;
  }

  @Override
  public int getGear() {
    if (this.speed > 0) {
      this.gear = 1;
    }
    if (this.speed >= this.thres1) {
      this.gear = 2;
    }
    if (this.speed >= this.thres2) {
      this.gear = 3;
    }
    if (this.speed >= this.thres3) {
      this.gear = 4;
    }
    if (this.speed >= this.thres4) {
      this.gear = 5;
    }
    if (this.speed >= this.thres5) {
      this.gear = 6;
    }
    return this.gear;
  }

  @Override
public String toString() {
    return String.format("Transmission (speed = " + speed + ", gear = " + gear + ")");
  }

  @Override
 public int hashCode() {
    return Objects.hash(gear, speed, thres1, thres2, thres3, thres4, thres5);
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (obj == null) {
      return false;
    }
    if (getClass() != obj.getClass()) {
      return false;
    }
    AutomaticTransmission other = (AutomaticTransmission) obj;
    return gear == other.gear && speed == other.speed 
           && thres1 == other.thres1 && thres2 == other.thres2
           && thres3 == other.thres3 && thres4 == other.thres4 && thres5 == other.thres5;
  } 

}
