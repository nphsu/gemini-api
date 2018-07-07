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
}