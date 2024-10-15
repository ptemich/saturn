package pl.ptemich.templates_demo.model.jupiter;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class DocumentLinking extends AbstractEntity {

    @ManyToOne(cascade = CascadeType.ALL)
    private Document document;

    @ManyToOne(cascade = CascadeType.ALL)
    private Task task;

    private String text;

}
