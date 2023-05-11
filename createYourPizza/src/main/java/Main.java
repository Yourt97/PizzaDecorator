import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws URISyntaxException, IOException {

        Pizza pizza = new ThinCrust();
        ProductManager productManager = new ProductManager();
        boolean endChoice = false;
        boolean menu = false;

        while (!menu) {
            System.out.println("1. Wyświetl produkty");
            System.out.println("2. Zaproponuj produkt");
            System.out.println("3. Wybierz ciasto");
            System.out.println("4. Dołóż dodatki");
            System.out.println("5. Zobacz podsumowanie");
            System.out.println("6. koniec");


            Scanner scanner = new Scanner(System.in);
            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {

                case 1 -> {
                    System.out.println("Zobacz jakie produkty wykorzystujemy");

                    productManager.getAllProducts().forEach(System.out::println);
                }
                case 2 -> {
                    System.out.println("Zaproponuj  nam produkt, który możemy dodać w przyszłości");
                    String newProduct = scanner.next();
                    productManager.addProduct(newProduct);
                }
                case 3 -> {
                    System.out.println("Wybierz rodzaj ciasta");
                    System.out.println("Standardowo pizza wykonywana jest na cienkim cieście");
                    System.out.println("1. Ciasto cienkie");
                    System.out.println("2. Ciasto grube");
                    int crust = scanner.nextInt();

                    if (crust == 1) {
                        System.out.println("Wybrano cienkie ciasto");
                        System.out.println("Standarodo pizza zawiera sos pomidorowy, ser, oregano");
                        System.out.println("Przejdz do wyboru dodatkowych składników");

                    } else {
                        pizza = new ThickCrust();
                        System.out.println("Wybrano grube ciasto");
                        System.out.println("Standarodo pizza zawiera sos pomidorowy, ser, oregano");
                        System.out.println("Przejdz do wyboru dodatkowych składników");

                    }
                }
                case 4 -> {
                    while (!endChoice) {
                    System.out.println("Wybierz dodatki");

                        System.out.println("Dodatki roślinne");
                        System.out.println("1. Cebula 2. Kukurydza 3. Ananas 4. Papryka 5. Ogórek koszony");
                        System.out.println("6. Pieczarki 7. Oliwki zielone 8. Oliwki czarne");
                        System.out.println("Dodatki mięsne");
                        System.out.println("9. Pepperoni 10. Boczek 11. Szynka 12. Kurczak");
                        System.out.println("Przyprawy");
                        System.out.println("13. Tabasko 14. Bazylia");
                        System.out.println("15. Zakończ wybór");

                       int choiceAdd = scanner.nextInt();
                        switch (choiceAdd) {
                            case 1 -> {
                                pizza = new OnionDecorator(pizza);
                                System.out.println("Dodano cebule");
                            }
                            case 2 -> {
                               pizza = new CornDecorator(pizza);
                                System.out.println("Dodano kukurydze");
                            }
                            case 3 ->{
                                pizza = new AnanasDecorator(pizza);
                                System.out.println("Dodano ananasa");
                            }
                            case 4-> {
                                pizza = new PepperDecorator(pizza);
                                System.out.println("Dodano papryke");
                            }
                            case 5 -> {
                                pizza = new PikledcucumberDecorator(pizza);
                                System.out.println("Dodano ogórka kiszonego");
                            }
                            case 6 -> {
                                pizza = new ChampignonsDecorator(pizza);
                                System.out.println("Dodano pieczarki");
                            }
                            case 7 -> {
                                pizza = new GreenOlivesDecorator(pizza);
                                System.out.println("Dodano oliwki zielone");
                            }
                            case 8 -> {
                                pizza = new BlackOlivesDecorator(pizza);
                                System.out.println("Dodano oliwki czarne");
                            }
                            case 9 -> {
                                pizza = new PepperoniDecorator(pizza);
                                System.out.println("Dodano pepperoni");
                            }
                            case 10 -> {
                                pizza = new BaconDecorator(pizza);
                                System.out.println("Dodano boczek");
                            }
                            case 11 -> {
                                pizza = new HamDecorator(pizza);
                                System.out.println("Dodano szynke");
                            }
                            case 12 -> {
                                pizza = new ChickenDecorator(pizza);
                                System.out.println("Dodano kurczaka");
                            }
                            case 13 -> {
                                pizza = new TabascoDecorator(pizza);
                                System.out.println("Dodano tabasco");
                            }
                            case 14 -> {
                                pizza = new BasilDecorator(pizza);
                                System.out.println("Dodano bazylie");
                            }

                            case 15 -> {
                                endChoice =true;
                                System.out.println("Zakończono wybór dodatków");
                            }
                            default -> throw new IllegalStateException("Unexpected value: " + choiceAdd);
                        }


                    }
                }
                case 5 -> {
                    System.out.println("Zobacz podsumowanie");
                    System.out.println(pizza.getDescription() + " " + pizza.getCost());
                }
                case 6 ->{
                    scanner.close();
                    menu = true;

                }


                default -> throw new IllegalStateException("Unexpected value: " + choice);
            }

        }




    }
}
