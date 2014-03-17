package at.certex.cem.web.beans;

import at.certex.cem.web.apps.App;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.enterprise.inject.Any;
import javax.enterprise.inject.Instance;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import org.primefaces.model.menu.DefaultMenuItem;
import org.primefaces.model.menu.DefaultMenuModel;
import org.primefaces.model.menu.MenuModel;

/**
 *
 * @author Burrito
 */
@Named
@ViewScoped
public class AppsBean implements Serializable{
    @Inject
    @Any
    private Instance<App> apps;
    
    private MenuModel appMenuModel;
    
    @PostConstruct
    public void init()
    {
        this.appMenuModel = new DefaultMenuModel();
        for(final App app: apps)
        {
            DefaultMenuItem item = new DefaultMenuItem(app.getName(), app.getIcon());
            item.setCommand(String.format("#{appsBean.run('%s')}", app.getId()));
            
            this.appMenuModel.addElement(item);
        }
    }

    public MenuModel getAppMenuModel() {
        return appMenuModel;
    }
    
    public void run(String appId)
    {
        for(App app: apps)
            if(app.getId().equals(appId))
                app.run();
    }

    
}
