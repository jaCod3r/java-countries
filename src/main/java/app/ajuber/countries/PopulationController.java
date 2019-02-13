package app.ajuber.countries;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Comparator;

@RestController
@RequestMapping("/population")
public class PopulationController {

  Comparator<Country> comparator = Comparator.comparing( Country::getPopulation );

  @RequestMapping("/min")
  public Country getMinPopulation() {
    return CountriesApplication.ourCountryList.countryList.stream().min(comparator).get();
  }

  @RequestMapping("/max")
  public Country getMaxPopulation() {
    return CountriesApplication.ourCountryList.countryList.stream().max(comparator).get();
  }

//  @RequestMapping("/size")
//  public Country getPopulation(@RequestParam(value = "people") int population) {
//    return CountriesApplication.ourCountryList.countryList
//  }
}
