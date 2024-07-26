import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;
import org.junit.Test;


public class TestExample {
    @Test
    public void test(Page page){
        page.navigate("https://www.wikipedia.org/");
        page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("English 6,847,000+ articles")).click();
        page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Independence Day")).click();
        page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Australia")).first().click();
    }
}
