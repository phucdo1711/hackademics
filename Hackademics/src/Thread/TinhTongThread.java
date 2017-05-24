/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Thread;

public class TinhTongThread extends Thread {
    private int lo, hi;
    private int[] arr;
    private static int ans = 0;

    public TinhTongThread(int[] arr, int lo, int hi) {
        this.lo = lo;
        this.hi = hi;
        this.arr = arr;
    }

    @Override
    public void run() {
        for(int i = lo; i <hi ; i++){
            ans += arr[i];
        }
        
    }

    /**
     * Sum the elements of an array.
     *
     * @param arr array to sum
     * @return sum of the array's elements
     * @throws InterruptedException shouldn't happen
     */
    public static int sum(int[] arr) throws InterruptedException {
        int len = arr.length;
        int ans = 0;

        // Tao va chay 4 thread
        TinhTongThread[] ts = new TinhTongThread[4];
        for (int i = 0; i < 4; i++) {
            ts[i] = new TinhTongThread(arr, (i * len) / 4, ((i + 1) * len / 4));
            ts[i].start();
            ts[i].join();
        }

        // Doi 4 thread tinh tong va tra ve ket qua (su dung join)
        // TODO

        return ans = TinhTongThread.ans;
    }

    public static void main(String[] args) throws InterruptedException {
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
        int sum = sum(arr);
        System.out.println("Sum: " + sum);
    }

}

