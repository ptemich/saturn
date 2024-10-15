package pl.ptemich.templates_demo;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.ptemich.templates_demo.model.ProjectRepository;
import pl.ptemich.templates_demo.model.jupiter.*;
import pl.ptemich.templates_demo.model.jupiter.Process;

@Service
@RequiredArgsConstructor
public class ProjectService {

    private final ProjectRepository projectRepository;

    @Transactional
    public void demoSave() {
        Project project = new Project();
        project.setName("Projekt");
        projectRepository.save(project);

        Workstream workstream = new Workstream();
        workstream.setName("Workstrikik");
        workstream.setProject(project);
        project.getWorkstreams().add(workstream);

        Process process = new Process();
        process.setName("Processs A");
        process.setWorkstream(workstream);
        workstream.getProcesses().add(process);

        Task task = new Task();
        task.setName("zadanko");
        process.getTasks().add(task);

        Document document = new Document();
        document.setName("dokumencik");

        DocumentLinking documentLinking = new DocumentLinking();
        documentLinking.setDocument(document);
        documentLinking.setTask(task);
        documentLinking.setText("custom");

        task.getLinkings().add(documentLinking);
        document.getLinkings().add(documentLinking);
    }

}
