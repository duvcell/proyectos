package RetoSelenium.RetoFinalCursoSelenium.Pages;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import RetoSelenium.RetoFinalCursoSelenium.Utils.ExcelUtils;

public class DatosGeneradosPage {
	@FindBy(xpath = "/html/body/table")
	WebElement tblFormulario;

	private WebDriver driver;

	public WebDriver getDriver() {
		return driver;
	}

	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}

	public void traerContenidoHTML() {

		String strNombArchivo = System.getProperty("user.dir") + "/formularioWeb.xlsx";
		ExcelUtils excelUtil = new ExcelUtils(strNombArchivo);
		excelUtil.setExcelFile("Formulario");

		List<WebElement> ListaEtiquetas = tblFormulario.findElements(By.tagName("th"));
		List<WebElement> ListaFormulario = tblFormulario.findElements(By.tagName("td"));

		excelUtil.setCellData(ListaEtiquetas.get(0).getText(), 0, 0);
		excelUtil.setCellData(ListaEtiquetas.get(1).getText(), 0, 1);
		excelUtil.setCellData(ListaEtiquetas.get(2).getText(), 0, 2);
		excelUtil.setCellData(ListaEtiquetas.get(3).getText(), 0, 3);
		excelUtil.setCellData(ListaEtiquetas.get(4).getText(), 0, 4);
		excelUtil.setCellData(ListaEtiquetas.get(5).getText(), 0, 5);
		int i = 0;
		int k = 0;
		int j = 0;
		
		for (i = 1; i < 101; i++) {
			for (j = 0; j < 6; j++) {
				excelUtil.setCellData(ListaFormulario.get(k).getText(), i, j);
				System.out.println("Fila: " + i + "," + "Columna: " + j + "Registro: " + k + " Dato:"+ ListaFormulario.get(k).getText()+ "\n");
				k++;
			}
		}
		
	}

	public void verPantallaActual() {
		String MainWindow = driver.getWindowHandle();

		Set<String> pantalla = driver.getWindowHandles();
		Iterator<String> iterador = pantalla.iterator();

		while (iterador.hasNext()) {
			String ChildWindow = iterador.next();

			if (!MainWindow.equalsIgnoreCase(ChildWindow))
				;
			{
				driver.switchTo().window(ChildWindow);
			}
		}
	}

}
