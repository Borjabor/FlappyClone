package com.gcstudios.entities;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

import com.gcstudios.main.Game;

public class Pipes extends Entity{
	
	public Pipes(double x, double y, int width, int height, double speed, BufferedImage sprite) {
		super(x, y, width, height, speed, sprite);
	}

	public void tick() {
		x--;
		if(x + width <= 0) {
			
			Game.score += 5;     
			Game.entities.remove(this);
			return;
		}
	}
	
	public void render(Graphics g) {
		//g.setColor(Color.green);
		//g.fillRect((int)x, (int)y, width, height);
		g.setColor(Color.black);
		g.fillRect(this.getX()-1, this.getY(), width, height);
		g.setColor(new Color(49, 120, 40));
		g.fillRect(this.getX(), this.getY() + 1, width - 2, height - 2);
		g.setColor(new Color(96, 235, 77));
		g.fillRect(this.getX() + 8, this.getY() + 1, width - 14, height - 2);
			
	}

}
