package app.ajuber.countries;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CountriesApplication {

  static CountriesList ourCountryList;

  public static void main(String[] args) {
    ourCountryList =  new CountriesList();
    SpringApplication.run(CountriesApplication.class, args);
  }
}

