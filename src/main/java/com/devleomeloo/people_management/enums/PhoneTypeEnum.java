package com.devleomeloo.people_management.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum PhoneTypeEnum {

    HOME("Home"),
    MOBILE("Mobile"),
    COMMERCIAL("Comemrcial");

    private final String description;

}
