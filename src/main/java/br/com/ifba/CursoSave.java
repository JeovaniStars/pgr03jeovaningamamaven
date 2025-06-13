package br.com.ifba;

import br.com.ifba.curso.entity.Curso;
import br.com.ifba.curso.view.CursoSaveView;

public class CursoSave {

    private CursoSaveView view;

    public CursoSave() {
        this.view = new CursoSaveView();

        // Registrar listeners usando os métodos públicos
        view.addSalvarListener(e -> salvarCurso());
        view.addCancelarListener(e -> view.fechar());
    }

    private void salvarCurso() {
        String codigo = view.getCodigoCurso();
        String nome = view.getNome();
        String descricao = view.getDescricao();
        boolean ativo = true; // sempre ativo

        Curso curso = new Curso(codigo, nome, descricao, ativo);

        // Aqui, salve no banco ou faça o que precisar com o curso
        System.out.println("Curso salvo: " + curso);

        view.fechar();
    }

    public void exibirTela() {
        view.setVisible(true);
    }

    public static void main(String[] args) {
        new CursoSave().exibirTela();
    }
}
