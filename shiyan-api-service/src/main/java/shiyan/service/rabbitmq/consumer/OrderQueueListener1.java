package shiyan.service.rabbitmq.consumer;

import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageListener;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2016/5/16.
 */
@Service("orderQueueListener1")
public class OrderQueueListener1 implements MessageListener {

    @Override
    public void onMessage(Message message) {
        //consumer your message
    }
}
