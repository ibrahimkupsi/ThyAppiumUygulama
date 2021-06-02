package com.thy;

import com.thoughtworks.gauge.Step;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;

import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import static element.BookAFlightPageElements.*;
import static element.FlightResultsPage.*;
import static element.HomePageElements.*;




public class StepImpl extends HookImpl{


    @Step({"<seconds> saniye bekle"})
    public void waitBySecond(int seconds) {
        try {
            TimeUnit.SECONDS.sleep(seconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    @Step({"Bilet al butonuna varsa tikla"})
    public void existClickByKey() {

        click(BookAFlightBy);

    }


    @Step({"Tek Yön Uçuş seç"})
    public void oneWay(){
        click(oneWayButtonBy);
    }

    @Step({"kalkış yeri seç"})
    public void selectDeparture(){
        click(fromToButtonBy);
    }

    @Step({"Kalkış yerini <key> olarak seç"})
    public void sendKey(String key){

        sendKeys(fromToSearchBoxButtonBy,key);
        //Assert.assertTrue(fromToSelectResultBy.isDisplayed());
        click(fromToSelectResultBy);
    }

    @Step({"Varış yerini <key> olarak seç"})
    public void sendArrival(String key){
        click(goToButtonBy);
        sendKeys(goToSearchBoxButtonBy, key);
        click(goToSelectResultBy);
    }

    @Step({"Tarih seç"})
    public void selectDate(){
        click(dateButtonBy);
        elements(dateListBy).get(0).isSelected();
        List<MobileElement> dates =elements(dateListBy);
        int index= 0;
        for (MobileElement element: dates){
            if (element.isSelected()){
                index= dates.indexOf(element)+2;
            }
        }
        elements(dateListBy).get(index).click();


    }


    @Step("Tamam butonuna tıkla")
    public void clickOK(){
        click(doneButtonBy);
    }

    @Step({"Kişi sayısını <key> artır"})
    public void numberOfPassengers(int key){
        for (int i = 0; i < key; i++){
            click(addingPersonButtonBy);
        }
    }

    @Step({"Uçuş ara"})
    public void searchFlight(){
        click(searchFlightBy);
    }

    @Step({"Uçuş liste kontrol"})
    public void listControl(){
        Assert.assertTrue(getElement(flightAreaBy).isDisplayed());
    }

    @Step({"Ekonomik Uçuş seç"})
    public void selectEcoFly(){

        Random rnd = new Random();
        int randomNumber = rnd.nextInt(elements(flightListBy).size());
        elements(flightListBy).get(randomNumber).click();
        elements(selectEcoFligthBy).get(0).click();

    }

    @Step({"Devam Butonuna tıklanır"})
    public void clickContinue(){
        click(continueButtonBy);
    }






}
