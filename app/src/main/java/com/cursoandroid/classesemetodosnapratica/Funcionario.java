package com.cursoandroid.classesemetodosnapratica;

class Funcionario {

    //propriedades
        String nome;
        double salario;

    //metodos - sem retorno
        /*void recuperarSalario() {
            this.salario = this.salario - (this.salario * 0.1);
            System.out.println(this.salario);
        }*/

     //metodos - com retorno
     double recuperarSalario(double bonus, double descontoAdicional) {
         this.salario = this.salario - (this.salario * 0.1);
         return this.salario + bonus - descontoAdicional;
         //System.out.println(this.salario);
     }

}
