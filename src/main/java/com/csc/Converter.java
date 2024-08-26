package com.csc;

import java.util.*;

public class Converter {

  public String toPounds(int ounces) {
    // if we have exactly one pound in ounces
    if (ounces == 16) {
      return "1.0000 lb";
    }
    
    double pounds = (double)ounces / 16.0;
    
    // converts a double to a string with the required precision then returns it.
    return String.format("%.4f lbs", pounds);
  }

  public String toPoundsAndOunces(int ounces) {
    int pounds = ounces / 16;
    
    // ounces remaining after dividing out the pounds
    int ounces_remaining = ounces % 16;
    
    // if we need to use lb instead of lbs
    if (pounds == 1) {
      return String.format("1 lb %d oz", ounces_remaining);
    } else {
      return String.format("%d lbs %d oz", pounds, ounces_remaining);
    }
  }
}
