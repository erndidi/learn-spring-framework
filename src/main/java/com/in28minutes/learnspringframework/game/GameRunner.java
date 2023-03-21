package com.in28minutes.learnspringframework.game;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GameRunner {
	
	@Autowired
	private GamingConsole _game;
	public GameRunner(GamingConsole game) {
		_game = game;
	}
	
	public void run()
	{
		_game.up();
		_game.down();
		_game.left();
		_game.right();
	}

}
