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
public class Fahrzeug
{
    private short reifen;
    private String farbe;
    private short PS;
    private short tueren;
    private boolean gestartet;
    private short geschwindigkeit;
    public static int anzahl;
    
    void starten()
    {
        gestartet=true;
    }
    void stoppen()
    {
        gestartet=false;
    }
    void beschleunigen(short aenderung)
    {
        if (gestartet==true && geschwindigkeit <=250)
        {
            geschwindigkeit += aenderung;
        }
        else
        {
            System.out.println("Das Fahrzeug kann nicht beschleunigt werden!");
        }
         
    }
    void bremsen(short aenderung)
    {
        if(gestartet==true && geschwindigkeit>0)
        {
            geschwindigkeit -= aenderung;
        }
        else
        {
            System.out.println("Das Fahrzeug kann nicht gebremst werden!");
        }
    }
    
    public short getReifen()
    {
        return reifen;
    }
    public String getFarbe()
    {
        return farbe; 
    }
    public short getPS()
    {
        return PS;
    }
    public short getTueren()
    {
        return tueren;
    }
    public boolean getGestartet()
    {
        return gestartet;
    }
    public short getGeschwindigkeit()
    {
        return geschwindigkeit;
    }
    public static int getAnzahl()
    {
        return anzahl;
    }
    
    public void setReifen(short r)
    {
        reifen=r;
    }
    public void setFarbe(String f)
    {
        farbe=f;
    }
    public void setPS(short ps)
    {
        PS=ps;
    }
    public void setTueren(short t)
    {
        tueren=t;
    }
    public void setGestartet(boolean ge)
    {
        gestartet=ge;
    }
    public void setGeschwindigkeit(short g)
    {
        geschwindigkeit=g;
    }
    public void setAnzahl(int a)
    {
        anzahl=a;
    }

    public Fahrzeug(short reifen,short PS, short tueren, boolean gestartet, short geschwindigkeit)
    {
        this.reifen = reifen;
        this.PS = PS;
        this.tueren = tueren;
        this.gestartet = gestartet;
        this.geschwindigkeit = geschwindigkeit;
    }
    
    
    
    
    
}
