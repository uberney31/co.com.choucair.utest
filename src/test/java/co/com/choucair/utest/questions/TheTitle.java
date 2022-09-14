package co.com.choucair.utest.questions;

import co.com.choucair.utest.model.DataFormRegister;
import co.com.choucair.utest.userinterface.LocatorUtestLabel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import java.util.List;

public class TheTitle implements Question <Boolean> {
    private List<DataFormRegister> title;
    public TheTitle(List<DataFormRegister>title){
        this.title=title;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;
        String titlePage= Text.of(LocatorUtestLabel.LABEL_VALIDATE_REGISTER).viewedBy(actor).asString();
        if(title.equals(titlePage)){
            result =true;
        }
        else{
            result=false;
        }
        return result;
    }
    public static TheTitle is(List<DataFormRegister>textCompleteRegister){
        return new TheTitle(textCompleteRegister);
    }
}
