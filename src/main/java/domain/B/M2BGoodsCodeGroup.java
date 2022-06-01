package domain.B;

import domain.B.MonthlyFee.BMonthlyFee;
import domain.M.MBilling;
import domain.M.MGoodsCode;
import lombok.AllArgsConstructor;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;


@AllArgsConstructor
public enum M2BGoodsCodeGroup {
    LINE(new HashSet(Arrays.asList(
            MGoodsCode.LINE1,
            MGoodsCode.LINE2)),
            BGoodsCode.LINE),
    TELEVISION(new HashSet(Arrays.asList(
            MGoodsCode.TELEVISION1,
            MGoodsCode.TELEVISION2)),
            BGoodsCode.TELEVISION
    ),
    TELEPHONE(new HashSet(Arrays.asList(
            MGoodsCode.TELEPHONE1,
            MGoodsCode.TELEPHONE2)),
            BGoodsCode.TELEPHONE);

    private Set<MGoodsCode> mCode;
    private BGoodsCode bCode;

    public Boolean contains(MGoodsCode mGoodsCode){
        return this.mCode.contains(mGoodsCode);
    }

    public BGoodsCode convert(MBilling billing){
        MGoodsCode code = billing.getCode();
        if (this.mCode.contains(code)){
            return this.bCode;
        }
        else {
            throw new RuntimeException("該当しないコード値です");
        }
    }
}



//    public static final Set<MGoodsCode> LINE
//            = new HashSet(Arrays.asList(
//                    MGoodsCode.LINE1,
//                    MGoodsCode.LINE2
//            )
//    );
//
//    public static final Set<MGoodsCode> TELEVISION
//            = new HashSet(Arrays.asList(
//                    MGoodsCode.TELEVISION1,
//                    MGoodsCode.TELEVISION2
//            )
//    );
//
//    public static final Set<MGoodsCode> TELEPHONE
//            = new HashSet(Arrays.asList(
//                    MGoodsCode.TELEPHONE1,
//                    MGoodsCode.TELEPHONE2
//            )
//    );
//    private static final List<MGoodsCode> TELEPHONE;

//    public static Boolean contains(MGoodsCode mGoodsCode){
//        LINE.contains(mGoodsCode)
//    }


    // 汚い
//    public static BGoodsCode map(MGoodsCode mcode) throws Exception {
//        if ( mcode.equals(MGoodsCode.LINE1) || mcode.equals(MGoodsCode.LINE2)){
//            return BGoodsCode.LINE;
//        }
//        else if (mcode.equals(MGoodsCode.TELEPHONE1) || mcode.equals(MGoodsCode.TELEPHONE2)){
//            return BGoodsCode.TELEPHONE;
//        }
//        else if (mcode.equals(MGoodsCode.TELEVISION1) || mcode.equals(MGoodsCode.TELEVISION2)){
//            return BGoodsCode.TELEVISION;
//        }
//        else {
//            throw new Exception("Unkown MCode");
//        }
//    }
//}
