public class Persona {

    private double peso;
    private double altura;
    private String nombre;

    public Persona(String nombrePersona, double pesoPersona, double alturaPersona) {
        nombre = nombrePersona;
        peso = pesoPersona;
        altura = alturaPersona;
    }

    // Métodos getter y setter
    public double getPeso() {
        return peso;
    }

    public void setPeso(double nuevoPeso) {
        peso = nuevoPeso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double nuevaAltura) {
        altura = nuevaAltura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nuevoNombre) {
        nombre = nuevoNombre;
    }

    public String calculaIMC() {
        double imc = peso / (altura * altura);

        if (imc < 18.5) {
            return "BAJO PESO";
        } else if (imc < 25) {
            return "PESO NORMAL";
        } else if (imc < 30) {
            return "SOBREPESO";
        } else if (imc < 35) {
            return "OBESIDAD TIPO 1";
        } else if (imc < 40) {
            return "OBESIDAD TIPO 2";
        } else {
            return "OBESIDAD TIPO 3";
        }
    }
}
