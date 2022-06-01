package domain.M;

import domain.Amount;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDate;

@AllArgsConstructor
@Getter
public class MBilling {
    final private MGoodsCode code;
//    final private Amount amount;
//    final private LocalDate date;
//    public static MBilling create(Integer code){
//        return new MBilling(MGoodsCode.valueOf(code));
//    }
}
