package models;

public class CalculadoraImc {

    double peso_imc;

    public  String calcularIMC(double peso,double altura, int idade, String sexo) {
        // adulto não considera o genero só para idoso

        peso_imc = peso/(Math.pow(altura,2));

        if (idade <= 65){
            //retornos ed imc para adultos homens e mulheres

            if (peso_imc < 16){
                return "Baixo peso muito grave";
            }

            else if (peso_imc >= 16.00 && peso_imc <= 16.99){
                return "Baixo peso grave";
            }
            else if ( peso_imc >= 17.0 && peso_imc <= 18.49){
                return "Baixo peso";
            }
            else if (peso_imc >= 18.50  && peso_imc <= 24.99){
                return "Peso normal";
            }

            else if (peso_imc >= 25.00 && peso_imc <= 29.99){
                return "Sobrepeso";
            }

            else if (peso_imc >= 30.00 && peso_imc <= 34.99){
                return "Obesidade grau I";
            }

            else if (peso_imc >= 35.00  && peso_imc <= 39.99){
                return "Obesidade grau II";
            }

            else if (peso_imc >= 40.00){
                return "Obesidade grau III (obesidade mórbida)";
            }



        } else { //calculo dos idosos

            if (sexo.equals("h")){ //homens idosos

                if (peso_imc <= 21.9){
                    return "Baixo peso";
                }

                if ( 22.00 <= peso_imc && peso_imc <= 27.00){
                    return "Peso normal";
                }

                if ( 27.1 <= peso_imc && peso_imc <= 30.00){
                    return "Sobrepeso";
                }

                if ( 30.1 <= peso_imc && peso_imc <= 35.00){
                    return "Obesidade grau I";
                }

                if ( 35.1 <= peso_imc && peso_imc <= 39.9){
                    return "Obesidade grau II";
                }

                if (peso_imc >= 40.0){
                    return "Obesidade grau III (obesidade mórbida)";
                }
            } else if (sexo.equals("m")){

                if (peso_imc <= 21.9){
                    return "Baixo peso";
                }

                if (peso_imc >= 22.00 && peso_imc <= 27.0){
                    return "Peso normal";
                }

                if (peso_imc >= 27.1 && peso_imc <= 32.0){
                    return "Sobrepeso";
                }

                if (peso_imc >= 32.1 && peso_imc <= 37.0){
                    return "Obesidade grau I";
                }

                if (peso_imc >= 37.1 && peso_imc <= 41.9){
                    return "Obesidade grau II";
                }

                if (peso_imc >= 42.0){
                    return "Obesidade grau III (obesidade mórbida)";
                }

            } else {return "Sexo Invalido";}

        }
        return "";
    }
}
