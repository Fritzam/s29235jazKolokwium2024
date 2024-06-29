package Repository;

import jaz_s29235_nbp.main.Classes.ExchangeRates;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NBPRatesRepository extends JpaRepository<ExchangeRates, Integer> {
}
