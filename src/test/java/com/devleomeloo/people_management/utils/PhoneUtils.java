package com.devleomeloo.people_management.utils;

import com.devleomeloo.people_management.dto.request.PhoneDTO;
import com.devleomeloo.people_management.entity.PhoneNumber;
import com.devleomeloo.people_management.enums.PhoneTypeEnum;

public class PhoneUtils {

    private static final String PHONE_NUMBER = "1199999-9999";
    private static final PhoneTypeEnum PHONE_TYPE_ENUM = PhoneTypeEnum.MOBILE;
    private static final long PHONE_ID = 1L;

    public static PhoneDTO createFakeDTO(){
        return PhoneDTO.builder()
                .number(PHONE_NUMBER)
                .type(PHONE_TYPE_ENUM)
                .build();
    }

    public static PhoneNumber createFakeEntity(){

        return PhoneNumber.builder()
                .id(PHONE_ID)
                .number(PHONE_NUMBER)
                .type(PHONE_TYPE_ENUM)
                .build();
    }
}
