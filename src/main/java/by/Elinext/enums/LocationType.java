package by.Elinext.enums;

import by.Elinext.exceptions.KindOfValueException;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Arrays;

@AllArgsConstructor
@Getter
public enum LocationType {
    SALES("Sales"),
    WARRANTY("Warranty"),
    MANUFACTURING("Manufacturing"),
    CORPORATE("Corporate"),
    SERVICE("Service"),
    PARTS("Parts");
    String text;

    public static LocationType getLocationType(String by) {
        LocationType kindOfLocationType = Arrays.stream(LocationType.values())
                .filter(n -> n.getText().equals(by))
                .findFirst()
                .orElseThrow(() -> new KindOfValueException("Error, not found kindOfLocationType"));
        return kindOfLocationType;
    }
}


