package FallingCoins;

import java.util.ArrayList;

import zen.core.Zen;

public class FallingCoins {

	static ArrayList<Coin> coins = new ArrayList<Coin>();
	static int score = 0;
	
	public static void main(String[] args) {
		Bucket b = new Bucket();
		boolean gameOver = false;
		for (int i = 0; i < 100; i++)
		{
				coins.add(new Coin());
		}
		setup();
		
		while (true)
		{	if (!gameOver)
			{
				Zen.setBackground("red");
				b.draw();
				b.move();
			
				Zen.setColor("black");
				Zen.drawText("Score:" + score, 0, 20);
				
				for (int i = 0; i < coins.size(); i++)
				{
					coins.get(i).draw();
					coins.get(i).move();
					if (b.isCollecting(coins.get(i)))
					{
						score += coins.get(i).points;
						coins.remove(i);
						coins.add(new Coin());
						if (coins.get(i).type == 6)
						{
							gameOver = true;
							break;
						}
					}
					if (coins.get(i).y > 600)
					{
						coins.remove(i);
						coins.add(new Coin());
					}
				}
			
			}
			else
			{
				Zen.setBackground("white");
				Zen.setColor("black");
				Zen.setFont("Arial", 32);
				Zen.drawText("Game Over", 70, 290);
				Zen.drawText("Your Score:" + score, 70, 320);
			}
		
		Zen.buffer(33);
		
		}
	}
	public static void setup()
	{
		Zen.create(300, 600);
	}

}
