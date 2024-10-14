package bootcamp.main;

import java.time.LocalDate;

public class Mentoring extends Content {
    private LocalDate data;

    // public Mentoring() {}

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public double calculateXP() {
        return XP_DEFAULT + 20d;
    }

    @Override
    public String toString() {
        return "Mentoria {" +
                "Titulo = '" + getTitle() + '\'' +
                ", Descricao = '" + getDescription() + '\'' +
                ", Data = " + data +
            '}'
        ;
    }
}
