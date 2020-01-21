package by.Elinext.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class HelpForm {
    private String choise;
    private String country;
    private String name;
    private String company;
    private String email;
    private String phone;
    private String comments;
    private String message;
}
