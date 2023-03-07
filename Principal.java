
public class Principal {
    // Chamar o 'psvm' preenche automatico--->
    public static void main(String[] args) {

        Filme filme1 = new Filme();
        filme1.setTitulo("The Container");
        filme1.setDuracao(120);
        filme1.setAno(2022);
        filme1.setSimpose("E um filme de terror");

        // Chamar'sout' faz o auto complete para imprimir no console -->

        System.out.println("Titulo: " + filme1.getTitulo());
        System.out.println("Duração: " + filme1.getDuracao() + " minutos");
        System.out.println("Ano de Lançamento: " + filme1.getAno());
        System.out.println("Sinopse: " + filme1.getSinopose());

    }

}
