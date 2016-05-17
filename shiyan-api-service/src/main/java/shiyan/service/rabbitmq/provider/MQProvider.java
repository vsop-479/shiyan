package shiyan.service.rabbitmq.provider;

import com.google.gson.Gson;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2016/5/16.
 */
@Service("mqProvider")
public class MQProvider {
    @Autowired
    private AmqpTemplate orderMQTemplate;
    protected Logger logger = LoggerFactory.getLogger(getClass());

    public void sendDataToQueue(String routingKey, Object obj){
        try{
            orderMQTemplate.convertAndSend(routingKey, obj);
            logger.info("send: " + new Gson().toJson(obj) + ";to: " + routingKey);
        }catch(Exception e){
            logger.error("", e);
        }
    }
}
