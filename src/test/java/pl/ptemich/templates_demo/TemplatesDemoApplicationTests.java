package pl.ptemich.templates_demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TemplatesDemoApplicationTests {

	@Autowired
	private ProjectService projectService;

	@Test
	void contextLoads() {
		projectService.demoSave();
	}

}
