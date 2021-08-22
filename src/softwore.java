import language.I18NFactory;
import language.I18n;

public class softwore {
    public static void main(String[] args) {
            I18n i18n = I18NFactory.getI18NObject("Italy");
            System.out.println(i18n.getTitle());

    }
}

