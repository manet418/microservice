package org.example.controller;

import org.example.entity.Discount;
import org.example.service.DiscountService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/discounts")
public class DiscountController {

    private DiscountService discountService;

    public DiscountController(DiscountService discountService) {
        this.discountService = discountService;
    }

    @PostMapping
    public Discount createDiscount(@RequestBody Discount discount) {
        return discountService.save(discount);
    }


    @GetMapping("/{codeName}")
    public Discount getDiscountByCodeName(@PathVariable("codeName") String codeName) {
        return discountService.findByCodeName(codeName);
    }
}
