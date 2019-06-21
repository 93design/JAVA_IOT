package entity.impl.console;

import entity.abstractClasses.Microsoft;
import entity.interfaces.VideoGame;

/**
 * Created by Mrrobot on 7/11/2017 videogame consoles.
 */
public class XBox extends Microsoft {

    @Override
    public void insertGame (VideoGame game) {

    }

    @Override
    public void startConsole () {

    }

    @Override
    public void saveGame (VideoGame game) {

    }

    @Override
    public void closeGame (VideoGame game) {

    }

    @Override
    public boolean turnOffConsole () {
        return false;
    }

    @Override
    public boolean consoleWorking () {
        return false;
    }

}
