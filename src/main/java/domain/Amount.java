package domain;

import lombok.Value;

// ref:https://bufferings.hatenablog.com/entry/2015/12/05/115628
@Value
public class Amount {
    Integer value;

    public Amount(Integer value){
        if (value < 0){
            throw new RuntimeException("マイナスの金額です");
        }
        this.value = value;
    }

}
