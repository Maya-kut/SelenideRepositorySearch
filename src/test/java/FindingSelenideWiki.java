import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.CollectionCondition.exactTexts;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class FindingSelenideWiki {
        @BeforeAll
        static void setUpConfiguration() {
            Configuration.browserSize = "1920x1080";
            Configuration.browser = "chrome";
            Configuration.pageLoadStrategy = "eager";
//            Configuration.holdBrowserOpen = true;
        }

        @Test
        void tryToFindSelenideWiki() {
            open("https://github.com/");
            $("[data-action='click:qbsearch-input#searchInputContainerClicked']").click();

            $("#query-builder-test").setValue("selenide").pressEnter();
            $$("[data-testid='results-list']").first().$("a").click();

            $("#wiki-tab").click();

            $("#wiki-body").shouldHave(text("Soft assertions"));
            $$("a").findBy(text("Soft assertions")).click();

            $("#wiki-body").shouldHave(text("JUnit5"));

       


    }
}
