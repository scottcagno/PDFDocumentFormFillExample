package main.java.com.cagnosolutions.example.pdf;

import com.cagnosolutions.example.pdf.PDFToolKit;
import org.apache.pdfbox.exceptions.COSVisitorException;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Scott Cagno.
 * Copyright Cagno Solutions. All rights reserved.
 */

public class Main {

	public static void main(String[] args) {

		// setup pdf documents
		String pdfForm = "blankPdfForm.pdf";
		String pdfFill = "filledPdfForm.pdf";

		// map we will use to fill out the pdf, key / value style
		Map<String,String> data = new HashMap<>();
		data.put("fullName", "Scott Cagno");
		data.put("company", "Cagno Solutions, LLC");

		// instantiate pdf toolkit class
		PDFToolKit toolkit = new PDFToolKit();

		try {
			PDFToolKit.populateAndCopy(pdfForm, pdfFill, data);
		} catch (IOException | COSVisitorException e) {
			e.printStackTrace();
		}

		System.out.println("Complete");
	}
}
