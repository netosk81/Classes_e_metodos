package com.cursoandroid.classesemetodosnapratica;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Cao cao = new Cao();
        //cao.dormir();
        cao.latir();

        Passaro passaro  = new Passaro();
        //passaro.correr();
        //passaro.dormir();
        passaro.voar();


        /*Animal animal = new Animal();
        animal.correr();*/

        /*animal.cor = "Azul";
        animal.peso = 152;
        animal.tamanho = 1,90;*/








        /*Funcionario funcionario = new Funcionario();
        funcionario.nome = "José";
        funcionario.salario = 920;

        double salarioRecuperado = funcionario.recuperarSalario(175.00, 20.00);
        //System.out.println("Salario do José: " + (salarioRecuperado + 100));
        System.out.println("Salario do José: " + salarioRecuperado);*/

        //int numero = 10;
         /*Casa minhaCasa = new Casa();
         minhaCasa.cor = "red";

         System.out.println(minhaCasa.cor);
         minhaCasa.abrirPorta();*/




    }
}