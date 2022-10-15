package teste.aptidao.springboot.domain;

public class Dominio {
    private String name;

    public Dominio(String name) {
        this.name = name;
    }

    public Dominio() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
