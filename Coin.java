package FallingCoins;

import zen.core.Zen;

public class Coin {
	int x = Zen.getRandomNumber(0, 300);
	int y = Zen.getRandomNumber(-1000, 0);
	int speed;
	int points;
	int type = Zen.dice(6);
	String color;

	public Coin() {
		switch (type)
		{
		case 1:
			points = 10;
			speed = 3;
			color = "yellow";
			break;
		case 2:
			points = 25;
			speed = 5;
			color = "magenta";
			break;
		case 3:
			points = 50;
			speed = 7;
			color = "green";
			break;
		case 4:
			points = -35;
			speed = 4;
			color = "black";
			break;
		case 5:
			points = 125;
			speed = 11;
			color = "blue";
			break;
		case 6:
			points = 0;
			speed = 8;
			color = "white";

		}
	}

	public void draw() {
		Zen.setColor(color);
		Zen.fillOval(x, y, 10, 10);
	}
	public void move()
	{
		y += speed;
	}

}
