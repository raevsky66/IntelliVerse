package telran.java55.project.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import telran.java55.project.dto.ProjectDto;
import telran.java55.project.service.ProjectService;

@RestController
@RequiredArgsConstructor
public class ProjectController {
	final ProjectService projectService;

	@GetMapping("/project/{text}")
	public ProjectDto getResponse(@PathVariable String text) {
		return projectService.getResponse(text);
	}

	
}
