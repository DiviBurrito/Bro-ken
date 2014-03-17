package at.certex.cem.web.apps;

import at.certex.cem.web.beans.MessageBean;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;


/**
 *
 * @author Burrito
 */
@ViewScoped
public class CalendarApp implements App {

    @Inject
    private MessageBean messageBean;
    
    @Override
    public String getIcon() {
        return "/img/apps/calendar.png";
    }

    @Override
    public String getName() {
        return "Calendar";
    }

    @Override
    public void run() {
        this.messageBean.addMessage("Orschloch");
    }

    @Override
    public String getId() {
        return "calendar-app";
    }
    
}
