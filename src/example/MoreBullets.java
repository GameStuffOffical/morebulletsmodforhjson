package example;
import mindustry.entities.bullet.*;
import mindsutry.ctype.ContentList;
public class MoreBullets implements ContentList {
	// dont use this file placement as an example
	public BulletType standardHomingFast;
	@Override
	public void load(){
		standardHomingFast = new BasicBulletType(6f, 12, "bullet"){{
			width = 7f;
			height = 9f;
			homingPower = 0.08f;
			reloadMultiplier = 1.5f;
			ammoMultiplier = 5;
			lifetime = 60f;
		}};
	}
}


