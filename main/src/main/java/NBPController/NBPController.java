package NBPController;

import io.swagger.v3.oas.annotations.Operation;
import jaz_s29235_nbp.main.Classes.ExchangeRates;
import jaz_s29235_nbp.main.Service.NBPService;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class NBPController {
    private final NBPService service;

    NBPController(NBPService service) {
        this.service = service;
    }


    @Operation(summary = "Wywołuje endpoint z API NBP pozyskujący dla nas jsona z podanymi poniżej danymi")
    @GetMapping("/{currency}/{dateA}/{dateB}")
    public ResponseEntity<ExchangeRates> getNBPresult(@PathVariable String currency, @PathVariable String dateA, @PathVariable String dateB) {
        return ResponseEntity.ok(service.getRates(currency, dateA, dateB));
    }

    @GetMapping("/Test")
    public ResponseEntity<String> test() {
        return ResponseEntity.ok("Działa");
    }
}
