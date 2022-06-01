package domain.B.MonthlyFee;

import domain.B.BUser;

import java.time.LocalDate;

public class LineMonthlyFee implements BMonthlyFee{
    @Override
    public Boolean shouldBilling(BUser member, LocalDate date){
        return true;
    }
}
