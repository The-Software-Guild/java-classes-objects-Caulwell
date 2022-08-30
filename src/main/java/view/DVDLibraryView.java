package view;

import model.dto.DVD;

public class DVDLibraryView {

    private UserIO io;

    public DVDLibraryView(UserIO io){
        this.io = io;
    }

    public int getMenuChoice(){
        io.print("""
                Main Menu
                1. Add new DVD
                2. Remove a DVD
                3. Edit a DVD
                4. List all DVDs
                5. View DVD Details
                6. Exit
                """);
        return io.readInt("Please select from the above choices.", 1, 5);
    }

    public DVD getNewDVDInfo() {
        String studentId = io.readString("Please enter Student ID");
        String firstName = io.readString("Please enter First Name");
        String lastName = io.readString("Please enter Last Name");
        String cohort = io.readString("Please enter Cohort");
        DVD currentStudent = new DVD(studentId);
        currentStudent.setFirstName(firstName);
        currentStudent.setLastName(lastName);
        currentStudent.setCohort(cohort);
        return currentStudent;
    }

    public void displayAddDVDBanner() {
        io.print("=== Add DVD ===");
    }

    public void displayAddSuccessBanner() {
        io.readString(
                "DVD successfully added.  Please hit enter to continue");
    }
}
