package com.lockedme;

public class DisplayMenu {

	public static void printWelcomeScreen(String appName, String developerName) {
		String companyDetails = String.format("----------------------------------------------------------------------\n"
				+ "** %s.com. \n" + "** This application was developed by %s.\n"
				+ "----------------------------------------------------------------------\n", appName, developerName);
		String appFunction = "This application is to do following operation on files :-\n"
				+ " Retrieve all file names in the \"main\" folder\n"
				+ "Search, add, or delete files in \"main\" folder.\n";
		System.out.println(companyDetails);

		System.out.println(appFunction);
	}

	public static void displayingMenues() {
		String menu = "\n\n--------- Type the following operation number to perform it--------- \n\n"
				+ "1) Retrieve all files inside \"main\" folder\n" + "2) Display menu for File operations\n"
				+ "3) Exit program\n";
		System.out.println(menu);

	}

	public static void displayFileOptions() {
		String fileMenu = "\n\n****** Select any option number from below and press Enter ******\n\n"
				+ "1) Add a file to \"main\" folder\n" + "2) Delete a file from \"main\" folder\n"
				+ "3) Search for a file from \"main\" folder\n" + "4) Show Previous Menu\n" + "5) Exit program\n";

		System.out.println(fileMenu);
	}

}