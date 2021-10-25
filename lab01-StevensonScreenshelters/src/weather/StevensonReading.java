package weather;

import java.util.Objects;

/**
 * The class contains stevenson screen readings and their corresponding values associated with them.
 *
 */

public final class StevensonReading implements WeatherReading {
  private double aTc;
  private double dpt;
  private double windSpeed;
  private double totalRain;
  private double rH;
  private double hind;
  private double c1 = -8.78469475556;
  private double c2 = 1.61139411;
  private double c3 = 2.33854883889;
  private double c4 = -0.14611605;
  private double c5 = -0.012308094;
  private double c6 = -0.0164248277778;
  private double c7 = 0.002211732;
  private double c8 = 0.00072546; 
  private double c9 = -0.000003582;
  private double atf;
  private double wc;

  /**
 *Class constructor to initiate the values with checking for illegal arguements.
 * 
 */
  public StevensonReading(double aTc, double dpt, double windSpeed, double totalRain) {
    this.aTc = aTc;
    if (dpt > this.aTc) {
      throw new IllegalArgumentException();
    }
    else {
      this.dpt = dpt;
    }
    if (windSpeed < 0) {
      throw new IllegalArgumentException();
    }
    else {
      this.windSpeed = windSpeed;
    }
    if (totalRain < 0) {
      throw new IllegalArgumentException();
    }
    else {
      this.totalRain = totalRain;
    }
    this.atf = (this.aTc * 1.8) + 32;
  }

  @Override
  public int getTemperature() {
    this.aTc = Math.round(this.aTc);
    int temp = (int) this.aTc;
    return temp;
  }

  @Override
  public int getDewPoint() {
    this.dpt = Math.round(this.dpt);
    int temp = (int) this.dpt;
    return temp;
  }

  @Override
  public int getWindSpeed() {
    this.windSpeed = Math.round(this.windSpeed);
    int temp = (int) this.windSpeed;
    return temp;
  }

  @Override
  public int getTotalRain() {
    this.totalRain = Math.round(this.totalRain);
    int temp = (int) this.totalRain;
    return temp;
  }

  @Override
  public int getRelativeHumidity() {
    this.rH = 100 - 5 * (this.aTc - this.dpt);
    this.rH = Math.round(this.rH);
    int temp = (int) this.rH;
    return temp;
  }

  @Override
  public int getHeatIndex() {
    this.rH = 100 - 5 * (this.aTc - this.dpt);
    double h1 = (this.c1) + (this.c2 * this.aTc) + (this.c3 * this.rH)
              + (this.c4 * this.aTc * this.rH) + (this.c5 * this.aTc * this.aTc)
              + (this.c6 * this.rH * this.rH)
              + (this.c7 * this.aTc * this.aTc * this.rH)
              + (this.c8 * this.aTc * this.rH * this.rH)
              + (this.c9 * this.aTc * this.aTc * this.rH * this.rH);
    this.hind = h1 ; 
    this.hind = Math.round(this.hind);
    int temp = (int) this.hind;
    return temp;
  }

  @Override
  public int getWindChill() {
    double v = Math.pow(this.windSpeed, 0.16);
    this.wc = 35.74 + (0.6215 * this.atf) - (35.75 * v);
    this.wc += (0.4275 * this.atf * v);
    this.wc = Math.round(this.wc);
    int temp = (int) this.wc;
    return temp;
  }

  @Override
  public int hashCode() {
    return Objects.hash(aTc, atf, dpt, hind, rH, totalRain, wc, windSpeed);
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
    StevensonReading other = (StevensonReading) obj;
    return Double.doubleToLongBits(aTc) == Double.doubleToLongBits(other.aTc)
            && Double.doubleToLongBits(atf) == Double.doubleToLongBits(other.atf)
            && Double.doubleToLongBits(dpt) == Double.doubleToLongBits(other.dpt)
            && Double.doubleToLongBits(hind) == Double.doubleToLongBits(other.hind)
            && Double.doubleToLongBits(rH) == Double.doubleToLongBits(other.rH)
            && Double.doubleToLongBits(totalRain) == Double.doubleToLongBits(other.totalRain)
            && Double.doubleToLongBits(wc) == Double.doubleToLongBits(other.wc)
            && Double.doubleToLongBits(windSpeed) == Double.doubleToLongBits(other.windSpeed);
  }

  @Override
  public String toString() {
    return String.format("Reading: T = %d, D = %d, v = %d, rain = %d",
                        (int) Math.round(this.aTc), (int) Math.round(this.dpt), 
                        (int) Math.round(this.windSpeed), 
                        (int) Math.round(this.totalRain));
  }



}
