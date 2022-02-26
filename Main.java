
package linkedlist;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {

    //Bağlı listedeki elemanlardan çift olanlarını yeni bağlı listeye ekleyen program
    
    public static void print_list (LinkedList<Integer> numbers){
        
        //listeyi yazdıran metod
        
        ListIterator<Integer> iterator = numbers.listIterator();
        
        if(iterator.hasNext()){
            System.out.println("linked list you entered = "+numbers);
        }
        
    }
    public static void choose_couplenumbers (LinkedList<Integer> numbers
            ,LinkedList<Integer> couple_numbers){
        
        //çift sayıları ayırıp yeni listeye ekleyen metod
        
        ListIterator<Integer> iterator = numbers.listIterator();
        
        while(iterator.hasNext()){
            
            int test = iterator.next();
            if(test % 2 == 0){
                couple_numbers.add(test);
            }
        }
        System.out.println("linked list of couple numbers = "+couple_numbers);
        
    }
    public static void main(String[] args) {
        
        LinkedList<Integer> numbers= new LinkedList();
        Scanner sc = new Scanner(System.in);
        int value;
        while(true){
            System.out.println("Enter the number you want to add to the linked list"
                    + "(for exit=(-1) ) :  ");
            value = sc.nextInt();
            if(value==-1) break;
            numbers.add(value);
        }
        print_list(numbers);
        LinkedList<Integer> ciftsayilar = new LinkedList();
        choose_couplenumbers(numbers,ciftsayilar);
    }
}
