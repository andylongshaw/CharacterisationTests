package com.blueskyline.characterisationtests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import org.junit.Test;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Paths;

public class CharacterisationTestForLegacyCrud
{
  @Test
  public void WeHaventBrokenAnything()
  {
    String cannedOutput = "";
    String capturedOutput = "";

    try
    {
      cannedOutput = new String(Files.readAllBytes(Paths.get("legacy_output.txt")));

      Process process = Runtime.getRuntime().exec("java -cp ./out com.blueskyline.characterisationtests.LegacyCrud");
      process.waitFor();

      BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));

      String line;
      while ((line = reader.readLine()) != null)
      {
        if (!capturedOutput.equals(""))
        {
          capturedOutput += "\n";
        }
        capturedOutput += line;
      }
    }
    catch (Exception ex)
    {
      fail(ex.getMessage());
    }

    assertEquals(cannedOutput, capturedOutput);
  }
}
