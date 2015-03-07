package FallingCoins;

import zen.core.Zen;

public class Bucket {
	int x = 140;
	int y = 590;
	
	public void draw()
	{
		Zen.setColor("orange");
		Zen.fillRect(x, y, 25, 10);
	}
	public void move()
	{
		if (Zen.isKeyPressed("right"))
		{
			x += 4;
		}
		if (Zen.isKeyPressed("left"))
		{
			x -= 4;
		}
		if (x > 275)
		{
			x = 275;
		}
		if (x < 0)
		{
			x = 0;
		}
	}
	public boolean isCollecting(Coin c)
	{
		if (Math.abs(x - c.x) < 20 && Math.abs(y - c.y) < 10)
		{
			return true;
		}
		return false;
	}
}
