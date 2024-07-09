import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class GasMileageCalculatorTest{

	@Test
	public void testCanCalculateMileagePerGallon(){


	// given

	GasMileageCalculator calculator = new GasMileageCalculator();
	//when
	double numberOfMilesDriven = 30.00;
	double numberOfGallons =  20;
	double milesPerGallon = calculator.computeMilesPerGallon(numberOfMilesDriven,  numberOfGallons);
	//assert
	assertEquals(1.5,milesPerGallon );



	}
	@Test
	public void testCanCalculateMileagePerGallon(){


	// given

	GasMileageCalculatorApp calculator = new GasMileageCalculatorApp();
	//when
	double numberOfMilesDriven = 30.00;
	double numberOfGallons =  3;
	double milesPerGallon = calculator.computeMilesPerGallon(numberOfMilesDriven,  numberOfGallons);
	//assert
	assertEquals(2.5,milesPerGallon );
	
	}





}