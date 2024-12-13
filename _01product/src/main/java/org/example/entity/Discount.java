package org.example.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDate;

@Setter
@Getter
@RequiredArgsConstructor
@NoArgsConstructor
public class Discount {
    private Long id;
    @NonNull
    private String codeName;
    @NonNull
    private BigDecimal codeValue;
    @NonNull
    @Column(name = "expiry_date")
    @JsonProperty("expiryDate")
    private LocalDate expiryDate;

}
