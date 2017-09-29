/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;
import models.ModelMenor;
import views.ViewMenor;

public class ControllerMenor {
    ModelMenor    model_menor;
    ViewMenor     view_menor;
    
    public ControllerMenor(ModelMenor model_menor,ViewMenor view_menor){
        this.model_menor = model_menor;
        this.view_menor = view_menor;
        view_menor.jbtn_menor.addActionListener(e -> jbtn_menor_click());
     
        initView();
    }//constructor
    
    public void initView(){
    view_menor.jtf_n1.setText(String.valueOf(model_menor.getN1()));
    view_menor.jtf_n2.setText(String.valueOf(model_menor.getN2()));
    view_menor.jtf_n3.setText(String.valueOf(model_menor.getN3()));
    view_menor.jtf_m.setText(String.valueOf(model_menor.getM()));
    
    
    
    view_menor.setVisible(true);
    
    }
    public void jbtn_mayor_click(){
    model_menor.setN1(Integer.parseInt(view_menor.jtf_n1.getText()));
    model_menor.setN2(Integer.parseInt(view_menor.jtf_n2.getText()));
    model_menor.setN3(Integer.parseInt(view_menor.jtf_n3.getText()));
    
    model_menor.menor();
    view_menor.jtf_m.setText(String.valueOf(model_menor.getM()));
    
    }

    private void jbtn_menor_click() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}//class
