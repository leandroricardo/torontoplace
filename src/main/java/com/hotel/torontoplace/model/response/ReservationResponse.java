package com.hotel.torontoplace.model.response;

import com.hotel.torontoplace.model.Links;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ReservationResponse {

    private Long id;
    private Integer rooomNumber;
    private Integer price;
    private Links links;
}
