package testNG;

public class ReadExcel {

//	public /*Static*/ String[][] getdata(String excelfilename) throws IOException {
//		//to open a spreadsheet
//		//XSSFWorkbook book = new XSSFWorkbook("./testdata/TC001Ec.xlsx");
//		XSSFWorkbook bookFWorkbook("./testdata/"+excelfilename+".xlsx");
//		//to open a specific sheet
//		XSSFSheet sheet = book.getSheetAt(0); // getsheetat method ctrl+2,l
//		// to get no of rows available 
//		int rowNum = sheet.getLastRowNum();			//getLastRowNum ctrl+2,l
//		System.out.println("Row Count: "+rowNum);	
//		// to get no of columns 
//		short colcount = sheet.getRow(0).getLastCellNum();	//.getRow(0) & getLastCellNum()  ctrl+2,l
//		System.out.println("columncount: "+colcount);
//
//		// create 2 dimensional data read from the excel		
//		String[][] data = new String[rowNum][colcount];
//		
//		//iterate rows and columns
//		for (int i = 1; i <= rowNum; i++) {				// 1 is given as 0 is the index of excel and column headings
//			XSSFRow eachrow = sheet.getRow(i);
//			for (int j = 0; j < colcount; j++) {
//				XSSFCell cell = eachrow.getCell(j);
//				String cellvalue = cell.getStringCellValue();
//				data[i-1][j]  = cellvalue;				
//				//System.out.println(cellvalue);
//			}
//		}
//		book.close();
//		return data;		
//	}

	public static void main(String[] args) {

//		Get Approval Message
		webDriverWait(ExpectedConditions.visibilityOf(obj.Approval_error_Message()));
		String approval_Msg = obj.Approval_error_Message().getText();
		System.out.println("Approval Msg is: " + approval_Msg);

		String ref_Number = StringHelper.drawDigitsFromString(approval_Msg);
		System.out.println("Ref Number is: " + ref_Number);

		String Reference_Number = ref_Number.replace(".", "");

		// Logout
		webDriverWait(ExpectedConditions.elementToBeClickable(objects.get_User_Profile_Name()));
		objects.get_User_Profile_Name().click();

		webDriverWait(ExpectedConditions.elementToBeClickable(objects.logout_Button()));
		objects.logout_Button().click();

		// Select Employee Option
		webDriverWait(ExpectedConditions.elementToBeClickable(objects.Employee_Option()));
		objects.Employee_Option().click();
		String username_Query = "SELECT TC_RESP_USER_ID FROM T_TRANS_CONTROL WHERE TC_TRANS_ID='" + Reference_Number
				+ "' AND ROWNUM=1";
		String username = get_DB_Data(username_Query, "TC_RESP_USER_ID");
		String password_Query = "SELECT PKG_USER_PASSWORD.FN_DECRYPT_PASSWORD ('" + username
				+ "') USER_PASSWORD FROM DUAL";
		String password = get_DB_Data(password_Query, "USER_PASSWORD");
		// Enter UserID
		webDriverWait(ExpectedConditions.visibilityOf(objects.Employee_Id_Field()));
		// objects.Employee_Id_Field().sendKeys(ReadExcelData.readExcel("Login", 2, 1));
		objects.Employee_Id_Field().sendKeys(username);
		// Enter Password
		webDriverWait(ExpectedConditions.visibilityOf(objects.password_Field()));
		// objects.password_Field().sendKeys(get_DB_Data(ReadExcelData.readExcel("Login",
		// 2, 2), ReadExcelData.readExcel("Login", 2, 4)));
		objects.password_Field().sendKeys(password);
		// Click Login Button
		webDriverWait(ExpectedConditions.elementToBeClickable(objects.login_Button()));
		objects.login_Button().click();

		// Click My Actions
		webDriverWait(ExpectedConditions.elementToBeClickable(objects.my_Action()));
		objects.my_Action().click();

		// Search Using Quote Number
		webDriverWait(ExpectedConditions.visibilityOf(objects.work_Flow_Query_Button()));
		objects.work_Flow_Query_Button().sendKeys(Reference_Number);

		// click Approval Menu
		webDriverWait(ExpectedConditions.elementToBeClickable(objects.approve_Menu()));
		objects.approve_Menu().click();

		// Approve Policy
		webDriverWait(ExpectedConditions.elementToBeClickable(objects.approve_Button()));
		scrollDownJavaSc(objects.approve_Button());
		Thread.sleep(1000);
		objects.approve_Button().click();
		Thread.sleep(2000);

		// Approval_Msg Verification
		webDriverWait(ExpectedConditions.visibilityOf(objects.policy_Approval_Msg()));
		String approval_msg = objects.policy_Approval_Msg().getText();
		System.out.println(approval_msg);

		if (approval_msg.contains("Approved Successfully")) {

			System.out.println("Endorsement approved Successfully");
		} else {
			Assert.fail();
			System.out.println("Endorsement approved Successfully");
		}

	}

public static int getRowCount() {
		int rowCount = 0;
		try {

			rowCount = sheet.getPhysicalNumberOfRows();
		} catch (Exception e) {
			e.getMessage();
			e.getCause();
			e.printStackTrace();
		}
		return rowCount;

	}


public static String getCellDataString(int rownum, int colnum) {
		String cellData = null;
		try {
//cellData = sheet.getRow(rownum).getCell(colnum).getStringCellValue();
			XSSFCell cell =sheet.getRow(rownum).getCell(colnum);
			DataFormatter df = new DataFormatter();
			cellData = df.formatCellValue(cell);
		} catch (Exception e) {
			e.getMessage();
			e.getCause();
			e.printStackTrace();
		}
		return cellData;
	}












	

}
