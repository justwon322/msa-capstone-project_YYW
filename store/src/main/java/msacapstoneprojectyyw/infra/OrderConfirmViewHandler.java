package msacapstoneprojectyyw.infra;

import msacapstoneprojectyyw.domain.*;
import msacapstoneprojectyyw.config.kafka.KafkaProcessor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

@Service
public class OrderConfirmViewHandler {

    @Autowired
    private OrderConfirmRepository orderConfirmRepository;





}

