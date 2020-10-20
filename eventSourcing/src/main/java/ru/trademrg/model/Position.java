package ru.trademrg.model;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class Position {
    String shortName;
    long size;
}