package com.pruebatecnicagrupor5.registerdata;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;
import com.pruebatecnicagrupor5.Actions;

public class RegisterDataOwner extends Actions {
    protected RegisterDataOwner(RemoteWebDriver driver) {
        super(driver);
    }

    private static final By TXTNOMBREAPELLIDO = By.xpath("//input[@placeholder='Nombre y apellido']");
    private static final By TXTDIA = By.xpath("//input[@placeholder='Día']");
    private static final By TXTMES = By.xpath("//input[@placeholder='Mes']");
    private static final By TXTYEAR = By.xpath("//input[@placeholder='Año']");
    private static final By SELECTOCUPACION = By.xpath("//mat-select[@aria-label='Ocupación']");
    private static final By TXTCELULAR = By.xpath("//input[@placeholder='Número de celular']");
    private static final By TXTEMAIL = By.xpath("//input[@placeholder='Correo electrónico']");
    private static final By BTNFINALIZAR = By.xpath("// * [text () = 'Finalizar'] // ancestor :: button");
    private static final By BTNIDENTIFICARIDEAL = By.xpath("//div[text()=' Identifica el ideal para ti ']");
    private static final By CHECKTODORIESGO = By.xpath("(.//*[normalize-space(text()) and normalize-space(.)=concat('', '\"', 'Solo daños a terceros y asistencia', '\"', '')])[1]/following::div[2]");

    public RegisterDataOwner registerDataOwner(String nombreCompleto, String dia, String mes, String year, String genero, String ocupacion, String celular, String email) {
        waitForElement(TXTNOMBREAPELLIDO, 8000);
        write(TXTNOMBREAPELLIDO, nombreCompleto);
        write(TXTDIA, dia);
        clickEnterElement(TXTDIA);
        write(TXTMES, mes);
        clickEnterElement(TXTMES);
        write(TXTYEAR, year);
        clickEnterElement(TXTYEAR);
        click(By.xpath("// * [text () = '" + genero + "'] // ancestor :: button"));
        click(SELECTOCUPACION);
        click(By.xpath("// * [text () = '" + ocupacion + "'] // ancestor :: mat-option"));
        write(TXTCELULAR, celular);
        write(TXTEMAIL, email);
        click(BTNFINALIZAR);
        waitForElement(BTNIDENTIFICARIDEAL, 120000);
        click(CHECKTODORIESGO);
        click(BTNIDENTIFICARIDEAL);
        return this;
    }
}
