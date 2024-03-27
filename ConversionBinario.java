import javax.swing.JOptionPane;

public class ConversionBinario {
    public static void main(String[] args) {
        
        String binario = JOptionPane.showInputDialog(null, "Ingrese un número binario de 16 dígitos:");

        if (binario.length() != 16 || !binario.matches("[01]+")) {
            JOptionPane.showMessageDialog(null, "El número binario ingresado no tiene 16 dígitos o no es válido.");
            return;
        }
       
        int decimal = Integer.parseInt(binario, 2);

        
        JOptionPane.showMessageDialog(null, 
            "Número Decimal: " + decimal + "\n" +
            "Número Octal: " + Integer.toOctalString(decimal) + "\n" +
            "Número Hexadecimal: " + Integer.toHexString(decimal).toUpperCase());
    }
}
