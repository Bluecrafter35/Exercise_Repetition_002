
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
