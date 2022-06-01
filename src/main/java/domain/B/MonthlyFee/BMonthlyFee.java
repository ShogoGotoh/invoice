package domain.B.MonthlyFee;

import domain.B.BGoodsCode;
import domain.B.BUser;
import domain.B.M2BGoodsCodeGroup;
import domain.M.MBilling;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//課金額

public interface BMonthlyFee {
    public abstract Boolean shouldBilling(BUser member, LocalDate date);

//    public static BMonthlyFee convert(MBilling mBilling){
//        M2BGoodsCodeGroup group = Arrays.stream(M2BGoodsCodeGroup.values())
//                .filter(g -> g.contains(mBilling.getCode()))
//                .findFirst();
//        mBillings.stream().map(e -> new BMonthlyFee() {
//        })
//        mBillings.stream().map()
//        return new ArrayList<BMonthlyFee>();
//    }
}
