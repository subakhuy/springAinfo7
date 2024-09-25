package kr.ainfo7.rest_server;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;

@RestController
public class IndexController {
	@GetMapping("/")
	public ResponseEntity<String> index() {
		return ResponseEntity.ok().body("{\"message\": \"hello\"}");
	}
}
