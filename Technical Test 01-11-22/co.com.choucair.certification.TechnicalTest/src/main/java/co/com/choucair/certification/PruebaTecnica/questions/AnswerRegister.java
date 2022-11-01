package co.com.choucair.certification.PruebaTecnica.questions;


import co.com.choucair.certification.PruebaTecnica.model.Person;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static co.com.choucair.certification.PruebaTecnica.userinterface.UtestFinishRegister.*;


public class AnswerRegister implements Question<Boolean> {

    private Person dataPerson;

    public AnswerRegister(Person dataPerson) {
        this.dataPerson = dataPerson;
    }

    public static AnswerRegister tittle(Person dataPerson){
        return new AnswerRegister(dataPerson);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;
        String tittle = Text.of(H1_TITTLE).viewedBy(actor).asString();
        System.out.print(tittle);
        System.out.print(dataPerson.getTittle());
        if(dataPerson.getTittle().equals(tittle)){

            result= true;

        }else{
            result= false;

        }
        return result;
    }
}
