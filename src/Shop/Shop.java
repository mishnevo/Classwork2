package Shop;
import java.util.ArrayList;
import java.util.Scanner;

public class Shop {
    private ArrayList<Computer> list = new ArrayList<Computer>();

    public void add(){

        Scanner in = new Scanner(System.in);

        Computer newComputer = new Computer();
        System.out.println("Add number");
        newComputer.setNumber(in.nextInt());

        System.out.println("Add GPU");
        newComputer.setGraphicCard(in.next());

        System.out.println("Add CPU");
        newComputer.setCPU(in.next());

        System.out.println("Add RAM");
        newComputer.setRAM(in.next());

        list.add(newComputer);

    }

    public void delete(int number){
        int index = 0;
        for (Computer deleting : list) {
            if (deleting.getNumber() == number) {
                index = list.indexOf(deleting);

            }
        }
        list.remove(index);
    }
    public void searching(int number){
        for (Computer searching : list) {
            if (searching.getNumber() == number) {
                searching.print();

            }
        }
    }
    public void show(){
        for(int i = 0; i < list.size(); i++){
            list.get(i).print();
        }
    }

    public void work(){
        boolean flag = true;
        Scanner in = new Scanner(System.in);
        int ans;

        while (flag) {
            System.out.println(
                    "What do you want to do?\n" +
                            "0.Leave\n" +
                            "1.Search Computer\n" +
                            "2.Delete/Buy Computer\n" +
                            "3.Add Computer\n" +
                            "4.Show computers\n");


            ans = in.nextInt();
            switch (ans) {
                case 0:
                    System.out.println("Bye!");
                    flag = false;
                    break;

                case 1:
                    System.out.println("Searching Computer. Please enter its number");
                    searching(in.nextInt());
                    break;

                case 2:
                    System.out.println("Enter number of the computer to delete:");
                    delete(in.nextInt());

                    break;
                case 3:
                    System.out.println("Adding Computer");
                    add();
                    break;
                case 4:
                    show();
                    break;
                default:
                    System.out.println("No such command in the program");
                    break;
            }
        }


    }




}
