package msacapstoneprojectyyw.domain;

import msacapstoneprojectyyw.domain.*;
import msacapstoneprojectyyw.infra.AbstractEvent;
import java.util.*;
import lombok.*;


@Data
@ToString
public class OrderCanceled extends AbstractEvent {

    private Long id;
    private String customerId;
    private String customerAddr;
    private String productName;
    private String productPrice;
    private String orderStatus;

    public OrderCanceled(Order aggregate){
        super(aggregate);
    }
    public OrderCanceled(){
        super();
    }
}
