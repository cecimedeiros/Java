public static boolean isNomeValido(String nome) {
      return nome.matches("[a-zA-Z]+"); // Verifica se o nome contém apenas caracteres alfabéticos
}

public static boolean isMatriculaValida(String matricula) {
    return matricula.matches("\\d+"); // Verifica se a matrícula contém APENAS números
}

public static boolean isMatriculaValida(String matricula) {
    return matricula.isBlank(); // Verifica se a matrícula contém APENAS espaços em branco
}

//no caso, esses métodos serão o seguinte:
//se só alfabetico true
//se só números então retorna true
//se só espaços em branco true
