package pl.ptemich.templates_demo.model.jupiter;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
public class Document extends AbstractEntity {

    private String name;

    @OneToMany(mappedBy = "document", cascade = CascadeType.ALL)
    private List<DocumentLinking> linkings = new ArrayList<>();

}
