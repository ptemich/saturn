package pl.ptemich.templates_demo.model;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.ptemich.templates_demo.model.saturn.Project;

import java.util.UUID;

public interface ProjectRepository extends JpaRepository<Project, UUID> {
}
