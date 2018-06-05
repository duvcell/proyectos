package RetoSelenium.RetoFinalCursoSelenium.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import RetoSelenium.RetoFinalCursoSelenium.Object.DatosObject;

public class FormularioPage {
	
	DatosObject datosObject = new DatosObject();
	
	@FindBy (xpath = "//*[@id=\'gdNumRowsToAdd\']")
	WebElement txtAnadir;
	
	@FindBy (xpath = "//*[@id=\'gdAddDataSetRowsSection\']/input[2]")
	WebElement btnAnadir;
	
	@FindBy (xpath = "//*[@id=\'gdTitle_1\']")
	WebElement txtNombre;
	
	@FindBy (xpath = "//*[@id=\'gdDataType_1\']")
	WebElement cmbNombre;
	
	@FindBy (id = "dtExample_1")
	WebElement cmbEjemploNombre;
	
	@FindBy (xpath = "//*[@id=\'gdTitle_2\']")
	WebElement txtApellido;
	
	@FindBy (xpath = "//*[@id=\"gdDataType_2\"]")
	WebElement cmbApellido;
	
	@FindBy (id = "dtExample_2")
	WebElement cmbEjemploApellido;

	@FindBy (xpath = "//*[@id=\"gdTitle_3\"]")
	WebElement txtEdad;
	
	@FindBy (xpath = "//*[@id=\"gdDataType_3\"]")
	WebElement cmbEdad;
	
	@FindBy (xpath = "//*[@id=\"dtNumRangeMin_3\"]")
	WebElement txtEdadMinima;
	
	@FindBy (xpath = "//*[@id=\"dtNumRangeMax_3\"]")
	WebElement txtEdadMaxima;
	
	@FindBy (xpath = "//*[@id=\"gdTitle_4\"]")
	WebElement txtTelefono;
	
	@FindBy (xpath = "//*[@id=\"gdDataType_4\"]")
	WebElement cmbTelefono;
	
	@FindBy (xpath = "//*[@id=\"dtExample_4\"]")
	WebElement cmbEjemploTelefono;
	
	@FindBy (xpath = "//*[@id=\"gdTitle_5\"]")
	WebElement txtPais;
	
	@FindBy (xpath = "//*[@id=\"gdDataType_5\"]")
	WebElement cmbPais;
	
	@FindBy (xpath = "//*[@id=\"gdTitle_6\"]")
	WebElement txtDireccion;
	
	@FindBy (xpath = "//*[@id=\"gdDataType_6\"]")
	WebElement cmbDireccion;
	
	@FindBy (xpath = "//*[@id=\"gdExportTarget_newTab\"]")
	WebElement rdbSolapa;

	@FindBy (xpath = "//*[@id=\'gdGenerateButton\']")
	WebElement btnGenerar;	

	
	public void diligenciaFormulario() {
		txtAnadir.clear();
		txtAnadir.sendKeys(datosObject.getFilas());
		btnAnadir.click();
		
		txtNombre.sendKeys(datosObject.getColumnaNombre());
		
		Select sCNombre = new Select(cmbNombre);
		sCNombre.selectByVisibleText(datosObject.getTipoNombre());
		
		Select sENombre = new Select(cmbEjemploNombre);
		sENombre.selectByVisibleText(datosObject.getEjemploNombre());
		
		
		txtApellido.sendKeys(datosObject.getColumnaApellido());
		
		Select sCbApellido = new Select(cmbApellido);
		sCbApellido.selectByVisibleText(datosObject.getTipoApellido());
		
		Select sEApellido = new Select(cmbEjemploApellido);
		sEApellido.selectByVisibleText(datosObject.getEjemploApellido());
		
		
		txtEdad.sendKeys(datosObject.getColumnaEdad());
		
		Select sCEdad = new Select(cmbEdad);
		sCEdad.selectByVisibleText(datosObject.getTipoEdad());
		
		txtEdadMinima.sendKeys(datosObject.getEdadMinima());
		
		txtEdadMaxima.sendKeys(datosObject.getEdadMaxima());
		
		
		txtTelefono.sendKeys(datosObject.getColumnaTelefono());
		
		Select sCTelefono = new Select (cmbTelefono);
		sCTelefono.selectByVisibleText(datosObject.getTipoTelefono());
		
		Select SETelefono = new Select(cmbEjemploTelefono);
		SETelefono.selectByVisibleText(datosObject.getEjemploTelefono());
		
		
		txtPais.sendKeys(datosObject.getColumnaPais());
		
		Select sCPais = new Select (cmbPais);
		sCPais.selectByVisibleText(datosObject.getTipoPais());
		
		
		txtDireccion.sendKeys(datosObject.getColumnaDireccion());
		
		Select sCDireccion = new Select(cmbDireccion);
		sCDireccion.selectByVisibleText(datosObject.getTipoDireccion());
		
		rdbSolapa.click();
		
		btnGenerar.click();
	}
	
}
