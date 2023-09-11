package studio.thinkground.testproject1.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@ToString
@Getter
@Setter
public class MemberDTO {

    private String name,email,organization;

}
