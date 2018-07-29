package shunp.geminiapi.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import shunp.geminiapi.domain.Currency;
import shunp.geminiapi.domain.CurrencyRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CurrencyService {

    private final CurrencyRepository currencyRepository;

    public List<Currency> findAll() {
        return currencyRepository.findAll();
    }

    public Currency save(String name, String unit) {
        return currencyRepository.save(Currency.newCurrency(name, unit));
    }

    public void delete(Long id) {
        currencyRepository.findById(id).ifPresent(currency -> currencyRepository.delete(currency));
    }
}