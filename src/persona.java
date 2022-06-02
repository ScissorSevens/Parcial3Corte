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
public class persona {
   private int EdadPersona;
   private String Nompersona;
   private String Genero;
   private int Estrato;
   
   persona(int idPersona,String Nompersona){
   this.Nompersona=Nompersona;
   this.EdadPersona=idPersona;
   this.Estrato=Estrato;
   }
   persona(int idPersona,String Nompersona,int Estrato,String Genero){
   this.Nompersona=Nompersona;
   this.EdadPersona=idPersona;
   this.Estrato=Estrato;
   this.Genero=Genero;
   }
   
   public String SalarioAPagar(int EdadPersona){
       String cadena="";
       this.EdadPersona=EdadPersona;
   if (EdadPersona>50){
   cadena+="Su salario mensual debido y sus años de experiencia es de $60000 pesos ";
   
   }else if (EdadPersona<50){
   
    cadena+="Su salario mensual debido y sus años de experiencia es de $50000 pesos ";
   
   }     
       return cadena; 
   }
   public void MostrarDatos(){
   JOptionPane.showMessageDialog(null,"Tus datos a confirman son:"
           + "\n1."+Nompersona
           +"\n2."+EdadPersona);
   JOptionPane.showMessageDialog(null,"Informacion Verificada");
   
   }
    public void MostrarDatos1(){
   JOptionPane.showMessageDialog(null,"Tus datos a confirman son:"
           + "\n1."+Nompersona
           +"\n2."+EdadPersona
           +"\n3."+Estrato
           +"\n4."+Genero);
   JOptionPane.showMessageDialog(null,"Informacion Verificada");
   }
    
    
}
