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
public class Wasserfahrzeug extends Fahrzeug
{
    private double tiefgang;
    private short schrauben;
    private double ladung;

    public Wasserfahrzeug(double tiefgang, short schrauben, double ladung, short reifen,short PS, short tueren, short geschwindigkeit)
    {
        super(reifen,PS, tueren, false, geschwindigkeit);
        this.tiefgang = tiefgang;
        this.schrauben = schrauben;
        this.ladung = ladung;
        anzahl +=1;
    }

    
    
    void entladen()
    {
        ladung=0;
    }
    
    public double getTiefgang()
    {
        return tiefgang;
    }
    public short getSchrauben()
    {
        return schrauben;
    }
    public double getLadung()
    {
        return ladung;
    }
    public void setTiefgang(double t)
    {
        tiefgang=t;
    }
    public void setSchrauben(short s)
    {
        schrauben=s;
    }
    public void setLadung(double l)
    {
        ladung=l;
    }
}
