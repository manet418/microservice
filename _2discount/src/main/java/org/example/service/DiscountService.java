package org.example.service;

import org.example.entity.Discount;
import org.example.repository.DiscountRepository;
import org.springframework.stereotype.Service;

@Service
public class DiscountService {

    private DiscountRepository discountRepository;

    public DiscountService(DiscountRepository discountRepository) {
        this.discountRepository = discountRepository;
    }

    public Discount findByCodeName(String codeName) {
        return discountRepository.findByCodeName(codeName);
    }

    public Discount save(Discount discount) {
        return discountRepository.save(discount);
    }
}
