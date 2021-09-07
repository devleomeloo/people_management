package com.devleomeloo.people_management.dto.request;

import com.devleomeloo.people_management.enums.PhoneTypeEnum;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.validation.constraints.NotEmpty;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.constraints.Size;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class PhoneDTO {

    private Long id;

    @Enumerated(EnumType.STRING)
    private PhoneTypeEnum type;

    @NotEmpty
    @Size(min = 13, max = 14)
    private String number;
}
