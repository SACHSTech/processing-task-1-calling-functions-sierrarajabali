import processing.core.PApplet;

public class Sketch extends PApplet {
	
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(400, 400);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */

  // Background color set to blue
  public void setup() {
    background(138, 181, 237);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */

  // Drawing of the house
  public void draw() {
	  
	// The grass (foreground) of the background
  fill(21, 153, 51);
  rect(0, 250, 400, 400);  
  
  // The roof of the house
  fill(150, 58, 38);
  triangle(100, 200, 200, 80, 300,200);

  // Base of the house
  fill(255, 77, 207);
  rect(100, 200, 200, 200); 

  // Door of the house
  fill(150, 150, 150);
  rect(130, 295, 70, 130); 

  // Doorknob of the house
  fill(255, 255, 48);
  circle(150, 360, 20);

  }
  
}