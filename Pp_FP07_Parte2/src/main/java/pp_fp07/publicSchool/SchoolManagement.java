package pp_fp07.publicSchool;
import Enumerations.TipoContrato;

public class SchoolManagement {
    
    private Pessoa[] pessoas;
    
    public void ListProfessores(Pessoa[] pessoass){
        for(Pessoa _pessoa : pessoass){
            if(_pessoa instanceof Professor){
                Professor prof = (Professor)_pessoa;
                System.out.println("Professores: ");
                System.out.println("Sigla: " + prof.getsigla());
                System.out.println("Nome: " + prof.getnome());
                System.out.println("Data nascimento: " + prof.getdatanascimento());
                System.out.println("Morada: " + prof.getmorada());
                System.out.println("Numero cartao de cidadao: " + prof.getn_cc());
                System.out.println("Nif: " + prof.getnif());         
                System.out.println("Tipo de contrato: " + TipoContrato.tipocontratoToString(prof.getcontrato()));

                System.out.println("Informacoes a cerca das unidades curriculares que leciona: ");
                for(UnidadeCurricular uni: prof.getuni_curricular()){

                    System.out.println("Sigla: " + uni.getsigla());
                    System.out.println("Nome: " + uni.getnome_uni());
                    System.out.println("Nome do curso: " + uni.getnome_curso());
                    System.out.println("Ano: " + uni.getano());
                    System.out.println("Semestre: " + uni.getsemestre());

                }
            }
        }
    }

    public void ListAlunos_Func(Pessoa[] pessoass){
        for(Pessoa _pessoass : pessoass){
            if(_pessoass instanceof FuncionarioAdmin){
                System.out.println("---------------------------------------------------------------");
                FuncionarioAdmin func1 = (FuncionarioAdmin)_pessoass;
                System.out.println("Funcionarios: ");
                System.out.println("Codigo: " + func1.getcodigo());
                System.out.println("Nome: " + func1.getnome());
                System.out.println("Data nascimento: " + func1.getdatanascimento());
                System.out.println("Morada: " + func1.getmorada());
                System.out.println("Numero de cartao de cidadao: " + func1.getn_cc());
                System.out.println("Nif: " + func1.getnif());
                System.out.println("Tipo de contrato: " + TipoContrato.tipocontratoToString(func1.getcontrato()));

            }else if(_pessoass instanceof Aluno){
                System.out.println("---------------------------------------------------------------");
                Aluno alun1 = (Aluno)_pessoass;
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
    }   

    public void setpessoas(Pessoa[] pessoas){
        this.pessoas = pessoas;
    }

    public Pessoa[] getpessoas(){
        return this.pessoas;
    }
}
