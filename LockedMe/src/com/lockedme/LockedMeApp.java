package com.lockedme;

public class LockedMeApp {
	public static void main(String[] args) {
			FileOperations.createMainFolderIfNotPresent("main");
			
			DisplayMenu.printWelcomeScreen("LockedMe", "Kaustubh Nagvekar");
			
			FileHandleOptions.handleWelcomeScreenInput();
}
}
