
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Christoph Mautner
 */
public class WetterWert
{
    private Date datum;
    private int temperatur;
    private int luftfeuchtigkeit;

    public WetterWert(Date datum, int temperatur, int luftfeuchtigkeit)
    {
        this.datum = datum;
        this.temperatur = temperatur;
        this.luftfeuchtigkeit = luftfeuchtigkeit;
    }
    
    public String toString()
    {
        return String.format("%s", datum );
    }
}
