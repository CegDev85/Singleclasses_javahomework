public class WaterBottle {

    private int volume;

    public WaterBottle(int volume){
        this.volume = volume;
    }

    public int volume(){
        return volume;
    }

    public int drink(){
        return volume - 10;
    }

    public int empty(){
        return volume - volume;
    }

    public int fill(){
        int volume = 100;
        return volume;
    }

}
