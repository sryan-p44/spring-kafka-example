package example;

import org.springframework.kafka.annotation.KafkaHandler;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.scheduling.annotation.Async;

import java.util.Date;

@KafkaListener(topics = "messages.1000")
public class SampleKafkaListener {

    @KafkaHandler
    @Async
    public void handle(String s) throws Exception {

        System.out.println(new Date() + " " + s + " " + Thread.currentThread().getName());

        Thread.sleep(10000);
        System.out.println("Done " + s);

    }

}
