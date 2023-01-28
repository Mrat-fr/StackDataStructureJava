public class Project2 {
    public static void main(String[] args) {
        java.util.Scanner input=new java.util.Scanner(System.in);
        Stack Cupboard = new Stack();
        Stack CounterTop = new Stack();
        boolean mainLoop = true;
        while (mainLoop){
            System.out.println("--------------------------------");
            System.out.println("Plate storage and sorting system");
            System.out.println("- ceramic storage, max space 5 -");
            System.out.println("--------------------------------");
            System.out.println("            CUPBOARD            ");
            Cupboard.ShowCupboard();
            System.out.println("................................");
            System.out.println("(1)Add Plate");
            System.out.println("(2)Sort Plates");
            System.out.println("(3)Remove top Plate");
            System.out.println("(0)Exit");
            System.out.print(": ");
            int Option=input.nextInt();
            switch (Option) {
                case 1 -> {
                    int Size;
                    do{
                        System.out.print("What size is the plate, Range 5 to 15:");
                        Size=input.nextInt();
                        if (Size < 5 || Size > 15){
                            System.out.println("pick 5 to 15");
                        }
                    }while(Size < 5 || Size > 15);
                    Cupboard.push(Size);
                }
                case 2 -> {
                    if(Cupboard.isEmpty()){
                        System.out.println("Nothing to sort");
                        break;
                    }
                    int Hand;
                        while(!Cupboard.isEmpty()) {
                            Cupboard.WrongMaterial();
                            Hand = Cupboard.pop();
                            while(!CounterTop.isEmpty() && CounterTop.peek() > Hand)
                            {

                                Cupboard.push(CounterTop.pop());
                            }
                            CounterTop.push(Hand);
                        }
                        while(!CounterTop.isEmpty()){
                            Cupboard.push(CounterTop.pop());
                        }
                }
                case 3 -> {
                    Cupboard.pop();
                }
                case 0 -> {
                    System.out.println("-------------------------------");
                    System.out.println("------EXITING APPLICATION------");
                    System.out.println("-------------------------------");
                    mainLoop = false;
                }
                default -> {
                    System.out.println("Invalid input");
                    System.out.println("");
                }
            }
        }
    }
}