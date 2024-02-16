package src.main.java.org.Practise.OOP.Task8;

public class TrafficLight {
    private String color ;
    private int duration ;

    public TrafficLight(String color, int duration) {
        this.color = color;
        this.duration = duration;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
    public boolean isRed(){
        return color.equals("Red");
    }
    public boolean isGreen(){
        return color.equals("Green");
    }
    public void changeColour(String newcolour){
        color = newcolour;
    }
}
