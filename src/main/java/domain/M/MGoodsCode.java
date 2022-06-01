package domain.M;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum MGoodsCode {
    LINE1(001),
    LINE2(002),
    TELEVISION1(101),
    TELEVISION2(102),
    TELEPHONE1(201),
    TELEPHONE2(202);

    private Integer code;
}
