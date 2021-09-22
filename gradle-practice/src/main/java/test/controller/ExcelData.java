package test.controller;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ExcelData {

    private Integer num;

    private String name;

    private String email;

    void setNum(int num) {
        this.num = num;
    }

    void setName(String name) {
        this.name = name;
    }

    void setEmail(String email) {
        this.email = email;
    }
}