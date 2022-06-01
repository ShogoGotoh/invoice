package domain.B;

import lombok.AllArgsConstructor;
import lombok.Getter;

// MGCを変換する
@AllArgsConstructor
@Getter
public enum BGoodsCode {
    LINE("001"),
    TELEVISION("002"),
    TELEPHONE("003");

    private String value;
}
