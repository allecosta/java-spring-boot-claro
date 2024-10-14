package bootcamp.main;

public class Course extends Content {
    private int hourLoad;

    // public Course() {}

    public int getHourLoad() {
        return hourLoad;
    }

    public void setHourLoad(int hourLoad) {
        this.hourLoad = hourLoad;
    }

    @Override
    public double calculateXP() {
        return XP_DEFAULT * hourLoad;
    }

    @Override
    public String toString() {
        return "Curso {" +
                "Titulo = '" + getTitle() + '\'' +
                ", Descricao = '" + getDescription() + '\'' +
                ", Carga Horaria = " + hourLoad +
            '}'
        ;
    }
}
