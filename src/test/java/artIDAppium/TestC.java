package artIDAppium;

import org.testng.Assert;
import org.testng.annotations.Test;


public class TestC extends FirstOne {
	
    @Test(priority=0)
    public void titleAssetion() {
    	MainCl mainPage = new MainCl(driver);  
        Assert.assertEquals(MainCl.expectedTitle, mainPage.mainPageTitle());
    }
    
    
    @Test(priority=1)
    public void validateCheckoutButtonWithEmptyFields() {
    	MainCl mainPage = new MainCl(driver); 
    	Assert.assertTrue(mainPage.checkoutButton().isEnabled());        
    }
    
  
    @Test(priority=2)
    public void validateMainItems() {
    	MainCl mainPage = new MainCl(driver); 
    	
        Assert.assertEquals(MainCl.expectedZebraValue, mainPage.arrOfAnimals(2)[0]);
        Assert.assertEquals(MainCl.expectedLionValue, mainPage.arrOfAnimals(3)[0]);
        Assert.assertEquals(MainCl.expectedElephantValue, mainPage.arrOfAnimals(4)[0]); 
        Assert.assertEquals(MainCl.expectedGiraffeValue, mainPage.arrOfAnimals(5)[0]);    
    }    
    
	
    @Test(priority=3)
    public void californiaTotalsTest(){
    	MainCl mainPage = new MainCl(driver);
    	double totals = mainPage.pricesTotals(MainCl.CALITAXES)[0];
    	ResultsP resultsPage = mainPage.navigateToResultsPage(MainCl.CALISTATE);
   
    	Assert.assertEquals(totals, resultsPage.subtotalValueFromResultsPage());
    }
    
    
    @Test(priority=4)
    public void californiaSubTotalsTest(){
    	MainCl mainPage = new MainCl(driver);
    	double subTotals = mainPage.pricesTotals(MainCl.CALITAXES)[1];
    	ResultsP resultsPage = mainPage.navigateToResultsPage(MainCl.CALISTATE);
   
    	Assert.assertEquals(subTotals, resultsPage.taxesValueFromResultsPage());
    }
    
    
    @Test(priority=5)
    public void californiaPercentsTest(){
    	MainCl mainPage = new MainCl(driver);
    	double percents = mainPage.pricesTotals(MainCl.CALITAXES)[2];
    	ResultsP resultsPage = mainPage.navigateToResultsPage(MainCl.CALISTATE);
   
    	Assert.assertEquals(percents, resultsPage.totalValueFromResultsPage());
    }
    
    
    @Test(priority=6)
    public void nyTestTotal(){
    	MainCl mainPage = new MainCl(driver);
    	double totals = mainPage.pricesTotals(MainCl.NYTAXES)[0];
    	ResultsP resultsPage = mainPage.navigateToResultsPage(MainCl.NYSTATE);
   
    	Assert.assertEquals(totals, resultsPage.subtotalValueFromResultsPage());
    }
    
    
    @Test(priority=7)
    public void nyTestSubTotal(){
    	MainCl mainPage = new MainCl(driver);
     	double subTotals = mainPage.pricesTotals(MainCl.NYTAXES)[1];
    	ResultsP resultsPage = mainPage.navigateToResultsPage(MainCl.NYSTATE);
   
    	Assert.assertEquals(subTotals, resultsPage.taxesValueFromResultsPage());
    }
    
    
    @Test(priority=8)
    public void nyTestPercent(){
    	MainCl mainPage = new MainCl(driver);
    	double percents = mainPage.pricesTotals(MainCl.NYTAXES)[2];
    	ResultsP resultsPage = mainPage.navigateToResultsPage(MainCl.NYSTATE);

    	Assert.assertEquals(percents, resultsPage.totalValueFromResultsPage());
    }
   
    
    @Test(priority=9)
    public void mnTestTotal(){
    	MainCl mainPage = new MainCl(driver);
    	double totals = mainPage.pricesTotals(MainCl.MNTAXES)[0];  	
    	ResultsP resultsPage = mainPage.navigateToResultsPage(MainCl.MNSTATE);
   
    	Assert.assertEquals(totals, resultsPage.subtotalValueFromResultsPage());
    }
    
    
    @Test(priority=10)
    public void mnTestSubTotal(){
    	MainCl mainPage = new MainCl(driver);
     	double subTotals = mainPage.pricesTotals(MainCl.MNTAXES)[1];
    	ResultsP resultsPage = mainPage.navigateToResultsPage(MainCl.MNSTATE);
   
    	Assert.assertEquals(subTotals, resultsPage.taxesValueFromResultsPage());
    }
    
    
    @Test(priority=11)
    public void mnTestPercent(){
    	MainCl mainPage = new MainCl(driver);
    	double percents = mainPage.pricesTotals(MainCl.MNTAXES)[2];   	
    	ResultsP resultsPage = mainPage.navigateToResultsPage(MainCl.MNSTATE);

    	Assert.assertEquals(percents, resultsPage.totalValueFromResultsPage());
    }
    
   
    @Test(priority=12)
    public void otherStateTestTotal(){
    	MainCl mainPage = new MainCl(driver);
    	double totals = mainPage.pricesTotals(MainCl.OTHERSTATES)[0];
    	ResultsP resultsPage = mainPage.navigateToResultsPage(MainCl.OREGONSTATE);
    	
    	Assert.assertEquals(totals, resultsPage.subtotalValueFromResultsPage());
    }
    
    
    @Test(priority=13)
    public void otherStateTestSubTotal(){
    	MainCl mainPage = new MainCl(driver);
     	double subTotals = mainPage.pricesTotals(MainCl.OTHERSTATES)[1];
    	ResultsP resultsPage = mainPage.navigateToResultsPage(MainCl.OREGONSTATE);
    	
    	Assert.assertEquals(subTotals, resultsPage.taxesValueFromResultsPage());
    }
    
    
    @Test(priority=14)
    public void otherStatePercent(){
    	MainCl mainPage = new MainCl(driver);
    	double percents = mainPage.pricesTotals(MainCl.OTHERSTATES)[2];
    	ResultsP resultsPage = mainPage.navigateToResultsPage(MainCl.OREGONSTATE);

    	Assert.assertEquals(percents, resultsPage.totalValueFromResultsPage());
    }
    
}
