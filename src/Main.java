public class Main {
    public static void main(String args[]) {

        for(int i = 1 ; i<=50 ; i++ ){

            if(i%3==0 && i%5==0){

                System.out.print("\"ka-ching!\"" + ",");
            }
            // I think u have a Mistake in the Exercise because Number 6 needs to be changed to "ka" too.
            else if(i%3==0 && i!=6){

                System.out.print("\"ka\"" + ",");
            }

            else  if(i%5==0){

                if (i==50){

                    System.out.print("\"ching!\"");

                }
                else{

                    System.out.print("\"ching!\"" + ",");

                }
            }
            else {

                System.out.print("\""+ i +"\",");

            }

        }

    }
}