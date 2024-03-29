import java.util.ArrayList;

public class BlocoDeNotas {

    private ArrayList <Anotacao> suasAnotacoes = new ArrayList<>();
    private ArrayList <Anotacao> lixeira = new ArrayList<>();


    public Anotacao buscar(Integer codigo){
        Anotacao an = suasAnotacoes.get(codigo - 1);
        return an;
    }

    public void adicionar (String texto){

        Anotacao an = new Anotacao(texto, suasAnotacoes.size() + 1);
        suasAnotacoes.add(an);

    }

    public void remover(Integer id){

        Anotacao item = buscar(id);
        lixeira.add(item);
        suasAnotacoes.remove(item);
        item.setIdRemovido(lixeira.size() + 1);

        for (int i = 0; i < suasAnotacoes.size(); i ++){

            Anotacao mod = suasAnotacoes.get(i);
            mod.setId(i + 1);

        }

    }

    public void editar(String texto, Integer id){

        Anotacao item = buscar(id);
        item.setTexto(texto);

    }

    public void recuperar(Integer id){

        Anotacao an = lixeira.get(id - 1);
        suasAnotacoes.add(an);
        lixeira.remove(an);

        for (int i = 0; i < suasAnotacoes.size(); i ++){

            Anotacao mod = suasAnotacoes.get(i);
            mod.setId(i + 1);

        }

    }

    public String retornarLixeira(){

        for (int i = 0; i < lixeira.size(); i++){

            Anotacao mod = lixeira.get(i);
            mod.setId(i + 1);

        }

        for (int i = 0; i < lixeira.size(); i++){
            Anotacao an = lixeira.get(i);
            System.out.println(an.toString());
            System.out.println();
        }

        return null;

    }

    public String retornarBloco(){

        for (int i = 0; i < suasAnotacoes.size(); i++){
            Anotacao an = suasAnotacoes.get(i);
            System.out.println(an.toString());
            System.out.println();
        }

        return null;

    }

    //outra solução apresentada para "retornarBloco(), que seria o "toString()" da classe BlocoDeNotas"
    /*
    public String toString() {
        String str = "";
        for (Anotacao an : suasAnotacoes) {
            str += (an.toString() + "\n");
        }
        return str;
    }
    */

}