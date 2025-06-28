public class Arrays {

    //syntax of an array
    // type[] arrayName = new type[size]
    // new keyword is used to provide a new space in the memory

public static void main(String[] args) {
//    int[] marks = new int[3]; or
    int marks[] = new int[3];

    marks[0] = 97;
    marks[1] = 98;
    marks[2] = 95;

//    System.out.println(marks[0]);
//    System.out.println(marks[1]);
//    System.out.println(marks[2]);

    for(int i = 0 ; i < marks.length ; i++){
        System.out.println(marks[i]);
    }

}


}
