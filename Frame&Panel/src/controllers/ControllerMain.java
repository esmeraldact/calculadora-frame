/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import views.ViewMain;
import models.ModelMain;
import views.ViewMessage;

public class ControllerMain implements ActionListener{
    ViewMain viewMain;
    ViewMessage viewMessage;
    ModelMain modelMain;
    
    public ControllerMain(ViewMain viewMain,ViewMessage viewMessage,ModelMain modelMain){
        this.viewMain = viewMain;
        this.viewMessage = viewMessage;
        this.modelMain = modelMain;
        this.viewMain.jmiMessage.addActionListener(this);
        initView();
    }

  

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==viewMain.jmiMessage)
            jmiMessageActionPerformed();
    }
    
    public void jmiMessageActionPerformed(){
        this.viewMain.setContentPane(viewMessage);
        this.viewMain.revalidate();
        this.viewMain.repaint();
    }
    
    private void initView(){
        this.viewMain.setTitle("Hola  Panel");
        this.viewMain.setLocationRelativeTo(null);
        this.viewMain.setVisible(true);
    }
}