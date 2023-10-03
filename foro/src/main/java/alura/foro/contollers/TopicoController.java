package alura.foro.contollers;

import alura.foro.models.Topico;
import alura.foro.repository.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class TopicoController {

    @Autowired
    private Repository repository;
    @GetMapping("/saludo")
    public String saludando(){
        return "Hola Mundo";
    }

    @GetMapping("/topico")
    public List<Topico> listarTopicos(){
        return repository.findAll();
    }

    @GetMapping("/topico/{id}")
    public ResponseEntity<Topico> obtenerTopicoPorId(@PathVariable Long id){
        Optional<Topico> topicoOptional = repository.findById(id);

        if (topicoOptional.isPresent()) {
            Topico topicoEspecifico = topicoOptional.get();
            return ResponseEntity.ok(topicoEspecifico);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
    @PostMapping("/agregar")
    public String agregarTopico(@RequestBody Topico topico){
        repository.save(topico);
        return "Topico Agregado";
    }

    @PutMapping("/editar/{id}")
    public String update(@PathVariable Long id, @RequestBody Topico topico){
        Topico updateTopico = repository.findById(id).get();
        updateTopico.setAutor(topico.getAutor());
        updateTopico.setCurso(topico.getCurso());
        updateTopico.setMensaje(topico.getMensaje());
        updateTopico.setTitulo(topico.getTitulo());
        repository.save(updateTopico);
        return "Editado Correctamente";
    }

    @DeleteMapping("/eliminar/{id}")
    public String delete(@PathVariable Long id){
        Topico deleteTopico = repository.findById(id).get();
        repository.delete(deleteTopico);
        return "Eliminado Correctamente";
    }
}
