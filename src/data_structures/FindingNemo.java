package data_structures;

public class FindingNemo {

    public static void findNemo(String[] array){

        //O(n) --> n is the input size
        for (int i = 0; i <array.length ; i++) {

            if(array[i]=="Nemo"){
                System.out.println("Found Nemo at " + i);
                break;
            }

        }
    }

    // Best case - when we get the item in the first index itself
    // Worst case - when we get the item in the last index

    public static void main(String[] args) {

        String[] names= {"test4","test1","test2","test3","Nemo"};

        findNemo(names);
    }

}
