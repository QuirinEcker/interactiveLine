import processing.core.PApplet;

import java.awt.*;

public class Ecker_InteractiveLine extends PApplet {

    public static void main(String[] args) {
        PApplet.main("Ecker_InteractiveLine");
    }

    public void settings() {
        size(500,500);
    }

    public void setup() {
        background(255,255,255,255);
        frameRate(60);
    }

    public void draw() {
        background(255,255,255);
        fill(0,0,0,0);
        line(0,0, mouseX, mouseY);
    }
}
