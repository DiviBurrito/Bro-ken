package at.certex.cem.web.beans;

import java.io.Serializable;
import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Inject;

/**
 *
 * @author Burrito
 */
@RequestScoped
public class MessageBean implements Serializable{
    
    public void addMessage(String text) {
        FacesContext context = FacesContext.getCurrentInstance();
        FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, text, text); 
        context.addMessage(null, msg);
    }
}
