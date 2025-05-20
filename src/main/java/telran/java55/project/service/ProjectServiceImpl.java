package telran.java55.project.service;

import org.springframework.stereotype.Service;

import telran.java55.project.dto.ProjectDto;

@Service
public class ProjectServiceImpl implements ProjectService {

	@Override
	public ProjectDto getResponse(String text) {
		return ProjectDto.create(text);
	}

}
