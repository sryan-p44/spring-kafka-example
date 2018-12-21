package example;


import org.apache.kafka.clients.consumer.Consumer;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.listener.ErrorHandler;

public class SampleErrorHandler implements ErrorHandler {

    @Override
    public void handle(Exception thrownException, ConsumerRecord<?, ?> data) {

    }

    @Override
    public void handle(Exception thrownException, ConsumerRecord<?, ?> data, Consumer<?, ?> consumer) {

        System.out.printf("Error processing kafka message. \n" +
                "topic: %s \n" +
                "partition: %s \n" +
                "timestamp: %s",
                data.topic(), data.partition(), data.timestamp());

    }
}
