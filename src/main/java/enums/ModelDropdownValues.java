package enums;

import io.qameta.allure.model.Parameter;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum ModelDropdownValues {

    PLEASE_SELECT("– please select –"),
    SCOOTER("Scooter"),
    THREE_WHEELER("Three-Wheeler"),
    MOPED("Moped"),
    MOTORCYCLE("Motorcycle");


   @Getter
   private final String modelValues;
}
