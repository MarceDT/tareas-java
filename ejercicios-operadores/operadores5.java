
import javax.swing.JOptionPane;

  public class operadores5{
    public static void main(String[] args) {
        String contraseña=JOptionPane.showInputDialog(null, "Introduzca su contraseña porfavor:","calculadora de sueldo total" ,JOptionPane.QUESTION_MESSAGE);
        String txtsueldobase= JOptionPane.showInputDialog(null,"Introduzca su sueldo:" ,"calculadora de sueldo total" ,JOptionPane.QUESTION_MESSAGE);
		String txtmeses= JOptionPane.showInputDialog(null, "Introduzca la cantidad de meses trabajados: " ,"calculadora de sueldo total" ,JOptionPane.QUESTION_MESSAGE);
        
          double sueldito = Integer.parseInt(txtsueldobase);
          double meses = Integer.parseInt(txtmeses);
          double total = (sueldito- 10%sueldito)*meses;

          String confirmacion=JOptionPane.showInputDialog(null, "Introduzca su contraseña nuevamente porfavor:","Calculadora de sueldo total",JOptionPane.WARNING_MESSAGE);

      if (confirmacion.equals(contraseña))
{
     JOptionPane.showMessageDialog(null, "Su sueldo total es: " +total+" Gs","Exito!", JOptionPane.INFORMATION_MESSAGE);
} else{
     JOptionPane.showMessageDialog( null, "Su contraseña no es correcta.", "ERROR", JOptionPane.ERROR_MESSAGE );
}
    }
  }