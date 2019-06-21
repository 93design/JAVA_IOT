package app;

import entity.enums.AdapterCable;
import entity.enums.Controller;
import entity.enums.OutputCable;
import entity.impl.console.Emulator;
import entity.impl.videogames.VideoGameCartridge;

/**
 * Created by Mrrobot on 7/11/2017 videogame consoles.
 */
public class EmulatorApp {

	public static void main(String[] args) {

		Emulator emulator = new Emulator("Nintendo", AdapterCable.NES_ADAPTOR, OutputCable.AV,
				Controller.NES_CONTROLLER, "testing", "NES");

		VideoGameCartridge cartridge = new VideoGameCartridge();
		emulator.insertGame(cartridge);

		System.out.println(emulator);

	}

}
