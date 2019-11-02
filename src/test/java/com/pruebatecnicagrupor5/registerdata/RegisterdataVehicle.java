package com.pruebatecnicagrupor5.registerdata;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;
import com.pruebatecnicagrupor5.Actions;

public class RegisterdataVehicle extends Actions {
    protected RegisterdataVehicle(RemoteWebDriver driver) {
        super(driver);
    }

    private static final By TXTMARCA = By.xpath("//input[@placeholder='Marca']");
    private static final By TXTMODELO = By.xpath("//input[@placeholder='Modelo']");
    private static final By TXTREFERENCIA = By.xpath("//input[@placeholder='Referencia']");
    private static final By TXTCIUDADCIRCULACION = By.xpath("//input[@placeholder='Ciudad de Circulación']");
    private static final By BTNSIGUIENTE = By.xpath("// * [text () = 'Siguiente'] // ancestor :: button");

    public RegisterDataOwner RegisterVehicleInfo(String marca, String modelo, String referencia, String ciudadCirculacion) {
        waitForElement(TXTMARCA, 8000);
        clearElement(TXTMARCA);
        write(TXTMARCA, marca);
        clickEnterElement(TXTMARCA);
        waitForElement(TXTMODELO, 2000);
        write(TXTMODELO, modelo);
        clickEnterElement(TXTMODELO);
        write(TXTREFERENCIA, referencia);
        clickEnterElement(TXTREFERENCIA);
        waitForElement(TXTCIUDADCIRCULACION,8000);
        clearElement(TXTCIUDADCIRCULACION);
        write(TXTCIUDADCIRCULACION, ciudadCirculacion);
        clickEnterElement(TXTCIUDADCIRCULACION);

        click(BTNSIGUIENTE);
        return new RegisterDataOwner(driver());


    }
}
