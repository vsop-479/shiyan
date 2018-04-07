package shiyan.test.kafka.consumer;


import org.apache.kafka.clients.consumer.Consumer;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.common.TopicPartition;
import shiyan.test.kafka.Common;
import java.io.IOException;
import java.util.*;

/**
 * Created by Administrator on 2015/9/17.
 */
public class KafkaConsumer {
    private final Consumer consumer;

    private KafkaConsumer(){
        Properties props = new Properties();
        try {
            props.load(getClass().getResourceAsStream("/kafka-consumer.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        consumer = new org.apache.kafka.clients.consumer.KafkaConsumer(props);
    }

    private void consumer() throws InterruptedException {
        List topics = new ArrayList<String>();
        topics.add(Common.TOPIC);
        consumer.subscribe(topics);
//        List partitions = new ArrayList<String>();
//        TopicPartition topicPartition = new TopicPartiion(Common.TOPIC, 0);
//        partitions.add(topicPartition);
//        consumer.beginningOffsets(partitions);
        while(true){
            ConsumerRecords<String, String> records = consumer.poll(200);
            Iterator iterator = records.iterator();
            for(ConsumerRecord<String, String> record : records){
                System.out.println("value: " + record.value() + ", offset: " + record.offset());
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        new shiyan.test.kafka.consumer.KafkaConsumer().consumer();
    }
}
