package com.example.LombokUsage;

import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class WithLombok {

    private long id;
    private String name;
    private String email;
    private LocalDate birthday;
}
