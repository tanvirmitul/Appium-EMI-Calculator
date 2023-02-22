package testrunner;

import dataset.Dataset;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.EmiCalCPage;
import setup.Setup;

public class CalculateTestRunner extends Setup {
    EmiCalCPage emi;
    @BeforeTest
    public void startEMICalculator(){
        emi= new EmiCalCPage(driver);
        emi.btnStart.click();
    }

    @Test(dataProvider = "data-provider", dataProviderClass = Dataset.class, description = "Verified whether the emi and other fields are calculated according to the dataset or not.")
    public void calculate(int loanAmount, double interest, int period, double pFee, int mEMI, int tInterest, int tpFee, int tPayment) throws InterruptedException {
        emi= new EmiCalCPage(driver);
        Thread.sleep(2000);
        emi.calculateEMI(loanAmount,interest,period,pFee);
        Thread.sleep(6000);

        String monthlyEMI= emi.monthlyEMI.getText();
        monthlyEMI= String.valueOf((int)Double.parseDouble(monthlyEMI.replace(",","")));

        String totalInterest= emi.totalInterest.getText();
        totalInterest= String.valueOf((int)Double.parseDouble(totalInterest.replace(",","")));

        String processingFee= emi.processingFee.getText();
        processingFee= String.valueOf((int)Double.parseDouble(processingFee.replace(",","")));

        String totalPayment= emi.totalPayment.getText();
        totalPayment= String.valueOf((int)Double.parseDouble(totalPayment.replace(",","")));

        Assert.assertEquals(monthlyEMI,String.valueOf(mEMI));
        Assert.assertEquals(totalInterest,String.valueOf(tInterest));
        Assert.assertEquals(processingFee,String.valueOf(tpFee));
        Assert.assertEquals(totalPayment,String.valueOf(tPayment));
        Thread.sleep(2000);
        emi.btnReset.click();
        Thread.sleep(1000);

    }
}
