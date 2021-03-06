package ch.heigvd.res.lab00;

import org.junit.Assert;
import static org.junit.Assert.assertNotNull;
import org.junit.Test;

/**
 *       *** IMPORTANT WARNING : DO NOT EDIT THIS FILE ***
 * 
 * This file is used to specify what you have to implement. To check your work,
 * we will run our own copy of the automated tests. If you change this file,
 * then you will introduce a change of specification!!!
 * 
 * @author Olivier Liechti
 */
public class ClarinetTest {
  @Test
  public void aClarinetShouldMakeFiii() {
    IInstrument clarinet = new Clarinet();
    String sound = clarinet.play();
    Assert.assertEquals("fiii", sound);
  }
 
}
