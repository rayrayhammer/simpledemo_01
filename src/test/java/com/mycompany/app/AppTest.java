package com.mycompany.app;

import static org.junit.Assert.*;
import org.junit.Test;
import com.mycompany.app.Calculator;
public class AppTest {

  @Test  
  public void addTwoNumberTest() {

    Calculator calculator = new Calculator();
    assertEquals(calculator.addTwoNumber(1,2),3);
  }
}