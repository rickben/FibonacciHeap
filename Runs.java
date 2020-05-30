public class Runs {

    public static void main(String[] args){
        //int[] arr = {1000,2000,3000};
        System.out.println("sequence 1");
        //for (int m:arr) {//three different runs
        int m=Integer.parseInt(args[0]);
            FibonacciHeap heap = new FibonacciHeap();
            System.out.println("m: "+m);
               for (int i=m;i>0;i--){
                    heap.insert(i);
               }
               System.out.println(heap.totalLinks());
               System.out.println(heap.totalCuts());
               System.out.println(heap.potential());
        }
    }
//}
