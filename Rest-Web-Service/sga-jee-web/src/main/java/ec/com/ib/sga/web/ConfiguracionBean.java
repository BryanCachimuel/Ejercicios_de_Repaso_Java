package ec.com.ib.sga.web;

import javax.enterprise.context.ApplicationScoped;
import javax.faces.annotation.FacesConfig;
import static javax.faces.annotation.FacesConfig.Version.JSF_2_3;

/*
    Se agrega este procedimiento para indicar que como tenemos glassfish 5 se va a usar la versión de java server faces 2.3
    Nota: Esto en versiones posteriores ya no se utiliza 
*/

@FacesConfig(
        version=JSF_2_3
)
@ApplicationScoped
public class ConfiguracionBean {
    
}
