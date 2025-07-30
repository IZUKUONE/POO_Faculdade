package POO.Association;

public class player {

    private String name;
    private time Time;

    public void imprime(){
        System.out.println(name);
        //sem ele vai da um NULL POINTER, pois o jogador precisa de um time
        if (Time != null){
            System.out.println(Time.getName());
        }
    }

    public String getName() {
        return name;
    }

    public time getTime() {
        return Time;
    }

    public void setTime(time time) {
        Time = time;
    }

    public void setName(String name) {
        this.name = name;
    }

    public player(String name) {
        this.name = name;
    }
}
