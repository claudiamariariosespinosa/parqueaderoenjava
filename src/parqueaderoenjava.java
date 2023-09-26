import javax.swing.*;
import java.beans.JavaBean;


class main {



    public static void main  (String[] args) {


        String placa;
        String nombre;
        double horaInicio,horasalida,valor1,resta1,valor2;
        int carro=2000,moto=1000,vehiculo;

        JOptionPane.showInternalMessageDialog(null,"======================================");
        JOptionPane.showInternalMessageDialog(null,"Bienvenidos al parqueadero de Claudia ");
        vehiculo=Integer.parseInt(JOptionPane.showInputDialog("ingrese el numero 1 si su vehiculo es un carro de lo contrario indique 2 si es moto"));


        placa =JOptionPane.showInputDialog("Por favor ingrese la placa del vehiculo:");
        nombre = JOptionPane.showInputDialog("Por favor ingrese el nombre del conductor:");

        horaInicio = java.lang.Double.parseDouble(JOptionPane.showInputDialog("Por favor ingrese la hora de llegada:"));



        JOptionPane.showInternalMessageDialog(null,"su nombre es: " + nombre
                +"          su placa es: "+placa
                + "     su hora de entrada es: " + horaInicio);


        horasalida =  java.lang.Double.parseDouble(JOptionPane.showInputDialog("Por favor ingrese la hora de salida: "));
        /*if (vehiculo==1){resta1 = horasalida - horaInicio;

            double numero = resta1;
            long resultado = Math.round( numero );


            valor2 = resultado *carro;


            JOptionPane.showInternalMessageDialog(null,"el valor a pagar es:" + valor2);

            JOptionPane.showInternalMessageDialog(null,"horas que estuvo en el parqueadero:" + resultado);
        }

        else {resta1 = horasalida - horaInicio;

            double numero = resta1;
            long resultado = Math.round( numero );

            valor2 = resultado *moto;

            JOptionPane.showInternalMessageDialog(null,"el valor a pagar es:" + valor2);

            JOptionPane.showInternalMessageDialog(null,"horas que estuvo en el parqueadero:" + resultado);



        }*/

        switch ((int ) vehiculo) {
            case 1:

                resta1 = horasalida - horaInicio;

                double numero = resta1;
                long resultado = Math.round( numero );

                valor2 = resultado *carro;

                JOptionPane.showInternalMessageDialog(null,"el valor a pagar es:" + valor2);

                JOptionPane.showInternalMessageDialog(null,"horas que estuvo en el parqueadero:" + resultado);
                break;
            case 2:
                resta1 = horasalida - horaInicio;

                double numer = resta1;
                long resultad = Math.round( numer );

                valor2 = resultad *moto;

                JOptionPane.showInternalMessageDialog(null,"el valor a pagar es:" + valor2);

                JOptionPane.showInternalMessageDialog(null,"horas que estuvo en el parqueadero:" + resultad);



                break;
        }
        Default : JOptionPane.showInternalMessageDialog(null,"ese tipo de vehiculo no se admite en el parqueadero:");






    }
}

