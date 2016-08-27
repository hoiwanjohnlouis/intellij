//: object/E11_AllTheColorsOfTheRainbow.java
/****************** Exercise 11 *****************
 * Turn the AllTheColorsOfTheRainbow example into
 * a program that compiles and runs.
 ************************************************/
package com.tij4f2014.ch02.object;

public class E11_AllTheColorsOfTheRainbow {
  int anIntegerRepresentingColors;
  void changeTheHueOfTheColor(int newHue) {
    anIntegerRepresentingColors = newHue;
  }
  public static void main(String[] args) {
    E11_AllTheColorsOfTheRainbow all =
      new E11_AllTheColorsOfTheRainbow();
    all.changeTheHueOfTheColor(27);
  }
} ///:~
