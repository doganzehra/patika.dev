public class Fighter {
    String name;
    int damage;
    int health;
    int weight;
    double dodge;
    int turn;

    public Fighter(String name, int damage, int health, int weight, double dodge, int turn) {
        this.name = name;
        this.damage = damage;
        this.health = health;
        this.weight = weight;
        this.dodge = dodge;
        this.turn = turn;
    }

    public int hit(Fighter f1) {
        turn = (int) (Math.random() * 100);
        if(f1.turn > 50){
            System.out.println("------------");
            System.out.println(f1.name + " => " + f2.name + " " +  this.damage + " hasar vurdu.");

            if (f2.dodge()) {
                System.out.println(f2.name + " gelen hasarı savurdu.");
                return f2.health;
            }

            if (f2.health - this.damage < 0)
                return 0;

            return f1.health - this.damage;
        }else{
            System.out.println("------------");
            System.out.println(f2.name + " => " + f1.name + " " +  this.damage + " hasar vurdu.");

            if (f1.dodge()) {
                System.out.println(f1.name + " gelen hasarı savurdu.");
                return f1.health;
            }

            if (f1.health - this.damage < 0)
                return 0;

            return f2.health - this.damage;
        }
    }

    public boolean dodge() {
        double randomValue = Math.random() * 100;  //0.0 to 99.9
        return randomValue <= this.dodge;
    }
}