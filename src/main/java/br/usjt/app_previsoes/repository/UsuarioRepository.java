package br.usjt.app_previsoes.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.usjt.app_previsoes.model.Usuario;


public interface UsuarioRepository extends JpaRepository<Usuario,Long>{
    public Usuario findOneByLoginAndSenha (String login, String senha);
}
