import com.microsoft.playwright.*;
import com.microsoft.playwright.options.AriaRole;

public class Example {
    public static void main(String[] args) {
        try (Playwright playwright = Playwright.create()) {
            Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
            BrowserContext context = browser.newContext();
            Page page = context.newPage();
            page.navigate("https://www.wikipedia.org/");
            page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("English 6,847,000+ articles")).click();
            page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Snooker").setExact(true)).click();
            page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Mark Selby")).first().click();

        }

    }
}
