package by.Elinext.pages;

import by.Elinext.asserts.AssertPage;
import lombok.Getter;

@Getter
public class HeritagePage extends AbstractPage {

    @Override
    public HeritagePage load() {
        new AssertPage()
                .assertLoad("Our Heritage")
                .assertUrl("http://qa.yotec.net/we-are-wabash/our-heritage");
        return this;
    }
}
