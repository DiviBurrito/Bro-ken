/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package at.certex.cem.web.apps;

import java.io.Serializable;

/**
 *
 * @author Burrito
 */
public interface App extends Serializable {
    public String getId();
    public String getIcon();
    public String getName();
    public void run();
}
