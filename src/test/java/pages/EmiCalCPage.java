package pages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static setup.Setup.Package_Name;

public class EmiCalCPage {
    @FindBy (id = Package_Name+":id/btnStart")
    public WebElement btnStart;
    @FindBy (id = Package_Name+":id/etLoanAmount")
    WebElement txtLoanAmount;
    @FindBy(id = Package_Name+ ":id/etInterest")
    WebElement txtInterestAmount;
    @FindBy(id = Package_Name+ ":id/etYears")
    WebElement txtPeriod;
    @FindBy(id = Package_Name+":id/etEMI")
    WebElement txtEmiAmount;
    @FindBy(id = Package_Name+":id/etFee")
    WebElement txtProcessingFee;
    @FindBy(id = Package_Name+ ":id/btnCalculate")
    WebElement btnCalculate;
    @FindBy(id = Package_Name+":id/btnReset")
    public WebElement btnReset;
    @FindBy(id = Package_Name+":id/monthly_emi_result")
    public WebElement monthlyEMI;
    @FindBy(id = Package_Name+":id/total_interest_result")
    public WebElement totalInterest;
    @FindBy(id = Package_Name+":id/processing_fee_result")
    public WebElement processingFee;
    @FindBy(id = Package_Name+":id/total_payment_result")
    public WebElement totalPayment;

    public EmiCalCPage(AndroidDriver driver){
        PageFactory.initElements(new AppiumFieldDecorator(driver),this);
    }
    public void calculateEmi(){

    }
    public void calculateEMI(int loanAmount, double interest, int years, double processingFee){
        txtLoanAmount.sendKeys(""+loanAmount+"");
        txtInterestAmount.sendKeys(""+interest+"");
        txtPeriod.sendKeys(""+years);
        txtProcessingFee.sendKeys(""+processingFee+"");
        btnCalculate.click();

    }
}
