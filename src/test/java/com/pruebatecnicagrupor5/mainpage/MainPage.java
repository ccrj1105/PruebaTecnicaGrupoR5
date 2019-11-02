package com.pruebatecnicagrupor5.mainpage;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;
import com.pruebatecnicagrupor5.Actions;
import com.pruebatecnicagrupor5.registerdata.RegisterDataCustomer;

public class MainPage extends Actions {
    RemoteWebDriver driver;


    public MainPage(RemoteWebDriver driver) {
        super(driver);
    }

    public MainPage(String url, RemoteWebDriver driver) {
        super(driver);
        driver.get(url);
    }

    private static final By TXTNUMEROPLACA = By.xpath("//input[@placeholder='Ingresa la placa']");

    private static final By BTNCOTIZARGRATIS = By.xpath("//cang-dynamic-form/form/cang-field-button/div/button");

    public RegisterDataCustomer cotizarGratis(String numPlaca) {
        write(TXTNUMEROPLACA, numPlaca);
        click(BTNCOTIZARGRATIS);

        return new RegisterDataCustomer(driver());
    }
}
