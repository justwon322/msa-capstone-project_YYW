package msacapstoneprojectyyw.domain;

import msacapstoneprojectyyw.domain.*;
import msacapstoneprojectyyw.infra.AbstractEvent;
import lombok.*;
import java.util.*;
@Data
@ToString
public class PaymentCanceled extends AbstractEvent {

    private Long id;
    private String orderId;
    private String orderStatus;
}


