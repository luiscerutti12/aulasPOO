package poo.exercicio.pkg01.vo;

import java.util.Objects;

public class Funcionario extends Pessoa{
    
    private Setor setor = new Setor();

    public Setor getSetor() {
        return setor;
    }

    public void setSetor(Setor setor) {
        this.setor = setor;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + Objects.hashCode(this.getCodigo());
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Funcionario other = (Funcionario) obj;
        if (!Objects.equals(this.getCodigo(), other.getCodigo())) {
            return false;
        }
        return true;
    }

   
    
}
