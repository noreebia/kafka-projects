package kairex.wallet.monitor.kafka;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class Receiver {

	public Receiver() {
		System.out.println("Kafka listener listening...");
	}

//	@KafkaListener(topics = "${kafka.topics.boot}")
	@KafkaListener(topics = "test", groupId = "boot")
	public void receive(ConsumerRecord<?, ?> consumerRecord) {
		System.out.println(consumerRecord.toString());
	}
}
