import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.CollectionCondition.exactTexts;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class WikiSearch {
    @Nested
    class SelenideWikiSearch{

        @BeforeAll
        static void beforeAll() {
            Configuration.browserSize = "1920x1080";
//            Configuration.browser = "chrome";
//            chromeConfiguration.baseUrl = "";
            Configuration.pageLoadStrategy = "eager";
//            Configuration.holdBrowserOpen = true;
        }

        @Test
        void findSelenideWikiSearch() {
            //переход на страницу гитхаба
            open("https://github.com/");
            $("[data-action='click:qbsearch-input#searchInputContainerClicked']").click();

            //ввод значения для поиска
            $("#query-builder-test").setValue("selenide").pressEnter();
            $$("[data-testid='results-list']").first().$("a").click();

            //переход во вкладку Wiki
            $("#wiki-tab").click();

            //проверка текста Soft assertions
            $("#wiki-body").shouldHave(text("Soft assertions"));
            $$("a").findBy(text("Soft assertions")).click();

            //проверка наличия примера о JUnit5
            $("#repo-content-pjax-container").shouldHave(text("JUnit5"));



//            sleep(10000);


        }


    }
}
