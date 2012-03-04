package com.mojang.mojam.entity;

import com.mojang.mojam.entity.mob.Mob;
import com.mojang.mojam.screen.Art;
import com.mojang.mojam.screen.Screen;

public class BulletPoison extends Bullet {

	public BulletPoison(Mob e, double xa, double ya, float damage) {
		super(e, xa, ya, damage);
		life=80;
		this.xa = xa * 3;
		this.ya = ya * 3;
		
	}

	@Override
	public void render(Screen screen) {
		screen.blit(Art.bulletpoison[facing][0], pos.x - 8, pos.y - 10);
	}
	
	
}