import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.CollectionCondition.exactTexts;
import static com.codeborne.selenide.CollectionCondition.texts;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.$;

public class EnterprizeSearch {

            @BeforeAll
            static void beforeAll() {
                Configuration.browserSize = "1920x1080";
//            Configuration.browser = "chrome";
//            chromeConfiguration.baseUrl = "";
                Configuration.pageLoadStrategy = "eager";
//            Configuration.holdBrowserOpen = true;
            }

            @Test
            void findSelenideEnterprize() {
                //переход на страницу гитхаба
                open("https://github.com/");
                $(".HeaderMenu-nav").find(byText("Solutions")).click();
                $$("a").findBy(text("Enterprises")).click();

                $("#hero-section-brand-heading").shouldHave(text("The AI-powered"));
                $("#hero-section-brand-heading").shouldHave(text("developer platform"));

//            sleep(10000);


            }


        }


