
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

    public Date getDatum()
    {
        return datum;
    }

    public int getTemperatur()
    {
        return temperatur;
    }

    public int getLuftfeuchtigkeit()
    {
        return luftfeuchtigkeit;
    }
    
    public static WetterWert createWert(String line)
    {
        String[] parts = line.split(",");
        Date date = new Date();
        date.setTime(Long.parseLong(parts[0]));
        return new WetterWert(date, Integer.parseInt(parts[1]), Integer.parseInt(parts[2]));
    }
    
    public String toString()
    {
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM - HH:mm:ss");
        return String.format("%s - %d° - %d%s", sdf.format(datum), temperatur, luftfeuchtigkeit, "%" );
    }
}
