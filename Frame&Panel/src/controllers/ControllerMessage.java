/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import views.ViewMessage;
import models.ModelMessage;

public class ControllerMessage implements ActionListener{
    private final ViewMessage viewMessage;
    private final ModelMessage modelMessage;
    
    public ControllerMessage(ViewMessage viewMessage, ModelMessage modelMessage){
        this.viewMessage = viewMessage;
        this.modelMessage = modelMessage;
        this.viewMessage.jb_hola.addActionListener(this);
        this.viewMessage.jb_adios.addActionListener(this);
        initView();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==viewMessage.jb_hola)
            jb_holaActionPerformed();
        else if(e.getSource()==viewMessage.jb_adios)
            jb_adiosActionPerformed();
    }
    
    private void jb_holaActionPerformed(){
        modelMessage.setMessage("Hola Panel");
        viewMessage.jl_mensaje.setText(modelMessage.getMessage());
    }
    
    private void jb_adiosActionPerformed(){
        modelMessage.setMessage("Adios Panel");
        viewMessage.jl_mensaje.setText(modelMessage.getMessage());
    }
    
    private void initView(){
        viewMessage.jl_mensaje.setText(modelMessage.getMessage());
    }
}