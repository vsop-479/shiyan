package shiyan.test.kafka.producer;

import org.apache.kafka.clients.producer.Producer;
import org.apache.kafka.clients.producer.ProducerRecord;
import shiyan.test.kafka.Common;
import shiyan.test.threadLocal.ThreadLocalVars;

import java.io.IOException;
import java.util.Properties;

/**
 * Created by Administrator on 2015/9/17.
 */
public class KafkaProducer {
    private final Producer<String, String> producer;

    private KafkaProducer(){
        Properties props = new Properties();
        try {
            props.load(getClass().getResourceAsStream("/kafka-producer.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        producer = new org.apache.kafka.clients.producer.KafkaProducer<>(props);
    }

    private void produce() throws InterruptedException {
        int messageNO = 0;
        final int COUNT = 1000;
        while(messageNO < COUNT){
            String key = String.valueOf(messageNO);
            String message = "hello kafka message " + key;
            producer.send(new ProducerRecord<>(Common.TOPIC, key, message));
            System.out.println(message);
            messageNO++;
        }
//        因消息采用异步发送，运行结束有可能导致未发送的消息丢失。
        Thread.sleep(30 * 1000);
    }

    public static void main(String[] args) throws InterruptedException {
        new shiyan.test.kafka.producer.KafkaProducer().produce();
    }
}
