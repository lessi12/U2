/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package at.ac.fh_kufstein.uebung_2.Classes;

/**
 *
 * @author lessi
 */
public class Auto extends Fahrzeug
{
    private boolean klimaanlage;
    private short airbags;
    private color farben;
    
    public enum color
    {
        silver, red, black, blue, white;
    }
   
    public Auto(short airbags, short reifen, short PS, short tueren,short geschwindigkeit, color f)
    {
        super(reifen, PS, tueren, false, geschwindigkeit);
        this.klimaanlage = false;
        this.airbags = airbags;
        farben = f;
    }
    public Auto(short airbags, short reifen, short PS, short tueren,short geschwindigkeit)
    {
        super(reifen, PS, tueren, false, geschwindigkeit);
        this.klimaanlage = false;
        this.airbags = airbags;
        farben = color.black;
    }
    
    

    
    public color getFarben()
    {
        return farben;
    }

    public void setFarbe(color f)
    {
        this.farben = f;
    }
    
  
    void klimaanlageAn()
    {
        if(klimaanlage==false)
        {
            klimaanlage=true;
        }
        else
        {
            System.out.println("Klimaanlage läuft bereits!");
        }
    }
    void klimaanlageAus()
    {
        if(klimaanlage==true)
        {
            klimaanlage=false;
        }
        else
        {
            System.out.println("Klimaanlage ist bereits aus!");
        }
    }
    public boolean getKlimaanlage()
    {
        return klimaanlage;
    }
    public short getAirbags()
    {
        return airbags;
    }
    public void setKlimaanlage(boolean k)
    {
        klimaanlage=k;
    }
    public void setAirbags(short air)
    {
        airbags=air;
    }
    
    @Override
    public String toString()
    {
        return "Mein Auto hat " + getPS() + "und fährt mit " + getGeschwindigkeit() + " km/h ";
    }
}
