package example;

import org.springframework.kafka.annotation.KafkaHandler;
import org.springframework.kafka.annotation.KafkaListener;

@KafkaListener(topics = "topic.with.2.partitions")
public class SampleKafkaListener {

    @KafkaHandler
    public void handle(String s) throws Exception {
        if (s.equals("fail")) {
            throw new Exception("fail");
        }
        System.out.println(s);

        Thread.sleep(5000);
    }

}
