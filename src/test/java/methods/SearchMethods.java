package methods;


import org.testng.Assert;
import contants.*;
import java.net.MalformedURLException;

public class SearchMethods extends BaseMethod
{
    public void initializeTest() throws MalformedURLException {
        initializeTest2();
    }

    //If i clicked a search, app is crashed. I didn't reach any search item
    public void writeAndSearch(String text) throws InterruptedException {
    }


    public void clickSearch() throws InterruptedException {
        untilElementAppear(objectRepo.buttonSearch);
        click(objectRepo.buttonSearch);
    }

    public void elementCheckedSearch() {
        elementConfirmed(objectRepo.buttonSearch);
    }


}
