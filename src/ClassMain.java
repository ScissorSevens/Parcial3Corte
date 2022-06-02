/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dekuw
 */
import javax.swing.JOptionPane;
public class ClassMain {
    public static void main(String[]args){
    persona p1;
    int EdadPersona;
    String Nompersona;
    String Genero;
    int Estrato;
    boolean entrada =false;
    do {
        int op;
        char res;
    op=Integer.parseInt(JOptionPane.showInputDialog(null,"Hola, este es un programa que te ayudara saber cual es tu Salario al mes."
            + "\n Antes de Empesar elije una de las dos opciones"
            + "\n1.Registrarte con solo Nonbre y Edad "
            + "\n2.Registrarte con Nombre, Edad, Estrato,Genero"
            + "\n3.Salir"));
    switch(op){
        case 1:
    Nompersona=JOptionPane.showInputDialog(null,"Porfavor dame tu Nombre");
    EdadPersona=Integer.parseInt(JOptionPane.showInputDialog(null,"Por favor dame tu Edad"));
    p1=new persona(EdadPersona,Nompersona);  
    p1.MostrarDatos();
    JOptionPane.showMessageDialog(null,p1.SalarioAPagar(EdadPersona));
           break;
        case 2:
           Nompersona=JOptionPane.showInputDialog(null,"Porfavor dame tu Nombre");
    EdadPersona=Integer.parseInt(JOptionPane.showInputDialog(null,"Por favor dame tu Edad"));
    Genero=JOptionPane.showInputDialog(null,"Porfavor dame tu Genero");
    Estrato=Integer.parseInt(JOptionPane.showInputDialog(null,"Por favor dame el estrato al que perteneces, introduce un numero   de 1 a 4  "
            + "\n Elije una opcion:"
            + "\n1.Grupo A"
            + "\n2.Grupo B"
            + "\n3.Grupo C"
            + "\n4.Grupo D"));
    p1=new persona(EdadPersona,Nompersona,Estrato,Genero);  
    p1.MostrarDatos1();
    
     JOptionPane.showMessageDialog(null,p1.SalarioAPagar(EdadPersona));
           break;
        case 3:
            int Op;
            Op=Integer.parseInt(JOptionPane.showInputDialog(null,"Deseas Sair? "
                    + "\n1.Si"
                    + "\n.2No"));
            if (Op==1){
            entrada=true;
            
            }else{
        entrada=false;
        break;
        }
    
        default:
            JOptionPane.showMessageDialog(null,"Opcion Invalida");
                   
    
    
    }
     
    }while (!entrada);
    
    
    
    
    
    
    
    
        
        
    }
}
