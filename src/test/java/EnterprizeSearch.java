import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.CollectionCondition.exactTexts;
import static com.codeborne.selenide.CollectionCondition.texts;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byTagAndText;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.$;

public class EnterprizeSearch {

            @BeforeAll
            static void setUpConfiguration() {
                Configuration.browserSize = "1920x1080";
                Configuration.browser = "chrome";  //но ведь метод Сonfiguration.browser по дефолту устанавливает хром
                Configuration.pageLoadStrategy = "eager";
            }

            @Test
            void tryToFindSelenideEnterprize() {

                open("https://github.com/");

//                $(".HeaderMenu-nav").find(byText("Solutions")).click(); - хочу оставить как второй вариант прохождения теста
                $(byTagAndText("button","Solutions")).hover();

//                $$("a").findBy(text("Enterprises")).click(); - хочу оставить как второй вариант прохождения теста
                $(byTagAndText("a","Enterprises")).click();

                $("#hero-section-brand-heading").shouldHave(text("The AI-powered"));
                $("#hero-section-brand-heading").shouldHave(text("developer platform"));



            }


        }


