package ud08.examen.Trim2ev;

import java.util.Comparator;

public class AmigosComparator implements Comparator<Usuario>{
    @Override
    public int compare(Usuario usu0, Usuario usu1){
        int s1 = usu1.amigosDeGenero('m').size();
        int s0 = usu0.amigosDeGenero('m').size();
        int res = s1 - s0;
        if (res == 0)
            res= usu0.getFechaRegistro().compareTo(usu1.getFechaRegistro());
        return res;
    }
}
