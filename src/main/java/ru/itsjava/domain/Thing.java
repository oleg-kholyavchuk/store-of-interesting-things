package ru.itsjava.domain;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Data
public class Thing {
    private final String title;
    private final String author;
    private final int price;
}
