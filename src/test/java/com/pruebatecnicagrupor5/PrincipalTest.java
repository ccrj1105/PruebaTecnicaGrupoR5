/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pruebatecnicagrupor5;


import com.pruebatecnicagrupor5.mainpage.MainPage;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

/**
 * @author cristian
 */
public class PrincipalTest {

    /**
     * @param args the command line arguments
     */
    private MainPage mainPage;
    private static RemoteWebDriver driver;


    @Test
    public void pruebaTecnica() {


        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        this.mainPage = new MainPage("https://segurocanguro.com/", driver);
        this.mainPage.cotizarGratis("czr263")
                .RegisterDataCustomer("1029117867", "Cédula de Ciudadanía").
                RegisterVehicleInfo("MERCEDES BENZ", "2020", "B 200",
                        "Bogotá").
                registerDataOwner("pepe pruebas", "25", "Febrero", "1996", "Hombre", "Empleado", "3015879695", "pruebas@gmail.com");

        driver.close();


    }

}
