package ac1.dbz;

public class Arena_DBZ {
    
    // ATRIBUTOS ENCAPSULADOS
    private String nome;
    private String tipo;
    private int level;
    private int vida;
    private int ataque;
    private int defesa;

    //CONSTRUTOR
    public Arena_DBZ(String nome, String tipo, int level) {
        this.nome = nome;
        this.tipo = tipo;
        this.level = level;
        calculaAtributos();
        calculaBonus();
        imprimePersonagens();   
    }
    
    //METODOS
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getDefesa() {
        return defesa;
    }

    public void setDefesa(int defesa) {
        this.defesa = defesa;
    }
    
    

    public void imprimePersonagens(){
        System.out.println("Nome: " + nome + " | " +
                           "Tipo: " + tipo + " | " +
                           "Level: " + level + " | " +
                           "Vida: " + vida + " | " +
                           "Ataque: " + ataque + " | " +
                           "Defesa: " + defesa + " | "
        );
    }

    public void calculaAtributos(){
        switch(this.tipo){
            case "Sayajin1":
                this.vida = 75;
                this.ataque = 110;
                this.defesa = 30;
                break;
                
            case "Sayajin2":
                this.vida = 60;
                this.ataque = 101;
                this.defesa = 50;
                break;
                
            case "Sayajin3":
                this.vida = 70;
                this.ataque = 90;
                this.defesa = 90;
                break;
            
            case "Sayajin4":
                this.vida = 60;
                this.ataque = 97;
                this.defesa = 20;
                break;
                
        }
    }

    public void calculaBonus(){
        vida = vida + (level / 2);
        ataque = ataque + (level / 3); 
        defesa = defesa + (level / 4); 
    }

}
