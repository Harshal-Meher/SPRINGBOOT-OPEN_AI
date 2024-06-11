package dailycodebuffer.controller;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AiController {

	@Autowired ChatClient chatclient;
	
	@GetMapping("/prompt")
	public String prompt(@RequestParam String massage) {
		return chatclient.call(massage);
		
	}

}
