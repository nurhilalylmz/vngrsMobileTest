package methods;

import contants.*;
public class MenuFilterMethods extends BaseMethod
{
    public void menuFilterElementIsChecked() {
        elementConfirmed(objectRepo.buttonMenuFilter);
    }

    public void menuFilterElementIsClicked() throws InterruptedException {
        untilElementAppear(objectRepo.buttonMenuFilter);
        click(objectRepo.buttonMenuFilter);
    }

    public void popularDesignerNewsIsChecked() {
        elementConfirmed(objectRepo.buttonPopularDesign);
    }

    public void materialDesignIsChecked() {
        elementConfirmed(objectRepo.buttonMaterialDesign);

    }

    public void productHuntIsChecked() {
        elementConfirmed(objectRepo.buttonProductHunt);

    }

}
