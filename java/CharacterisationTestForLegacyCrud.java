package com.blueskyline.characterisationtests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import org.junit.Test;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

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

      capturedOutput = new Scanner(process.getInputStream(), "utf-8").useDelimiter("\\z").next();

    }
    catch (Exception ex)
    {
      fail(ex.getMessage());
    }

    assertEquals(cannedOutput, capturedOutput);
  }
}
