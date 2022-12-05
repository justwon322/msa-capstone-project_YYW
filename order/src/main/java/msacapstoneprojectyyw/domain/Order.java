package msacapstoneprojectyyw.domain;

import msacapstoneprojectyyw.domain.Ordered;
import msacapstoneprojectyyw.domain.OrderCanceled;
import msacapstoneprojectyyw.OrderApplication;
import javax.persistence.*;
import java.util.List;
import lombok.Data;
import java.util.Date;


@Entity
@Table(name="Order_table")
@Data

public class Order  {


    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    
    
    
    
    
    private Long id;
    
    
    
    
    
    private String customerId;
    
    
    
    
    
    private String customerAddr;
    
    
    
    
    
    private String productName;
    
    
    
    
    
    private String productPrice;
    
    
    
    
    
    private String orderStatus;

    @PostPersist
    public void onPostPersist(){

        //Following code causes dependency to external APIs
        // it is NOT A GOOD PRACTICE. instead, Event-Policy mapping is recommended.


        msacapstoneprojectyyw.external.Payment payment = new msacapstoneprojectyyw.external.Payment();
        // mappings goes here
        OrderApplication.applicationContext.getBean(msacapstoneprojectyyw.external.PaymentService.class)
            .paymentRequest(payment);


        Ordered ordered = new Ordered(this);
        ordered.publishAfterCommit();

    }
    @PreRemove
    public void onPreRemove(){


        OrderCanceled orderCanceled = new OrderCanceled(this);
        orderCanceled.publishAfterCommit();

    }

    public static OrderRepository repository(){
        OrderRepository orderRepository = OrderApplication.applicationContext.getBean(OrderRepository.class);
        return orderRepository;
    }






}
