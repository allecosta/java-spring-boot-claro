package digitalbank.main;

public class Client {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void listClients() {
        System.out.println("*** Lista de Clientes ***");
        System.out.println(name);
    }
}
