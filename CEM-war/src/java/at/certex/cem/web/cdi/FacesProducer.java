package at.certex.cem.web.cdi;

import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Produces;
import javax.faces.context.FacesContext;

/**
 *
 * @author Burrito
 */
public class FacesProducer {
    
    @Produces @RequestScoped
    public static FacesContext getCurrentFacesContext() {
        return FacesContext.getCurrentInstance();   
    }
}
