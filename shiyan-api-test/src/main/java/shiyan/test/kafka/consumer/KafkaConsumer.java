package shiyan.test.kafka.consumer;


import kafka.consumer.Consumer;
import kafka.consumer.ConsumerConfig;
import kafka.consumer.ConsumerIterator;
import kafka.consumer.KafkaStream;
import kafka.javaapi.consumer.ConsumerConnector;
import kafka.message.MessageAndMetadata;
import kafka.serializer.StringDecoder;
import kafka.utils.VerifiableProperties;
import shiyan.test.kafka.producer.KafkaProducer;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

/**
 * Created by Administrator on 2015/9/17.
 */
public class KafkaConsumer {
    private final ConsumerConnector consumer;

    private KafkaConsumer(){
        Properties props = new Properties();
        try {
            props.load(getClass().getResourceAsStream("/kafka-consumer.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        ConsumerConfig consumerConfig = new ConsumerConfig(props);
        consumer = Consumer.createJavaConsumerConnector(consumerConfig);
    }

    private void consumer(){
        Map<String, Integer> topicCountMap = new HashMap<String, Integer>();
        topicCountMap.put(KafkaProducer.TOPIC, new Integer(1));
        StringDecoder keyDecoder = new StringDecoder(new VerifiableProperties());
        StringDecoder valDecoder = new StringDecoder(new VerifiableProperties());
        Map<String, List<KafkaStream<String, String>>> messageStreams =
                consumer.createMessageStreams(topicCountMap, keyDecoder, valDecoder);
        KafkaStream<String, String> messageAndMetadatas = messageStreams.get(KafkaProducer.TOPIC).get(0);
        ConsumerIterator<String, String> iterator = messageAndMetadatas.iterator();
        while(iterator.hasNext()){
            MessageAndMetadata<String, String> messageAndMetadata = iterator.next();
            System.out.println(messageAndMetadata.message());
        }
        System.out.println("done");
    }

    public static void main(String[] args){
        new shiyan.test.kafka.consumer.KafkaConsumer().consumer();
    }
}
