
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import javax.swing.AbstractListModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Christoph Mautner
 */
public class WetterBL extends AbstractListModel
{
    private ArrayList<WetterWert> wetterliste = new ArrayList<>();
    
    public void add(WetterWert ww)
    {
        wetterliste.add(ww);
        fireIntervalAdded(this, wetterliste.size()-1, wetterliste.size()-1);
    }
    
    public void speichern(File f)
    {
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(f)))
        {
            for (WetterWert ww : wetterliste) 
            {
                bw.append(""+ww.getDatum().getTime()+",");
                bw.append(""+ww.getTemperatur()+",");
                bw.append(""+ww.getLuftfeuchtigkeit());
                bw.newLine();
            }
        }catch(Exception ex)
        {
            ex.printStackTrace();
        }
    }
    
    public void load(File f)
    {
        try(BufferedReader br = new BufferedReader(new FileReader(f)))
        {
            String line ="";
            while((line=br.readLine())!=null)
            {
                WetterWert ww = WetterWert.createWert(line);
                add(ww);
            }
        }catch(Exception ex)
        {
            ex.printStackTrace();
        }
 
    }
    
    @Override
    public int getSize()
    {
        return wetterliste.size();
    }

    @Override
    public Object getElementAt(int i)
    {
        return wetterliste.get(i);
    }
    
}
