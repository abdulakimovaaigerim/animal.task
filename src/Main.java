import java.util.Arrays;

public class Main {
    public static void main(String[] args) {


        Animal[] animals = {new Shark("shark"),
                            new Shark("delphin"),
                            new Shark("kit"),

                            new Eagle("owl"),
                            new Eagle("crow"),
                            new Eagle("eagle"),

                            new Turtle("habitat"),
                            new Turtle("hawksbill"),
                            new Turtle("kemp")};

        for (Animal animal : animals) {
            if (animal.getClass().equals(Shark.class)){
                ((Shark) animal).attack();
            }
            else if (animal.getClass().equals(Eagle.class)) {
                ((Eagle) animal).fly();
            }else if (animal.getClass().equals(Turtle.class)) {
                ((Turtle) animal).swim();
            }else {
                System.out.println(animal);
            }

        }
        int eagle=0;
        int turtle=0;
        int shark=0;
        Shark[]sharks=new Shark[3];
        Turtle[]turtles=new Turtle[3];
        Eagle[]eagles=new Eagle[3];
        for (Animal animal : animals) {
            if (animal instanceof Shark){
                sharks[shark]= (Shark) animal;
                shark++;
            }
            else if (animal instanceof Turtle) {
                turtles[turtle]= (Turtle) animal;
                turtle++;
            } else if (animal instanceof Eagle) {
                eagles[eagle]= (Eagle) animal;
                eagle++;
            }
        }
        System.out.println(Arrays.toString(sharks));
        System.out.println(Arrays.toString(turtles));
        System.out.println(Arrays.toString(eagles));
           }

        }

