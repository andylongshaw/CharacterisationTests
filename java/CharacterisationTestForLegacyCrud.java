package com.blueskyline.characterisationtests;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CharacterisationTestForLegacyCrud
{
  @Test
  public void WeHaventBrokenAnything()
  {
    String cannedOutput = "Wibble";
    String capturedOutput = "Wobble";

    assertEquals(cannedOutput, capturedOutput);
  }
}
