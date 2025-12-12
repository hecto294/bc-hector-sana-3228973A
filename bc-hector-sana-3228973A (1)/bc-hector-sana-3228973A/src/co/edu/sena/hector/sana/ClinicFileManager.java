package co.edu.sena.hector.sana;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class ClinicFileManager {

    public static void savePatients(List<Patient> patients, String filename) {
        try (FileWriter writer = new FileWriter(filename)) {
            for (Patient p : patients) {
                writer.write(p.toString() + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
