package wilmanSaragihJSleepRA;

import java.util.Scanner;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import com.google.gson.Gson;

/**
 * JSleep class to demonstrate JSON parsing with GSON
 *
 * @author Wilman Saragih Sitio
 * @version 2024
 */
public class JSleep {

    class Country {
        public String name;
        public int population;
        public List<String> listOfStates; // Mendefinisikan atribut 'listOfStates' untuk menyimpan daftar nama-nama negara bagian.
    }

    public static void main(String[] args) {
        String filepath = "src\\city.json";
        Gson gson = new Gson(); // Membuat instance baru dari Gson untuk parsing JSON.
        try {
            BufferedReader br = new BufferedReader(new FileReader(filepath)); // Membuka file untuk dibaca dengan BufferedReader yang membungkus FileReader.
            Country input = gson.fromJson(br, Country.class); // Menggunakan Gson untuk mendeserialisasi JSON dari BufferedReader ke objek 'Country'.
            System.out.println("name: " + input.name);
            System.out.println("population: " + input.population);
            System.out.println("states:");
            input.listOfStates.forEach(System.out::println); // Mencetak setiap negara bagian dalam daftar 'listOfStates'.
        } catch (IOException e) { // Menangani potensi IOException jika file tidak ditemukan atau ada masalah saat membaca file.
            e.printStackTrace(); // Mencetak stack trace dari pengecualian untuk debugging.
        }
    }
}
