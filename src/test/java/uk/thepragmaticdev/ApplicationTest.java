package uk.thepragmaticdev;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ApplicationTest {

  @Test
  public void testPositive() {
    Application app = new Application();
    assertEquals(true, app.isPositive(1));
  }

  @Test
  public void testNegative() {
    Application app = new Application();
    assertEquals(false, app.isPositive(-1));
  }

  // Uncomment to kill surviving mutant
  // @Test
  // public void testZero() {
  // Application app = new Application();
  // assertEquals(true, app.isPositive(0));
  // }
}