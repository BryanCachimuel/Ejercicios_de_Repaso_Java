package salario_neto;

public class SalarioN {
    
    double sb, cb, a, ayp, an, isrt, ss, afore, sc, sind;
    String puesto = "";
    double horas = 0, 
           xhora = 0, 
           deducciones = 0, 
           percepciones = 0, 
           sn = 0,
           anios = 0;
   
   public void setEmpleado(String puesto, double horas, double anios){
       this.puesto = puesto;
       this.horas = horas;
       this.anios = anios;
   }
   
   
   public void setCuantoXHora(){
       switch(puesto){
           case "Ing. en Ciberseguridad":
               xhora = 70;
               break;
               
           case "Desarrollador FullStack":
               xhora = 55;
               break;
             
           case "Desarrollador Backend":
               xhora = 45;
               break;
               
            case "Desarrollador Frontend":
               xhora = 38;
               break;
             
            case "Analista de Base de Datos":
               xhora = 47;
               break;
               
            case "Asistente de Sistemas":
               xhora = 35;
               break;
               
            default:
                xhora = 0;
                break;
       }
   }
   
   public double getSueldo(){
       this.sb = horas *  xhora;
       return getRedondear(sb);
   }
   
   public double getCanasta(){
       this.cb = sb *  0.06;
       return getRedondear(cb);
   }
   
   public double getApoyo(){
       this.a = sb *  0.03;
       return a;
   }
   
   public double getAsistencia(){
       this.ayp = sb *  0.025;
       return getRedondear(ayp);
   }
   
   public double getAntiguedad(){
       this.an = anios *  150;
       return getRedondear(an);
   }
   
   public double getISRT(){
       this.isrt = sb *  0.1;
       return getRedondear(isrt);
   }
   
   public double getSalud(){
       this.ss = sb *  0.035;
       return getRedondear(ss);
   }
   
   public double getAfore(){
       this.afore = sb *  0.05;
       return getRedondear(afore);
   }
   
   public double getSistema(){
       this.sc = sb *  0.03;
       return getRedondear(sc);
   }
   
   public double getSindicato(){
       this.sind = sb *  0.01;
       return getRedondear(sind);
   }
   
   public double getPercepciones(){
       this.percepciones = sb + cb + a + ayp + an;
       return getRedondear(percepciones);
   }
   
   public double getDeducciones(){
       this.deducciones = isrt + ss + afore + sc + sind;
       return getRedondear(deducciones);
   }
   
   public double getSalarioNeto(){
       this.sn = percepciones -  deducciones;
       return getRedondear(sn);
   }
   
   public double getRedondear(double n){
       double r = Math.round(n * 100)/100;
       return r;
   }
}
