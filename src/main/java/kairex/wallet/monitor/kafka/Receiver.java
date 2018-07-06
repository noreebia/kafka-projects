package kairex.wallet.monitor.kafka;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class Receiver {

	public Receiver() {
		System.out.println("Kafka listener listening...");
	}

	@KafkaListener(topics = "SOOY")
//	@KafkaListener(topics = {"test", "test2"}, groupId = "boot")
	public void receive(ConsumerRecord<?, ?> consumerRecord) {
		System.out.println(consumerRecord.toString());
	}
}
