package jaz_s29235_nbp.main.Service;

import jaz_s29235_nbp.main.Classes.ExchangeRates;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class NBPService {
    private final RestTemplate restTemplate;

    NBPService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }
    public ExchangeRates getRates(String currency, String dateA, String dateB) {
        return restTemplate.getForEntity(STR."http://api.nbp.pl/api/exchangerates/rates/a/" + currency + "/" +
                dateA + "/" + dateB + "/?format=json", ExchangeRates.class).getBody();
    }

    public double getAveragePrice() {
        return 0;
    }
}
