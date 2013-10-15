package lgames;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;


public class Main {
	public static void main(String[] args) {
		LwjglApplicationConfiguration gcf = new LwjglApplicationConfiguration();
		gcf.useGL20 = true;
		gcf.title = "Pong Game";
		gcf.width = 720;
		gcf.height = 540;
		
		new LwjglApplication(new Pong(), gcf);
	}
}
