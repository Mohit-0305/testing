class pat1{
    public static void main(String[] a) {
        pat1 obj = new pat1();
        obj.displayPattern3(4);
    }

    void displayPattern1(int size){
        int i,j;
        for(i = 1 ; i<=size ; i++){
            for(j=1 ; j<= i ; j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }

    void displayPattern2(int size){
        int i, j, space,k, stars;
        
        for(i=1 ; i<= size ; i++){
            space = size - i;
            stars = 2*i - 1;
            for(j=1 ; j<=space ; j++){
                System.out.print(" ");
            }
            for(k=1 ; k<=stars ; k++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    void displayPattern3(int size){
        boolean a = true;
        int i, j, space,k, stars;
        
        for(i=1 ; i<= size ; i++){
            space = size - i;
            stars = 2*i - 1;
            for(j=1 ; j<=space ; j++){
                System.out.print(" ");
            }
            for(k=1 ; k<=stars ; k++){
                if (a == true) {
                    System.out.print("*");
                }else{
                    System.out.print("+");
                }
                a = !a;
            }
            System.out.println("");
        }
    }
}
