package methods;


import contants.objectRepo;

public class MoreOptionMethods extends BaseMethod
{
    public void checkedMoreOptions() throws InterruptedException {
        elementConfirmed(objectRepo.buttonMoreOptions);
    }
    public void checkedLoginToDesigner() throws InterruptedException {
        elementConfirmed(objectRepo.buttonLoginToDesigner);
    }
    public void checkedMoreAbout() throws InterruptedException {
        elementConfirmed(objectRepo.buttonMoreAbout);
    }

    public void clickedMoreOptions() throws InterruptedException {
        untilElementAppear(objectRepo.buttonMoreOptions);
        click(objectRepo.buttonMoreOptions);
    }
    public void clickedLoginToDesigner() throws InterruptedException {
        untilElementAppear(objectRepo.buttonLoginToDesigner);
        click(objectRepo.buttonLoginToDesigner);
    }
    public void clickedMoreAbout() throws InterruptedException {
        untilElementAppear(objectRepo.buttonMoreAbout);
        click(objectRepo.buttonMoreAbout);
    }

}
