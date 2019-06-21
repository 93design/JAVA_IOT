package entity.impl.console;

import entity.abstractClasses.Microsoft;
import entity.enums.AdapterCable;
import entity.enums.Controller;
import entity.enums.OutputCable;
import entity.interfaces.VideoGame;

/**
 * Created by Mrrobot on 7/11/2017 videogame consoles.
 */
public class PC extends Microsoft {

    public PC () {
        setDescription("Pc Master Race...");
        setNameConsole("Pc");
        setManFactor(super.getClass().toString());
    }

    @Override
    public void insertGame (VideoGame game) {

    }

    @Override
    public void startConsole () {
        if (!consoleWorking()) {
            setAdpCable(AdapterCable.PC_ADAPTOR);
            setOutCable(OutputCable.DVI);
            setContrl(Controller.KEYBOARD);
            setDeviceWorking(true);
        }
    }

    @Override
    public void saveGame (VideoGame game) {

    }

    @Override
    public void closeGame (VideoGame game) {

    }

    @Override
    public boolean turnOffConsole () {
        setAdpCable(null);
        setOutCable(null);
        setContrl(null);
        setDeviceWorking(false);
        return isDeviceWorking();
    }

    @Override
    public boolean consoleWorking () {
        return isDeviceWorking();
    }

}
