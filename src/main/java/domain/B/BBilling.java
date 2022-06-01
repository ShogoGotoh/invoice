package domain.B;

import domain.B.BGoodsCode;
import lombok.AllArgsConstructor;
import lombok.Getter;

// 課金額　まだ請求するかは未定
@AllArgsConstructor
public class BBilling {
    @Getter
    final private BGoodsCode code;
    @Getter
    final private Integer amount;
}
