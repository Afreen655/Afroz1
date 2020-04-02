package ctsnewpackage;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LearningAttributesInTestNGTest {

  @Test
  public void TestATest() {
    throw new RuntimeException("Test not implemented");
  }

  @Test
  public void TestBTest() {
    throw new RuntimeException("Test not implemented");
  }

  @Test
  public void TestCTest() {
    throw new RuntimeException("Test not implemented");
  }


@Test
public void TestA() {
Assert.assertEquals("google","google" );
}
@Test
public void TestB() {
Assert.assertEquals("yahoo1","yahoo" );
}
@Test
public void TestC() {
Assert.assertEquals("yahoo","yahoo" );
}
}