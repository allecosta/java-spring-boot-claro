package bootcamp.main;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Bootcamp {
    private String name;
    private String description;
    private final LocalDate dataStart = LocalDate.now();
    private final LocalDate dataFinal = dataStart.plusDays(45);
    private Set<Dev> devSubscribed = new HashSet<>();
    private Set<Content> content = new LinkedHashSet<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getDataStart() {
        return dataStart;
    }

    public LocalDate getDataFinal() {
        return dataFinal;
    }

    public Set<Dev> getDevSubscribed() {
        return devSubscribed;
    }

    public void setDevSubscribed(Set<Dev> devSubscribed) {
        this.devSubscribed = devSubscribed;
    }

    public Set<Content> getContent() {
        return content;
    }

    public void setContent(Set<Content> content) {
        this.content = content;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }

        if (object == null || getClass() != object.getClass()) {
            return false;
        }

        Bootcamp bootcamp = (Bootcamp) object;

        return Objects.equals(name, bootcamp.name) && 
        Objects.equals(description, bootcamp.description) &&
        Objects.equals(dataStart, bootcamp.dataStart) &&
        Objects.equals(dataFinal, bootcamp.dataFinal) &&
        Objects.equals(devSubscribed, bootcamp.devSubscribed) &&
        Objects.equals(content, bootcamp.content);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description, dataStart, dataFinal, devSubscribed, content);
    }
}
