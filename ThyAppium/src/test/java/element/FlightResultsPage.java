package element;

import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;

import java.util.List;

public class FlightResultsPage {
    public static By flightAreaBy = By.id("com.turkishairlines.mobile:id/frFlightSearch_rvFlight");
    public static  By flightListBy = By.xpath("//*[@class=\"androidx.recyclerview.widget.RecyclerView\"]/android.view.ViewGroup/android.widget.FrameLayout");
    public static By selectEcoFligthBy = By.xpath("//*[@class=\"android.widget.LinearLayout\"]/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup");
    public static By continueButtonBy = By.id("com.turkishairlines.mobile:id/frFlightSearch_btnContinue");

}
