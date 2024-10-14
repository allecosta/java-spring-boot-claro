package bootcamp.main;

import java.util.*;

public class Dev {
    private String name;
    private Set<Content> contentSubscribed = new LinkedHashSet<>();
    private Set<Content> contentFinale = new LinkedHashSet<>();

    public void registerBootcamp(Bootcamp bootcamp) {
        this.contentSubscribed.addAll(bootcamp.getContent());
        bootcamp.getDevSubscribed().add(this);
    }

    public void progress() {
        Optional<Content> content = this.contentSubscribed.stream().findFirst();

        if (content.isPresent()) {
            this.contentFinale.add(content.get());
            this.contentSubscribed.remove(content.get());
        } else {
            System.err.println("OPS! Você não está matriculado em nenhum conteúdo.");
        }
    }

    public double calculateTotalXP() {
        Iterator<Content> iterator = this.contentSubscribed.iterator();

        double soma = 0;

        while (iterator.hasNext()) {
            double next = iterator.next().calculateXP();

            soma += next;
        }

        return soma;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Content> getContentSubscribed() {
        return contentSubscribed;
    }

    public void setContentSubscribed(Set<Content> contentSubscribed) {
        this.contentSubscribed = contentSubscribed;
    }

    public Set<Content> getContentFinale() {
        return contentFinale;
    }

    public void setContentfinale(Set<Content> contentFinale) {
        this.contentFinale = contentFinale;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }

        if (object == null) {
            return false;
        }

        Dev dev = (Dev) object;

        return Objects.equals(name, dev.name) &&
        Objects.equals(contentSubscribed, dev.contentSubscribed) &&
        Objects.equals(contentFinale, dev.contentFinale);
    } 

    @Override
    public int hashCode() {
        return Objects.hash(name, contentSubscribed, contentFinale);
    }
}
