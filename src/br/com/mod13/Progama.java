package br.com.mod13;

/**
 * @author williams.silva
 */
public class Progama {

    public static void main(String args[]){

        PessoaFisica fisica = new PessoaFisica();
        fisica.setNome("Williams");
        fisica.setSobrenome("Silva");
        fisica.setIdade("26 anos");
        fisica.setEndereco("Maceió - AL");
        fisica.setDataNascimento("02/11/1996");
        fisica.setCpf("123.456.789-99");
        System.out.println(fisica.getNome() + " " + fisica.getSobrenome() + " Tem" + " " + fisica.getIdade() + ", e seu CPF é : "+ fisica.getCpf());



    PessoaJuridica juridica = new PessoaJuridica();
        juridica.setNome("Henrique");
        juridica.setSobrenome("Neves");
        juridica.setIdade("50 anos");
        juridica.setEndereco("Maceió - AL");
        juridica.setDataNascimento("22/08/1966");
        juridica.setCnpj(0123456789D);
        System.out.println(juridica.getNome() + " " + juridica.getSobrenome() + " Tem" + " " + juridica.getIdade() + ", e seu CNPJ é : "+ juridica.getCnpj());

    }

}
