package lockedme;


public class LockedMeMain {
public static void main(String[] args) {
		
		// Create "main" folder if not present in current folder structure
		FileOpertions.createMainFolderIfNotPresent("main");
		
		menuOptions.printWelcomeScreen("Locker", "aishu");
		
		HandleOptions.handleWelcomeScreenInput();
	}



	}


