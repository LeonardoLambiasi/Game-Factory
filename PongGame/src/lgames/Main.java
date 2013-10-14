package lgames;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;

public class Main {
	public static void main(String[] args) {
		LwjglApplicationConfiguration gcf = new LwjglApplicationConfiguration();
		gcf.useGL20 = false;
		gcf.title = "jogo";
		gcf.width = 1080;
		gcf.height = 720;
		
		new LwjglApplication(new Pong(), gcf);
	}
}
