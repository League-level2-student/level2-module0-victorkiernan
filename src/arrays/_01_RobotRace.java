package arrays;

import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	//1. make a main method
public static void main(String[] args) {
	Robot r[]= new Robot[5];

	//2. create an array of 5 robots.
for(int i=0; i<r.length;i++ ) {
	r[i] = new Robot("vic");
	int multi = i*100;
	r[i].setX(250+multi);
	r[i].setY(500);
	Random ran = new Random();
	int x = ran.nextInt(50);
	r[i].move(x);
			}
	//3. use a for loop to initialize the robots. DONE!!!!!1

		//4. make each robot start at the bottom of the screen, side by side, facing upDONE!!!!

	//5. use another for loop to iterate through the array and make each robot move 
	//   a random amount less than 50.

	//6. use a while loop to repeat step 5 until a robot has reached the top of the screen.

	//7. declare that robot the winner and throw it a party!

	//8. try different races with different amounts of robots.

	//9. make the robots race around a circular track.
}}
