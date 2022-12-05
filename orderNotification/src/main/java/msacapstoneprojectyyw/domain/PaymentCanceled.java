package msacapstoneprojectyyw.domain;

import msacapstoneprojectyyw.infra.AbstractEvent;
import lombok.Data;
import java.util.*;


@Data
public class PaymentCanceled extends AbstractEvent {

    private Long id;
    private String orderId;
    private String orderStatus;
}
