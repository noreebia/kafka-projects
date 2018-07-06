package kairex.wallet.monitor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import kairex.wallet.monitor.kafka.Receiver;
import kairex.wallet.monitor.kafka.Sender;

@Component
public class Test implements CommandLineRunner {

	@Autowired
	Sender sender;
	
	@Autowired
	Receiver receiver;
	
	@Override
	public void run(String... args) throws Exception {
//		System.out.println("producing kafka record...");
//		sender.send("test", "payload for test!");
	}
}
