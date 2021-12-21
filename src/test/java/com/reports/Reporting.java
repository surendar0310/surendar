package com.reports;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class Reporting {

	public static void jvmReports(String jsonfile) {
		
		File reportdirectory=new File(System.getProperty("user.dir")+"\\src\\test\\resources\\Reports");
		Configuration configuration=new Configuration(reportdirectory, "facebook automation");
		configuration.addClassifications("os","windows10");
		List<String> jsonfiles=new ArrayList<String>();
		jsonfiles.add(jsonfile);
		ReportBuilder builder=new ReportBuilder(jsonfiles, configuration);
		builder.generateReports();
		System.out.println("by perth");
		
	}

		
}
