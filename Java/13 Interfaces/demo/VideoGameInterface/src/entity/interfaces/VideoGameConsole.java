package entity.interfaces;

/**
 * Created by Mrrobot on 7/11/2017 videogame consoles.
 */
public interface VideoGameConsole {

    void insertGame (VideoGame game);

    void startConsole ();

    void saveGame (VideoGame game);

    void closeGame (VideoGame game);

    boolean turnOffConsole ();

    boolean consoleWorking ();
}
