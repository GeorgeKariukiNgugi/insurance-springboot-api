package com.fiona.InsuranceType.Model;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//        ! todo  unused imports.
import lombok.NonNull;
//! todo  Create a folder called payloads, then add variables and different constructors to them, so as to improve the flexibility of the class.
//! todo  WHY do we need @NoArgsConstructor ???
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class InsuranceTypeDTO {
    private UUID insuranceTypeId;
    @NotBlank(message = "Name cannot be blank/null")
    private String name;
    @NotBlank(message = "description cannot be null/blank")
    private String description;
}
