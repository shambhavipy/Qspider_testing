package org.trmga.genericUtility;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzer implements IRetryAnalyzer {

	int upperLimit = 3;
	int num=0;
	@Override
	public boolean retry(ITestResult result) {
		
		if(num<upperLimit) {
			
			num++;
			return true;
			
		}
		return false;
	}
}
