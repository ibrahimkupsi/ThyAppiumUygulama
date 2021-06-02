package element;

import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;

import java.util.List;

public class BookAFlightPageElements {

    public static By oneWayButtonBy = By.id("com.turkishairlines.mobile:id/frDashboard_tvOneWay");
    public static By fromToButtonBy = By.id("com.turkishairlines.mobile:id/frDashboard_tvFromCode");
    public static By fromToSearchBoxButtonBy = By.id("com.turkishairlines.mobile:id/frAirportSelection_etSearch");
    public static By fromToSelectResultBy = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.RelativeLayout[2]/android.widget.TextView[2]");
    public static By goToButtonBy =  By.id("com.turkishairlines.mobile:id/frDashboard_llTo");
    public static By goToSearchBoxButtonBy = (By.id("com.turkishairlines.mobile:id/frAirportSelection_etSearch"));
    public static By goToSelectResultBy = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.RelativeLayout[2]/android.widget.TextView[2]");
    public static By dateButtonBy = By.id("com.turkishairlines.mobile:id/frDashboard_rlDeparture");
    public static By dateListBy = By.xpath("//*[@class=\"android.view.ViewGroup\"]/android.view.ViewGroup/android.widget.FrameLayout");
    public static By doneButtonBy = By.id("com.turkishairlines.mobile:id/frDashboard_btnDone");
    public static By addingPersonButtonBy = By.xpath("//*[@class='android.widget.TextView' and @bounds='[925,1040][1079,1194]']");
    public static By searchFlightBy = By.id("com.turkishairlines.mobile:id/frDashboard_btnSearch");
}
