public class Stack {
    private int Top = 0;
    private int Max = 5;
    private int cupboard[];

    public Stack(){
        this.Max = Max;
        this.cupboard = new int[Max];
        this.Top = -1;
    }

    public boolean isFull() {
        return (Top == Max - 1);
    }

    public boolean isEmpty() {
        return (Top == - 1);
    }

    public int peek(){
        if (isEmpty()){
            return 0;
        }else {return cupboard[Top];}
    }

    public void push(int Size){
        if(!isFull()){
            cupboard[++Top] = Size;
        } else {
            System.out.println("cupboard is full");
        }
    }
    public int pop(){
        int top = 0;
        if(!isEmpty()){
            top = cupboard[Top];
            cupboard[Top] = 0;
            Top--;
        } else {
            System.out.println("cupboard is empty");
        }
        return top;
    }

    public void WrongMaterial(){
        if (cupboard[Top] == 11 || cupboard[Top] == 12 || cupboard[Top] == 13 || cupboard[Top] == 14) {
            pop();
        }
    }

    public void ShowCupboard() {
        for (int i = cupboard.length - 1; i >= 0; i--) {
            String Plate = "<";
            if (cupboard[i] != 0) {
                if (cupboard[i] == 11 || cupboard[i] == 12 || cupboard[i] == 13 || cupboard[i] == 14){
                    for (int x = 0; x < cupboard[i]; x++) {
                        Plate = Plate + "#";
                    }
                    Plate = Plate + ">";
                    System.out.println(Plate);
                }else {
                    for (int x = 0; x < cupboard[i]; x++) {
                        Plate = Plate + "-";
                    }
                    Plate = Plate + ">";
                    System.out.println(Plate);
                }
            }
        }
    }


}
