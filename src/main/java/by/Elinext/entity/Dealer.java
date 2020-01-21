package by.Elinext.entity;

import by.Elinext.enums.LocationType;
import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Dealer {
    private String typeOfTerm;
    private int radius;
    private LocationType locationType;
}
