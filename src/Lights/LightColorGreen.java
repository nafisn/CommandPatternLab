package Lights;

public class LightColorGreen implements Command {

    Light light;
    public LightColorGreen(Light light){
        this.light = light;
    }

    public void execute() {
        light.color("Green");
    }

    public void undo(){
        light.color("White");
    }
}
