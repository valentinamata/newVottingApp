/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import model.Users;

public interface JavaFacade {
   public String getPersonAsJson(String username);
   public Users delete(String username);
   public Users addPersonFromGson(String json);
}
