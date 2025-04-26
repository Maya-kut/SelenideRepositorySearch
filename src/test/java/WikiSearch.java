import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

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
            open("https://github.com/");
            $("[data-action='click:qbsearch-input#searchInputContainerClicked']").click();
//            $("#query-builder-test").setValue("selenide").pressEnter();
//            $$("ul.repo-list li").first().$("a").click();
            sleep(5000);


        }


    }
}
