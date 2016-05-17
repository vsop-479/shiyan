package shiyan.service.rabbitmq.provider;

import org.springframework.stereotype.Service;
import shiyan.service.rabbitmq.provider.MQProvider;

/**
 * Created by Administrator on 2016/5/16.
 */
@Service("orderMQProvider")
public class OrderMQProvider extends MQProvider {

//    public void sendDataToQueue(Operation operation, Order order){
//        try{
//            MQMessage<Order> orderMessage = new MQMessage<Order>();
//            orderMessage.setData(order);
//            orderMessage.setOp(operation);
//            sendDataToQueue(MQConstants.ORDER_QUEUE_KEY, orderMessage);
//        }catch(Exception e){
//            logger.error("", e);
//        }
//    }
}
