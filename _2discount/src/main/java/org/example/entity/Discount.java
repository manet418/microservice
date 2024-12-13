package org.example.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Setter
@Getter
@RequiredArgsConstructor
@NoArgsConstructor
public class Discount {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
