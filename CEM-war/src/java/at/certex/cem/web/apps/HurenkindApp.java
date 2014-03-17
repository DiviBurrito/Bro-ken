/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package at.certex.cem.web.apps;

import javax.faces.view.ViewScoped;
import javax.inject.Named;

/**
 *
 * @author Burrito
 */
@ViewScoped
public class HurenkindApp implements App {

    @Override
    public String getIcon() {
        return "/img/apps/calendar.png";
    }

    @Override
    public String getName() {
        return "Hurenkind";
    }
    
    public void run() {
        System.out.println("asfasöjdföasdjfösadfjöosodf");
    }

    @Override
    public String getId() {
        return "hurenkind-app";
    }
    
}
