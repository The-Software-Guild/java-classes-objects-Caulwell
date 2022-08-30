package controller;

import model.dao.DVDLibraryDao;
import model.dao.DVDLibraryDaoException;
import model.dto.DVD;
import view.DVDLibraryView;

public class DVDLibraryController {

    private DVDLibraryView view;
    private DVDLibraryDao dao;

    public DVDLibraryController(DVDLibraryView view, DVDLibraryDao dao){
        this.dao = dao;
        this.view = view;
    }
    
    public void run(){
        
        int menuSelection = 0;
        
        while(true){
            menuSelection = getMenuSelection();
            
            switch(menuSelection){
                case 1 -> addDVD();
                case 2 -> removeDVD();
                case 3 -> editDVD();
                case 4 -> listDVDs();
                case 5 -> viewDVD();
                case 6 -> {
                    exitMenu();
                    return;
                }
                default -> unkownCommand();
            }
        }
    }

    private int getMenuSelection(){
        return view.getMenuChoice();
    }

    private void addDVD() throws DVDLibraryDaoException {
        view.displayAddDVDBanner();
        DVD newDVD = view.getNewDVDInfo();
        dao.addDVD(dvd.getId(), newDVD);
        view.displayAddSuccessBanner();
    }

    private void removeDVD() {
    }

    private void editDVD() {
    }

    private void listDVDs() {
    }

    private void viewDVD() {
    }

    private void exitMenu() {
    }

    private void unkownCommand() {
    }












}
