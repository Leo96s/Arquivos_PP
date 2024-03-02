/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp_fp07.publicSchool;

import Enumerations.TipoContrato;

/**
 *
 * @author Leonardo
 */
public class SchoolDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        

        UnidadeCurricular sdac = new UnidadeCurricular("Sistemas digitais e Arquitetura de computadores", "UC1", 
        "Licenciatura em Engenharia Informatica", 1, 2);

        UnidadeCurricular md = new UnidadeCurricular("Matematica discreta", "AC2", 
        "Licenciatura em Engenharia Informatica", 1, 2);

        UnidadeCurricular isc = new UnidadeCurricular("Intruducao de Sistemas Computacionais", "AC3", 
        "Licenciatura em Engenharia Informatica", 1, 1);

        UnidadeCurricular mci = new UnidadeCurricular("Matematica Computacional I", "AC3",
         "Licenciatura em Engenharia Informatica", 1, 2);

        UnidadeCurricular pp = new UnidadeCurricular("Paradigma da Progamacao", "AC4",
         "Licenciatura em Engenharia Informatica", 1, 2);

        UnidadeCurricular esi = new UnidadeCurricular("Engenharia de Software I", "AC5",
         "Licenciatura em Engenharia Informatica", 1, 2);

        UnidadeCurricular esii = new UnidadeCurricular("Engenharia de Software II", "AC6", 
        "Licenciatura em Engenharia Informatica", 2, 1);

        UnidadeCurricular[] cuc = {sdac, isc};
        UnidadeCurricular[] cuc1 = {esi, esii};
        UnidadeCurricular[] tcuc = {sdac, md, isc, mci, pp, esi, esii};
        UnidadeCurricular[] semes1_lei = {isc};

        Pessoa prof = new Professor("Antonio", "24-03-1998", "rua alcobita", 123456789, "11223344556", 
        "AB1", TipoContrato.INTEGRAL, cuc);

        Pessoa prof2 = new Professor("Miguel", "26-06-1998", "rua alcobita", 123456789, "11223344556", 
        "AB1", TipoContrato.INTEGRAL, cuc1);

        Pessoa func = new FuncionarioAdmin("Antonia", "01-05-1973", "rua da Joana", 123456789, 
        "11223344556", TipoContrato.PARCIAL);

        Pessoa func2 = new FuncionarioAdmin("Torres", "01-08-1975", "rua da Joana", 123456789, 
        "11223344556", TipoContrato.INTEGRAL);

        Pessoa aluno1 = new Aluno("Tobias", "12-06-2003", "rua da ponte", 123456789, "11223344556", tcuc);
        Pessoa aluno2 = new Aluno("Carvalho", "12-04-2003", "rua da ponte", 123456789, "11223344556", semes1_lei);



        Pessoa[] pessoas = {prof, prof2, func, func2, aluno1, aluno2};

    for (Pessoa pessoa : pessoas) {
        System.out.println("---------------------------------------------------------------");
        if(pessoa instanceof Professor){
            Professor prof1 = (Professor)pessoa;
            System.out.println("Professores: ");
            System.out.println("Sigla: " + prof1.getsigla());
            System.out.println("Nome: " + prof1.getnome());
            System.out.println("Data nascimento: " + prof1.getdatanascimento());
            System.out.println("Morada: " + prof1.getmorada());
            System.out.println("Numero cartao de cidadao: " + prof1.getn_cc());
            System.out.println("Nif: " + prof1.getnif());         
            System.out.println("Tipo de contrato: " + TipoContrato.tipocontratoToString(prof1.getcontrato()));

            System.out.println("Informacoes a cerca das unidades curriculares que leciona: ");
            for(UnidadeCurricular uni: prof1.getuni_curricular()){

                System.out.println("Sigla: " + uni.getsigla());
                System.out.println("Nome: " + uni.getnome_uni());
                System.out.println("Nome do curso: " + uni.getnome_curso());
                System.out.println("Ano: " + uni.getano());
                System.out.println("Semestre: " + uni.getsemestre());

            }

        }else if(pessoa instanceof FuncionarioAdmin){
            System.out.println("---------------------------------------------------------------");
            FuncionarioAdmin func1 = (FuncionarioAdmin)pessoa;
            System.out.println("Funcionarios: ");
            System.out.println("Codigo: " + func1.getcodigo());
            System.out.println("Nome: " + func1.getnome());
            System.out.println("Data nascimento: " + func1.getdatanascimento());
            System.out.println("Morada: " + func1.getmorada());
            System.out.println("Numero de cartao de cidadao: " + func1.getn_cc());
            System.out.println("Nif: " + func1.getnif());
            System.out.println("Tipo de contrato: " + TipoContrato.tipocontratoToString(func1.getcontrato()));

        }else if(pessoa instanceof Aluno){
            System.out.println("---------------------------------------------------------------");
            Aluno alun1 = (Aluno)aluno1;
            System.out.println("Alunos: ");
            System.out.println("Codigo: " + alun1.getcodigo());
            System.out.println("Nome: " + alun1.getnome());
            System.out.println("Data nascimento: " + alun1.getdatanascimento());
            System.out.println("Morada: " + alun1.getmorada());
            System.out.println("Numero cartao de cidadao: " + alun1.getn_cc());
            System.out.println("Nif: " + alun1.getnif());         

            System.out.println("Informacoes a cerca das unidades curriculares que leciona: ");
            for(UnidadeCurricular uni: alun1.getuni_curricular()){

                System.out.println("Sigla: " + uni.getsigla());
                System.out.println("Nome: " + uni.getnome_uni());
                System.out.println("Nome do curso: " + uni.getnome_curso());
                System.out.println("Ano: " + uni.getano());
                System.out.println("Semestre: " + uni.getsemestre());

            }
            System.out.println("---------------------------------------------------------------");

        }

    }
    SchoolManagement professores = new SchoolManagement();

    professores.setpessoas(pessoas);

    professores.ListProfessores(professores.getpessoas());
    


        
    }
    
}
