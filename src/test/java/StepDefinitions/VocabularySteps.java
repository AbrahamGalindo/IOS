package StepDefinitions;

import Hooks.InitialHooks;
import Pages.*;
import io.cucumber.java.en.And;

public class VocabularySteps {

    HomePage homePage = new HomePage();
    VocabularyPage vocabularyPage = new VocabularyPage();

    @And("Admin select vocabulary evaluation")
    public void adminSelectVocabularyEvaluation() {
        homePage.adminClickVocabulary();
    }

    @And("Admin tap on begin item button for vocabulary")
    public void adminTapOnBeginItemButtonForVocabulary() {
        vocabularyPage.adminTapBeginItem();
    }

    @And("Admin select the correct option for vocabulary practice {int}")
    public void adminSelectTheCorrectOptionForVocabularyPractice(int item) {
        vocabularyPage.adminSelectTheCorrectResponse(InitialHooks.age, item);
    }

    @And("Admin tap on complete button for vocabulary")
    public void adminTapOnCompleteButtonForVocabulary() {
        vocabularyPage.adminTapCompleteButton();
    }

    @And("Admin enter the client age {int}")
    public void adminEnterTheClientAgeAge(int age) {
        InitialHooks.age = age;
        homePage.adminInsertAge(age);
    }

    @And("Admin tap on begin items button for vocabulary pictures")
    public void adminTapOnBeginItemsButtonForVocabularyPictures() {
        if ((InitialHooks.age == 5) || (InitialHooks.age == 6)) {
            vocabularyPage.adminTapBeginItemsForVocabularyPictures();
        }
    }

    @And("Client select the correct option for vocabulary pictures {int}")
    public void clientSelectTheCorrectOptionForVocabularyPictures(int item) {
        if ((InitialHooks.age == 5) || (InitialHooks.age == 6)) {
            vocabularyPage.clientSelectCorrectOptionForVocabularyPictures(item);
        }
    }
}
