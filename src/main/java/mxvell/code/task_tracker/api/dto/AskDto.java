package mxvell.code.task_tracker.api.dto;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class AskDto {
     Boolean answer;

     public static AskDto makeDefault(Boolean answer) {
         return builder()
                 .answer(answer)
                 .build();
     }
}
