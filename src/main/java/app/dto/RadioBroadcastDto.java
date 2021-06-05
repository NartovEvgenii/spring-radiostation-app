package app.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RadioBroadcastDto {

    private Long idRadioBroadcast;

    private String nameRadio;

    private LocalDate date;
}
