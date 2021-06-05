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
public class SingerDto {

    private Long idSinger;

    private String singerFirstName;

    private String singerLastName;

    private LocalDate birthday;
}
