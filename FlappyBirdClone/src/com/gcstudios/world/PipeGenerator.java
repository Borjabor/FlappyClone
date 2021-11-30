package com.gcstudios.world;

import com.gcstudios.entities.Entity;
import com.gcstudios.entities.Pipes;
import com.gcstudios.main.Game;

public class PipeGenerator {
	
	public int time = 0;
	public int targetTime = 120;
	
	public void tick() {
		int incr = Entity.rand.nextInt(3);
		time += incr;
		
		if(time >= targetTime) {
			//Create new pipe and reset counter
			int pipeHeight01 = Entity.rand.nextInt(40) + 70;
			Pipes pipe1 = new Pipes(Game.WIDTH, 0, 20, pipeHeight01, 1, null);
			
			int buffer = Entity.rand.nextInt(50) + 24;
			Pipes pipe2 = new Pipes(Game.WIDTH, pipeHeight01 + buffer, 20, 160, 1, null);

			Game.entities.add(pipe1);
			Game.entities.add(pipe2);
			time = 0;
		}
	}

}
