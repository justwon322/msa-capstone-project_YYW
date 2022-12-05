package msacapstoneprojectyyw.domain;

import msacapstoneprojectyyw.domain.*;
import msacapstoneprojectyyw.infra.AbstractEvent;
import lombok.*;
import java.util.*;
@Data
@ToString
public class OrderCanceled extends AbstractEvent {

    private Long id;
    private String customerId;
    private String customerAddr;
    private String productName;
    private String productPrice;
    private String orderStatus;
}


