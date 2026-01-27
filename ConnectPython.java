package com.random.percentwork;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ConnectPython {

    public void connect() {
        try {
            ProcessBuilder pd = new ProcessBuilder("python", "percent50.py");
            Process process = pd.start();

            // Read Python standard output
            BufferedReader reader =
                new BufferedReader(new InputStreamReader(process.getInputStream()));

            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println("PYTHON -> " + line);
            }

            // Read Python error output
            BufferedReader errorReader =
                new BufferedReader(new InputStreamReader(process.getErrorStream()));

            while ((line = errorReader.readLine()) != null) {
                System.err.println("PYTHON ERROR -> " + line);
            }

            process.waitFor();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

