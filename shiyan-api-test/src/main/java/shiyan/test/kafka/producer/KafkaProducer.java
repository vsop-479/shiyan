package shiyan.test.kafka.producer;

import kafka.javaapi.producer.Producer;
import kafka.producer.KeyedMessage;
import kafka.producer.ProducerConfig;

import java.io.IOException;
import java.util.Properties;

/**
 * Created by Administrator on 2015/9/17.
 */
public class KafkaProducer {
    private final Producer<String, String> producer;
    public final static String TOPIC = "TEST-TOPIC";

    private KafkaProducer(){
        Properties props = new Properties();
        try {
            props.load(getClass().getResourceAsStream("/kafka-producer.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        ProducerConfig producerConfig = new ProducerConfig(props);
        producer = new Producer<String, String>(producerConfig);
    }

    private void produce(){
        int messageNO = 0;
        final int COUNT = 1000;
        while(messageNO < COUNT){
            String key = String.valueOf(messageNO);
            String message = "hello kafka message " + key;
            producer.send(new KeyedMessage<String, String>(TOPIC, key, message));
            System.out.println(message);
            messageNO++;
        }
    }

    public static void main(String[] args){
        new shiyan.test.kafka.producer.KafkaProducer().produce();
    }
}
