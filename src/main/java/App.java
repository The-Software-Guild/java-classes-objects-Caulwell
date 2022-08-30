import controller.DVDLibraryController;
import model.dao.DVDLibraryDao;
import model.dao.DVDLibraryDaoFileImpl;
import view.DVDLibraryView;
import view.UserIO;
import view.UserIOConsoleImpl;

public class App {

    public static void main(String[] args) {
        UserIO myIo = new UserIOConsoleImpl();
        DVDLibraryView myView = new DVDLibraryView(myIo);
        DVDLibraryDao myDao = new DVDLibraryDaoFileImpl();
        DVDLibraryController controller = new DVDLibraryController(myView, myDao);
        controller.run();
    }

}
