package com.blueskyline.characterisationtests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import org.junit.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class CharacterisationTestForLegacyCrud
{
  @Test
  public void WeHaventBrokenAnything()
  {
    String cannedOutput = "";
    try
    {
      cannedOutput = new String(Files.readAllBytes(Paths.get("legacy_output.txt")));
    }
    catch (IOException ex)
    {
      fail("Could not load canned legacy output file");
    }

    String capturedOutput = "Wobble";

    assertEquals(cannedOutput, capturedOutput);
  }
}
