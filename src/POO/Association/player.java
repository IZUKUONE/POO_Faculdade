package POO.Association;

public class player {

    private String name;

    public void imprime(){
        System.out.println(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public player(String name) {
        this.name = name;
    }
}
