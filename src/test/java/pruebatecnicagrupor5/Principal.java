/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebatecnicagrupor5;


import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import pruebatecnicagrupor5.mainpage.MainPage;

/**
 * @author cristian
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    private MainPage mainPage;
    private static RemoteWebDriver driver;

    public static void main(String[] args) {
        Principal pr = new Principal();
        pr.pruebaTecnica();

    }

    public void pruebaTecnica() {


        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        this.mainPage = new MainPage("https://segurocanguro.com/", driver);
        this.mainPage.cotizarGratis("czr263")
                .RegisterDataCustomer("1019117870", "Cédula de Ciudadanía").
                RegisterVehicleInfo("MERCEDES BENZ","2020","B 200",
                        "Bogotá").
                registerDataOwner("cristian rodriguez","25","Marzo","1996","Hombre","Empleado","3015879695","pruebas@gmail.com");

        driver.close();


    }

}
