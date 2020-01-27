package it.itis.cuneo;

import java.util.Scanner;

public class Calcolatrice
{
    public double Addizione(double Num1, double Num2)    //Metodo Somma.
    {
        double Ris = 0;
        Ris = Num1 + Num2;

        return Ris;
    }

    public double Sottrazione(double Num1, double Num2)      //Metodo Differenza.
    {
        double Ris = 0;
        Ris = Num1 - Num2;

        return Ris;
    }

    public double Moltiplicazione(double Num1, double Num2)      //Metodo Moltiplicazione.
    {
        double Ris = 0;
        Ris = Num1 * Num2;

        return Ris;
    }

    public double Divisione(double Num1, double Num2)        //Metodo Divisione.
    {
        double Ris = 0;
        Ris = Num1 / Num2;

        return Ris;
    }


    public static void main(String[] args)
    {
        Scanner Input = new Scanner(System.in);
        Calcolatrice Ris = new Calcolatrice();      //Creazione oggetto per il richiamo dei metodi.
        double Risultato;

        System.out.println("Inserisci il primo numero: ");      //Richiesta primo numero.
        double Num1 = Input.nextDouble();

        System.out.println("Inserisci il secondo numero: ");    //Richiesta secondo numero.
        double Num2 = Input.nextDouble();

        System.out.println("- Ora digita il numero corrispondente alla operazione che desideri -");
        System.out.println("1.Moltiplicazione, 2.Sottrazione, 3.Moltiplicazione, 4.Divisione");

        int Scelta = Input.nextInt();

            switch (Scelta)      //Switch creato per poter far scegliere all'utente l'operazione da eseguire.
            {
                case 1:
                    Risultato = Ris.Addizione(Num1, Num2);
                    System.out.println("Ecco il risultato della somma tra " + Num1 + " e " + Num2 + ": " + Risultato);
                    break;

                case 2:
                    Risultato = Ris.Sottrazione(Num1, Num2);
                    System.out.println("Ecco il risultato della differenza tra " + Num1 + " e " + Num2 + ": " + Risultato);
                    break;

                case 3:
                    Risultato = Ris.Moltiplicazione(Num1, Num2);
                    System.out.println("Ecco il risultato del prodotto tra " + Num1 + " e " + Num2 + ": " + Risultato);
                    break;

                case 4:
                    Risultato = Ris.Divisione(Num1, Num2);
                    System.out.println("Ecco il risultato del quoziente tra " + Num1 + " e " + Num2 + ": " + Risultato);
                    break;

                default:
                    System.out.println("Hai inserito un valore non accettabile.");
            }
    }
}
