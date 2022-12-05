package msacapstoneprojectyyw.domain;

import msacapstoneprojectyyw.domain.*;
import msacapstoneprojectyyw.infra.AbstractEvent;
import java.util.*;
import lombok.*;


@Data
@ToString
public class PaymentCanceled extends AbstractEvent {

    private Long id;
    private String orderId;
    private String orderStatus;

    public PaymentCanceled(Payment aggregate){
        super(aggregate);
    }
    public PaymentCanceled(){
        super();
    }
}
