package com.pruebatecnicagrupor5.registerdata;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;
import com.pruebatecnicagrupor5.Actions;

public class RegisterDataCustomer extends Actions {


    RemoteWebDriver driver;

    public RegisterDataCustomer(RemoteWebDriver driver) {
        super(driver);
    }

    private static final By TXTNUMDOCCUSTOMER = By.xpath("//input[@placeholder='Número de documento']");
    private static final By SELECTTYPEDOC = By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Número de documento'])[1]/following::span[3]");
    private static final By BTNCONTINUAR = By.xpath("// * [text () = 'Continuar'] // ancestor :: button");

    public RegisterdataVehicle RegisterDataCustomer(String numDoc, String typeDoc) {
        waitForElement(TXTNUMDOCCUSTOMER, 8000);
        write(TXTNUMDOCCUSTOMER, numDoc);
        click(SELECTTYPEDOC);
        click(By.xpath("// * [text () = '" + typeDoc + "'] // ancestor :: mat-option"));
        click(BTNCONTINUAR);
        return new RegisterdataVehicle(driver());

    }
}
