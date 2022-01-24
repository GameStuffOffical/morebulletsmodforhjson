    @Override
    public void load(){
		        standardHomingFast = new BasicBulletType(3f, 12, "bullet"){{
            width = 7f;
            height = 9f;
            homingPower = 0.08f;
            reloadMultiplier = 1.5f;
            ammoMultiplier = 5;
            lifetime = 60f;
					  speed = 6f;
        }};
		}
