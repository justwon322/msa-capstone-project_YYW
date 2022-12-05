package msacapstoneprojectyyw.domain;

import msacapstoneprojectyyw.infra.AbstractEvent;
import lombok.Data;
import java.util.*;


@Data
public class DeliveryStarted extends AbstractEvent {

    private Long id;
    private String orderId;
    private String customerId;
    private String customerAddr;
    private String productName;
    private String productPrice;
    private String orderStatus;
}
