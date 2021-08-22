package language;

public class I18NFactory {
    public static I18n getI18NObject(String area){
        if(area.equals("china")){
            return new chinese();
        }else if(area.equals("Italy")){
            return new Italy();
        }else if(area.equals("japan")){
            return new japan();
        }else{
            return null;
        }
    }
}
